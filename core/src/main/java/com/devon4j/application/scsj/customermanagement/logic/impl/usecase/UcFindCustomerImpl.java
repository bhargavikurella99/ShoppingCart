package com.devon4j.application.scsj.customermanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon4j.application.scsj.customermanagement.dataaccess.api.CustomerEntity;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerCto;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerEto;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerSearchCriteriaTo;
import com.devon4j.application.scsj.customermanagement.logic.api.usecase.UcFindCustomer;
import com.devon4j.application.scsj.customermanagement.logic.base.usecase.AbstractCustomerUc;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductEto;

/**
 * Use case implementation for searching, filtering and getting Customers
 */
@Named
@Validated
@Transactional
public class UcFindCustomerImpl extends AbstractCustomerUc implements UcFindCustomer {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindCustomerImpl.class);

  @Override
  public CustomerCto findCustomerCto(long id) {

    LOG.debug("Get CustomerCto with id {} from database.", id);
    CustomerEntity entity = getCustomerRepository().find(id);
    CustomerCto cto = new CustomerCto();
    cto.setCustomer(getBeanMapper().map(entity, CustomerEto.class));
    cto.setProducts(getBeanMapper().mapList(entity.getProducts(), ProductEto.class));

    return cto;
  }

  @Override
  public Page<CustomerCto> findCustomerCtos(CustomerSearchCriteriaTo criteria) {

    Page<CustomerEntity> customers = getCustomerRepository().findByCriteria(criteria);
    List<CustomerCto> ctos = new ArrayList<>();
    for (CustomerEntity entity : customers.getContent()) {
      CustomerCto cto = new CustomerCto();
      cto.setCustomer(getBeanMapper().map(entity, CustomerEto.class));
      cto.setProducts(getBeanMapper().mapList(entity.getProducts(), ProductEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, customers.getTotalElements());
  }
}
