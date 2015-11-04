package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UnitsApiService;
import io.swagger.api.factories.UnitsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse20017;
import io.swagger.model.InlineResponse20018;
import io.swagger.model.Unit;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/units")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/units", description = "the units API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class UnitsApi  {

   private final UnitsApiService delegate = UnitsApiServiceFactory.getUnitsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Units", notes = "Get all Units", response = InlineResponse20017.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20017.class) })

    public Response unitsGet(@ApiParam(value = "client_id") @QueryParam("client_id") String clientId,
    @ApiParam(value = "name") @QueryParam("name") String name,
    @ApiParam(value = "abbreviated_name") @QueryParam("abbreviated_name") String abbreviatedName,
    @ApiParam(value = "category_id") @QueryParam("category_id") Boolean categoryId,
    @ApiParam(value = "minimum_value") @QueryParam("minimum_value") BigDecimal minimumValue,
    @ApiParam(value = "maximum_value") @QueryParam("maximum_value") BigDecimal maximumValue,
    @ApiParam(value = "updated") @QueryParam("updated") Integer updated,
    @ApiParam(value = "multiply") @QueryParam("multiply") BigDecimal multiply,
    @ApiParam(value = "add") @QueryParam("add") BigDecimal add,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.unitsGet(clientId,name,abbreviatedName,categoryId,minimumValue,maximumValue,updated,multiply,add,createdAt,updatedAt,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Unit", notes = "Store Unit", response = InlineResponse20018.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20018.class) })

    public Response unitsPost(@ApiParam(value = "Unit that should be stored" ) Unit body)
    throws NotFoundException {
        return delegate.unitsPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Unit", notes = "Get Unit", response = InlineResponse20018.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20018.class) })

    public Response unitsIdGet(@ApiParam(value = "id of Unit",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.unitsIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Unit", notes = "Update Unit", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response unitsIdPut(@ApiParam(value = "id of Unit",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "Unit that should be updated" ) Unit body)
    throws NotFoundException {
        return delegate.unitsIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Unit", notes = "Delete Unit", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response unitsIdDelete(@ApiParam(value = "id of Unit",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.unitsIdDelete(id);
    }
}

