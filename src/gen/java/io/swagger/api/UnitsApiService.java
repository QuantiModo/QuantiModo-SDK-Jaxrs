package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20026;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20027;
import io.swagger.model.Unit;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class UnitsApiService {
  
      public abstract Response unitsGet(String accessToken,String clientId,String name,String abbreviatedName,Integer categoryId,BigDecimal minimumValue,BigDecimal maximumValue,Integer updated,Integer defaultUnitId,BigDecimal multiply,BigDecimal add,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response unitsPost(String accessToken,Unit body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response unitsIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response unitsIdPut(Integer id,String accessToken,Unit body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response unitsIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
