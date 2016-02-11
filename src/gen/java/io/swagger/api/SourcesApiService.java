package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20021;
import io.swagger.model.Source;
import io.swagger.model.InlineResponse20022;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class SourcesApiService {
  
      public abstract Response sourcesGet(String accessToken,String clientId,String name,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sourcesPost(String accessToken,Source body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sourcesIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sourcesIdPut(Integer id,String accessToken,Source body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sourcesIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
