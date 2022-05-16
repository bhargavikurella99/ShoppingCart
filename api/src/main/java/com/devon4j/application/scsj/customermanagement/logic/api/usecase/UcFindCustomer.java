package com.devon4j.application.scsj.customermanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerCto;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerSearchCriteriaTo;

public interface UcFindCustomer {

  /**
   * Returns a composite Customer by its id 'id'.
   *
   * @param id The id 'id' of the Customer.
   * @return The {@link CustomerCto} with id 'id'
   */
  CustomerCto findCustomerCto(long id);

  /**
   * Returns a paginated list of composite Customers matching the search criteria.
   *
   * @param criteria the {@link CustomerSearchCriteriaTo}.
   * @return the {@link List} of matching {@link CustomerCto}s.
   */
  Page<CustomerCto> findCustomerCtos(CustomerSearchCriteriaTo criteria);

}
