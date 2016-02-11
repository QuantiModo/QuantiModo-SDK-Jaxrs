package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse20028;
import io.swagger.model.Update;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class UpdatesApiService {
  
      public abstract Response updatesGet(String accessToken,Integer userId,Integer connectorId,Integer numberOfMeasurements,Boolean success,String message,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response updatesPost(String accessToken,Update body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response updatesIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response updatesIdPut(Integer id,String accessToken,Update body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response updatesIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
