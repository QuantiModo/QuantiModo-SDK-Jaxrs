package io.swagger.api.factories;

import io.swagger.api.UpdatesApiService;
import io.swagger.api.impl.UpdatesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class UpdatesApiServiceFactory {

   private final static UpdatesApiService service = new UpdatesApiServiceImpl();

   public static UpdatesApiService getUpdatesApi()
   {
      return service;
   }
}
