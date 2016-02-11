package io.swagger.api.factories;

import io.swagger.api.VariableCategoriesApiService;
import io.swagger.api.impl.VariableCategoriesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class VariableCategoriesApiServiceFactory {

   private final static VariableCategoriesApiService service = new VariableCategoriesApiServiceImpl();

   public static VariableCategoriesApiService getVariableCategoriesApi()
   {
      return service;
   }
}
