package io.swagger.api.factories;

import io.swagger.api.CommonVariableRelationshipsApiService;
import io.swagger.api.impl.CommonVariableRelationshipsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class CommonVariableRelationshipsApiServiceFactory {

   private final static CommonVariableRelationshipsApiService service = new CommonVariableRelationshipsApiServiceImpl();

   public static CommonVariableRelationshipsApiService getCommonVariableRelationshipsApi()
   {
      return service;
   }
}
