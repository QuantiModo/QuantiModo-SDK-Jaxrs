package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20024;
import io.swagger.model.InlineResponse20025;
import io.swagger.model.UnitCategory;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class UnitCategoriesApiService {
  
      public abstract Response unitCategoriesGet(String accessToken,String name,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response unitCategoriesPost(String accessToken,UnitCategory body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response unitCategoriesIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response unitCategoriesIdPut(Integer id,String accessToken,UnitCategory body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response unitCategoriesIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
