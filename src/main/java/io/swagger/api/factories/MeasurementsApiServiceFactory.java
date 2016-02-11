package io.swagger.api.factories;

import io.swagger.api.MeasurementsApiService;
import io.swagger.api.impl.MeasurementsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class MeasurementsApiServiceFactory {

   private final static MeasurementsApiService service = new MeasurementsApiServiceImpl();

   public static MeasurementsApiService getMeasurementsApi()
   {
      return service;
   }
}
