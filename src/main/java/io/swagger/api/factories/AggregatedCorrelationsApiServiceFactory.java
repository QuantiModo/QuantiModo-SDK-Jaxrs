package io.swagger.api.factories;

import io.swagger.api.AggregatedCorrelationsApiService;
import io.swagger.api.impl.AggregatedCorrelationsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class AggregatedCorrelationsApiServiceFactory {

   private final static AggregatedCorrelationsApiService service = new AggregatedCorrelationsApiServiceImpl();

   public static AggregatedCorrelationsApiService getAggregatedCorrelationsApi()
   {
      return service;
   }
}
