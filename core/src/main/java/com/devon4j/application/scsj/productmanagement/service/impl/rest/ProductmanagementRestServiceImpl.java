package com.devon4j.application.scsj.productmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devon4j.application.scsj.productmanagement.logic.api.Productmanagement;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductCto;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductSearchCriteriaTo;
import com.devon4j.application.scsj.productmanagement.service.api.rest.ProductmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Productmanagement}.
 */
@Named("ProductmanagementRestService")
public class ProductmanagementRestServiceImpl implements ProductmanagementRestService {

  @Inject
  private Productmanagement productmanagement;

  @Override
  public ProductCto getProductCto(long id) {

    return this.productmanagement.findProductCto(id);
  }

  @Override
  public Page<ProductCto> findProductCtos(ProductSearchCriteriaTo searchCriteriaTo) {

    return this.productmanagement.findProductCtos(searchCriteriaTo);
  }
}