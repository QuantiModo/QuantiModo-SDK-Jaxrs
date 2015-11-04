package io.swagger.api.factories;

import io.swagger.api.ConnectorsApiService;
import io.swagger.api.impl.ConnectorsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class ConnectorsApiServiceFactory {

   private final static ConnectorsApiService service = new ConnectorsApiServiceImpl();

   public static ConnectorsApiService getConnectorsApi()
   {
      return service;
   }
}
