package io.swagger.api.factories;

import io.swagger.api.VariableUserSourcesApiService;
import io.swagger.api.impl.VariableUserSourcesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class VariableUserSourcesApiServiceFactory {

   private final static VariableUserSourcesApiService service = new VariableUserSourcesApiServiceImpl();

   public static VariableUserSourcesApiService getVariableUserSourcesApi()
   {
      return service;
   }
}
