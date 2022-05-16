package com.devon4j.application.scsj.productmanagement.logic.api.to;

import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerEto;
import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Product
 */
public class ProductCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private ProductEto product;

  private CustomerEto customer;

  public ProductEto getProduct() {

    return product;
  }

  public void setProduct(ProductEto product) {

    this.product = product;
  }

  public CustomerEto getCustomer() {

    return customer;
  }

  public void setCustomer(CustomerEto customer) {

    this.customer = customer;
  }

}
