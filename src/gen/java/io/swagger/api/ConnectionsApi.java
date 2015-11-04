package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ConnectionsApiService;
import io.swagger.api.factories.ConnectionsApiServiceFactory;

import io.swagger.annotations.ApiParam;

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
import javax.ws.rs.*;

@Path("/api/v2/connections")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/connections", description = "the connections API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class ConnectionsApi  {

   private final ConnectionsApiService delegate = ConnectionsApiServiceFactory.getConnectionsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Connections", notes = "Get all Connections", response = InlineResponse2003.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2003.class) })

    public Response connectionsGet(@ApiParam(value = "user_id") @QueryParam("user_id") Integer userId,
    @ApiParam(value = "connector_id") @QueryParam("connector_id") Integer connectorId,
    @ApiParam(value = "connect_status") @QueryParam("connect_status") String connectStatus,
    @ApiParam(value = "connect_error") @QueryParam("connect_error") String connectError,
    @ApiParam(value = "update_requested_at") @QueryParam("update_requested_at") String updateRequestedAt,
    @ApiParam(value = "update_status") @QueryParam("update_status") String updateStatus,
    @ApiParam(value = "update_error") @QueryParam("update_error") String updateError,
    @ApiParam(value = "last_successful_updated_at") @QueryParam("last_successful_updated_at") String lastSuccessfulUpdatedAt,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.connectionsGet(userId,connectorId,connectStatus,connectError,updateRequestedAt,updateStatus,updateError,lastSuccessfulUpdatedAt,createdAt,updatedAt,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Connection", notes = "Store Connection", response = InlineResponse2004.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2004.class) })

    public Response connectionsPost(@ApiParam(value = "Connection that should be stored" ) Connection body)
    throws NotFoundException {
        return delegate.connectionsPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Connection", notes = "Get Connection", response = InlineResponse2004.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2004.class) })

    public Response connectionsIdGet(@ApiParam(value = "id of Connection",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.connectionsIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Connection", notes = "Update Connection", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response connectionsIdPut(@ApiParam(value = "id of Connection",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "Connection that should be updated" ) Connection body)
    throws NotFoundException {
        return delegate.connectionsIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Connection", notes = "Delete Connection", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response connectionsIdDelete(@ApiParam(value = "id of Connection",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.connectionsIdDelete(id);
    }
}

