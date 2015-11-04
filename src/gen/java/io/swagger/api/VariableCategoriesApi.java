package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.VariableCategoriesApiService;
import io.swagger.api.factories.VariableCategoriesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20023;
import java.math.BigDecimal;
import io.swagger.model.VariableCategory;
import io.swagger.model.InlineResponse20024;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/variableCategories")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/variableCategories", description = "the variableCategories API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class VariableCategoriesApi  {

   private final VariableCategoriesApiService delegate = VariableCategoriesApiServiceFactory.getVariableCategoriesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all VariableCategories", notes = "Get all VariableCategories", response = InlineResponse20023.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20023.class) })

    public Response variableCategoriesGet(@ApiParam(value = "name") @QueryParam("name") String name,
    @ApiParam(value = "filling_value") @QueryParam("filling_value") BigDecimal fillingValue,
    @ApiParam(value = "maximum_allowed_value") @QueryParam("maximum_allowed_value") BigDecimal maximumAllowedValue,
    @ApiParam(value = "minimum_allowed_value") @QueryParam("minimum_allowed_value") BigDecimal minimumAllowedValue,
    @ApiParam(value = "duration_of_action") @QueryParam("duration_of_action") Integer durationOfAction,
    @ApiParam(value = "onset_delay") @QueryParam("onset_delay") Integer onsetDelay,
    @ApiParam(value = "combination_operation") @QueryParam("combination_operation") String combinationOperation,
    @ApiParam(value = "updated") @QueryParam("updated") Integer updated,
    @ApiParam(value = "cause_only") @QueryParam("cause_only") Boolean causeOnly,
    @ApiParam(value = "public") @QueryParam("public") Integer _public,
    @ApiParam(value = "outcome") @QueryParam("outcome") Boolean outcome,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "image_url") @QueryParam("image_url") String imageUrl,
    @ApiParam(value = "default_unit_id") @QueryParam("default_unit_id") Integer defaultUnitId,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.variableCategoriesGet(name,fillingValue,maximumAllowedValue,minimumAllowedValue,durationOfAction,onsetDelay,combinationOperation,updated,causeOnly,_public,outcome,createdAt,updatedAt,imageUrl,defaultUnitId,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store VariableCategory", notes = "Store VariableCategory", response = InlineResponse20024.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20024.class) })

    public Response variableCategoriesPost(@ApiParam(value = "VariableCategory that should be stored" ) VariableCategory body)
    throws NotFoundException {
        return delegate.variableCategoriesPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get VariableCategory", notes = "Get VariableCategory", response = InlineResponse20024.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20024.class) })

    public Response variableCategoriesIdGet(@ApiParam(value = "id of VariableCategory",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.variableCategoriesIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update VariableCategory", notes = "Update VariableCategory", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variableCategoriesIdPut(@ApiParam(value = "id of VariableCategory",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "VariableCategory that should be updated" ) VariableCategory body)
    throws NotFoundException {
        return delegate.variableCategoriesIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete VariableCategory", notes = "Delete VariableCategory", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variableCategoriesIdDelete(@ApiParam(value = "id of VariableCategory",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.variableCategoriesIdDelete(id);
    }
}

