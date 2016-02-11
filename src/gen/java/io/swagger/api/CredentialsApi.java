package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CredentialsApiService;
import io.swagger.api.factories.CredentialsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2004;
import io.swagger.model.Credential;
import io.swagger.model.InlineResponse20019;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/credentials")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the credentials API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class CredentialsApi  {
   private final CredentialsApiService delegate = CredentialsApiServiceFactory.getCredentialsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Credentials", notes = "Get all Credentials", response = InlineResponse2004.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Credential",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2004.class) })

    public Response credentialsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of user that owns this credential") @QueryParam("user_id") Integer userId
,@ApiParam(value = "The id for the connector data source from which the credential was obtained") @QueryParam("connector_id") Integer connectorId
,@ApiParam(value = "Attribute name such as token, userid, username, or password") @QueryParam("attr_key") String attrKey
,@ApiParam(value = "Encrypted value for the attribute specified") @QueryParam("attr_value") String attrValue
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.credentialsGet(accessToken,userId,connectorId,attrKey,attrValue,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Credential", notes = "Store Credential", response = InlineResponse20019.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Credential",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20019.class) })

    public Response credentialsPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Credential that should be stored" ) Credential body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.credentialsPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Credential", notes = "Get Credential", response = InlineResponse20019.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Credential",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20019.class) })

    public Response credentialsIdGet(
@ApiParam(value = "connector id",required=true) @PathParam("id") Integer id,@ApiParam(value = "attrKey",required=true) @QueryParam("attrKey") String attrKey
,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.credentialsIdGet(id,attrKey,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Credential", notes = "Update Credential", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Credential",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response credentialsIdPut(
@ApiParam(value = "connector id",required=true) @PathParam("id") Integer id,@ApiParam(value = "attrKey",required=true) @QueryParam("attrKey") String attrKey
,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Credential that should be updated" ) Credential body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.credentialsIdPut(id,attrKey,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Credential", notes = "Delete Credential", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Credential" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response credentialsIdDelete(
@ApiParam(value = "connector id",required=true) @PathParam("id") Integer id,@ApiParam(value = "attrKey",required=true) @QueryParam("attrKey") String attrKey
,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.credentialsIdDelete(id,attrKey,accessToken,securityContext);
    }
}
