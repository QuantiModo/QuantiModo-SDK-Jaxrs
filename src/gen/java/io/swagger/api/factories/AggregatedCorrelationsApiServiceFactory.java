package io.swagger.api.factories;

import io.swagger.api.AggregatedCorrelationsApiService;
import io.swagger.api.impl.AggregatedCorrelationsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class AggregatedCorrelationsApiServiceFactory {

   private final static AggregatedCorrelationsApiService service = new AggregatedCorrelationsApiServiceImpl();

   public static AggregatedCorrelationsApiService getAggregatedCorrelationsApi()
   {
      return service;
   }
}
