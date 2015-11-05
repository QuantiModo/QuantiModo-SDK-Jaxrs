package io.swagger.api;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class CorrelationsApiService {
  
      public abstract Response correlationsGet(Integer timestamp,Integer userId,BigDecimal correlation,Integer causeId,Integer effectId,Integer onsetDelay,Integer durationOfAction,Integer numberOfPairs,BigDecimal valuePredictingHighOutcome,BigDecimal valuePredictingLowOutcome,BigDecimal optimalPearsonProduct,BigDecimal vote,BigDecimal statisticalSignificance,String causeUnit,Integer causeUnitId,Integer causeChanges,Integer effectChanges,BigDecimal qmScore,String error,String createdAt,String updatedAt,BigDecimal reversePearsonCorrelationCoefficient,BigDecimal predictivePearsonCorrelationCoefficient,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response correlationsPost(Correlation body)
      throws NotFoundException;
  
      public abstract Response correlationsIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response correlationsIdPut(Integer id,Correlation body)
      throws NotFoundException;
  
      public abstract Response correlationsIdDelete(Integer id)
      throws NotFoundException;
  
}
