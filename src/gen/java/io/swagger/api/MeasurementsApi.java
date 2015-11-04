package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MeasurementsApiService;
import io.swagger.api.factories.MeasurementsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20011;
import java.math.BigDecimal;
import io.swagger.model.MeasurementPost;
import java.io.File;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.Measurement;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/measurements")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/measurements", description = "the measurements API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class MeasurementsApi  {

   private final MeasurementsApiService delegate = MeasurementsApiServiceFactory.getMeasurementsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Measurements", notes = "Get all Measurements", response = InlineResponse20011.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20011.class) })

    public Response measurementsGet(@ApiParam(value = "user_id") @QueryParam("user_id") Integer userId,
    @ApiParam(value = "client_id") @QueryParam("client_id") String clientId,
    @ApiParam(value = "connector_id") @QueryParam("connector_id") Integer connectorId,
    @ApiParam(value = "variable_id") @QueryParam("variable_id") Integer variableId,
    @ApiParam(value = "start_time") @QueryParam("start_time") Integer startTime,
    @ApiParam(value = "value") @QueryParam("value") BigDecimal value,
    @ApiParam(value = "original_value") @QueryParam("original_value") BigDecimal originalValue,
    @ApiParam(value = "duration") @QueryParam("duration") Integer duration,
    @ApiParam(value = "note") @QueryParam("note") String note,
    @ApiParam(value = "latitude") @QueryParam("latitude") BigDecimal latitude,
    @ApiParam(value = "longitude") @QueryParam("longitude") BigDecimal longitude,
    @ApiParam(value = "location") @QueryParam("location") String location,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "error") @QueryParam("error") String error,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.measurementsGet(userId,clientId,connectorId,variableId,startTime,value,originalValue,duration,note,latitude,longitude,location,createdAt,updatedAt,error,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Measurement", notes = "Store Measurement", response = InlineResponse20011.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20011.class) })

    public Response measurementsPost(@ApiParam(value = "Measurement that should be stored" ) MeasurementPost body)
    throws NotFoundException {
        return delegate.measurementsPost(body);
    }
    @GET
    @Path("/csv")
    @Consumes({ "application/json" })
    @Produces({ "text/csv" })
    @io.swagger.annotations.ApiOperation(value = "Get Measurements CSV", notes = "Get Measurements CSV", response = File.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = File.class) })

    public Response measurementsCsvGet()
    throws NotFoundException {
        return delegate.measurementsCsvGet();
    }
    @POST
    @Path("/request_csv")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Post Request for Measurements CSV", notes = "Post Request for Measurements CSV", response = Integer.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Integer.class) })

    public Response measurementsRequestCsvPost()
    throws NotFoundException {
        return delegate.measurementsRequestCsvPost();
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Measurement", notes = "Get Measurement", response = InlineResponse20012.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20012.class) })

    public Response measurementsIdGet(@ApiParam(value = "id of Measurement",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.measurementsIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Measurement", notes = "Update Measurement", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response measurementsIdPut(@ApiParam(value = "id of Measurement",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "Measurement that should be updated" ) Measurement body)
    throws NotFoundException {
        return delegate.measurementsIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Measurement", notes = "Delete Measurement", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response measurementsIdDelete(@ApiParam(value = "id of Measurement",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.measurementsIdDelete(id);
    }
}

