package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserVariablesApiService;
import io.swagger.api.factories.UserVariablesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2009;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20030;
import io.swagger.model.UserVariable;
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

@Path("/userVariables")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the userVariables API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class UserVariablesApi  {
   private final UserVariablesApiService delegate = UserVariablesApiServiceFactory.getUserVariablesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all UserVariables", notes = "Get all UserVariables", response = InlineResponse2009.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "UserVariable",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2009.class) })

    public Response userVariablesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "The ID of the client application which last created or updated this user variable") @QueryParam("client_id") String clientId
,@ApiParam(value = "ID of the parent variable if this variable has any parent") @QueryParam("parent_id") Integer parentId
,@ApiParam(value = "ID of variable") @QueryParam("variable_id") Integer variableId
,@ApiParam(value = "User ID") @QueryParam("user_id") Integer userId
,@ApiParam(value = "D of unit to use for this variable") @QueryParam("default_unit_id") Integer defaultUnitId
,@ApiParam(value = "Minimum reasonable value for this variable (uses default unit)") @QueryParam("minimum_allowed_value") BigDecimal minimumAllowedValue
,@ApiParam(value = "Maximum reasonable value for this variable (uses default unit)") @QueryParam("maximum_allowed_value") BigDecimal maximumAllowedValue
,@ApiParam(value = "Value for replacing null measurements") @QueryParam("filling_value") BigDecimal fillingValue
,@ApiParam(value = "The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables") @QueryParam("join_with") Integer joinWith
,@ApiParam(value = "Estimated number of seconds that pass before a stimulus produces a perceivable effect") @QueryParam("onset_delay") Integer onsetDelay
,@ApiParam(value = "Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect") @QueryParam("duration_of_action") Integer durationOfAction
,@ApiParam(value = "ID of variable category") @QueryParam("variable_category_id") Integer variableCategoryId
,@ApiParam(value = "updated") @QueryParam("updated") Integer updated
,@ApiParam(value = "Is variable public") @QueryParam("public") Integer _public
,@ApiParam(value = "A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user") @QueryParam("cause_only") Boolean causeOnly
,@ApiParam(value = "0 -> No filling, 1 -> Use filling-value") @QueryParam("filling_type") String fillingType
,@ApiParam(value = "Number of measurements") @QueryParam("number_of_measurements") Integer numberOfMeasurements
,@ApiParam(value = "Number of processed measurements") @QueryParam("number_of_processed_measurements") Integer numberOfProcessedMeasurements
,@ApiParam(value = "Number of measurements at last analysis") @QueryParam("measurements_at_last_analysis") Integer measurementsAtLastAnalysis
,@ApiParam(value = "ID of last Unit") @QueryParam("last_unit_id") Integer lastUnitId
,@ApiParam(value = "ID of last original Unit") @QueryParam("last_original_unit_id") Integer lastOriginalUnitId
,@ApiParam(value = "Last original value which is stored") @QueryParam("last_original_value") Integer lastOriginalValue
,@ApiParam(value = "Last Value") @QueryParam("last_value") BigDecimal lastValue
,@ApiParam(value = "Last original value which is stored") @QueryParam("last_original_value") BigDecimal lastOriginalValue2
,@ApiParam(value = "ID of last source") @QueryParam("last_source_id") Integer lastSourceId
,@ApiParam(value = "Number of correlations for this variable") @QueryParam("number_of_correlations") Integer numberOfCorrelations
,@ApiParam(value = "status") @QueryParam("status") String status
,@ApiParam(value = "error_message") @QueryParam("error_message") String errorMessage
,@ApiParam(value = "When this variable or its settings were last updated") @QueryParam("last_successful_update_time") String lastSuccessfulUpdateTime
,@ApiParam(value = "Standard deviation") @QueryParam("standard_deviation") BigDecimal standardDeviation
,@ApiParam(value = "Variance") @QueryParam("variance") BigDecimal variance
,@ApiParam(value = "Minimum recorded value of this variable") @QueryParam("minimum_recorded_value") BigDecimal minimumRecordedValue
,@ApiParam(value = "Maximum recorded value of this variable") @QueryParam("maximum_recorded_value") BigDecimal maximumRecordedValue
,@ApiParam(value = "Mean") @QueryParam("mean") BigDecimal mean
,@ApiParam(value = "Median") @QueryParam("median") BigDecimal median
,@ApiParam(value = "Most common Unit ID") @QueryParam("most_common_unit_id") Integer mostCommonUnitId
,@ApiParam(value = "Most common value") @QueryParam("most_common_value") BigDecimal mostCommonValue
,@ApiParam(value = "Number of unique daily values") @QueryParam("number_of_unique_daily_values") BigDecimal numberOfUniqueDailyValues
,@ApiParam(value = "Number of changes") @QueryParam("number_of_changes") Integer numberOfChanges
,@ApiParam(value = "Skewness") @QueryParam("skewness") BigDecimal skewness
,@ApiParam(value = "Kurtosis") @QueryParam("kurtosis") BigDecimal kurtosis
,@ApiParam(value = "Latitude") @QueryParam("latitude") BigDecimal latitude
,@ApiParam(value = "Longitude") @QueryParam("longitude") BigDecimal longitude
,@ApiParam(value = "Location") @QueryParam("location") String location
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables") @QueryParam("outcome") Boolean outcome
,@ApiParam(value = "Comma-separated list of source names to limit variables to those sources") @QueryParam("sources") String sources
,@ApiParam(value = "Earliest source time") @QueryParam("earliest_source_time") Integer earliestSourceTime
,@ApiParam(value = "Latest source time") @QueryParam("latest_source_time") Integer latestSourceTime
,@ApiParam(value = "Earliest measurement time") @QueryParam("earliest_measurement_time") Integer earliestMeasurementTime
,@ApiParam(value = "Latest measurement time") @QueryParam("latest_measurement_time") Integer latestMeasurementTime
,@ApiParam(value = "Earliest filling time") @QueryParam("earliest_filling_time") Integer earliestFillingTime
,@ApiParam(value = "Latest filling time") @QueryParam("latest_filling_time") Integer latestFillingTime
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userVariablesGet(accessToken,clientId,parentId,variableId,userId,defaultUnitId,minimumAllowedValue,maximumAllowedValue,fillingValue,joinWith,onsetDelay,durationOfAction,variableCategoryId,updated,_public,causeOnly,fillingType,numberOfMeasurements,numberOfProcessedMeasurements,measurementsAtLastAnalysis,lastUnitId,lastOriginalUnitId,lastOriginalValue,lastValue,lastOriginalValue2,lastSourceId,numberOfCorrelations,status,errorMessage,lastSuccessfulUpdateTime,standardDeviation,variance,minimumRecordedValue,maximumRecordedValue,mean,median,mostCommonUnitId,mostCommonValue,numberOfUniqueDailyValues,numberOfChanges,skewness,kurtosis,latitude,longitude,location,createdAt,updatedAt,outcome,sources,earliestSourceTime,latestSourceTime,earliestMeasurementTime,latestMeasurementTime,earliestFillingTime,latestFillingTime,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store UserVariable", notes = "Users can change things like the display name for a variable. They can also change the parameters used in analysis of that variable such as the expected duration of action for a variable to have an effect, the estimated delay before the onset of action. In order to filter out erroneous data, they are able to set the maximum and minimum reasonable daily values for a variable.", response = InlineResponse20030.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "UserVariable",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20030.class) })

    public Response userVariablesPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "UserVariable that should be stored" ) UserVariable body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userVariablesPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get UserVariable", notes = "Get UserVariable", response = InlineResponse20030.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "UserVariable",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20030.class) })

    public Response userVariablesIdGet(
@ApiParam(value = "id of UserVariable",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userVariablesIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update UserVariable", notes = "Update UserVariable", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "UserVariable",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response userVariablesIdPut(
@ApiParam(value = "id of UserVariable",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "UserVariable that should be updated" ) UserVariable body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userVariablesIdPut(id,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete UserVariable", notes = "Delete UserVariable", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "UserVariable" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response userVariablesIdDelete(
@ApiParam(value = "id of UserVariable",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userVariablesIdDelete(id,accessToken,securityContext);
    }
}
