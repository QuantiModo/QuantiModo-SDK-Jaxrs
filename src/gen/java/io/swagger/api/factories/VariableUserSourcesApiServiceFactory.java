package io.swagger.api.factories;

import io.swagger.api.VariableUserSourcesApiService;
import io.swagger.api.impl.VariableUserSourcesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class VariableUserSourcesApiServiceFactory {

   private final static VariableUserSourcesApiService service = new VariableUserSourcesApiServiceImpl();

   public static VariableUserSourcesApiService getVariableUserSourcesApi()
   {
      return service;
   }
}
