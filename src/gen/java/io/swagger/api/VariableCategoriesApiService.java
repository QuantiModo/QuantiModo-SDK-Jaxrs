package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20031;
import java.math.BigDecimal;
import io.swagger.model.VariableCategory;
import io.swagger.model.InlineResponse20032;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class VariableCategoriesApiService {
  
      public abstract Response variableCategoriesGet(String accessToken,String name,BigDecimal fillingValue,BigDecimal maximumAllowedValue,BigDecimal minimumAllowedValue,Integer durationOfAction,Integer onsetDelay,String combinationOperation,Integer updated,Boolean causeOnly,Integer _public,Boolean outcome,String createdAt,String updatedAt,String imageUrl,Integer defaultUnitId,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response variableCategoriesPost(String accessToken,VariableCategory body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response variableCategoriesIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response variableCategoriesIdPut(Integer id,String accessToken,VariableCategory body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response variableCategoriesIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
