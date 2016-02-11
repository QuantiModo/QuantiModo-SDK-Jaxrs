package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2009;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20030;
import io.swagger.model.UserVariable;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class UserVariablesApiServiceImpl extends UserVariablesApiService {
  
      @Override
      public Response userVariablesGet(String accessToken,String clientId,Integer parentId,Integer variableId,Integer userId,Integer defaultUnitId,BigDecimal minimumAllowedValue,BigDecimal maximumAllowedValue,BigDecimal fillingValue,Integer joinWith,Integer onsetDelay,Integer durationOfAction,Integer variableCategoryId,Integer updated,Integer _public,Boolean causeOnly,String fillingType,Integer numberOfMeasurements,Integer numberOfProcessedMeasurements,Integer measurementsAtLastAnalysis,Integer lastUnitId,Integer lastOriginalUnitId,Integer lastOriginalValue,BigDecimal lastValue,BigDecimal lastOriginalValue2,Integer lastSourceId,Integer numberOfCorrelations,String status,String errorMessage,String lastSuccessfulUpdateTime,BigDecimal standardDeviation,BigDecimal variance,BigDecimal minimumRecordedValue,BigDecimal maximumRecordedValue,BigDecimal mean,BigDecimal median,Integer mostCommonUnitId,BigDecimal mostCommonValue,BigDecimal numberOfUniqueDailyValues,Integer numberOfChanges,BigDecimal skewness,BigDecimal kurtosis,BigDecimal latitude,BigDecimal longitude,String location,String createdAt,String updatedAt,Boolean outcome,String sources,Integer earliestSourceTime,Integer latestSourceTime,Integer earliestMeasurementTime,Integer latestMeasurementTime,Integer earliestFillingTime,Integer latestFillingTime,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userVariablesPost(String accessToken,UserVariable body,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userVariablesIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userVariablesIdPut(Integer id,String accessToken,UserVariable body,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userVariablesIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
