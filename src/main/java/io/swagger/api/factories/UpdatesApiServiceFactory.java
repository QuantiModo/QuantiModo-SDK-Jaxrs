package io.swagger.api.factories;

import io.swagger.api.UpdatesApiService;
import io.swagger.api.impl.UpdatesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class UpdatesApiServiceFactory {

   private final static UpdatesApiService service = new UpdatesApiServiceImpl();

   public static UpdatesApiService getUpdatesApi()
   {
      return service;
   }
}
