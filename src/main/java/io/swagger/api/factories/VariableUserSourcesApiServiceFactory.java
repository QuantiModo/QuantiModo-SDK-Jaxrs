package io.swagger.api.factories;

import io.swagger.api.VariableUserSourcesApiService;
import io.swagger.api.impl.VariableUserSourcesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class VariableUserSourcesApiServiceFactory {

   private final static VariableUserSourcesApiService service = new VariableUserSourcesApiServiceImpl();

   public static VariableUserSourcesApiService getVariableUserSourcesApi()
   {
      return service;
   }
}
