package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AggregatedCorrelationsApiService;
import io.swagger.api.factories.AggregatedCorrelationsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse200;
import io.swagger.model.AggregatedCorrelation;
import io.swagger.model.InlineResponse2001;
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

@Path("/aggregatedCorrelations")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the aggregatedCorrelations API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class AggregatedCorrelationsApi  {
   private final AggregatedCorrelationsApiService delegate = AggregatedCorrelationsApiServiceFactory.getAggregatedCorrelationsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all AggregatedCorrelations", notes = "Get all AggregatedCorrelations", response = InlineResponse200.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "AggregatedCorrelation",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })

    public Response aggregatedCorrelationsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "Pearson correlation coefficient between cause and effect measurements") @QueryParam("correlation") BigDecimal correlation
,@ApiParam(value = "Variable ID of the predictor variable for which the user desires correlations") @QueryParam("cause_id") Integer causeId
,@ApiParam(value = "Variable ID of the outcome variable for which the user desires correlations") @QueryParam("effect_id") Integer effectId
,@ApiParam(value = "User estimated (or default number of seconds) after cause measurement before a perceivable effect is observed") @QueryParam("onset_delay") Integer onsetDelay
,@ApiParam(value = "Number of seconds over which the predictor variable event is expected to produce a perceivable effect following the onset delay") @QueryParam("duration_of_action") Integer durationOfAction
,@ApiParam(value = "Number of predictor/outcome data points used in the analysis") @QueryParam("number_of_pairs") Integer numberOfPairs
,@ApiParam(value = "Predictor daily aggregated measurement value that predicts an above average effect measurement value (in default unit for predictor variable)") @QueryParam("value_predicting_high_outcome") BigDecimal valuePredictingHighOutcome
,@ApiParam(value = "Predictor daily aggregated measurement value that predicts a below average effect measurement value (in default unit for outcome variable)") @QueryParam("value_predicting_low_outcome") BigDecimal valuePredictingLowOutcome
,@ApiParam(value = "Optimal Pearson Product") @QueryParam("optimal_pearson_product") BigDecimal optimalPearsonProduct
,@ApiParam(value = "Number of users whose data was used in this aggregation") @QueryParam("number_of_users") Integer numberOfUsers
,@ApiParam(value = "Number of correlational analyses used in this aggregation") @QueryParam("number_of_correlations") Integer numberOfCorrelations
,@ApiParam(value = "A function of the effect size and sample size") @QueryParam("statistical_significance") BigDecimal statisticalSignificance
,@ApiParam(value = "Abbreviated unit name for the predictor variable") @QueryParam("cause_unit") String causeUnit
,@ApiParam(value = "Unit ID for the predictor variable") @QueryParam("cause_unit_id") Integer causeUnitId
,@ApiParam(value = "Number of times that the predictor time series changes") @QueryParam("cause_changes") Integer causeChanges
,@ApiParam(value = "Number of times that the predictor time series changes") @QueryParam("effect_changes") Integer effectChanges
,@ApiParam(value = "Aggregated QM Score which is directly proportional with the relevance of each predictor or outcome") @QueryParam("aggregate_qm_score") BigDecimal aggregateQmScore
,@ApiParam(value = "Date at which the analysis was first performed") @QueryParam("created_at") String createdAt
,@ApiParam(value = "Date at which the analysis was last updated") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "Indicates whether an analysis is up to date (UPDATED), needs to be updated (WAITING), or had an error (ERROR)") @QueryParam("status") String status
,@ApiParam(value = "Message describing any problems encountered during the analysis") @QueryParam("error_message") String errorMessage
,@ApiParam(value = "Last Successful update time") @QueryParam("last_successful_update_time") String lastSuccessfulUpdateTime
,@ApiParam(value = "Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation") @QueryParam("reverse_pearson_correlation_coefficient") BigDecimal reversePearsonCorrelationCoefficient
,@ApiParam(value = "Predictive Pearson Correlation Coefficient") @QueryParam("predictive_pearson_correlation_coefficient") BigDecimal predictivePearsonCorrelationCoefficient
,@ApiParam(value = "Limit the number of results returned") @QueryParam("limit") Integer limit
,@ApiParam(value = "Records from give Offset") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort records by given field") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsGet(accessToken,correlation,causeId,effectId,onsetDelay,durationOfAction,numberOfPairs,valuePredictingHighOutcome,valuePredictingLowOutcome,optimalPearsonProduct,numberOfUsers,numberOfCorrelations,statisticalSignificance,causeUnit,causeUnitId,causeChanges,effectChanges,aggregateQmScore,createdAt,updatedAt,status,errorMessage,lastSuccessfulUpdateTime,reversePearsonCorrelationCoefficient,predictivePearsonCorrelationCoefficient,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store AggregatedCorrelation", notes = "Store AggregatedCorrelation", response = InlineResponse2001.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "AggregatedCorrelation",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2001.class) })

    public Response aggregatedCorrelationsPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "AggregatedCorrelation that should be stored" ) AggregatedCorrelation body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get AggregatedCorrelation", notes = "Get AggregatedCorrelation", response = InlineResponse2001.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "AggregatedCorrelation",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2001.class) })

    public Response aggregatedCorrelationsIdGet(
@ApiParam(value = "id of AggregatedCorrelation",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update AggregatedCorrelation", notes = "Update AggregatedCorrelation", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "AggregatedCorrelation",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response aggregatedCorrelationsIdPut(
@ApiParam(value = "id of AggregatedCorrelation",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "AggregatedCorrelation that should be updated" ) AggregatedCorrelation body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsIdPut(id,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete AggregatedCorrelation", notes = "Delete AggregatedCorrelation", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "AggregatedCorrelation" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response aggregatedCorrelationsIdDelete(
@ApiParam(value = "id of AggregatedCorrelation",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsIdDelete(id,accessToken,securityContext);
    }
}
