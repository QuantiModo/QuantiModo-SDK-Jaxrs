package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20019;
import io.swagger.model.Update;
import io.swagger.model.InlineResponse20020;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public abstract class UpdatesApiService {
  
      public abstract Response updatesGet(Integer userId,Integer connectorId,Integer numberOfMeasurements,Boolean success,String message,String createdAt,String updatedAt,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response updatesPost(Update body)
      throws NotFoundException;
  
      public abstract Response updatesIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response updatesIdPut(Integer id,Update body)
      throws NotFoundException;
  
      public abstract Response updatesIdDelete(Integer id)
      throws NotFoundException;
  
}
