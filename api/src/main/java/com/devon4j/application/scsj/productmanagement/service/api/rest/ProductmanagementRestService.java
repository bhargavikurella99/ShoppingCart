package com.devon4j.application.scsj.productmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devon4j.application.scsj.productmanagement.logic.api.Productmanagement;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductCto;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Productmanagement}.
 */
@Path("/productmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ProductmanagementRestService {

  /**
   * Delegates to {@link Productmanagement#findProductCto}.
   *
   * @param id the ID of the {@link ProductCto}
   * @return the {@link ProductCto}
   */
  @GET
  @Path("/product/cto/{id}/")
  public ProductCto getProductCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Productmanagement#findProductCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding products.
   * @return the {@link Page list} of matching {@link ProductCto}s.
   */
  @Path("/product/cto/search")
  @POST
  public Page<ProductCto> findProductCtos(ProductSearchCriteriaTo searchCriteriaTo);

}