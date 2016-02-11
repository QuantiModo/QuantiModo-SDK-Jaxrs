package io.swagger.api.factories;

import io.swagger.api.UnitsApiService;
import io.swagger.api.impl.UnitsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class UnitsApiServiceFactory {

   private final static UnitsApiService service = new UnitsApiServiceImpl();

   public static UnitsApiService getUnitsApi()
   {
      return service;
   }
}
