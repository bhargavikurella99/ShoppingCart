package com.devon4j.application.scsj.customermanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devon4j.application.scsj.customermanagement.logic.api.Customermanagement;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerCto;
import com.devon4j.application.scsj.customermanagement.logic.api.to.CustomerSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Customermanagement}.
 */
@Path("/customermanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface CustomermanagementRestService {

  /**
   * Delegates to {@link Customermanagement#findCustomerCto}.
   *
   * @param id the ID of the {@link CustomerCto}
   * @return the {@link CustomerCto}
   */
  @GET
  @Path("/customer/cto/{id}/")
  public CustomerCto getCustomerCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Customermanagement#findCustomerCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding customers.
   * @return the {@link Page list} of matching {@link CustomerCto}s.
   */
  @Path("/customer/cto/search")
  @POST
  public Page<CustomerCto> findCustomerCtos(CustomerSearchCriteriaTo searchCriteriaTo);
}