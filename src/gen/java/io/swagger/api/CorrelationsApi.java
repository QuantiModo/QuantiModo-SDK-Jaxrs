package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CorrelationsApiService;
import io.swagger.api.factories.CorrelationsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse20017;
import io.swagger.model.Correlation;
import io.swagger.model.InlineResponse20018;
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

@Path("/correlations")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the correlations API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class CorrelationsApi  {
   private final CorrelationsApiService delegate = CorrelationsApiServiceFactory.getCorrelationsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Correlations", notes = "Get all Correlations", response = InlineResponse20017.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Correlation",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20017.class) })

    public Response correlationsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "Time at which correlation was calculated") @QueryParam("timestamp") Integer timestamp
,@ApiParam(value = "ID of user that owns this correlation") @QueryParam("user_id") Integer userId
,@ApiParam(value = "Pearson correlation coefficient between cause and effect measurements") @QueryParam("correlation") BigDecimal correlation
,@ApiParam(value = "variable ID of the predictor variable for which the user desires correlations") @QueryParam("cause_id") Integer causeId
,@ApiParam(value = "variable ID of the outcome variable for which the user desires correlations") @QueryParam("effect_id") Integer effectId
,@ApiParam(value = "User estimated or default time after cause measurement before a perceivable effect is observed") @QueryParam("onset_delay") Integer onsetDelay
,@ApiParam(value = "Time over which the cause is expected to produce a perceivable effect following the onset delay") @QueryParam("duration_of_action") Integer durationOfAction
,@ApiParam(value = "Number of points that went into the correlation calculation") @QueryParam("number_of_pairs") Integer numberOfPairs
,@ApiParam(value = "cause value that predicts an above average effect value (in default unit for predictor variable)") @QueryParam("value_predicting_high_outcome") BigDecimal valuePredictingHighOutcome
,@ApiParam(value = "cause value that predicts a below average effect value (in default unit for predictor variable)") @QueryParam("value_predicting_low_outcome") BigDecimal valuePredictingLowOutcome
,@ApiParam(value = "Optimal Pearson Product") @QueryParam("optimal_pearson_product") BigDecimal optimalPearsonProduct
,@ApiParam(value = "Vote") @QueryParam("vote") BigDecimal vote
,@ApiParam(value = "A function of the effect size and sample size") @QueryParam("statistical_significance") BigDecimal statisticalSignificance
,@ApiParam(value = "Unit of the predictor variable") @QueryParam("cause_unit") String causeUnit
,@ApiParam(value = "Unit ID of the predictor variable") @QueryParam("cause_unit_id") Integer causeUnitId
,@ApiParam(value = "Cause changes") @QueryParam("cause_changes") Integer causeChanges
,@ApiParam(value = "Effect changes") @QueryParam("effect_changes") Integer effectChanges
,@ApiParam(value = "QM Score") @QueryParam("qm_score") BigDecimal qmScore
,@ApiParam(value = "error") @QueryParam("error") String error
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record in the database was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation") @QueryParam("reverse_pearson_correlation_coefficient") BigDecimal reversePearsonCorrelationCoefficient
,@ApiParam(value = "Predictive Pearson Correlation Coefficient") @QueryParam("predictive_pearson_correlation_coefficient") BigDecimal predictivePearsonCorrelationCoefficient
,@ApiParam(value = "Limit the number of results returned") @QueryParam("limit") Integer limit
,@ApiParam(value = "Records from give Offset") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort records by given field") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.correlationsGet(accessToken,timestamp,userId,correlation,causeId,effectId,onsetDelay,durationOfAction,numberOfPairs,valuePredictingHighOutcome,valuePredictingLowOutcome,optimalPearsonProduct,vote,statisticalSignificance,causeUnit,causeUnitId,causeChanges,effectChanges,qmScore,error,createdAt,updatedAt,reversePearsonCorrelationCoefficient,predictivePearsonCorrelationCoefficient,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Correlation", notes = "Store Correlation", response = InlineResponse20018.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Correlation",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20018.class) })

    public Response correlationsPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Correlation that should be stored" ) Correlation body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.correlationsPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Correlation Details", notes = "Get Correlation", response = InlineResponse20018.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Correlation",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20018.class) })

    public Response correlationsIdGet(
@ApiParam(value = "id of Correlation",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.correlationsIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Correlation", notes = "Update Correlation", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Correlation",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response correlationsIdPut(
@ApiParam(value = "id of Correlation",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Correlation that should be updated" ) Correlation body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.correlationsIdPut(id,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Correlation", notes = "Delete Correlation", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Correlation" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response correlationsIdDelete(
@ApiParam(value = "id of Correlation",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.correlationsIdDelete(id,accessToken,securityContext);
    }
}
