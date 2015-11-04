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

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/aggregatedCorrelations")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/aggregatedCorrelations", description = "the aggregatedCorrelations API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class AggregatedCorrelationsApi  {

   private final AggregatedCorrelationsApiService delegate = AggregatedCorrelationsApiServiceFactory.getAggregatedCorrelationsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all AggregatedCorrelations", notes = "Get all AggregatedCorrelations", response = InlineResponse200.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })

    public Response aggregatedCorrelationsGet(@ApiParam(value = "correlation") @QueryParam("correlation") BigDecimal correlation,
    @ApiParam(value = "cause_id") @QueryParam("cause_id") Integer causeId,
    @ApiParam(value = "effect_id") @QueryParam("effect_id") Integer effectId,
    @ApiParam(value = "onset_delay") @QueryParam("onset_delay") Integer onsetDelay,
    @ApiParam(value = "duration_of_action") @QueryParam("duration_of_action") Integer durationOfAction,
    @ApiParam(value = "number_of_pairs") @QueryParam("number_of_pairs") Integer numberOfPairs,
    @ApiParam(value = "value_predicting_high_outcome") @QueryParam("value_predicting_high_outcome") BigDecimal valuePredictingHighOutcome,
    @ApiParam(value = "value_predicting_low_outcome") @QueryParam("value_predicting_low_outcome") BigDecimal valuePredictingLowOutcome,
    @ApiParam(value = "optimal_pearson_product") @QueryParam("optimal_pearson_product") BigDecimal optimalPearsonProduct,
    @ApiParam(value = "vote") @QueryParam("vote") BigDecimal vote,
    @ApiParam(value = "number_of_users") @QueryParam("number_of_users") Integer numberOfUsers,
    @ApiParam(value = "number_of_correlations") @QueryParam("number_of_correlations") Integer numberOfCorrelations,
    @ApiParam(value = "statistical_significance") @QueryParam("statistical_significance") BigDecimal statisticalSignificance,
    @ApiParam(value = "cause_unit") @QueryParam("cause_unit") String causeUnit,
    @ApiParam(value = "cause_unit_id") @QueryParam("cause_unit_id") Integer causeUnitId,
    @ApiParam(value = "cause_changes") @QueryParam("cause_changes") Integer causeChanges,
    @ApiParam(value = "effect_changes") @QueryParam("effect_changes") Integer effectChanges,
    @ApiParam(value = "aggregate_qm_score") @QueryParam("aggregate_qm_score") BigDecimal aggregateQmScore,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "status") @QueryParam("status") String status,
    @ApiParam(value = "error_message") @QueryParam("error_message") String errorMessage,
    @ApiParam(value = "last_successful_update_time") @QueryParam("last_successful_update_time") String lastSuccessfulUpdateTime,
    @ApiParam(value = "reverse_pearson_correlation_coefficient") @QueryParam("reverse_pearson_correlation_coefficient") BigDecimal reversePearsonCorrelationCoefficient,
    @ApiParam(value = "predictive_pearson_correlation_coefficient") @QueryParam("predictive_pearson_correlation_coefficient") BigDecimal predictivePearsonCorrelationCoefficient,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsGet(correlation,causeId,effectId,onsetDelay,durationOfAction,numberOfPairs,valuePredictingHighOutcome,valuePredictingLowOutcome,optimalPearsonProduct,vote,numberOfUsers,numberOfCorrelations,statisticalSignificance,causeUnit,causeUnitId,causeChanges,effectChanges,aggregateQmScore,createdAt,updatedAt,status,errorMessage,lastSuccessfulUpdateTime,reversePearsonCorrelationCoefficient,predictivePearsonCorrelationCoefficient,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store AggregatedCorrelation", notes = "Store AggregatedCorrelation", response = InlineResponse2001.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2001.class) })

    public Response aggregatedCorrelationsPost(@ApiParam(value = "AggregatedCorrelation that should be stored" ) AggregatedCorrelation body)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get AggregatedCorrelation", notes = "Get AggregatedCorrelation", response = InlineResponse2001.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2001.class) })

    public Response aggregatedCorrelationsIdGet(@ApiParam(value = "id of AggregatedCorrelation",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update AggregatedCorrelation", notes = "Update AggregatedCorrelation", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response aggregatedCorrelationsIdPut(@ApiParam(value = "id of AggregatedCorrelation",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "AggregatedCorrelation that should be updated" ) AggregatedCorrelation body)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete AggregatedCorrelation", notes = "Delete AggregatedCorrelation", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response aggregatedCorrelationsIdDelete(@ApiParam(value = "id of AggregatedCorrelation",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.aggregatedCorrelationsIdDelete(id);
    }
}

