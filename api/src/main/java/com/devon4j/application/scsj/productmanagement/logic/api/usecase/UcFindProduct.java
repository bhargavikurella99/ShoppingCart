package com.devon4j.application.scsj.productmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductCto;
import com.devon4j.application.scsj.productmanagement.logic.api.to.ProductSearchCriteriaTo;

public interface UcFindProduct {

  /**
   * Returns a composite Product by its id 'id'.
   *
   * @param id The id 'id' of the Product.
   * @return The {@link ProductCto} with id 'id'
   */
  ProductCto findProductCto(long id);

  /**
   * Returns a paginated list of composite Products matching the search criteria.
   *
   * @param criteria the {@link ProductSearchCriteriaTo}.
   * @return the {@link List} of matching {@link ProductCto}s.
   */
  Page<ProductCto> findProductCtos(ProductSearchCriteriaTo criteria);

}
