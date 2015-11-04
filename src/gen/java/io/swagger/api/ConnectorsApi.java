package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ConnectorsApiService;
import io.swagger.api.factories.ConnectorsApiServiceFactory;

import io.swagger.annotations.ApiParam;

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
import javax.ws.rs.*;

@Path("/api/v2/connectors")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/connectors", description = "the connectors API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class ConnectorsApi  {

   private final ConnectorsApiService delegate = ConnectorsApiServiceFactory.getConnectorsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Connectors", notes = "Get all Connectors", response = InlineResponse2005.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2005.class) })

    public Response connectorsGet(@ApiParam(value = "name") @QueryParam("name") String name,
    @ApiParam(value = "display_name") @QueryParam("display_name") String displayName,
    @ApiParam(value = "image") @QueryParam("image") String image,
    @ApiParam(value = "get_it_url") @QueryParam("get_it_url") String getItUrl,
    @ApiParam(value = "short_description") @QueryParam("short_description") String shortDescription,
    @ApiParam(value = "long_description") @QueryParam("long_description") String longDescription,
    @ApiParam(value = "enabled") @QueryParam("enabled") Boolean enabled,
    @ApiParam(value = "oauth") @QueryParam("oauth") Boolean oauth,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.connectorsGet(name,displayName,image,getItUrl,shortDescription,longDescription,enabled,oauth,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Connector", notes = "Store Connector", response = InlineResponse2006.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2006.class) })

    public Response connectorsPost(@ApiParam(value = "Connector that should be stored" ) Connector body)
    throws NotFoundException {
        return delegate.connectorsPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Connector", notes = "Get Connector", response = InlineResponse2006.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2006.class) })

    public Response connectorsIdGet(@ApiParam(value = "id of Connector",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.connectorsIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Connector", notes = "Update Connector", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response connectorsIdPut(@ApiParam(value = "id of Connector",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "Connector that should be updated" ) Connector body)
    throws NotFoundException {
        return delegate.connectorsIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Connector", notes = "Delete Connector", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response connectorsIdDelete(@ApiParam(value = "id of Connector",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.connectorsIdDelete(id);
    }
}

