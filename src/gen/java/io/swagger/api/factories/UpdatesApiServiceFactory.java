package io.swagger.api.factories;

import io.swagger.api.UpdatesApiService;
import io.swagger.api.impl.UpdatesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class UpdatesApiServiceFactory {

   private final static UpdatesApiService service = new UpdatesApiServiceImpl();

   public static UpdatesApiService getUpdatesApi()
   {
      return service;
   }
}
