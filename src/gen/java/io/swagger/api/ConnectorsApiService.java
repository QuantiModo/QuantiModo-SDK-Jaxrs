package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2005;
import io.swagger.model.Connector;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public abstract class ConnectorsApiService {
  
      public abstract Response connectorsGet(String name,String displayName,String image,String getItUrl,String shortDescription,String longDescription,Boolean enabled,Boolean oauth,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response connectorsPost(Connector body)
      throws NotFoundException;
  
      public abstract Response connectorsIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response connectorsIdPut(Integer id,Connector body)
      throws NotFoundException;
  
      public abstract Response connectorsIdDelete(Integer id)
      throws NotFoundException;
  
}
