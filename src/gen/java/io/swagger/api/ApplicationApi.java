package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ApplicationApiService;
import io.swagger.api.factories.ApplicationApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/application")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the application API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class ApplicationApi  {
   private final ApplicationApiService delegate = ApplicationApiServiceFactory.getApplicationApi();

    @GET
    @Path("/connections")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Connections", notes = "Get all Connections", response = InlineResponse2003.class, tags={ "Application Endpoints",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2003.class) })

    public Response applicationConnectionsGet(@ApiParam(value = "Application's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "The id for the connector data source for which the connection is connected") @QueryParam("connector_id") Integer connectorId
,@ApiParam(value = "Indicates whether a connector is currently connected to a service for a user.") @QueryParam("connect_status") String connectStatus
,@ApiParam(value = "Error message if there is a problem with authorizing this connection.") @QueryParam("connect_error") String connectError
,@ApiParam(value = "Time at which an update was requested by a user.") @QueryParam("update_requested_at") String updateRequestedAt
,@ApiParam(value = "Indicates whether a connector is currently updated.") @QueryParam("update_status") String updateStatus
,@ApiParam(value = "Indicates if there was an error during the update.") @QueryParam("update_error") String updateError
,@ApiParam(value = "The time at which the connector was last successfully updated.") @QueryParam("last_successful_updated_at") String lastSuccessfulUpdatedAt
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.applicationConnectionsGet(accessToken,connectorId,connectStatus,connectError,updateRequestedAt,updateStatus,updateError,lastSuccessfulUpdatedAt,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/credentials")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Credentials", notes = "Get all Credentials", response = InlineResponse2004.class, tags={ "Application Endpoints",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2004.class) })

    public Response applicationCredentialsGet(@ApiParam(value = "Application's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "The id for the connector data source from which the credential was obtained") @QueryParam("connector_id") Integer connectorId
,@ApiParam(value = "Attribute name such as token, userid, username, or password") @QueryParam("attr_key") String attrKey
,@ApiParam(value = "Encrypted value for the attribute specified") @QueryParam("attr_value") String attrValue
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.applicationCredentialsGet(accessToken,connectorId,attrKey,attrValue,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/measurements")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get measurements for all users using your application", notes = "Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten.", response = InlineResponse2005.class, tags={ "Application Endpoints",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2005.class) })

    public Response applicationMeasurementsGet(@ApiParam(value = "Application's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "The ID of the client application which originally stored the measurement") @QueryParam("client_id") String clientId
,@ApiParam(value = "The id for the connector data source from which the measurement was obtained") @QueryParam("connector_id") Integer connectorId
,@ApiParam(value = "ID of the variable for which we are creating the measurement records") @QueryParam("variable_id") Integer variableId
,@ApiParam(value = "Application or device used to record the measurement values") @QueryParam("source_id") Integer sourceId
,@ApiParam(value = "start time for the measurement event. Use ISO 8601 datetime format") @QueryParam("start_time") String startTime
,@ApiParam(value = "The value of the measurement after conversion to the default unit for that variable") @QueryParam("value") BigDecimal value
,@ApiParam(value = "The default unit id for the variable") @QueryParam("unit_id") Integer unitId
,@ApiParam(value = "Unconverted value of measurement as originally posted (before conversion to default unit)") @QueryParam("original_value") BigDecimal originalValue
,@ApiParam(value = "Unit id of the measurement as originally submitted") @QueryParam("original_unit_id") Integer originalUnitId
,@ApiParam(value = "Duration of the event being measurement in seconds") @QueryParam("duration") Integer duration
,@ApiParam(value = "An optional note the user may include with their measurement") @QueryParam("note") String note
,@ApiParam(value = "Latitude at which the measurement was taken") @QueryParam("latitude") BigDecimal latitude
,@ApiParam(value = "Longitude at which the measurement was taken") @QueryParam("longitude") BigDecimal longitude
,@ApiParam(value = "Optional human readable name for the location where the measurement was recorded") @QueryParam("location") String location
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "An error message if there is a problem with the measurement") @QueryParam("error") String error
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.applicationMeasurementsGet(accessToken,clientId,connectorId,variableId,sourceId,startTime,value,unitId,originalValue,originalUnitId,duration,note,latitude,longitude,location,createdAt,updatedAt,error,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/trackingReminders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get tracking reminders", notes = "Get the variable id, frequency, and default value for the user tracking reminders", response = InlineResponse2006.class, tags={ "Application Endpoints",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2006.class) })

    public Response applicationTrackingRemindersGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "The ID of the client application which last created or updated this trackingReminder") @QueryParam("client_id") String clientId
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.applicationTrackingRemindersGet(accessToken,clientId,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/updates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Updates", notes = "Get all Updates", response = InlineResponse2007.class, tags={ "Application Endpoints",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2007.class) })

    public Response applicationUpdatesGet(@ApiParam(value = "Application's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "connector_id") @QueryParam("connector_id") Integer connectorId
,@ApiParam(value = "number_of_measurements") @QueryParam("number_of_measurements") Integer numberOfMeasurements
,@ApiParam(value = "success") @QueryParam("success") Boolean success
,@ApiParam(value = "message") @QueryParam("message") String message
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.applicationUpdatesGet(accessToken,connectorId,numberOfMeasurements,success,message,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/userVariableRelationships")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all UserVariableRelationships", notes = "Get all UserVariableRelationships", response = InlineResponse2008.class, tags={ "Application Endpoints",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2008.class) })

    public Response applicationUserVariableRelationshipsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "id") @QueryParam("id") Integer id
,@ApiParam(value = "Our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors") @QueryParam("confidence_level") String confidenceLevel
,@ApiParam(value = "A quantitative representation of our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors") @QueryParam("confidence_score") BigDecimal confidenceScore
,@ApiParam(value = "Direction is positive if higher predictor values generally precede higher outcome values. Direction is negative if higher predictor values generally precede lower outcome values.") @QueryParam("direction") String direction
,@ApiParam(value = "Estimated number of seconds following the onset delay in which a stimulus produces a perceivable effect") @QueryParam("duration_of_action") Integer durationOfAction
,@ApiParam(value = "error_message") @QueryParam("error_message") String errorMessage
,@ApiParam(value = "Estimated number of seconds that pass before a stimulus produces a perceivable effect") @QueryParam("onset_delay") Integer onsetDelay
,@ApiParam(value = "Variable ID for the outcome variable") @QueryParam("outcome_variable_id") Integer outcomeVariableId
,@ApiParam(value = "Variable ID for the predictor variable") @QueryParam("predictor_variable_id") Integer predictorVariableId
,@ApiParam(value = "ID for default unit of the predictor variable") @QueryParam("predictor_unit_id") Integer predictorUnitId
,@ApiParam(value = "A value representative of the relevance of this predictor relative to other predictors of this outcome.  Usually used for relevancy sorting.") @QueryParam("sinn_rank") BigDecimal sinnRank
,@ApiParam(value = "Can be weak, medium, or strong based on the size of the effect which the predictor appears to have on the outcome relative to other variable relationship strength scores.") @QueryParam("strength_level") String strengthLevel
,@ApiParam(value = "A value represented to the size of the effect which the predictor appears to have on the outcome.") @QueryParam("strength_score") BigDecimal strengthScore
,@ApiParam(value = "vote") @QueryParam("vote") String vote
,@ApiParam(value = "Value for the predictor variable (in it's default unit) which typically precedes an above average outcome value") @QueryParam("value_predicting_high_outcome") BigDecimal valuePredictingHighOutcome
,@ApiParam(value = "Value for the predictor variable (in it's default unit) which typically precedes a below average outcome value") @QueryParam("value_predicting_low_outcome") BigDecimal valuePredictingLowOutcome
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.applicationUserVariableRelationshipsGet(accessToken,id,confidenceLevel,confidenceScore,direction,durationOfAction,errorMessage,onsetDelay,outcomeVariableId,predictorVariableId,predictorUnitId,sinnRank,strengthLevel,strengthScore,vote,valuePredictingHighOutcome,valuePredictingLowOutcome,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/userVariables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all UserVariables", notes = "Get all UserVariables", response = InlineResponse2009.class, tags={ "Application Endpoints",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2009.class) })

    public Response applicationUserVariablesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "The ID of the client application which last created or updated this user variable") @QueryParam("client_id") String clientId
,@ApiParam(value = "ID of the parent variable if this variable has any parent") @QueryParam("parent_id") Integer parentId
,@ApiParam(value = "ID of variable") @QueryParam("variable_id") Integer variableId
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
        return delegate.applicationUserVariablesGet(accessToken,clientId,parentId,variableId,defaultUnitId,minimumAllowedValue,maximumAllowedValue,fillingValue,joinWith,onsetDelay,durationOfAction,variableCategoryId,updated,_public,causeOnly,fillingType,numberOfMeasurements,numberOfProcessedMeasurements,measurementsAtLastAnalysis,lastUnitId,lastOriginalUnitId,lastOriginalValue,lastValue,lastOriginalValue2,lastSourceId,numberOfCorrelations,status,errorMessage,lastSuccessfulUpdateTime,standardDeviation,variance,minimumRecordedValue,maximumRecordedValue,mean,median,mostCommonUnitId,mostCommonValue,numberOfUniqueDailyValues,numberOfChanges,skewness,kurtosis,latitude,longitude,location,createdAt,updatedAt,outcome,sources,earliestSourceTime,latestSourceTime,earliestMeasurementTime,latestMeasurementTime,earliestFillingTime,latestFillingTime,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/variableUserSources")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all VariableUserSources", notes = "Get all VariableUserSources", response = InlineResponse20010.class, tags={ "Application Endpoints",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20010.class) })

    public Response applicationVariableUserSourcesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of variable") @QueryParam("variable_id") Integer variableId
,@ApiParam(value = "Time that this measurement occurred Uses epoch minute (epoch time divided by 60)") @QueryParam("timestamp") Integer timestamp
,@ApiParam(value = "Earliest measurement time") @QueryParam("earliest_measurement_time") Integer earliestMeasurementTime
,@ApiParam(value = "Latest measurement time") @QueryParam("latest_measurement_time") Integer latestMeasurementTime
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.applicationVariableUserSourcesGet(accessToken,variableId,timestamp,earliestMeasurementTime,latestMeasurementTime,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/votes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Votes", notes = "Get all Votes", response = InlineResponse20011.class, tags={ "Application Endpoints" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20011.class) })

    public Response applicationVotesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "The ID of the client application which last created or updated this vote") @QueryParam("client_id") String clientId
,@ApiParam(value = "ID of predictor variable") @QueryParam("cause_id") Integer causeId
,@ApiParam(value = "ID of outcome variable") @QueryParam("effect_id") Integer effectId
,@ApiParam(value = "Value of Vote. 1 is for upvote. 0 is for downvote.  Otherwise, there is no vote.") @QueryParam("value") Integer value
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.applicationVotesGet(accessToken,clientId,causeId,effectId,value,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
}
