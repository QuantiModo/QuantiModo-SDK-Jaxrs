package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20011;
import io.swagger.model.InlineResponse20036;
import io.swagger.model.Vote;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class VotesApiService {
  
      public abstract Response votesGet(String accessToken,String clientId,Integer userId,Integer causeId,Integer effectId,Integer value,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response votesPost(String accessToken,Vote body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response votesIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response votesIdPut(Integer id,String accessToken,Vote body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response votesIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
