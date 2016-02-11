package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2006;
import io.swagger.model.TrackingReminder;
import io.swagger.model.InlineResponse20023;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class TrackingRemindersApiService {
  
      public abstract Response trackingRemindersGet(String accessToken,String clientId,Integer userId,Integer variableId,Boolean popUp,Boolean sms,Boolean email,Boolean notificationBar,String lastReminded,String lastTracked,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response trackingRemindersPost(String accessToken,TrackingReminder body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response trackingRemindersIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response trackingRemindersIdPut(Integer id,String accessToken,TrackingReminder body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response trackingRemindersIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
