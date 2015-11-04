package io.swagger.api.factories;

import io.swagger.api.AggregatedCorrelationsApiService;
import io.swagger.api.impl.AggregatedCorrelationsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class AggregatedCorrelationsApiServiceFactory {

   private final static AggregatedCorrelationsApiService service = new AggregatedCorrelationsApiServiceImpl();

   public static AggregatedCorrelationsApiService getAggregatedCorrelationsApi()
   {
      return service;
   }
}
