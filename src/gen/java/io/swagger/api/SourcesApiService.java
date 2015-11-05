package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20013;
import io.swagger.model.Source;
import io.swagger.model.InlineResponse20014;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class SourcesApiService {
  
      public abstract Response sourcesGet(String clientId,String name,String createdAt,String updatedAt,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response sourcesPost(Source body)
      throws NotFoundException;
  
      public abstract Response sourcesIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response sourcesIdPut(Integer id,Source body)
      throws NotFoundException;
  
      public abstract Response sourcesIdDelete(Integer id)
      throws NotFoundException;
  
}
