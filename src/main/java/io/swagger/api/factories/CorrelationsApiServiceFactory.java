package io.swagger.api.factories;

import io.swagger.api.CorrelationsApiService;
import io.swagger.api.impl.CorrelationsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class CorrelationsApiServiceFactory {

   private final static CorrelationsApiService service = new CorrelationsApiServiceImpl();

   public static CorrelationsApiService getCorrelationsApi()
   {
      return service;
   }
}
