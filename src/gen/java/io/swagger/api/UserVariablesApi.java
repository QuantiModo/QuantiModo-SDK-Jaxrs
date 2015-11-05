package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserVariablesApiService;
import io.swagger.api.factories.UserVariablesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20021;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20022;
import io.swagger.model.UserVariable;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/userVariables")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/userVariables", description = "the userVariables API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class UserVariablesApi  {

   private final UserVariablesApiService delegate = UserVariablesApiServiceFactory.getUserVariablesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all UserVariables", notes = "Get all UserVariables", response = InlineResponse20021.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20021.class) })

    public Response userVariablesGet(@ApiParam(value = "client_id") @QueryParam("client_id") String clientId,
    @ApiParam(value = "variable_id") @QueryParam("variable_id") Integer variableId,
    @ApiParam(value = "default_unit_id") @QueryParam("default_unit_id") Integer defaultUnitId,
    @ApiParam(value = "minimum_allowed_value") @QueryParam("minimum_allowed_value") BigDecimal minimumAllowedValue,
    @ApiParam(value = "maximum_allowed_value") @QueryParam("maximum_allowed_value") BigDecimal maximumAllowedValue,
    @ApiParam(value = "filling_value") @QueryParam("filling_value") BigDecimal fillingValue,
    @ApiParam(value = "join_with") @QueryParam("join_with") Integer joinWith,
    @ApiParam(value = "onset_delay") @QueryParam("onset_delay") Integer onsetDelay,
    @ApiParam(value = "duration_of_action") @QueryParam("duration_of_action") Integer durationOfAction,
    @ApiParam(value = "variable_category_id") @QueryParam("variable_category_id") Integer variableCategoryId,
    @ApiParam(value = "updated") @QueryParam("updated") Integer updated,
    @ApiParam(value = "public") @QueryParam("public") Integer _public,
    @ApiParam(value = "cause_only") @QueryParam("cause_only") Boolean causeOnly,
    @ApiParam(value = "filling_type") @QueryParam("filling_type") String fillingType,
    @ApiParam(value = "number_of_measurements") @QueryParam("number_of_measurements") Integer numberOfMeasurements,
    @ApiParam(value = "number_of_processed_measurements") @QueryParam("number_of_processed_measurements") Integer numberOfProcessedMeasurements,
    @ApiParam(value = "measurements_at_last_analysis") @QueryParam("measurements_at_last_analysis") Integer measurementsAtLastAnalysis,
    @ApiParam(value = "last_unit_id") @QueryParam("last_unit_id") Integer lastUnitId,
    @ApiParam(value = "last_original_unit_id") @QueryParam("last_original_unit_id") Integer lastOriginalUnitId,
    @ApiParam(value = "last_original_value") @QueryParam("last_original_value") Integer lastOriginalValue,
    @ApiParam(value = "last_value") @QueryParam("last_value") BigDecimal lastValue,
    @ApiParam(value = "last_source_id") @QueryParam("last_source_id") Integer lastSourceId,
    @ApiParam(value = "number_of_correlations") @QueryParam("number_of_correlations") Integer numberOfCorrelations,
    @ApiParam(value = "status") @QueryParam("status") String status,
    @ApiParam(value = "error_message") @QueryParam("error_message") String errorMessage,
    @ApiParam(value = "last_successful_update_time") @QueryParam("last_successful_update_time") String lastSuccessfulUpdateTime,
    @ApiParam(value = "standard_deviation") @QueryParam("standard_deviation") BigDecimal standardDeviation,
    @ApiParam(value = "variance") @QueryParam("variance") BigDecimal variance,
    @ApiParam(value = "minimum_recorded_daily_value") @QueryParam("minimum_recorded_daily_value") BigDecimal minimumRecordedDailyValue,
    @ApiParam(value = "maximum_recorded_daily_value") @QueryParam("maximum_recorded_daily_value") BigDecimal maximumRecordedDailyValue,
    @ApiParam(value = "mean") @QueryParam("mean") BigDecimal mean,
    @ApiParam(value = "median") @QueryParam("median") BigDecimal median,
    @ApiParam(value = "most_common_unit_id") @QueryParam("most_common_unit_id") Integer mostCommonUnitId,
    @ApiParam(value = "most_common_value") @QueryParam("most_common_value") BigDecimal mostCommonValue,
    @ApiParam(value = "number_of_unique_daily_values") @QueryParam("number_of_unique_daily_values") BigDecimal numberOfUniqueDailyValues,
    @ApiParam(value = "number_of_changes") @QueryParam("number_of_changes") Integer numberOfChanges,
    @ApiParam(value = "skewness") @QueryParam("skewness") BigDecimal skewness,
    @ApiParam(value = "kurtosis") @QueryParam("kurtosis") BigDecimal kurtosis,
    @ApiParam(value = "latitude") @QueryParam("latitude") BigDecimal latitude,
    @ApiParam(value = "longitude") @QueryParam("longitude") BigDecimal longitude,
    @ApiParam(value = "location") @QueryParam("location") String location,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "outcome") @QueryParam("outcome") Boolean outcome,
    @ApiParam(value = "sources") @QueryParam("sources") String sources,
    @ApiParam(value = "earliest_source_time") @QueryParam("earliest_source_time") Integer earliestSourceTime,
    @ApiParam(value = "latest_source_time") @QueryParam("latest_source_time") Integer latestSourceTime,
    @ApiParam(value = "earliest_measurement_time") @QueryParam("earliest_measurement_time") Integer earliestMeasurementTime,
    @ApiParam(value = "latest_measurement_time") @QueryParam("latest_measurement_time") Integer latestMeasurementTime,
    @ApiParam(value = "earliest_filling_time") @QueryParam("earliest_filling_time") Integer earliestFillingTime,
    @ApiParam(value = "latest_filling_time") @QueryParam("latest_filling_time") Integer latestFillingTime,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.userVariablesGet(clientId,variableId,defaultUnitId,minimumAllowedValue,maximumAllowedValue,fillingValue,joinWith,onsetDelay,durationOfAction,variableCategoryId,updated,_public,causeOnly,fillingType,numberOfMeasurements,numberOfProcessedMeasurements,measurementsAtLastAnalysis,lastUnitId,lastOriginalUnitId,lastOriginalValue,lastValue,lastSourceId,numberOfCorrelations,status,errorMessage,lastSuccessfulUpdateTime,standardDeviation,variance,minimumRecordedDailyValue,maximumRecordedDailyValue,mean,median,mostCommonUnitId,mostCommonValue,numberOfUniqueDailyValues,numberOfChanges,skewness,kurtosis,latitude,longitude,location,createdAt,updatedAt,outcome,sources,earliestSourceTime,latestSourceTime,earliestMeasurementTime,latestMeasurementTime,earliestFillingTime,latestFillingTime,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store UserVariable", notes = "Store UserVariable", response = InlineResponse20022.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20022.class) })

    public Response userVariablesPost(@ApiParam(value = "UserVariable that should be stored" ) UserVariable body)
    throws NotFoundException {
        return delegate.userVariablesPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get UserVariable", notes = "Get UserVariable", response = InlineResponse20022.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20022.class) })

    public Response userVariablesIdGet(@ApiParam(value = "id of UserVariable",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.userVariablesIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update UserVariable", notes = "Update UserVariable", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response userVariablesIdPut(@ApiParam(value = "id of UserVariable",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "UserVariable that should be updated" ) UserVariable body)
    throws NotFoundException {
        return delegate.userVariablesIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete UserVariable", notes = "Delete UserVariable", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response userVariablesIdDelete(@ApiParam(value = "id of UserVariable",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.userVariablesIdDelete(id);
    }
}

