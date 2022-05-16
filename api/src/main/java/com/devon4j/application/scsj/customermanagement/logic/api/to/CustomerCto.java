package com.devon4j.application.scsj.customermanagement.logic.api.to;

import java.util.List;

import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductEto;
import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Customer
 */
public class CustomerCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private CustomerEto customer;

  private List<ProductEto> products;

  public CustomerEto getCustomer() {

    return this.customer;
  }

  public void setCustomer(CustomerEto customer) {

    this.customer = customer;
  }

  public List<ProductEto> getProducts() {

    return this.products;
  }

  public void setProducts(List<ProductEto> products) {

    this.products = products;
  }

}
