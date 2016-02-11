package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.VariableUserSourcesApiService;
import io.swagger.api.factories.VariableUserSourcesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20010;
import io.swagger.model.VariableUserSource;
import io.swagger.model.InlineResponse20033;
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

@Path("/variableUserSources")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the variableUserSources API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class VariableUserSourcesApi  {
   private final VariableUserSourcesApiService delegate = VariableUserSourcesApiServiceFactory.getVariableUserSourcesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all VariableUserSources", notes = "Get all VariableUserSources", response = InlineResponse20010.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableUserSource",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20010.class) })

    public Response variableUserSourcesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of variable") @QueryParam("variable_id") Integer variableId
,@ApiParam(value = "ID of User") @QueryParam("user_id") Integer userId
,@ApiParam(value = "Time that this measurement occurred Uses epoch minute (epoch time divided by 60)") @QueryParam("timestamp") Integer timestamp
,@ApiParam(value = "Earliest measurement time") @QueryParam("earliest_measurement_time") Integer earliestMeasurementTime
,@ApiParam(value = "Latest measurement time") @QueryParam("latest_measurement_time") Integer latestMeasurementTime
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableUserSourcesGet(accessToken,variableId,userId,timestamp,earliestMeasurementTime,latestMeasurementTime,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store VariableUserSource", notes = "Store VariableUserSource", response = InlineResponse20033.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableUserSource",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20033.class) })

    public Response variableUserSourcesPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "VariableUserSource that should be stored" ) VariableUserSource body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableUserSourcesPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get VariableUserSource", notes = "Get VariableUserSource", response = InlineResponse20033.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableUserSource",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20033.class) })

    public Response variableUserSourcesIdGet(
@ApiParam(value = "id of VariableUserSource",required=true) @PathParam("id") Integer id,@ApiParam(value = "source id of VariableUserSource",required=true) @QueryParam("source_id") Integer sourceId
,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableUserSourcesIdGet(id,sourceId,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update VariableUserSource", notes = "Update VariableUserSource", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableUserSource",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variableUserSourcesIdPut(
@ApiParam(value = "variable_id of VariableUserSource",required=true) @PathParam("id") Integer id,@ApiParam(value = "source id of VariableUserSource",required=true) @QueryParam("source_id") Integer sourceId
,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "VariableUserSource that should be updated" ) VariableUserSource body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableUserSourcesIdPut(id,sourceId,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete VariableUserSource", notes = "Delete VariableUserSource", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableUserSource" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variableUserSourcesIdDelete(
@ApiParam(value = "variable_id of VariableUserSource",required=true) @PathParam("id") Integer id,@ApiParam(value = "source id of VariableUserSource",required=true) @QueryParam("source_id") Integer sourceId
,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableUserSourcesIdDelete(id,sourceId,accessToken,securityContext);
    }
}
