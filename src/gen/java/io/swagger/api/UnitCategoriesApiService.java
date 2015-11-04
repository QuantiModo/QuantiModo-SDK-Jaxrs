package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20015;
import io.swagger.model.UnitCategory;
import io.swagger.model.InlineResponse20016;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public abstract class UnitCategoriesApiService {
  
      public abstract Response unitCategoriesGet(String name,String createdAt,String updatedAt,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response unitCategoriesPost(UnitCategory body)
      throws NotFoundException;
  
      public abstract Response unitCategoriesIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response unitCategoriesIdPut(Integer id,UnitCategory body)
      throws NotFoundException;
  
      public abstract Response unitCategoriesIdDelete(Integer id)
      throws NotFoundException;
  
}
