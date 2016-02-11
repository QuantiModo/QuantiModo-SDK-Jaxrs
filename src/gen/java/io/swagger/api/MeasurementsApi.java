package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MeasurementsApiService;
import io.swagger.api.factories.MeasurementsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.MeasurementPost;
import java.io.File;
import io.swagger.model.InlineResponse20020;
import io.swagger.model.Measurement;
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

@Path("/measurements")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the measurements API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class MeasurementsApi  {
   private final MeasurementsApiService delegate = MeasurementsApiServiceFactory.getMeasurementsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get measurements for this user", notes = "Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten.", response = InlineResponse2005.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Measurement",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2005.class) })

    public Response measurementsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "ID of user that owns this measurement") @QueryParam("user_id") Integer userId
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
        return delegate.measurementsGet(accessToken,userId,clientId,connectorId,variableId,sourceId,startTime,value,unitId,originalValue,originalUnitId,duration,note,latitude,longitude,location,createdAt,updatedAt,error,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Post a new set or update existing measurements to the database", notes = "You can submit or update multiple measurements in a measurements sub-array.  If the variable these measurements correspond to does not already exist in the database, it will be automatically added.", response = InlineResponse2005.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Measurement",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2005.class) })

    public Response measurementsPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Measurement that should be stored" ) MeasurementPost body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.measurementsPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/csv")
    @Consumes({ "application/json" })
    @Produces({ "text/csv" })
    @io.swagger.annotations.ApiOperation(value = "Get Measurements CSV", notes = "Download a CSV containing all user measurements", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Measurement",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = File.class) })

    public Response measurementsCsvGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.measurementsCsvGet(accessToken,securityContext);
    }
    @POST
    @Path("/request_csv")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Post Request for Measurements CSV", notes = "Use this endpoint to schedule a CSV export containing all user measurements to be emailed to the user within 24 hours.", response = Integer.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Measurement",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Integer.class) })

    public Response measurementsRequestCsvPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.measurementsRequestCsvPost(accessToken,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Measurement", notes = "Get Measurement", response = InlineResponse20020.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Measurement",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20020.class) })

    public Response measurementsIdGet(
@ApiParam(value = "id of Measurement",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.measurementsIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Measurement", notes = "Update Measurement", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Measurement",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response measurementsIdPut(
@ApiParam(value = "id of Measurement",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Measurement that should be updated" ) Measurement body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.measurementsIdPut(id,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Measurement", notes = "Delete Measurement", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Measurement" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response measurementsIdDelete(
@ApiParam(value = "id of Measurement",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.measurementsIdDelete(id,accessToken,securityContext);
    }
}
