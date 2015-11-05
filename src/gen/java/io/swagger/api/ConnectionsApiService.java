package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.Connection;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class ConnectionsApiService {
  
      public abstract Response connectionsGet(Integer userId,Integer connectorId,String connectStatus,String connectError,String updateRequestedAt,String updateStatus,String updateError,String lastSuccessfulUpdatedAt,String createdAt,String updatedAt,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response connectionsPost(Connection body)
      throws NotFoundException;
  
      public abstract Response connectionsIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response connectionsIdPut(Integer id,Connection body)
      throws NotFoundException;
  
      public abstract Response connectionsIdDelete(Integer id)
      throws NotFoundException;
  
}
