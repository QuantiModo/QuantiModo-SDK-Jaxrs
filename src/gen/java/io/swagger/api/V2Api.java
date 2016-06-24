package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.V2ApiService;
import io.swagger.api.factories.V2ApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse20010;
import java.io.File;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.InlineResponse20011;
import io.swagger.model.Measurement;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/v2")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the v2 API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class V2Api  {
   private final V2ApiService delegate = V2ApiServiceFactory.getV2Api();

    @GET
    @Path("/application/connections")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Connections", notes = "Get all Connections", response = InlineResponse2003.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "application endpoints", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2003.class) })
    public Response v2ApplicationConnectionsGet(@ApiParam(value = "Application's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "The id for the connector data source for which the connection is connected") @QueryParam("connector_id") Integer connectorId,@ApiParam(value = "Indicates whether a connector is currently connected to a service for a user.") @QueryParam("connect_status") String connectStatus,@ApiParam(value = "Error message if there is a problem with authorizing this connection.") @QueryParam("connect_error") String connectError,@ApiParam(value = "Time at which an update was requested by a user.") @QueryParam("update_requested_at") String updateRequestedAt,@ApiParam(value = "Indicates whether a connector is currently updated.") @QueryParam("update_status") String updateStatus,@ApiParam(value = "Indicates if there was an error during the update.") @QueryParam("update_error") String updateError,@ApiParam(value = "The time at which the connector was last successfully updated.") @QueryParam("last_successful_updated_at") String lastSuccessfulUpdatedAt,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format ") @QueryParam("created_at") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format ") @QueryParam("updated_at") String updatedAt,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2ApplicationConnectionsGet(accessToken,connectorId,connectStatus,connectError,updateRequestedAt,updateStatus,updateError,lastSuccessfulUpdatedAt,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/application/credentials")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Credentials", notes = "Get all Credentials", response = InlineResponse2004.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "application endpoints", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2004.class) })
    public Response v2ApplicationCredentialsGet(@ApiParam(value = "Application's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "The id for the connector data source from which the credential was obtained") @QueryParam("connector_id") Integer connectorId,@ApiParam(value = "Attribute name such as token, userid, username, or password") @QueryParam("attr_key") String attrKey,@ApiParam(value = "Encrypted value for the attribute specified") @QueryParam("attr_value") String attrValue,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format ") @QueryParam("created_at") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format ") @QueryParam("updated_at") String updatedAt,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2ApplicationCredentialsGet(accessToken,connectorId,attrKey,attrValue,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/application/measurements")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get measurements for all users using your application", notes = "Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten.", response = InlineResponse2005.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "application endpoints", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2005.class) })
    public Response v2ApplicationMeasurementsGet(@ApiParam(value = "Application's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "The ID of the client application which originally stored the measurement") @QueryParam("client_id") String clientId,@ApiParam(value = "The id for the connector data source from which the measurement was obtained") @QueryParam("connector_id") Integer connectorId,@ApiParam(value = "ID of the variable for which we are creating the measurement records") @QueryParam("variable_id") Integer variableId,@ApiParam(value = "Application or device used to record the measurement values") @QueryParam("source_id") Integer sourceId,@ApiParam(value = "start time for the measurement event. Use ISO 8601 datetime format ") @QueryParam("start_time") String startTime,@ApiParam(value = "The value of the measurement after conversion to the default unit for that variable") @QueryParam("value") BigDecimal value,@ApiParam(value = "The default unit id for the variable") @QueryParam("unit_id") Integer unitId,@ApiParam(value = "Unconverted value of measurement as originally posted (before conversion to default unit)") @QueryParam("original_value") BigDecimal originalValue,@ApiParam(value = "Unit id of the measurement as originally submitted") @QueryParam("original_unit_id") Integer originalUnitId,@ApiParam(value = "Duration of the event being measurement in seconds") @QueryParam("duration") Integer duration,@ApiParam(value = "An optional note the user may include with their measurement") @QueryParam("note") String note,@ApiParam(value = "Latitude at which the measurement was taken") @QueryParam("latitude") BigDecimal latitude,@ApiParam(value = "Longitude at which the measurement was taken") @QueryParam("longitude") BigDecimal longitude,@ApiParam(value = "Optional human readable name for the location where the measurement was recorded") @QueryParam("location") String location,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format ") @QueryParam("created_at") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format ") @QueryParam("updated_at") String updatedAt,@ApiParam(value = "An error message if there is a problem with the measurement") @QueryParam("error") String error,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2ApplicationMeasurementsGet(accessToken,clientId,connectorId,variableId,sourceId,startTime,value,unitId,originalValue,originalUnitId,duration,note,latitude,longitude,location,createdAt,updatedAt,error,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/application/trackingReminders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get tracking reminders", notes = "Get the variable id, frequency, and default value for the user tracking reminders ", response = InlineResponse2001.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "application endpoints", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2001.class) })
    public Response v2ApplicationTrackingRemindersGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "The ID of the client application which last created or updated this trackingReminder") @QueryParam("client_id") String clientId,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format ") @QueryParam("created_at") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format ") @QueryParam("updated_at") String updatedAt,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2ApplicationTrackingRemindersGet(accessToken,clientId,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/application/updates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Updates", notes = "Get all Updates", response = InlineResponse2006.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "application endpoints", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2006.class) })
    public Response v2ApplicationUpdatesGet(@ApiParam(value = "Application's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "connector_id") @QueryParam("connector_id") Integer connectorId,@ApiParam(value = "number_of_measurements") @QueryParam("number_of_measurements") Integer numberOfMeasurements,@ApiParam(value = "success") @QueryParam("success") Boolean success,@ApiParam(value = "message") @QueryParam("message") String message,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format ") @QueryParam("created_at") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format ") @QueryParam("updated_at") String updatedAt,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2ApplicationUpdatesGet(accessToken,connectorId,numberOfMeasurements,success,message,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/application/userVariableRelationships")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all UserVariableRelationships", notes = "Get all UserVariableRelationships", response = InlineResponse2007.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "application endpoints", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2007.class) })
    public Response v2ApplicationUserVariableRelationshipsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "id") @QueryParam("id") Integer id,@ApiParam(value = "Our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors") @QueryParam("confidence_level") String confidenceLevel,@ApiParam(value = "A quantitative representation of our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors") @QueryParam("confidence_score") BigDecimal confidenceScore,@ApiParam(value = "Direction is positive if higher predictor values generally precede higher outcome values. Direction is negative if higher predictor values generally precede lower outcome values.") @QueryParam("direction") String direction,@ApiParam(value = "Estimated number of seconds following the onset delay in which a stimulus produces a perceivable effect") @QueryParam("duration_of_action") Integer durationOfAction,@ApiParam(value = "error_message") @QueryParam("error_message") String errorMessage,@ApiParam(value = "Estimated number of seconds that pass before a stimulus produces a perceivable effect") @QueryParam("onset_delay") Integer onsetDelay,@ApiParam(value = "Variable ID for the outcome variable") @QueryParam("outcome_variable_id") Integer outcomeVariableId,@ApiParam(value = "Variable ID for the predictor variable") @QueryParam("predictor_variable_id") Integer predictorVariableId,@ApiParam(value = "ID for default unit of the predictor variable") @QueryParam("predictor_unit_id") Integer predictorUnitId,@ApiParam(value = "A value representative of the relevance of this predictor relative to other predictors of this outcome.  Usually used for relevancy sorting.") @QueryParam("sinn_rank") BigDecimal sinnRank,@ApiParam(value = "Can be weak, medium, or strong based on the size of the effect which the predictor appears to have on the outcome relative to other variable relationship strength scores.") @QueryParam("strength_level") String strengthLevel,@ApiParam(value = "A value represented to the size of the effect which the predictor appears to have on the outcome.") @QueryParam("strength_score") BigDecimal strengthScore,@ApiParam(value = "vote") @QueryParam("vote") String vote,@ApiParam(value = "Value for the predictor variable (in it's default unit) which typically precedes an above average outcome value") @QueryParam("value_predicting_high_outcome") BigDecimal valuePredictingHighOutcome,@ApiParam(value = "Value for the predictor variable (in it's default unit) which typically precedes a below average outcome value") @QueryParam("value_predicting_low_outcome") BigDecimal valuePredictingLowOutcome,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2ApplicationUserVariableRelationshipsGet(accessToken,id,confidenceLevel,confidenceScore,direction,durationOfAction,errorMessage,onsetDelay,outcomeVariableId,predictorVariableId,predictorUnitId,sinnRank,strengthLevel,strengthScore,vote,valuePredictingHighOutcome,valuePredictingLowOutcome,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/application/userVariables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all UserVariables", notes = "Get all UserVariables", response = InlineResponse2008.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "application endpoints", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2008.class) })
    public Response v2ApplicationUserVariablesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "The ID of the client application which last created or updated this user variable") @QueryParam("client_id") String clientId,@ApiParam(value = "ID of the parent variable if this variable has any parent") @QueryParam("parent_id") Integer parentId,@ApiParam(value = "ID of variable") @QueryParam("variable_id") Integer variableId,@ApiParam(value = "D of unit to use for this variable") @QueryParam("default_unit_id") Integer defaultUnitId,@ApiParam(value = "Minimum reasonable value for this variable (uses default unit)") @QueryParam("minimum_allowed_value") BigDecimal minimumAllowedValue,@ApiParam(value = "Maximum reasonable value for this variable (uses default unit)") @QueryParam("maximum_allowed_value") BigDecimal maximumAllowedValue,@ApiParam(value = "Value for replacing null measurements") @QueryParam("filling_value") BigDecimal fillingValue,@ApiParam(value = "The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables") @QueryParam("join_with") Integer joinWith,@ApiParam(value = "Estimated number of seconds that pass before a stimulus produces a perceivable effect") @QueryParam("onset_delay") Integer onsetDelay,@ApiParam(value = "Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect") @QueryParam("duration_of_action") Integer durationOfAction,@ApiParam(value = "ID of variable category") @QueryParam("variable_category_id") Integer variableCategoryId,@ApiParam(value = "updated") @QueryParam("updated") Integer updated,@ApiParam(value = "Is variable public") @QueryParam("public") Integer _public,@ApiParam(value = "A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user") @QueryParam("cause_only") Boolean causeOnly,@ApiParam(value = "0 -> No filling, 1 -> Use filling-value") @QueryParam("filling_type") String fillingType,@ApiParam(value = "Number of measurements") @QueryParam("number_of_measurements") Integer numberOfMeasurements,@ApiParam(value = "Number of processed measurements") @QueryParam("number_of_processed_measurements") Integer numberOfProcessedMeasurements,@ApiParam(value = "Number of measurements at last analysis") @QueryParam("measurements_at_last_analysis") Integer measurementsAtLastAnalysis,@ApiParam(value = "ID of last Unit") @QueryParam("last_unit_id") Integer lastUnitId,@ApiParam(value = "ID of last original Unit") @QueryParam("last_original_unit_id") Integer lastOriginalUnitId,@ApiParam(value = "Last original value which is stored") @QueryParam("last_original_value") Integer lastOriginalValue,@ApiParam(value = "Last Value") @QueryParam("last_value") BigDecimal lastValue,@ApiParam(value = "ID of last source") @QueryParam("last_source_id") Integer lastSourceId,@ApiParam(value = "Number of correlations for this variable") @QueryParam("number_of_correlations") Integer numberOfCorrelations,@ApiParam(value = "status") @QueryParam("status") String status,@ApiParam(value = "error_message") @QueryParam("error_message") String errorMessage,@ApiParam(value = "When this variable or its settings were last updated") @QueryParam("last_successful_update_time") String lastSuccessfulUpdateTime,@ApiParam(value = "Standard deviation") @QueryParam("standard_deviation") BigDecimal standardDeviation,@ApiParam(value = "Variance") @QueryParam("variance") BigDecimal variance,@ApiParam(value = "Minimum recorded value of this variable") @QueryParam("minimum_recorded_value") BigDecimal minimumRecordedValue,@ApiParam(value = "Maximum recorded value of this variable") @QueryParam("maximum_recorded_value") BigDecimal maximumRecordedValue,@ApiParam(value = "Mean") @QueryParam("mean") BigDecimal mean,@ApiParam(value = "Median") @QueryParam("median") BigDecimal median,@ApiParam(value = "Most common Unit ID") @QueryParam("most_common_unit_id") Integer mostCommonUnitId,@ApiParam(value = "Most common value") @QueryParam("most_common_value") BigDecimal mostCommonValue,@ApiParam(value = "Number of unique daily values") @QueryParam("number_of_unique_daily_values") BigDecimal numberOfUniqueDailyValues,@ApiParam(value = "Number of changes") @QueryParam("number_of_changes") Integer numberOfChanges,@ApiParam(value = "Skewness") @QueryParam("skewness") BigDecimal skewness,@ApiParam(value = "Kurtosis") @QueryParam("kurtosis") BigDecimal kurtosis,@ApiParam(value = "Latitude") @QueryParam("latitude") BigDecimal latitude,@ApiParam(value = "Longitude") @QueryParam("longitude") BigDecimal longitude,@ApiParam(value = "Location") @QueryParam("location") String location,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format ") @QueryParam("created_at") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format ") @QueryParam("updated_at") String updatedAt,@ApiParam(value = "Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables") @QueryParam("outcome") Boolean outcome,@ApiParam(value = "Comma-separated list of source names to limit variables to those sources") @QueryParam("sources") String sources,@ApiParam(value = "Earliest source time") @QueryParam("earliest_source_time") Integer earliestSourceTime,@ApiParam(value = "Latest source time") @QueryParam("latest_source_time") Integer latestSourceTime,@ApiParam(value = "Earliest measurement time") @QueryParam("earliest_measurement_time") Integer earliestMeasurementTime,@ApiParam(value = "Latest measurement time") @QueryParam("latest_measurement_time") Integer latestMeasurementTime,@ApiParam(value = "Earliest filling time") @QueryParam("earliest_filling_time") Integer earliestFillingTime,@ApiParam(value = "Latest filling time") @QueryParam("latest_filling_time") Integer latestFillingTime,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2ApplicationUserVariablesGet(accessToken,clientId,parentId,variableId,defaultUnitId,minimumAllowedValue,maximumAllowedValue,fillingValue,joinWith,onsetDelay,durationOfAction,variableCategoryId,updated,_public,causeOnly,fillingType,numberOfMeasurements,numberOfProcessedMeasurements,measurementsAtLastAnalysis,lastUnitId,lastOriginalUnitId,lastOriginalValue,lastValue,lastSourceId,numberOfCorrelations,status,errorMessage,lastSuccessfulUpdateTime,standardDeviation,variance,minimumRecordedValue,maximumRecordedValue,mean,median,mostCommonUnitId,mostCommonValue,numberOfUniqueDailyValues,numberOfChanges,skewness,kurtosis,latitude,longitude,location,createdAt,updatedAt,outcome,sources,earliestSourceTime,latestSourceTime,earliestMeasurementTime,latestMeasurementTime,earliestFillingTime,latestFillingTime,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/application/variableUserSources")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all VariableUserSources", notes = "Get all VariableUserSources", response = InlineResponse2009.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "application endpoints", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2009.class) })
    public Response v2ApplicationVariableUserSourcesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "ID of variable") @QueryParam("variable_id") Integer variableId,@ApiParam(value = "Time that this measurement occurred Uses epoch minute (epoch time divided by 60)") @QueryParam("timestamp") Integer timestamp,@ApiParam(value = "Earliest measurement time") @QueryParam("earliest_measurement_time") Integer earliestMeasurementTime,@ApiParam(value = "Latest measurement time") @QueryParam("latest_measurement_time") Integer latestMeasurementTime,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format ") @QueryParam("created_at") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format ") @QueryParam("updated_at") String updatedAt,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2ApplicationVariableUserSourcesGet(accessToken,variableId,timestamp,earliestMeasurementTime,latestMeasurementTime,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/application/votes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Votes", notes = "Get all Votes", response = InlineResponse20010.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "application endpoints", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20010.class) })
    public Response v2ApplicationVotesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "The ID of the client application which last created or updated this vote") @QueryParam("client_id") String clientId,@ApiParam(value = "ID of predictor variable") @QueryParam("cause_id") Integer causeId,@ApiParam(value = "ID of outcome variable") @QueryParam("effect_id") Integer effectId,@ApiParam(value = "Value of Vote. 1 is for upvote. 0 is for downvote.  Otherwise, there is no vote.") @QueryParam("value") Integer value,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format ") @QueryParam("created_at") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format ") @QueryParam("updated_at") String updatedAt,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2ApplicationVotesGet(accessToken,clientId,causeId,effectId,value,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/auth/social/authorizeCode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Second Step in Social Authentication flow with JWT Token", notes = " Here is the flow for how social authentication works with a JWT Token  1.**Client:** The client needs to open popup with social auth url (`https://app/quantimo.do/api/v2/auth/social/login?provider={provider}&redirectUrl={url}`) of server with `provider` and `redirectUrl`. (Url should be registered with our social apps. Facebook and Twitter are fine with any redirect url with the same domain base url but Google needs exact redirect url.)   2.**Server:** The QM server will redirect user to that provider to get access.   3.**Client:** After successful or failed authentication, it will be redirected to given `redirectUrl` with code or error.   4.**Client:** The client needs to get that code and needs to send an Ajax request to server at `https://app.quantimo.do/api/v2/auth/social/authorizeCode?provider={provider}&code={authorizationCode}`   5.**Server:** The QM server will authorize that code from the social connection and will authenticate user and will retrieve user info.   6.**Server:** The QM server will try to find existing user by unique identity. If the user already exists then it will login. Otherwise, it will create new user and will then login.   7.**Server:** Once user is found/created, it will return a JWT token for that user in the response.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "authentication", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class) })
    public Response v2AuthSocialAuthorizeCodeGet(@ApiParam(value = "Authorization code obtained from the provider.",required=true) @QueryParam("code") String code,@ApiParam(value = "The current options are `google` and `facebook`.",required=true) @QueryParam("provider") String provider,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2AuthSocialAuthorizeCodeGet(code,provider,securityContext);
    }
    @GET
    @Path("/auth/social/authorizeToken")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Native Social Authentication", notes = "      If you are using native authentication via Facebook or Google SDKs then you should use the following flow.   1.**Client:** Using native authentication via your native mobile app, get an access token using the instructions provided by the Facebook SDK (https://developers.facebook.com/docs/facebook-login) or Google (https://developers.google.com/identity/protocols/OAuth2)   2.**Client:** Send an Ajax request with provider name and access token on `https://app.quantimo.do/api/v2/auth/social/authorizeToken?provider={provider}&accessToken={accessToken}&refreshToken={refreshToken}` (`refreshToken` is optional)   3.**Server:** Server will try to get user info and will find existing user by unique identity. If user exist then it will do a login for that or it will create new user and will do login   4.**Server:** Once user is found/created, it will return a JWT token for that user in response   5.**Client:** After getting the JWT token to get a QM access token follow these steps and include your JWT token in them as a header (Authorization: Bearer **{yourJWThere}**) or as a url parameter (https://app.quantimo.do/api/v2/oauth/authorize?token={yourJWThere}). ", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "authentication", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class) })
    public Response v2AuthSocialAuthorizeTokenGet(@ApiParam(value = "User's OAuth2 access token obtained from Google or FB native SDK",required=true) @QueryParam("accessToken") String accessToken,@ApiParam(value = "The current options are `google` and `facebook`.",required=true) @QueryParam("provider") String provider,@ApiParam(value = "Optional refresh token obtained from Google or FB native SDK") @QueryParam("refreshToken") String refreshToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2AuthSocialAuthorizeTokenGet(accessToken,provider,refreshToken,securityContext);
    }
    @GET
    @Path("/auth/social/login")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "First Setp in Social Authentication flow with JWT Token", notes = " Here is the flow for how social authentication works with a JWT Token  1.**Client:** The client needs to open popup with social auth url (`https://app/quantimo.do/api/v2/auth/social/login?provider={provider}&redirectUrl={url}`) of server with `provider` and `redirectUrl`. (Url should be registered with our social apps. Facebook and Twitter are fine with any redirect url with the same domain base url but Google needs exact redirect url.)   2.**Server:** The QM server will redirect user to that provider to get access.   3.**Client:** After successful or failed authentication, it will be redirected to given `redirectUrl` with code or error.   4.**Client:** The client needs to get that code and needs to send an Ajax request to server at `https://app.quantimo.do/api/v2/auth/social/authorizeCode?provider={provider}&code={authorizationCode}`   5.**Server:** The QM server will authorize that code from the social connection and will authenticate user and will retrieve user info.   6.**Server:** The QM server will try to find existing user by unique identity. If the user already exists then it will login. Otherwise, it will create new user and will then login.   7.**Server:** Once user is found/created, it will return a JWT token for that user in the response.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "authentication", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class) })
    public Response v2AuthSocialLoginGet(@ApiParam(value = "The redirect URI is the URL within your client application that will receive the OAuth2 credentials. Url should be registered with our social apps. Facebook and Twitter are fine with any redirect url with the same domain base url but Google needs exact redirect url.",required=true) @QueryParam("redirectUrl") String redirectUrl,@ApiParam(value = "The current options are `google` and `facebook`.",required=true) @QueryParam("provider") String provider,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2AuthSocialLoginGet(redirectUrl,provider,securityContext);
    }
    @GET
    @Path("/measurements/csv")
    @Consumes({ "application/json" })
    @Produces({ "text/csv" })
    @io.swagger.annotations.ApiOperation(value = "Get Measurements CSV", notes = "Download a CSV containing all user measurements", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = File.class) })
    public Response v2MeasurementsCsvGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2MeasurementsCsvGet(accessToken,securityContext);
    }
    @DELETE
    @Path("/measurements/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Measurement", notes = "Delete Measurement", response = InlineResponse20012.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20012.class) })
    public Response v2MeasurementsIdDelete(@ApiParam(value = "id of Measurement",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2MeasurementsIdDelete(id,accessToken,securityContext);
    }
    @GET
    @Path("/measurements/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Measurement", notes = "Get Measurement", response = InlineResponse20011.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20011.class) })
    public Response v2MeasurementsIdGet(@ApiParam(value = "id of Measurement",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2MeasurementsIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/measurements/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Measurement", notes = "Update Measurement", response = InlineResponse20012.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20012.class) })
    public Response v2MeasurementsIdPut(@ApiParam(value = "id of Measurement",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Measurement that should be updated" ) Measurement body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2MeasurementsIdPut(id,accessToken,body,securityContext);
    }
    @POST
    @Path("/measurements/request_csv")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Post Request for Measurements CSV", notes = "Use this endpoint to schedule a CSV export containing all user measurements to be emailed to the user within 24 hours.", response = Integer.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Integer.class) })
    public Response v2MeasurementsRequestCsvPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2MeasurementsRequestCsvPost(accessToken,securityContext);
    }
    @POST
    @Path("/measurements/request_pdf")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Post Request for Measurements PDF", notes = "Use this endpoint to schedule a PDF export containing all user measurements to be emailed to the user within 24 hours.", response = Integer.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Integer.class) })
    public Response v2MeasurementsRequestPdfPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2MeasurementsRequestPdfPost(accessToken,securityContext);
    }
    @POST
    @Path("/measurements/request_xls")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Post Request for Measurements XLS", notes = "Use this endpoint to schedule a XLS export containing all user measurements to be emailed to the user within 24 hours.", response = Integer.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Integer.class) })
    public Response v2MeasurementsRequestXlsPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2MeasurementsRequestXlsPost(accessToken,securityContext);
    }
    @GET
    @Path("/oauth2/access_token")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a user access token", notes = "Client provides authorization token obtained from /api/v1/oauth2/authorize to this endpoint and receives an access token. Access token can then be used to query different API endpoints of QuantiModo. ### Request Access Token After user approves your access to the given scope form the https:/app.quantimo.do/v2/oauth2/authorize endpoint, you'll recevive an authorization code to request an access token. This time make a `POST` request to `/api/v2/oauth/access_token` with parameters including: * `grant_type` Can be `authorization_code` or `refresh_token` since we are getting the `access_token` for the first time we don't have a `refresh_token` so this must be `authorization_code`. * `code` Authorization code you received with the previous request. * `redirect_uri` Your application's redirect url.         ### Refreshing Access Token Access tokens expire at some point, to continue using our api you need to refresh them with `refresh_token` you received along with the `access_token`. To do this make a `POST` request to `/api/v2/oauth/access_token` with correct parameters, which are: * `grant_type` This time grant type must be `refresh_token` since we have it. * `clientId` Your application's client id. * `client_secret` Your application's client secret. * `refresh_token` The refresh token you received with the `access_token`. Every request you make to this endpoint will give you a new refresh token and make the old one expired. So you can keep getting new access tokens with new refresh tokens. ### Using Access Token Currently we support 2 ways for this, you can't use both at the same time. * Adding access token to the request header as `Authorization: Bearer {access_token}` * Adding to the url as a query parameter `?access_token={access_token}`         You can read more about OAuth2 from [here](http://oauth.net/2/)", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "authentication", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class) })
    public Response v2Oauth2AccessTokenGet(@ApiParam(value = "This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by emailing info@quantimo.do.",required=true) @QueryParam("clientId") String clientId,@ApiParam(value = "This is the secret for your obtained clientId. QuantiModo uses this to validate that only your application uses the clientId.",required=true) @QueryParam("client_secret") String clientSecret,@ApiParam(value = "Grant Type can be 'authorization_code' or 'refresh_token'",required=true) @QueryParam("grant_type") String grantType,@ApiParam(value = "Authorization code you received with the previous request.",required=true) @QueryParam("code") String code,@ApiParam(value = "If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment.") @QueryParam("response_type") String responseType,@ApiParam(value = "Scopes include basic, readmeasurements, and writemeasurements. The \"basic\" scope allows you to read user info (displayname, email, etc). The \"readmeasurements\" scope allows one to read a user's data. The \"writemeasurements\" scope allows you to write user data. Separate multiple scopes by a space.") @QueryParam("scope") String scope,@ApiParam(value = "The redirect URI is the URL within your client application that will receive the OAuth2 credentials.") @QueryParam("redirect_uri") String redirectUri,@ApiParam(value = "An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI") @QueryParam("state") String state,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2Oauth2AccessTokenGet(clientId,clientSecret,grantType,code,responseType,scope,redirectUri,state,securityContext);
    }
    @GET
    @Path("/oauth/authorize")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Request Authorization Code", notes = "You can implement OAuth2 authentication to your application using our **OAuth2** endpoints.  You need to redirect users to `/api/v2/oauth/authorize` endpoint to get an authorization code and include the parameters below.   This page will ask the user if they want to allow a client's application to submit or obtain data from their QM account. It will redirect the user to the url provided by the client application with the code as a query parameter or error in case of an error.     See the /api/v2/oauth/access_token endpoint for the next steps.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "authentication", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class) })
    public Response v2OauthAuthorizeGet(@ApiParam(value = "This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by creating a free application at [https://admin.quantimo.do](https://admin.quantimo.do).",required=true) @QueryParam("clientId") String clientId,@ApiParam(value = "This is the secret for your obtained clientId. QuantiModo uses this to validate that only your application uses the clientId.  Obtain this by creating a free application at [https://admin.quantimo.do](https://admin.quantimo.do).",required=true) @QueryParam("client_secret") String clientSecret,@ApiParam(value = "If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment.",required=true) @QueryParam("response_type") String responseType,@ApiParam(value = "Scopes include basic, readmeasurements, and writemeasurements. The \"basic\" scope allows you to read user info (displayname, email, etc). The \"readmeasurements\" scope allows one to read a user's data. The \"writemeasurements\" scope allows you to write user data. Separate multiple scopes by a space.",required=true) @QueryParam("scope") String scope,@ApiParam(value = "The redirect URI is the URL within your client application that will receive the OAuth2 credentials.") @QueryParam("redirect_uri") String redirectUri,@ApiParam(value = "An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI") @QueryParam("state") String state,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2OauthAuthorizeGet(clientId,clientSecret,responseType,scope,redirectUri,state,securityContext);
    }
}
