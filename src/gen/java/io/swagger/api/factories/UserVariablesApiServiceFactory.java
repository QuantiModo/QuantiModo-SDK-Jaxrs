package io.swagger.api.factories;

import io.swagger.api.UserVariablesApiService;
import io.swagger.api.impl.UserVariablesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class UserVariablesApiServiceFactory {

   private final static UserVariablesApiService service = new UserVariablesApiServiceImpl();

   public static UserVariablesApiService getUserVariablesApi()
   {
      return service;
   }
}
