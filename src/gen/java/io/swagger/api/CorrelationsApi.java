package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CorrelationsApiService;
import io.swagger.api.factories.CorrelationsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.Correlation;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/correlations")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/correlations", description = "the correlations API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class CorrelationsApi  {

   private final CorrelationsApiService delegate = CorrelationsApiServiceFactory.getCorrelationsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Correlations", notes = "Get all Correlations", response = InlineResponse2007.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2007.class) })

    public Response correlationsGet(@ApiParam(value = "timestamp") @QueryParam("timestamp") Integer timestamp,
    @ApiParam(value = "user_id") @QueryParam("user_id") Integer userId,
    @ApiParam(value = "correlation") @QueryParam("correlation") BigDecimal correlation,
    @ApiParam(value = "cause_id") @QueryParam("cause_id") Integer causeId,
    @ApiParam(value = "effect_id") @QueryParam("effect_id") Integer effectId,
    @ApiParam(value = "onset_delay") @QueryParam("onset_delay") Integer onsetDelay,
    @ApiParam(value = "duration_of_action") @QueryParam("duration_of_action") Integer durationOfAction,
    @ApiParam(value = "number_of_pairs") @QueryParam("number_of_pairs") Integer numberOfPairs,
    @ApiParam(value = "value_predicting_high_outcome") @QueryParam("value_predicting_high_outcome") BigDecimal valuePredictingHighOutcome,
    @ApiParam(value = "value_predicting_low_outcome") @QueryParam("value_predicting_low_outcome") BigDecimal valuePredictingLowOutcome,
    @ApiParam(value = "optimal_pearson_product") @QueryParam("optimal_pearson_product") BigDecimal optimalPearsonProduct,
    @ApiParam(value = "vote") @QueryParam("vote") BigDecimal vote,
    @ApiParam(value = "statistical_significance") @QueryParam("statistical_significance") BigDecimal statisticalSignificance,
    @ApiParam(value = "cause_unit") @QueryParam("cause_unit") String causeUnit,
    @ApiParam(value = "cause_unit_id") @QueryParam("cause_unit_id") Integer causeUnitId,
    @ApiParam(value = "cause_changes") @QueryParam("cause_changes") Integer causeChanges,
    @ApiParam(value = "effect_changes") @QueryParam("effect_changes") Integer effectChanges,
    @ApiParam(value = "qm_score") @QueryParam("qm_score") BigDecimal qmScore,
    @ApiParam(value = "error") @QueryParam("error") String error,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "reverse_pearson_correlation_coefficient") @QueryParam("reverse_pearson_correlation_coefficient") BigDecimal reversePearsonCorrelationCoefficient,
    @ApiParam(value = "predictive_pearson_correlation_coefficient") @QueryParam("predictive_pearson_correlation_coefficient") BigDecimal predictivePearsonCorrelationCoefficient,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.correlationsGet(timestamp,userId,correlation,causeId,effectId,onsetDelay,durationOfAction,numberOfPairs,valuePredictingHighOutcome,valuePredictingLowOutcome,optimalPearsonProduct,vote,statisticalSignificance,causeUnit,causeUnitId,causeChanges,effectChanges,qmScore,error,createdAt,updatedAt,reversePearsonCorrelationCoefficient,predictivePearsonCorrelationCoefficient,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Correlation", notes = "Store Correlation", response = InlineResponse2008.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2008.class) })

    public Response correlationsPost(@ApiParam(value = "Correlation that should be stored" ) Correlation body)
    throws NotFoundException {
        return delegate.correlationsPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Correlation", notes = "Get Correlation", response = InlineResponse2008.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2008.class) })

    public Response correlationsIdGet(@ApiParam(value = "id of Correlation",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.correlationsIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Correlation", notes = "Update Correlation", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response correlationsIdPut(@ApiParam(value = "id of Correlation",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "Correlation that should be updated" ) Correlation body)
    throws NotFoundException {
        return delegate.correlationsIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Correlation", notes = "Delete Correlation", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response correlationsIdDelete(@ApiParam(value = "id of Correlation",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.correlationsIdDelete(id);
    }
}

