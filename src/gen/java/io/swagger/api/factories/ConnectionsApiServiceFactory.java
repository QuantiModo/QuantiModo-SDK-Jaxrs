package io.swagger.api.factories;

import io.swagger.api.ConnectionsApiService;
import io.swagger.api.impl.ConnectionsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class ConnectionsApiServiceFactory {

   private final static ConnectionsApiService service = new ConnectionsApiServiceImpl();

   public static ConnectionsApiService getConnectionsApi()
   {
      return service;
   }
}
