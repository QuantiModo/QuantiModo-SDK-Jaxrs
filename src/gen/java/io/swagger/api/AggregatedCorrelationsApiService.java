package io.swagger.api;

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
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class AggregatedCorrelationsApiService {
  
      public abstract Response aggregatedCorrelationsGet(String accessToken,BigDecimal correlation,Integer causeId,Integer effectId,Integer onsetDelay,Integer durationOfAction,Integer numberOfPairs,BigDecimal valuePredictingHighOutcome,BigDecimal valuePredictingLowOutcome,BigDecimal optimalPearsonProduct,Integer numberOfUsers,Integer numberOfCorrelations,BigDecimal statisticalSignificance,String causeUnit,Integer causeUnitId,Integer causeChanges,Integer effectChanges,BigDecimal aggregateQmScore,String createdAt,String updatedAt,String status,String errorMessage,String lastSuccessfulUpdateTime,BigDecimal reversePearsonCorrelationCoefficient,BigDecimal predictivePearsonCorrelationCoefficient,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response aggregatedCorrelationsPost(String accessToken,AggregatedCorrelation body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response aggregatedCorrelationsIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response aggregatedCorrelationsIdPut(Integer id,String accessToken,AggregatedCorrelation body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response aggregatedCorrelationsIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
