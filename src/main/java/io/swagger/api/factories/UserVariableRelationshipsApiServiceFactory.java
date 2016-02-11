package io.swagger.api.factories;

import io.swagger.api.UserVariableRelationshipsApiService;
import io.swagger.api.impl.UserVariableRelationshipsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class UserVariableRelationshipsApiServiceFactory {

   private final static UserVariableRelationshipsApiService service = new UserVariableRelationshipsApiServiceImpl();

   public static UserVariableRelationshipsApiService getUserVariableRelationshipsApi()
   {
      return service;
   }
}
