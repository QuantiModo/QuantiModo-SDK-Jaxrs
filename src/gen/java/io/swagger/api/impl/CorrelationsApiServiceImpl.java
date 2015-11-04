package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.Correlation;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class CorrelationsApiServiceImpl extends CorrelationsApiService {
  
      @Override
      public Response correlationsGet(Integer timestamp,Integer userId,BigDecimal correlation,Integer causeId,Integer effectId,Integer onsetDelay,Integer durationOfAction,Integer numberOfPairs,BigDecimal valuePredictingHighOutcome,BigDecimal valuePredictingLowOutcome,BigDecimal optimalPearsonProduct,BigDecimal vote,BigDecimal statisticalSignificance,String causeUnit,Integer causeUnitId,Integer causeChanges,Integer effectChanges,BigDecimal qmScore,String error,String createdAt,String updatedAt,BigDecimal reversePearsonCorrelationCoefficient,BigDecimal predictivePearsonCorrelationCoefficient,Integer limit,Integer offset,String sort)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response correlationsPost(Correlation body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response correlationsIdGet(Integer id)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response correlationsIdPut(Integer id,Correlation body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response correlationsIdDelete(Integer id)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
