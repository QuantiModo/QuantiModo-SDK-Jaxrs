package io.swagger.api.factories;

import io.swagger.api.ApplicationApiService;
import io.swagger.api.impl.ApplicationApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class ApplicationApiServiceFactory {

   private final static ApplicationApiService service = new ApplicationApiServiceImpl();

   public static ApplicationApiService getApplicationApi()
   {
      return service;
   }
}
