package io.swagger.api.factories;

import io.swagger.api.CredentialsApiService;
import io.swagger.api.impl.CredentialsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class CredentialsApiServiceFactory {

   private final static CredentialsApiService service = new CredentialsApiServiceImpl();

   public static CredentialsApiService getCredentialsApi()
   {
      return service;
   }
}
