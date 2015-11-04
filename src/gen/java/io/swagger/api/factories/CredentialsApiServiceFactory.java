package io.swagger.api.factories;

import io.swagger.api.CredentialsApiService;
import io.swagger.api.impl.CredentialsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class CredentialsApiServiceFactory {

   private final static CredentialsApiService service = new CredentialsApiServiceImpl();

   public static CredentialsApiService getCredentialsApi()
   {
      return service;
   }
}
