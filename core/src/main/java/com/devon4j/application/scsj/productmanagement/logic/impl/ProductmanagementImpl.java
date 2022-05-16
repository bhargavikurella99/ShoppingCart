package com.devon4j.application.scsj.productmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devon4j.application.scsj.general.logic.base.AbstractComponentFacade;
import com.devon4j.application.scsj.productmanagement.logic.api.Productmanagement;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductCto;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductSearchCriteriaTo;
import com.devon4j.application.scsj.productmanagement.logic.api.usecase.UcFindProduct;

/**
 * Implementation of component interface of productmanagement
 */
@Named
public class ProductmanagementImpl extends AbstractComponentFacade implements Productmanagement {

  @Inject
  private UcFindProduct ucFindProduct;

  @Override
  public ProductCto findProductCto(long id) {

    return ucFindProduct.findProductCto(id);
  }

  @Override
  public Page<ProductCto> findProductCtos(ProductSearchCriteriaTo criteria) {

    return ucFindProduct.findProductCtos(criteria);
  }
}
