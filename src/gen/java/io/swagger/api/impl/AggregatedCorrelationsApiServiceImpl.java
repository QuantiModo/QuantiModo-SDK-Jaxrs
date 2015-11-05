package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse200;
import io.swagger.model.AggregatedCorrelation;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class AggregatedCorrelationsApiServiceImpl extends AggregatedCorrelationsApiService {
  
      @Override
      public Response aggregatedCorrelationsGet(BigDecimal correlation,Integer causeId,Integer effectId,Integer onsetDelay,Integer durationOfAction,Integer numberOfPairs,BigDecimal valuePredictingHighOutcome,BigDecimal valuePredictingLowOutcome,BigDecimal optimalPearsonProduct,BigDecimal vote,Integer numberOfUsers,Integer numberOfCorrelations,BigDecimal statisticalSignificance,String causeUnit,Integer causeUnitId,Integer causeChanges,Integer effectChanges,BigDecimal aggregateQmScore,String createdAt,String updatedAt,String status,String errorMessage,String lastSuccessfulUpdateTime,BigDecimal reversePearsonCorrelationCoefficient,BigDecimal predictivePearsonCorrelationCoefficient,Integer limit,Integer offset,String sort)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response aggregatedCorrelationsPost(AggregatedCorrelation body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response aggregatedCorrelationsIdGet(Integer id)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response aggregatedCorrelationsIdPut(Integer id,AggregatedCorrelation body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response aggregatedCorrelationsIdDelete(Integer id)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
