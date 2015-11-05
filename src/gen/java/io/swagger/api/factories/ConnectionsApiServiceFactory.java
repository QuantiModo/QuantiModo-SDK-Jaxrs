package io.swagger.api.factories;

import io.swagger.api.ConnectionsApiService;
import io.swagger.api.impl.ConnectionsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class ConnectionsApiServiceFactory {

   private final static ConnectionsApiService service = new ConnectionsApiServiceImpl();

   public static ConnectionsApiService getConnectionsApi()
   {
      return service;
   }
}
