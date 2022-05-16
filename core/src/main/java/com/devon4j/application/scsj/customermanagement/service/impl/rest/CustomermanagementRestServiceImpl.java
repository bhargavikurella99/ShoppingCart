package com.devon4j.application.scsj.customermanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devon4j.application.scsj.customermanagement.logic.api.Customermanagement;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerCto;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerSearchCriteriaTo;
import com.devon4j.application.scsj.customermanagement.service.api.rest.CustomermanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Customermanagement}.
 */
@Named("CustomermanagementRestService")
public class CustomermanagementRestServiceImpl implements CustomermanagementRestService {

  @Inject
  private Customermanagement customermanagement;

  @Override
  public CustomerCto getCustomerCto(long id) {

    return this.customermanagement.findCustomerCto(id);
  }

  @Override
  public Page<CustomerCto> findCustomerCtos(CustomerSearchCriteriaTo searchCriteriaTo) {

    return this.customermanagement.findCustomerCtos(searchCriteriaTo);
  }
}