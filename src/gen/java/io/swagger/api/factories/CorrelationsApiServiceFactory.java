package io.swagger.api.factories;

import io.swagger.api.CorrelationsApiService;
import io.swagger.api.impl.CorrelationsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class CorrelationsApiServiceFactory {

   private final static CorrelationsApiService service = new CorrelationsApiServiceImpl();

   public static CorrelationsApiService getCorrelationsApi()
   {
      return service;
   }
}
