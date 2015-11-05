package io.swagger.api.factories;

import io.swagger.api.VariableCategoriesApiService;
import io.swagger.api.impl.VariableCategoriesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class VariableCategoriesApiServiceFactory {

   private final static VariableCategoriesApiService service = new VariableCategoriesApiServiceImpl();

   public static VariableCategoriesApiService getVariableCategoriesApi()
   {
      return service;
   }
}
