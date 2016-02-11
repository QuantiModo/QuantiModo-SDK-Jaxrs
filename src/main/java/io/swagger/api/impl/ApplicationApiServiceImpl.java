package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class ApplicationApiServiceImpl extends ApplicationApiService {
  
      @Override
      public Response applicationConnectionsGet(String accessToken,Integer connectorId,String connectStatus,String connectError,String updateRequestedAt,String updateStatus,String updateError,String lastSuccessfulUpdatedAt,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response applicationCredentialsGet(String accessToken,Integer connectorId,String attrKey,String attrValue,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response applicationMeasurementsGet(String accessToken,String clientId,Integer connectorId,Integer variableId,Integer sourceId,String startTime,BigDecimal value,Integer unitId,BigDecimal originalValue,Integer originalUnitId,Integer duration,String note,BigDecimal latitude,BigDecimal longitude,String location,String createdAt,String updatedAt,String error,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response applicationTrackingRemindersGet(String accessToken,String clientId,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response applicationUpdatesGet(String accessToken,Integer connectorId,Integer numberOfMeasurements,Boolean success,String message,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response applicationUserVariableRelationshipsGet(String accessToken,Integer id,String confidenceLevel,BigDecimal confidenceScore,String direction,Integer durationOfAction,String errorMessage,Integer onsetDelay,Integer outcomeVariableId,Integer predictorVariableId,Integer predictorUnitId,BigDecimal sinnRank,String strengthLevel,BigDecimal strengthScore,String vote,BigDecimal valuePredictingHighOutcome,BigDecimal valuePredictingLowOutcome,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response applicationUserVariablesGet(String accessToken,String clientId,Integer parentId,Integer variableId,Integer defaultUnitId,BigDecimal minimumAllowedValue,BigDecimal maximumAllowedValue,BigDecimal fillingValue,Integer joinWith,Integer onsetDelay,Integer durationOfAction,Integer variableCategoryId,Integer updated,Integer _public,Boolean causeOnly,String fillingType,Integer numberOfMeasurements,Integer numberOfProcessedMeasurements,Integer measurementsAtLastAnalysis,Integer lastUnitId,Integer lastOriginalUnitId,Integer lastOriginalValue,BigDecimal lastValue,BigDecimal lastOriginalValue2,Integer lastSourceId,Integer numberOfCorrelations,String status,String errorMessage,String lastSuccessfulUpdateTime,BigDecimal standardDeviation,BigDecimal variance,BigDecimal minimumRecordedValue,BigDecimal maximumRecordedValue,BigDecimal mean,BigDecimal median,Integer mostCommonUnitId,BigDecimal mostCommonValue,BigDecimal numberOfUniqueDailyValues,Integer numberOfChanges,BigDecimal skewness,BigDecimal kurtosis,BigDecimal latitude,BigDecimal longitude,String location,String createdAt,String updatedAt,Boolean outcome,String sources,Integer earliestSourceTime,Integer latestSourceTime,Integer earliestMeasurementTime,Integer latestMeasurementTime,Integer earliestFillingTime,Integer latestFillingTime,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response applicationVariableUserSourcesGet(String accessToken,Integer variableId,Integer timestamp,Integer earliestMeasurementTime,Integer latestMeasurementTime,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response applicationVotesGet(String accessToken,String clientId,Integer causeId,Integer effectId,Integer value,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
