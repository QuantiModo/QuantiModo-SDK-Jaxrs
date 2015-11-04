package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UpdatesApiService;
import io.swagger.api.factories.UpdatesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20019;
import io.swagger.model.Update;
import io.swagger.model.InlineResponse20020;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/updates")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/updates", description = "the updates API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class UpdatesApi  {

   private final UpdatesApiService delegate = UpdatesApiServiceFactory.getUpdatesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Updates", notes = "Get all Updates", response = InlineResponse20019.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20019.class) })

    public Response updatesGet(@ApiParam(value = "user_id") @QueryParam("user_id") Integer userId,
    @ApiParam(value = "connector_id") @QueryParam("connector_id") Integer connectorId,
    @ApiParam(value = "number_of_measurements") @QueryParam("number_of_measurements") Integer numberOfMeasurements,
    @ApiParam(value = "success") @QueryParam("success") Boolean success,
    @ApiParam(value = "message") @QueryParam("message") String message,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.updatesGet(userId,connectorId,numberOfMeasurements,success,message,createdAt,updatedAt,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Update", notes = "Store Update", response = InlineResponse20020.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20020.class) })

    public Response updatesPost(@ApiParam(value = "Update that should be stored" ) Update body)
    throws NotFoundException {
        return delegate.updatesPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Update", notes = "Get Update", response = InlineResponse20020.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20020.class) })

    public Response updatesIdGet(@ApiParam(value = "id of Update",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.updatesIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Update", notes = "Update Update", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response updatesIdPut(@ApiParam(value = "id of Update",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "Update that should be updated" ) Update body)
    throws NotFoundException {
        return delegate.updatesIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Update", notes = "Delete Update", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response updatesIdDelete(@ApiParam(value = "id of Update",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.updatesIdDelete(id);
    }
}

