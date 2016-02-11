package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TrackingRemindersApiService;
import io.swagger.api.factories.TrackingRemindersApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2006;
import io.swagger.model.TrackingReminder;
import io.swagger.model.InlineResponse20023;
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

@Path("/trackingReminders")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the trackingReminders API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class TrackingRemindersApi  {
   private final TrackingRemindersApiService delegate = TrackingRemindersApiServiceFactory.getTrackingRemindersApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get tracking reminders", notes = "Users can be reminded to track certain variables at a specified frequency with a default value.", response = InlineResponse2006.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "TrackingReminder",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2006.class) })

    public Response trackingRemindersGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "The ID of the client application which last created or updated this tracking reminder") @QueryParam("client_id") String clientId
,@ApiParam(value = "ID of the user who created a reminder") @QueryParam("user_id") Integer userId
,@ApiParam(value = "Id for the variable to be tracked") @QueryParam("variable_id") Integer variableId
,@ApiParam(value = "True if the reminders should appear as a popup notification") @QueryParam("pop_up") Boolean popUp
,@ApiParam(value = "True if the reminders should be delivered via SMS") @QueryParam("sms") Boolean sms
,@ApiParam(value = "True if the reminders should be delivered via email") @QueryParam("email") Boolean email
,@ApiParam(value = "True if the reminders should appear in the notification bar") @QueryParam("notification_bar") Boolean notificationBar
,@ApiParam(value = "ISO 8601 timestamp for the last time a reminder was sent") @QueryParam("last_reminded") String lastReminded
,@ApiParam(value = "ISO 8601 timestamp for the last time a measurement was received for this user and variable") @QueryParam("last_tracked") String lastTracked
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trackingRemindersGet(accessToken,clientId,userId,variableId,popUp,sms,email,notificationBar,lastReminded,lastTracked,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store TrackingReminder", notes = "This is to enable users to indicate their opinion on the plausibility of a causal relationship between a treatment and outcome. QuantiModo incorporates crowd-sourced plausibility estimations into their algorithm. This is done allowing user to indicate their view of the plausibility of each relationship with thumbs up/down buttons placed next to each prediction.", response = InlineResponse20023.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "TrackingReminder",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20023.class) })

    public Response trackingRemindersPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "TrackingReminder that should be stored" ) TrackingReminder body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trackingRemindersPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get TrackingReminder", notes = "Get TrackingReminder", response = InlineResponse20023.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "TrackingReminder",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20023.class) })

    public Response trackingRemindersIdGet(
@ApiParam(value = "id of TrackingReminder",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trackingRemindersIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update TrackingReminder", notes = "Update TrackingReminder", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "TrackingReminder",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response trackingRemindersIdPut(
@ApiParam(value = "id of TrackingReminder",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "TrackingReminder that should be updated" ) TrackingReminder body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trackingRemindersIdPut(id,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete TrackingReminder", notes = "Delete previously posted trackingReminder", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "TrackingReminder" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response trackingRemindersIdDelete(
@ApiParam(value = "id of TrackingReminder",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trackingRemindersIdDelete(id,accessToken,securityContext);
    }
}
