package com.devon4j.application.scsj.productmanagement.logic.impl.usecase;

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

import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerEto;
import com.devon4j.application.scsj.productmanagement.dataaccess.api.ProductEntity;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductCto;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductEto;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductSearchCriteriaTo;
import com.devon4j.application.scsj.productmanagement.logic.api.usecase.UcFindProduct;
import com.devon4j.application.scsj.productmanagement.logic.base.usecase.AbstractProductUc;

/**
 * Use case implementation for searching, filtering and getting Products
 */
@Named
@Validated
@Transactional
public class UcFindProductImpl extends AbstractProductUc implements UcFindProduct {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindProductImpl.class);

  @Override
  public ProductCto findProductCto(long id) {

    LOG.debug("Get ProductCto with id {} from database.", id);
    ProductEntity entity = getProductRepository().find(id);
    ProductCto cto = new ProductCto();
    cto.setProduct(getBeanMapper().map(entity, ProductEto.class));
    cto.setCustomer(getBeanMapper().map(entity.getCustomer(), CustomerEto.class));

    return cto;
  }

  @Override
  public Page<ProductCto> findProductCtos(ProductSearchCriteriaTo criteria) {

    Page<ProductEntity> products = getProductRepository().findByCriteria(criteria);
    List<ProductCto> ctos = new ArrayList<>();
    for (ProductEntity entity : products.getContent()) {
      ProductCto cto = new ProductCto();
      cto.setProduct(getBeanMapper().map(entity, ProductEto.class));
      cto.setCustomer(getBeanMapper().map(entity.getCustomer(), CustomerEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, products.getTotalElements());
  }
}
