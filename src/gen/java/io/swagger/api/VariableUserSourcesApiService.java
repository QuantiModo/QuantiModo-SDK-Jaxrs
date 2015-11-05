package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20025;
import io.swagger.model.InlineResponse20026;
import io.swagger.model.VariableUserSource;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class VariableUserSourcesApiService {
  
      public abstract Response variableUserSourcesGet(Integer variableId,Integer userId,Integer timestamp,String createdAt,String updatedAt,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response variableUserSourcesPost(VariableUserSource body)
      throws NotFoundException;
  
      public abstract Response variableUserSourcesIdGet(Integer id,Integer sourceId)
      throws NotFoundException;
  
      public abstract Response variableUserSourcesIdPut(Integer id,Integer sourceId,VariableUserSource body)
      throws NotFoundException;
  
      public abstract Response variableUserSourcesIdDelete(Integer id,Integer sourceId)
      throws NotFoundException;
  
}
