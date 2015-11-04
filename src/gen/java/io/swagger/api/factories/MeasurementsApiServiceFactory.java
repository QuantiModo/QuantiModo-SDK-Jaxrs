package io.swagger.api.factories;

import io.swagger.api.MeasurementsApiService;
import io.swagger.api.impl.MeasurementsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class MeasurementsApiServiceFactory {

   private final static MeasurementsApiService service = new MeasurementsApiServiceImpl();

   public static MeasurementsApiService getMeasurementsApi()
   {
      return service;
   }
}
