package io.swagger.api.factories;

import io.swagger.api.VotesApiService;
import io.swagger.api.impl.VotesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class VotesApiServiceFactory {

   private final static VotesApiService service = new VotesApiServiceImpl();

   public static VotesApiService getVotesApi()
   {
      return service;
   }
}
