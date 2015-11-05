package io.swagger.api.factories;

import io.swagger.api.UnitsApiService;
import io.swagger.api.impl.UnitsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class UnitsApiServiceFactory {

   private final static UnitsApiService service = new UnitsApiServiceImpl();

   public static UnitsApiService getUnitsApi()
   {
      return service;
   }
}
