package io.swagger.api.factories;

import io.swagger.api.VotesApiService;
import io.swagger.api.impl.VotesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class VotesApiServiceFactory {

   private final static VotesApiService service = new VotesApiServiceImpl();

   public static VotesApiService getVotesApi()
   {
      return service;
   }
}
