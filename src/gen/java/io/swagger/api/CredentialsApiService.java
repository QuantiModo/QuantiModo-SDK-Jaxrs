package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.Credential;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class CredentialsApiService {
  
      public abstract Response credentialsGet(Boolean connectorId,String attrKey,String attrValue,String createdAt,String updatedAt,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response credentialsPost(Credential body)
      throws NotFoundException;
  
      public abstract Response credentialsIdGet(Integer id,String attrKey)
      throws NotFoundException;
  
      public abstract Response credentialsIdPut(Integer id,String attrKey,Credential body)
      throws NotFoundException;
  
      public abstract Response credentialsIdDelete(Integer id,String attrKey)
      throws NotFoundException;
  
}
