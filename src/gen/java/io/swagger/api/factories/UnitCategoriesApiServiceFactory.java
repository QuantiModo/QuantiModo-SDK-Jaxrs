package io.swagger.api.factories;

import io.swagger.api.UnitCategoriesApiService;
import io.swagger.api.impl.UnitCategoriesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class UnitCategoriesApiServiceFactory {

   private final static UnitCategoriesApiService service = new UnitCategoriesApiServiceImpl();

   public static UnitCategoriesApiService getUnitCategoriesApi()
   {
      return service;
   }
}
