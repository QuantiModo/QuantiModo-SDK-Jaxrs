package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse20014;
import io.swagger.model.Connection;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class ConnectionsApiService {
  
      public abstract Response connectionsGet(String accessToken,Integer userId,Integer connectorId,String connectStatus,String connectError,String updateRequestedAt,String updateStatus,String updateError,String lastSuccessfulUpdatedAt,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response connectionsPost(String accessToken,Connection body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response connectionsIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response connectionsIdPut(Integer id,String accessToken,Connection body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response connectionsIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
