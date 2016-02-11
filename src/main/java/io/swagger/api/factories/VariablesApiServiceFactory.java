package io.swagger.api.factories;

import io.swagger.api.VariablesApiService;
import io.swagger.api.impl.VariablesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class VariablesApiServiceFactory {

   private final static VariablesApiService service = new VariablesApiServiceImpl();

   public static VariablesApiService getVariablesApi()
   {
      return service;
   }
}
