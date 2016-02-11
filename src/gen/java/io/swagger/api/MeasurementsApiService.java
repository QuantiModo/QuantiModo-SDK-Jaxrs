package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.MeasurementPost;
import java.io.File;
import io.swagger.model.InlineResponse20020;
import io.swagger.model.Measurement;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class MeasurementsApiService {
  
      public abstract Response measurementsGet(String accessToken,Integer userId,String clientId,Integer connectorId,Integer variableId,Integer sourceId,String startTime,BigDecimal value,Integer unitId,BigDecimal originalValue,Integer originalUnitId,Integer duration,String note,BigDecimal latitude,BigDecimal longitude,String location,String createdAt,String updatedAt,String error,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response measurementsPost(String accessToken,MeasurementPost body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response measurementsCsvGet(String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response measurementsRequestCsvPost(String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response measurementsIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response measurementsIdPut(Integer id,String accessToken,Measurement body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response measurementsIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
