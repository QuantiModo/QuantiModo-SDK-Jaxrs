package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.VariableUserSourcesApiService;
import io.swagger.api.factories.VariableUserSourcesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20025;
import io.swagger.model.InlineResponse20026;
import io.swagger.model.VariableUserSource;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/variableUserSources")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/variableUserSources", description = "the variableUserSources API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class VariableUserSourcesApi  {

   private final VariableUserSourcesApiService delegate = VariableUserSourcesApiServiceFactory.getVariableUserSourcesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all VariableUserSources", notes = "Get all VariableUserSources", response = InlineResponse20025.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20025.class) })

    public Response variableUserSourcesGet(@ApiParam(value = "variable_id") @QueryParam("variable_id") Integer variableId,
    @ApiParam(value = "user_id") @QueryParam("user_id") Integer userId,
    @ApiParam(value = "timestamp") @QueryParam("timestamp") Integer timestamp,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.variableUserSourcesGet(variableId,userId,timestamp,createdAt,updatedAt,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store VariableUserSource", notes = "Store VariableUserSource", response = InlineResponse20026.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20026.class) })

    public Response variableUserSourcesPost(@ApiParam(value = "VariableUserSource that should be stored" ) VariableUserSource body)
    throws NotFoundException {
        return delegate.variableUserSourcesPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get VariableUserSource", notes = "Get VariableUserSource", response = InlineResponse20026.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20026.class) })

    public Response variableUserSourcesIdGet(@ApiParam(value = "id of VariableUserSource",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "source id of VariableUserSource",required=true) @QueryParam("source_id") Integer sourceId)
    throws NotFoundException {
        return delegate.variableUserSourcesIdGet(id,sourceId);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update VariableUserSource", notes = "Update VariableUserSource", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variableUserSourcesIdPut(@ApiParam(value = "variable_id of VariableUserSource",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "source id of VariableUserSource",required=true) @QueryParam("source_id") Integer sourceId,
    @ApiParam(value = "VariableUserSource that should be updated" ) VariableUserSource body)
    throws NotFoundException {
        return delegate.variableUserSourcesIdPut(id,sourceId,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete VariableUserSource", notes = "Delete VariableUserSource", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variableUserSourcesIdDelete(@ApiParam(value = "variable_id of VariableUserSource",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "source id of VariableUserSource",required=true) @QueryParam("source_id") Integer sourceId)
    throws NotFoundException {
        return delegate.variableUserSourcesIdDelete(id,sourceId);
    }
}

