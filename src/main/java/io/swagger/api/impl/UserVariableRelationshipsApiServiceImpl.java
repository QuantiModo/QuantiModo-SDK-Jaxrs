package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2008;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20029;
import io.swagger.model.UserVariableRelationship;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class UserVariableRelationshipsApiServiceImpl extends UserVariableRelationshipsApiService {
  
      @Override
      public Response userVariableRelationshipsGet(String accessToken,Integer id,String confidenceLevel,BigDecimal confidenceScore,String direction,Integer durationOfAction,String errorMessage,Integer onsetDelay,Integer outcomeVariableId,Integer predictorVariableId,Integer predictorUnitId,BigDecimal sinnRank,String strengthLevel,BigDecimal strengthScore,Integer userId,String vote,BigDecimal valuePredictingHighOutcome,BigDecimal valuePredictingLowOutcome,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userVariableRelationshipsPost(String accessToken,UserVariableRelationship body,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userVariableRelationshipsIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userVariableRelationshipsIdPut(Integer id,String accessToken,UserVariableRelationship body,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userVariableRelationshipsIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
