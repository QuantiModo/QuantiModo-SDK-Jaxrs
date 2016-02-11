package io.swagger.api.factories;

import io.swagger.api.ConnectionsApiService;
import io.swagger.api.impl.ConnectionsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class ConnectionsApiServiceFactory {

   private final static ConnectionsApiService service = new ConnectionsApiServiceImpl();

   public static ConnectionsApiService getConnectionsApi()
   {
      return service;
   }
}
