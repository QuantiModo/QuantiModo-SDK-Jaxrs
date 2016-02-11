package io.swagger.api.factories;

import io.swagger.api.SourcesApiService;
import io.swagger.api.impl.SourcesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class SourcesApiServiceFactory {

   private final static SourcesApiService service = new SourcesApiServiceImpl();

   public static SourcesApiService getSourcesApi()
   {
      return service;
   }
}
