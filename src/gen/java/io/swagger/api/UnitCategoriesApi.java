package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UnitCategoriesApiService;
import io.swagger.api.factories.UnitCategoriesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20015;
import io.swagger.model.UnitCategory;
import io.swagger.model.InlineResponse20016;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/unitCategories")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/unitCategories", description = "the unitCategories API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class UnitCategoriesApi  {

   private final UnitCategoriesApiService delegate = UnitCategoriesApiServiceFactory.getUnitCategoriesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all UnitCategories", notes = "Get all UnitCategories", response = InlineResponse20015.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20015.class) })

    public Response unitCategoriesGet(@ApiParam(value = "name") @QueryParam("name") String name,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.unitCategoriesGet(name,createdAt,updatedAt,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store UnitCategory", notes = "Store UnitCategory", response = InlineResponse20016.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20016.class) })

    public Response unitCategoriesPost(@ApiParam(value = "UnitCategory that should be stored" ) UnitCategory body)
    throws NotFoundException {
        return delegate.unitCategoriesPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get UnitCategory", notes = "Get UnitCategory", response = InlineResponse20016.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20016.class) })

    public Response unitCategoriesIdGet(@ApiParam(value = "id of UnitCategory",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.unitCategoriesIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update UnitCategory", notes = "Update UnitCategory", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response unitCategoriesIdPut(@ApiParam(value = "id of UnitCategory",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "UnitCategory that should be updated" ) UnitCategory body)
    throws NotFoundException {
        return delegate.unitCategoriesIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete UnitCategory", notes = "Delete UnitCategory", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response unitCategoriesIdDelete(@ApiParam(value = "id of UnitCategory",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.unitCategoriesIdDelete(id);
    }
}

