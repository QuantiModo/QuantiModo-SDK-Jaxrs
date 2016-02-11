package io.swagger.api.factories;

import io.swagger.api.UnitCategoriesApiService;
import io.swagger.api.impl.UnitCategoriesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class UnitCategoriesApiServiceFactory {

   private final static UnitCategoriesApiService service = new UnitCategoriesApiServiceImpl();

   public static UnitCategoriesApiService getUnitCategoriesApi()
   {
      return service;
   }
}
