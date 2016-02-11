package io.swagger.api.factories;

import io.swagger.api.ConnectorsApiService;
import io.swagger.api.impl.ConnectorsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class ConnectorsApiServiceFactory {

   private final static ConnectorsApiService service = new ConnectorsApiServiceImpl();

   public static ConnectorsApiService getConnectorsApi()
   {
      return service;
   }
}
