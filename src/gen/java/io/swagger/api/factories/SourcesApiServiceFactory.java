package io.swagger.api.factories;

import io.swagger.api.SourcesApiService;
import io.swagger.api.impl.SourcesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class SourcesApiServiceFactory {

   private final static SourcesApiService service = new SourcesApiServiceImpl();

   public static SourcesApiService getSourcesApi()
   {
      return service;
   }
}
