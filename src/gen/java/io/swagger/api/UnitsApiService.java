package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse20017;
import io.swagger.model.InlineResponse20018;
import io.swagger.model.Unit;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class UnitsApiService {
  
      public abstract Response unitsGet(String clientId,String name,String abbreviatedName,Boolean categoryId,BigDecimal minimumValue,BigDecimal maximumValue,Integer updated,BigDecimal multiply,BigDecimal add,String createdAt,String updatedAt,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response unitsPost(Unit body)
      throws NotFoundException;
  
      public abstract Response unitsIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response unitsIdPut(Integer id,Unit body)
      throws NotFoundException;
  
      public abstract Response unitsIdDelete(Integer id)
      throws NotFoundException;
  
}
