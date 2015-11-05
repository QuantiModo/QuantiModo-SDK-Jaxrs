package io.swagger.api.factories;

import io.swagger.api.UnitCategoriesApiService;
import io.swagger.api.impl.UnitCategoriesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class UnitCategoriesApiServiceFactory {

   private final static UnitCategoriesApiService service = new UnitCategoriesApiServiceImpl();

   public static UnitCategoriesApiService getUnitCategoriesApi()
   {
      return service;
   }
}
