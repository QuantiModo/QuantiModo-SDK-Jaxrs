package io.swagger.api.factories;

import io.swagger.api.UserVariablesApiService;
import io.swagger.api.impl.UserVariablesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class UserVariablesApiServiceFactory {

   private final static UserVariablesApiService service = new UserVariablesApiServiceImpl();

   public static UserVariablesApiService getUserVariablesApi()
   {
      return service;
   }
}
