package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20027;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20028;
import io.swagger.model.Variable;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class VariablesApiService {
  
      public abstract Response variablesGet(Integer id,String clientId,Integer parentId,String name,Integer variableCategoryId,Integer defaultUnitId,String combinationOperation,BigDecimal fillingValue,BigDecimal maximumAllowedValue,BigDecimal minimumAllowedValue,Integer onsetDelay,Integer durationOfAction,Integer _public,Boolean causeOnly,BigDecimal mostCommonValue,Integer mostCommonUnitId,BigDecimal standardDeviation,BigDecimal variance,BigDecimal mean,BigDecimal median,BigDecimal numberOfMeasurements,BigDecimal numberOfUniqueValues,BigDecimal skewness,BigDecimal kurtosis,BigDecimal latitude,BigDecimal longitude,String location,String status,String errorMessage,String lastSuccessfulUpdateTime,String createdAt,String updatedAt,String productUrl,String imageUrl,BigDecimal price,Integer numberOfUserVariables,Boolean outcome,BigDecimal minimumRecordedValue,BigDecimal maximumRecordedValue,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response variablesPost(Variable body)
      throws NotFoundException;
  
      public abstract Response variablesIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response variablesIdPut(Integer id,Variable body)
      throws NotFoundException;
  
      public abstract Response variablesIdDelete(Integer id)
      throws NotFoundException;
  
}
