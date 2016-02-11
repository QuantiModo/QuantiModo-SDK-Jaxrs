package io.swagger.api.factories;

import io.swagger.api.TrackingRemindersApiService;
import io.swagger.api.impl.TrackingRemindersApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class TrackingRemindersApiServiceFactory {

   private final static TrackingRemindersApiService service = new TrackingRemindersApiServiceImpl();

   public static TrackingRemindersApiService getTrackingRemindersApi()
   {
      return service;
   }
}
