package io.swagger.api.factories;

import io.swagger.api.UserVariablesApiService;
import io.swagger.api.impl.UserVariablesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class UserVariablesApiServiceFactory {

   private final static UserVariablesApiService service = new UserVariablesApiServiceImpl();

   public static UserVariablesApiService getUserVariablesApi()
   {
      return service;
   }
}
