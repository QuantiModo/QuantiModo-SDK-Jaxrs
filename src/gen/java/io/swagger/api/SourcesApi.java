package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SourcesApiService;
import io.swagger.api.factories.SourcesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20013;
import io.swagger.model.Source;
import io.swagger.model.InlineResponse20014;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/sources")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/sources", description = "the sources API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class SourcesApi  {

   private final SourcesApiService delegate = SourcesApiServiceFactory.getSourcesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Sources", notes = "Get all Sources", response = InlineResponse20013.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20013.class) })

    public Response sourcesGet(@ApiParam(value = "client_id") @QueryParam("client_id") String clientId,
    @ApiParam(value = "name") @QueryParam("name") String name,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.sourcesGet(clientId,name,createdAt,updatedAt,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Source", notes = "Store Source", response = InlineResponse20014.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20014.class) })

    public Response sourcesPost(@ApiParam(value = "Source that should be stored" ) Source body)
    throws NotFoundException {
        return delegate.sourcesPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Source", notes = "Get Source", response = InlineResponse20014.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20014.class) })

    public Response sourcesIdGet(@ApiParam(value = "id of Source",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.sourcesIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Source", notes = "Update Source", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response sourcesIdPut(@ApiParam(value = "id of Source",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "Source that should be updated" ) Source body)
    throws NotFoundException {
        return delegate.sourcesIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Source", notes = "Delete Source", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response sourcesIdDelete(@ApiParam(value = "id of Source",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.sourcesIdDelete(id);
    }
}

