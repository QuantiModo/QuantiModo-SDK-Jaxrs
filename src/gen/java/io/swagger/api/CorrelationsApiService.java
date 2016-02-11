package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse20017;
import io.swagger.model.Correlation;
import io.swagger.model.InlineResponse20018;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class CorrelationsApiService {
  
      public abstract Response correlationsGet(String accessToken,Integer timestamp,Integer userId,BigDecimal correlation,Integer causeId,Integer effectId,Integer onsetDelay,Integer durationOfAction,Integer numberOfPairs,BigDecimal valuePredictingHighOutcome,BigDecimal valuePredictingLowOutcome,BigDecimal optimalPearsonProduct,BigDecimal vote,BigDecimal statisticalSignificance,String causeUnit,Integer causeUnitId,Integer causeChanges,Integer effectChanges,BigDecimal qmScore,String error,String createdAt,String updatedAt,BigDecimal reversePearsonCorrelationCoefficient,BigDecimal predictivePearsonCorrelationCoefficient,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response correlationsPost(String accessToken,Correlation body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response correlationsIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response correlationsIdPut(Integer id,String accessToken,Correlation body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response correlationsIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
