package io.swagger.api.factories;

import io.swagger.api.VariablesApiService;
import io.swagger.api.impl.VariablesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class VariablesApiServiceFactory {

   private final static VariablesApiService service = new VariablesApiServiceImpl();

   public static VariablesApiService getVariablesApi()
   {
      return service;
   }
}
