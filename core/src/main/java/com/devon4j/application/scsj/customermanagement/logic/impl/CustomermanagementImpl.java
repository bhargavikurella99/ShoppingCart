package com.devon4j.application.scsj.customermanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devon4j.application.scsj.customermanagement.logic.api.Customermanagement;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerCto;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerSearchCriteriaTo;
import com.devon4j.application.scsj.customermanagement.logic.api.usecase.UcFindCustomer;
import com.devon4j.application.scsj.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of customermanagement
 */
@Named
public class CustomermanagementImpl extends AbstractComponentFacade implements Customermanagement {

  @Inject
  private UcFindCustomer ucFindCustomer;

  @Override
  public CustomerCto findCustomerCto(long id) {

    return ucFindCustomer.findCustomerCto(id);
  }

  @Override
  public Page<CustomerCto> findCustomerCtos(CustomerSearchCriteriaTo criteria) {

    return ucFindCustomer.findCustomerCtos(criteria);
  }
}
