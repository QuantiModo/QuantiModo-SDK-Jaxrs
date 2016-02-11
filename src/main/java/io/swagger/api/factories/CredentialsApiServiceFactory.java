package io.swagger.api.factories;

import io.swagger.api.CredentialsApiService;
import io.swagger.api.impl.CredentialsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class CredentialsApiServiceFactory {

   private final static CredentialsApiService service = new CredentialsApiServiceImpl();

   public static CredentialsApiService getCredentialsApi()
   {
      return service;
   }
}
