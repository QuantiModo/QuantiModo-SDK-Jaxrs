package io.swagger.api.factories;

import io.swagger.api.MeasurementsApiService;
import io.swagger.api.impl.MeasurementsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class MeasurementsApiServiceFactory {

   private final static MeasurementsApiService service = new MeasurementsApiServiceImpl();

   public static MeasurementsApiService getMeasurementsApi()
   {
      return service;
   }
}
