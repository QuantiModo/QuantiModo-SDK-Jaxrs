package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.InlineResponse20013;
import io.swagger.model.CommonVariableRelationship;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class CommonVariableRelationshipsApiServiceImpl extends CommonVariableRelationshipsApiService {
  
      @Override
      public Response commonVariableRelationshipsGet(String accessToken,Integer id,String confidenceLevel,BigDecimal confidenceScore,String direction,Integer durationOfAction,String errorMessage,Integer onsetDelay,Integer outcomeVariableId,Integer predictorVariableId,Integer predictorUnitId,BigDecimal sinnRank,BigDecimal strengthScore,String strengthLevel,Integer upVotes,Integer downVotes,BigDecimal valuePredictingHighOutcome,BigDecimal valuePredictingLowOutcome,Integer numberOfUsers,String dataSource,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response commonVariableRelationshipsPost(String accessToken,CommonVariableRelationship body,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response commonVariableRelationshipsIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response commonVariableRelationshipsIdPut(Integer id,String accessToken,CommonVariableRelationship body,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response commonVariableRelationshipsIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
