package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.VariablesApiService;
import io.swagger.api.factories.VariablesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20027;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20028;
import io.swagger.model.Variable;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/variables")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/variables", description = "the variables API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class VariablesApi  {

   private final VariablesApiService delegate = VariablesApiServiceFactory.getVariablesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Variables", notes = "Get all Variables", response = InlineResponse20027.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20027.class) })

    public Response variablesGet(@ApiParam(value = "id") @QueryParam("id") Integer id,
    @ApiParam(value = "client_id") @QueryParam("client_id") String clientId,
    @ApiParam(value = "parent_id") @QueryParam("parent_id") Integer parentId,
    @ApiParam(value = "name") @QueryParam("name") String name,
    @ApiParam(value = "variable_category_id") @QueryParam("variable_category_id") Integer variableCategoryId,
    @ApiParam(value = "default_unit_id") @QueryParam("default_unit_id") Integer defaultUnitId,
    @ApiParam(value = "combination_operation") @QueryParam("combination_operation") String combinationOperation,
    @ApiParam(value = "filling_value") @QueryParam("filling_value") BigDecimal fillingValue,
    @ApiParam(value = "maximum_allowed_value") @QueryParam("maximum_allowed_value") BigDecimal maximumAllowedValue,
    @ApiParam(value = "minimum_allowed_value") @QueryParam("minimum_allowed_value") BigDecimal minimumAllowedValue,
    @ApiParam(value = "onset_delay") @QueryParam("onset_delay") Integer onsetDelay,
    @ApiParam(value = "duration_of_action") @QueryParam("duration_of_action") Integer durationOfAction,
    @ApiParam(value = "public") @QueryParam("public") Integer _public,
    @ApiParam(value = "cause_only") @QueryParam("cause_only") Boolean causeOnly,
    @ApiParam(value = "most_common_value") @QueryParam("most_common_value") BigDecimal mostCommonValue,
    @ApiParam(value = "most_common_unit_id") @QueryParam("most_common_unit_id") Integer mostCommonUnitId,
    @ApiParam(value = "standard_deviation") @QueryParam("standard_deviation") BigDecimal standardDeviation,
    @ApiParam(value = "variance") @QueryParam("variance") BigDecimal variance,
    @ApiParam(value = "mean") @QueryParam("mean") BigDecimal mean,
    @ApiParam(value = "median") @QueryParam("median") BigDecimal median,
    @ApiParam(value = "number_of_measurements") @QueryParam("number_of_measurements") BigDecimal numberOfMeasurements,
    @ApiParam(value = "number_of_unique_values") @QueryParam("number_of_unique_values") BigDecimal numberOfUniqueValues,
    @ApiParam(value = "skewness") @QueryParam("skewness") BigDecimal skewness,
    @ApiParam(value = "kurtosis") @QueryParam("kurtosis") BigDecimal kurtosis,
    @ApiParam(value = "latitude") @QueryParam("latitude") BigDecimal latitude,
    @ApiParam(value = "longitude") @QueryParam("longitude") BigDecimal longitude,
    @ApiParam(value = "location") @QueryParam("location") String location,
    @ApiParam(value = "status") @QueryParam("status") String status,
    @ApiParam(value = "error_message") @QueryParam("error_message") String errorMessage,
    @ApiParam(value = "last_successful_update_time") @QueryParam("last_successful_update_time") String lastSuccessfulUpdateTime,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "product_url") @QueryParam("product_url") String productUrl,
    @ApiParam(value = "image_url") @QueryParam("image_url") String imageUrl,
    @ApiParam(value = "price") @QueryParam("price") BigDecimal price,
    @ApiParam(value = "number_of_user_variables") @QueryParam("number_of_user_variables") Integer numberOfUserVariables,
    @ApiParam(value = "outcome") @QueryParam("outcome") Boolean outcome,
    @ApiParam(value = "minimum_recorded_value") @QueryParam("minimum_recorded_value") BigDecimal minimumRecordedValue,
    @ApiParam(value = "maximum_recorded_value") @QueryParam("maximum_recorded_value") BigDecimal maximumRecordedValue,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.variablesGet(id,clientId,parentId,name,variableCategoryId,defaultUnitId,combinationOperation,fillingValue,maximumAllowedValue,minimumAllowedValue,onsetDelay,durationOfAction,_public,causeOnly,mostCommonValue,mostCommonUnitId,standardDeviation,variance,mean,median,numberOfMeasurements,numberOfUniqueValues,skewness,kurtosis,latitude,longitude,location,status,errorMessage,lastSuccessfulUpdateTime,createdAt,updatedAt,productUrl,imageUrl,price,numberOfUserVariables,outcome,minimumRecordedValue,maximumRecordedValue,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Variable", notes = "Store Variable", response = InlineResponse20028.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20028.class) })

    public Response variablesPost(@ApiParam(value = "Variable that should be stored" ) Variable body)
    throws NotFoundException {
        return delegate.variablesPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Variable", notes = "Get Variable", response = InlineResponse20028.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20028.class) })

    public Response variablesIdGet(@ApiParam(value = "id of Variable",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.variablesIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Variable", notes = "Update Variable", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variablesIdPut(@ApiParam(value = "id of Variable",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "Variable that should be updated" ) Variable body)
    throws NotFoundException {
        return delegate.variablesIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Variable", notes = "Delete Variable", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variablesIdDelete(@ApiParam(value = "id of Variable",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.variablesIdDelete(id);
    }
}

