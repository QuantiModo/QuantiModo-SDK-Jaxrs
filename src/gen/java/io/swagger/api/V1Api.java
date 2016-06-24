package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.V1ApiService;
import io.swagger.api.factories.V1ApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Correlation;
import io.swagger.model.JsonErrorResponse;
import io.swagger.model.PostCorrelation;
import io.swagger.model.ConnectorInstruction;
import io.swagger.model.ConnectorInfo;
import io.swagger.model.Connector;
import io.swagger.model.MeasurementSource;
import io.swagger.model.Measurement;
import io.swagger.model.MeasurementDelete;
import io.swagger.model.CommonResponse;
import io.swagger.model.MeasurementSet;
import io.swagger.model.MeasurementRange;
import io.swagger.model.UserTokenRequest;
import io.swagger.model.UserTokenSuccessfulResponse;
import io.swagger.model.UserTokenFailedResponse;
import io.swagger.model.Pairs;
import io.swagger.model.Variable;
import io.swagger.model.InlineResponse200;
import io.swagger.model.TrackingReminderNotificationSkip;
import io.swagger.model.TrackingReminderNotificationSnooze;
import io.swagger.model.TrackingReminderNotificationTrack;
import io.swagger.model.TrackingReminderDelete;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.TrackingReminder;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.UnitCategory;
import io.swagger.model.Unit;
import io.swagger.model.User;
import io.swagger.model.UserTag;
import io.swagger.model.UserVariables;
import io.swagger.model.VariableCategory;
import io.swagger.model.VariablesNew;
import io.swagger.model.VoteDelete;
import io.swagger.model.PostVote;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/v1")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class V1Api  {
   private final V1ApiService delegate = V1ApiServiceFactory.getV1Api();

    @GET
    @Path("/aggregatedCorrelations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get aggregated correlations", notes = "Get correlations based on the anonymized aggregate data from all QuantiModo users.", response = Correlation.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Correlation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Correlation.class, responseContainer = "List") })
    public Response v1AggregatedCorrelationsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "ORIGINAL variable name of the effect variable for which the user desires correlations") @QueryParam("effect") String effect,@ApiParam(value = "ORIGINAL variable name of the cause variable for which the user desires correlations") @QueryParam("cause") String cause,@ApiParam(value = "Pearson correlation coefficient between cause and effect after lagging by onset delay and grouping by duration of action") @QueryParam("correlationCoefficient") String correlationCoefficient,@ApiParam(value = "The number of seconds which pass following a cause measurement before an effect would likely be observed.") @QueryParam("onsetDelay") String onsetDelay,@ApiParam(value = "The time in seconds over which the cause would be expected to exert a measurable effect. We have selected a default value for each variable. This default value may be replaced by a user specified by adjusting their variable user settings.") @QueryParam("durationOfAction") String durationOfAction,@ApiParam(value = "The time that this measurement was last updated in the UTC format \"YYYY-MM-DDThh:mm:ss\"") @QueryParam("lastUpdated") String lastUpdated,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.") @QueryParam("limit") Integer limit,@ApiParam(value = "Now suppose you wanted to show results 11-20. You'd set the offset to 10 and the limit to 10.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with `-, it will sort in descending order.") @QueryParam("sort") Integer sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1AggregatedCorrelationsGet(accessToken,effect,cause,correlationCoefficient,onsetDelay,durationOfAction,lastUpdated,limit,offset,sort,securityContext);
    }
    @POST
    @Path("/aggregatedCorrelations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store or Update a Correlation", notes = "Add correlation", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class) })
    public Response v1AggregatedCorrelationsPost(@ApiParam(value = "Provides correlation data" ,required=true) PostCorrelation body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1AggregatedCorrelationsPost(body,accessToken,securityContext);
    }
    @GET
    @Path("/connect.js")
    @Consumes({ "application/json" })
    @Produces({ "application/x-javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get embeddable connect javascript", notes = "Get embeddable connect javascript. Usage:    - Embedding in applications with popups for 3rd-party authentication windows.      Use `qmSetupInPopup` function after connecting `connect.js`.    - Embedding in applications with popups for 3rd-party authentication windows.      Requires a selector to block. It will be embedded in this block.      Use `qmSetupOnPage` function after connecting `connect.js`.    - Embedding in mobile applications without popups for 3rd-party authentication.      Use `qmSetupOnMobile` function after connecting `connect.js`.      if using the MoodiModo Clones, Use `qmSetupOnIonic` function after connecting `connect.js`. ", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "connectors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Embeddable connect javascript was returned", response = void.class) })
    public Response v1ConnectJsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1ConnectJsGet(accessToken,securityContext);
    }
    @GET
    @Path("/connect/mobile")
    @Consumes({ "application/json" })
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "Mobile connect page", notes = "This page is designed to be opened in a webview.  Instead of using popup authentication boxes, it uses redirection. You can include the user's access_token as a URL parameter like https://app.quantimo.do/api/v1/connect/mobile?access_token=123", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "connectors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Mobile connect page was returned", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "User token is missing", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "User token is incorrect", response = void.class) })
    public Response v1ConnectMobileGet(@ApiParam(value = "User OAuth access token",required=true) @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1ConnectMobileGet(accessToken,securityContext);
    }
    @GET
    @Path("/connectors/{connector}/connect")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Obtain a token from 3rd party data source", notes = "Attempt to obtain a token from the data provider, store it in the database. With this, the connector to continue to obtain new user data until the token is revoked.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "connectors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Method not found. Could not execute the requested method.", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Error during update. Unsupported response from update().", response = void.class) })
    public Response v1ConnectorsConnectorConnectGet(@ApiParam(value = "Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.",required=true) @PathParam("connector") String connector,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1ConnectorsConnectorConnectGet(connector,accessToken,securityContext);
    }
    @GET
    @Path("/connectors/{connector}/connectInstructions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Connection Instructions", notes = "Returns instructions that describe what parameters and endpoint to use to connect to the given data provider.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "connectors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Method not found. Could not execute the requested method.", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Error during update. Unsupported response from update().", response = void.class) })
    public Response v1ConnectorsConnectorConnectInstructionsGet(@ApiParam(value = "Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.",required=true) @PathParam("connector") String connector,@ApiParam(value = "JSON Array of Parameters for the request to enable connector.",required=true) @QueryParam("parameters") String parameters,@ApiParam(value = "URL which should be used to enable the connector.",required=true) @QueryParam("url") String url,@ApiParam(value = "Should use popup when enabling connector",required=true) @QueryParam("usePopup") Boolean usePopup,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1ConnectorsConnectorConnectInstructionsGet(connector,parameters,url,usePopup,accessToken,securityContext);
    }
    @GET
    @Path("/connectors/{connector}/connectParameter")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Connect Parameter", notes = "Returns instructions that describe what parameters and endpoint to use to connect to the given data provider.", response = ConnectorInstruction.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "connectors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = ConnectorInstruction.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = ConnectorInstruction.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Method not found. Could not execute the requested method.", response = ConnectorInstruction.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Error during update. Unsupported response from update().", response = ConnectorInstruction.class) })
    public Response v1ConnectorsConnectorConnectParameterGet(@ApiParam(value = "Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.",required=true) @PathParam("connector") String connector,@ApiParam(value = "Name of the parameter that is user visible in the form",required=true) @QueryParam("displayName") String displayName,@ApiParam(value = "Name of the property that the user has to enter such as username or password Connector (used in HTTP request)",required=true) @QueryParam("key") String key,@ApiParam(value = "Placeholder hint value for the parameter input tag.",required=true) @QueryParam("placeholder") String placeholder,@ApiParam(value = "Type of input field such as those found here http://www.w3schools.com/tags/tag_input.asp",required=true) @QueryParam("type") String type,@ApiParam(value = "Should use popup when enabling connector",required=true) @QueryParam("usePopup") Boolean usePopup,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Default parameter value") @QueryParam("defaultValue") String defaultValue,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1ConnectorsConnectorConnectParameterGet(connector,displayName,key,placeholder,type,usePopup,accessToken,defaultValue,securityContext);
    }
    @GET
    @Path("/connectors/{connector}/disconnect")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete stored connection info", notes = "The disconnect method deletes any stored tokens or connection information from the connectors database.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "connectors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Method not found. Could not execute the requested method.", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Error during update. Unsupported response from update().", response = void.class) })
    public Response v1ConnectorsConnectorDisconnectGet(@ApiParam(value = "Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.",required=true) @PathParam("connector") String connector,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1ConnectorsConnectorDisconnectGet(connector,securityContext);
    }
    @GET
    @Path("/connectors/{connector}/info")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get connector info for user", notes = "Returns information about the connector such as the connector id, whether or not is connected for this user (i.e. we have a token or credentials), and its update history for the user.", response = ConnectorInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "connectors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = ConnectorInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = ConnectorInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Method not found. Could not execute the requested method.", response = ConnectorInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Error during update. Please contact info@quantimo.do.", response = ConnectorInfo.class) })
    public Response v1ConnectorsConnectorInfoGet(@ApiParam(value = "Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.",required=true) @PathParam("connector") String connector,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1ConnectorsConnectorInfoGet(connector,accessToken,securityContext);
    }
    @GET
    @Path("/connectors/{connector}/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sync with data source", notes = "The update method tells the QM Connector Framework to check with the data provider (such as Fitbit or MyFitnessPal) and retrieve any new measurements available.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "connectors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Connection Successful", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Method not found. Could not execute the requested method.", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Error during update. Unsupported response from update().", response = void.class) })
    public Response v1ConnectorsConnectorUpdateGet(@ApiParam(value = "Lowercase system name of the source application or device",required=true) @PathParam("connector") String connector,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1ConnectorsConnectorUpdateGet(connector,accessToken,securityContext);
    }
    @GET
    @Path("/connectors/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List of Connectors", notes = "A connector pulls data from other data providers using their API or a screenscraper. Returns a list of all available connectors and information about them such as their id, name, whether the user has provided access, logo url, connection instructions, and the update history.", response = Connector.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "connectors", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Connector.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Connector.class, responseContainer = "List") })
    public Response v1ConnectorsListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1ConnectorsListGet(securityContext);
    }
    @GET
    @Path("/correlations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get correlations", notes = "Get correlations.<br>Supported filter parameters:<br><ul><li><b>correlationCoefficient</b> - Pearson correlation coefficient between cause and effect after lagging by onset delay and grouping by duration of action</li><li><b>onsetDelay</b> - The number of seconds which pass following a cause measurement before an effect would likely be observed.</li><li><b>durationOfAction</b> - The time in seconds over which the cause would be expected to exert a measurable effect. We have selected a default value for each variable. This default value may be replaced by a user specified by adjusting their variable user settings.</li><li><b>lastUpdated</b> - The time that this measurement was last updated in the UTC format \"YYYY-MM-DDThh:mm:ss\"</li></ul><br>", response = Correlation.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Correlation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Correlation.class, responseContainer = "List") })
    public Response v1CorrelationsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "ORIGINAL variable name of the effect variable for which the user desires correlations") @QueryParam("effect") String effect,@ApiParam(value = "ORIGINAL variable name of the cause variable for which the user desires correlations") @QueryParam("cause") String cause,@ApiParam(value = "Pearson correlation coefficient between cause and effect after lagging by onset delay and grouping by duration of action") @QueryParam("correlationCoefficient") String correlationCoefficient,@ApiParam(value = "The number of seconds which pass following a cause measurement before an effect would likely be observed.") @QueryParam("onsetDelay") String onsetDelay,@ApiParam(value = "The time in seconds over which the cause would be expected to exert a measurable effect. We have selected a default value for each variable. This default value may be replaced by a user specified by adjusting their variable user settings.") @QueryParam("durationOfAction") String durationOfAction,@ApiParam(value = "The time that this measurement was last updated in the UTC format \"YYYY-MM-DDThh:mm:ss\"") @QueryParam("lastUpdated") String lastUpdated,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.") @QueryParam("limit") Integer limit,@ApiParam(value = "Now suppose you wanted to show results 11-20. You'd set the offset to 10 and the limit to 10.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with `-, it will sort in descending order.") @QueryParam("sort") Integer sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1CorrelationsGet(accessToken,effect,cause,correlationCoefficient,onsetDelay,durationOfAction,lastUpdated,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/measurementSources")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get measurement sources", notes = "Returns a list of all the apps from which measurement data is obtained.", response = MeasurementSource.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = MeasurementSource.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = MeasurementSource.class) })
    public Response v1MeasurementSourcesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1MeasurementSourcesGet(securityContext);
    }
    @POST
    @Path("/measurementSources")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a data source", notes = "Add a life-tracking app or device to the QuantiModo list of data sources.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class) })
    public Response v1MeasurementSourcesPost(@ApiParam(value = "An array of names of data sources you want to add." ,required=true) MeasurementSource body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1MeasurementSourcesPost(body,accessToken,securityContext);
    }
    @GET
    @Path("/measurements/daily")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get daily measurements for this user", notes = "Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten. <br>Supported filter parameters:<br><ul><li><b>value</b> - Value of measurement</li><li><b>lastUpdated</b> - The time that this measurement was created or last updated in the UTC format \"YYYY-MM-DDThh:mm:ss\"</li></ul><br>", response = Measurement.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Measurement.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Measurement.class) })
    public Response v1MeasurementsDailyGet(@ApiParam(value = "Name of the variable you want measurements for",required=true) @QueryParam("variableName") String variableName,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "The unit your want the measurements in") @QueryParam("abbreviatedUnitName") String abbreviatedUnitName,@ApiParam(value = "The lower limit of measurements returned (Iso8601)") @QueryParam("startTime") String startTime,@ApiParam(value = "The upper limit of measurements returned (Iso8601)") @QueryParam("endTime") String endTime,@ApiParam(value = "The time (in seconds) over which measurements are grouped together") @QueryParam("groupingWidth") Integer groupingWidth,@ApiParam(value = "The time (in seconds) over which measurements are grouped together") @QueryParam("groupingTimezone") String groupingTimezone,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.") @QueryParam("limit") Integer limit,@ApiParam(value = "Now suppose you wanted to show results 11-20. You'd set the offset to 10 and the limit to 10.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with `-, it will sort in descending order.") @QueryParam("sort") Integer sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1MeasurementsDailyGet(variableName,accessToken,abbreviatedUnitName,startTime,endTime,groupingWidth,groupingTimezone,limit,offset,sort,securityContext);
    }
    @POST
    @Path("/measurements/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a measurement", notes = "Delete a previously submitted measurement", response = CommonResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class) })
    public Response v1MeasurementsDeletePost(@ApiParam(value = "The startTime and variableId of the measurement to be deleted." ,required=true) MeasurementDelete body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1MeasurementsDeletePost(body,securityContext);
    }
    @GET
    @Path("/measurements")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get measurements for this user", notes = "Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten. <br>Supported filter parameters:<br><ul><li><b>value</b> - Value of measurement</li><li><b>lastUpdated</b> - The time that this measurement was created or last updated in the UTC format \"YYYY-MM-DDThh:mm:ss\"</li></ul><br>", response = Measurement.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Measurement.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Measurement.class) })
    public Response v1MeasurementsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Name of the variable you want measurements for") @QueryParam("variableName") String variableName,@ApiParam(value = "Name of the variable category you want measurements for") @QueryParam("variableCategoryName") String variableCategoryName,@ApiParam(value = "Name of the source you want measurements for (supports exact name match only)") @QueryParam("source") String source,@ApiParam(value = "Value of measurement") @QueryParam("value") String value,@ApiParam(value = "The time that this measurement was created or last updated in the format \"YYYY-MM-DDThh:mm:ss\"") @QueryParam("lastUpdated") String lastUpdated,@ApiParam(value = "The unit you want the measurements returned in") @QueryParam("unit") String unit,@ApiParam(value = "The lower limit of measurements returned (Epoch)") @QueryParam("startTime") String startTime,@ApiParam(value = "The time the measurement record was first created in the format YYYY-MM-DDThh:mm:ss. Time zone should be UTC and not local.") @QueryParam("createdAt") String createdAt,@ApiParam(value = "The time the measurement record was last changed in the format YYYY-MM-DDThh:mm:ss. Time zone should be UTC and not local.") @QueryParam("updatedAt") String updatedAt,@ApiParam(value = "The upper limit of measurements returned (Epoch)") @QueryParam("endTime") String endTime,@ApiParam(value = "The time (in seconds) over which measurements are grouped together") @QueryParam("groupingWidth") Integer groupingWidth,@ApiParam(value = "The time (in seconds) over which measurements are grouped together") @QueryParam("groupingTimezone") String groupingTimezone,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.") @QueryParam("limit") Integer limit,@ApiParam(value = "Now suppose you wanted to show results 11-20. You'd set the offset to 10 and the limit to 10.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with `-, it will sort in descending order.") @QueryParam("sort") Integer sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1MeasurementsGet(accessToken,variableName,variableCategoryName,source,value,lastUpdated,unit,startTime,createdAt,updatedAt,endTime,groupingWidth,groupingTimezone,limit,offset,sort,securityContext);
    }
    @POST
    @Path("/measurements")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Post a new set or update existing measurements to the database", notes = "You can submit or update multiple measurements in a \"measurements\" sub-array.  If the variable these measurements correspond to does not already exist in the database, it will be automatically added.  The request body should look something like [{\"measurements\":[{\"startTime\":1439389320,\"value\":\"3\"}, {\"startTime\":1439389319,\"value\":\"2\"}],\"name\":\"Acne (out of 5)\",\"source\":\"QuantiModo\",\"category\":\"Symptoms\",\"combinationOperation\":\"MEAN\",\"unit\":\"/5\"}]", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data.")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Measurements successfully stored", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class) })
    public Response v1MeasurementsPost(@ApiParam(value = "An array of measurements you want to insert." ,required=true) MeasurementSet body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1MeasurementsPost(body,accessToken,securityContext);
    }
    @GET
    @Path("/measurementsRange")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get measurements range for this user", notes = "Get Unix time-stamp (epoch time) of the user's first and last measurements taken.", response = MeasurementRange.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "measurements", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = MeasurementRange.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = MeasurementRange.class) })
    public Response v1MeasurementsRangeGet(@ApiParam(value = "Enter source name to limit to specific source (varchar)") @QueryParam("sources") String sources,@ApiParam(value = "If not specified, uses currently logged in user (bigint)") @QueryParam("user") Integer user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1MeasurementsRangeGet(sources,user,securityContext);
    }
    @POST
    @Path("/organizations/{organizationId}/users")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user tokens for existing users, create new users", notes = "Get user tokens for existing users, create new users", response = UserTokenSuccessfulResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "writemeasurements", description = "Grants write access to measurements and variables. Allows the client app to store user data."),
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication"),
            @io.swagger.annotations.AuthorizationScope(scope = "readmeasurements", description = "Grants read access to measurements and variables. Allows the client app to obtain the user&#39;s data.")
        }),
        @io.swagger.annotations.Authorization(value = "internalApiKey")
    }, tags={ "organizations","user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User has been found, token was returned", response = UserTokenSuccessfulResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "User has been created, token was returned", response = UserTokenSuccessfulResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad data", response = UserTokenSuccessfulResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = UserTokenSuccessfulResponse.class) })
    public Response v1OrganizationsOrganizationIdUsersPost(@ApiParam(value = "Organization ID",required=true) @PathParam("organizationId") Integer organizationId,@ApiParam(value = "Provides organization token and user ID" ,required=true) UserTokenRequest body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1OrganizationsOrganizationIdUsersPost(organizationId,body,accessToken,securityContext);
    }
    @GET
    @Path("/organizations/{organizationId}/users/{userId}/variables/{variableName}/causes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search user correlations for a given cause", notes = "Returns average of all correlations and votes for all user cause variables for a given cause. If parameter \"include_public\" is used, it also returns public correlations. User correlation overwrites or supersedes public correlation.", response = Correlation.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Correlation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Correlation.class, responseContainer = "List") })
    public Response v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet(@ApiParam(value = "Organization ID",required=true) @PathParam("organizationId") Integer organizationId,@ApiParam(value = "User id",required=true) @PathParam("userId") Integer userId,@ApiParam(value = "Effect variable name",required=true) @PathParam("variableName") String variableName,@ApiParam(value = "Organization access token",required=true) @QueryParam("organization_token") String organizationToken,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Include public correlations, Can be \"1\" or empty.") @QueryParam("includePublic") String includePublic,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet(organizationId,userId,variableName,organizationToken,accessToken,includePublic,securityContext);
    }
    @GET
    @Path("/organizations/{organizationId}/users/{userId}/variables/{variableName}/effects")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search user correlations for a given cause", notes = "Returns average of all correlations and votes for all user cause variables for a given effect. If parameter \"include_public\" is used, it also returns public correlations. User correlation overwrites or supersedes public correlation.", response = CommonResponse.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class, responseContainer = "List") })
    public Response v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet(@ApiParam(value = "Organization ID",required=true) @PathParam("organizationId") Integer organizationId,@ApiParam(value = "User id",required=true) @PathParam("userId") Integer userId,@ApiParam(value = "Cause variable name",required=true) @PathParam("variableName") String variableName,@ApiParam(value = "Organization access token",required=true) @QueryParam("organization_token") String organizationToken,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Include public correlations, Can be \"1\" or empty.") @QueryParam("include_public") String includePublic,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet(organizationId,userId,variableName,organizationToken,accessToken,includePublic,securityContext);
    }
    @GET
    @Path("/pairsCsv")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get pairs", notes = "Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.", response = Pairs.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "pairs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Pairs.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Pairs.class, responseContainer = "List") })
    public Response v1PairsCsvGet(@ApiParam(value = "Original variable name for the explanatory or independent variable",required=true) @QueryParam("cause") String cause,@ApiParam(value = "Original variable name for the outcome or dependent variable",required=true) @QueryParam("effect") String effect,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Name of data source that the cause measurements should come from") @QueryParam("causeSource") String causeSource,@ApiParam(value = "Abbreviated name for the unit cause measurements to be returned in") @QueryParam("causeUnit") String causeUnit,@ApiParam(value = "Delay before onset of action (in seconds) from the cause variable settings.") @QueryParam("delay") String delay,@ApiParam(value = "Duration of action (in seconds) from the cause variable settings.") @QueryParam("duration") String duration,@ApiParam(value = "Name of data source that the effectmeasurements should come from") @QueryParam("effectSource") String effectSource,@ApiParam(value = "Abbreviated name for the unit effect measurements to be returned in") @QueryParam("effectUnit") String effectUnit,@ApiParam(value = "The most recent date (in epoch time) for which we should return measurements") @QueryParam("endTime") String endTime,@ApiParam(value = "The earliest date (in epoch time) for which we should return measurements") @QueryParam("startTime") String startTime,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.") @QueryParam("limit") Integer limit,@ApiParam(value = "Now suppose you wanted to show results 11-20. You'd set the offset to 10 and the limit to 10.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with `-, it will sort in descending order.") @QueryParam("sort") Integer sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1PairsCsvGet(cause,effect,accessToken,causeSource,causeUnit,delay,duration,effectSource,effectUnit,endTime,startTime,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/pairs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get pairs", notes = "Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.", response = Pairs.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "pairs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Pairs.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Pairs.class, responseContainer = "List") })
    public Response v1PairsGet(@ApiParam(value = "Original variable name for the explanatory or independent variable",required=true) @QueryParam("cause") String cause,@ApiParam(value = "Original variable name for the outcome or dependent variable",required=true) @QueryParam("effect") String effect,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Name of data source that the cause measurements should come from") @QueryParam("causeSource") String causeSource,@ApiParam(value = "Abbreviated name for the unit cause measurements to be returned in") @QueryParam("causeUnit") String causeUnit,@ApiParam(value = "Delay before onset of action (in seconds) from the cause variable settings.") @QueryParam("delay") String delay,@ApiParam(value = "Duration of action (in seconds) from the cause variable settings.") @QueryParam("duration") String duration,@ApiParam(value = "Name of data source that the effectmeasurements should come from") @QueryParam("effectSource") String effectSource,@ApiParam(value = "Abbreviated name for the unit effect measurements to be returned in") @QueryParam("effectUnit") String effectUnit,@ApiParam(value = "The most recent date (in epoch time) for which we should return measurements") @QueryParam("endTime") String endTime,@ApiParam(value = "The earliest date (in epoch time) for which we should return measurements") @QueryParam("startTime") String startTime,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.") @QueryParam("limit") Integer limit,@ApiParam(value = "Now suppose you wanted to show results 11-20. You'd set the offset to 10 and the limit to 10.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with `-, it will sort in descending order.") @QueryParam("sort") Integer sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1PairsGet(cause,effect,accessToken,causeSource,causeUnit,delay,duration,effectSource,effectUnit,endTime,startTime,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/public/correlations/search/{search}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get average correlations for variables containing search term", notes = "Returns the average correlations from all users for all public variables that contain the characters in the search query. Returns average of all users public variable correlations with a specified cause or effect.", response = Correlation.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Correlation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Correlation.class, responseContainer = "List") })
    public Response v1PublicCorrelationsSearchSearchGet(@ApiParam(value = "Name of the variable that you want to know the causes or effects of.",required=true) @PathParam("search") String search,@ApiParam(value = "Setting this to effect indicates that the searched variable is the effect and that the causes of this variable should be returned.  cause indicates that the searched variable is the cause and the effects should be returned.",required=true) @QueryParam("effectOrCause") String effectOrCause,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1PublicCorrelationsSearchSearchGet(search,effectOrCause,accessToken,securityContext);
    }
    @GET
    @Path("/public/variables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get public variables", notes = "This endpoint retrieves an array of all public variables. Public variables are things like foods, medications, symptoms, conditions, and anything not unique to a particular user. For instance, a telephone number or name would not be a public variable.", response = Variable.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Variable.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Variable.class) })
    public Response v1PublicVariablesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1PublicVariablesGet(securityContext);
    }
    @GET
    @Path("/public/variables/search/{search}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get top 5 PUBLIC variables with the most correlations", notes = "Get top 5 PUBLIC variables with the most correlations containing the entered search characters. For example, search for 'mood' as an effect. Since 'Overall Mood' has a lot of correlations with other variables, it should be in the autocomplete list.<br>Supported filter parameters:<br><ul><li><b>category</b> - Category of Variable</li></ul><br>", response = Variable.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Variables returned", response = Variable.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Variable.class) })
    public Response v1PublicVariablesSearchSearchGet(@ApiParam(value = "Search query can be some fraction of a variable name.",required=true) @PathParam("search") String search,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Filter variables by category name. The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work.") @QueryParam("categoryName") String categoryName,@ApiParam(value = "Specify a data source name to only return variables from a specific data source.") @QueryParam("source") String source,@ApiParam(value = "Indicate if you only want variables that have user correlations.  Possible values are effect and cause.") @QueryParam("effectOrCause") String effectOrCause,@ApiParam(value = "Indicate if you only want variables that have aggregated correlations.  Possible values are effect and cause.") @QueryParam("publicEffectOrCause") String publicEffectOrCause,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.") @QueryParam("limit") Integer limit,@ApiParam(value = "Now suppose you wanted to show results 11-20. You'd set the offset to 10 and the limit to 10.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with `-, it will sort in descending order.") @QueryParam("sort") Integer sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1PublicVariablesSearchSearchGet(search,accessToken,categoryName,source,effectOrCause,publicEffectOrCause,limit,offset,sort,securityContext);
    }
    @GET
    @Path("/trackingReminderNotifications")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get specific pending tracking reminders", notes = "Specfic pending reminder instances that still need to be tracked.  ", response = InlineResponse200.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "reminders", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })
    public Response v1TrackingReminderNotificationsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Limit tracking reminder notifications to a specific variable category") @QueryParam("variableCategoryName") String variableCategoryName,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format. Time zone should be UTC and not local. ") @QueryParam("createdAt") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local. ") @QueryParam("updatedAt") String updatedAt,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1TrackingReminderNotificationsGet(accessToken,variableCategoryName,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @POST
    @Path("/trackingReminderNotifications/skip")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Skip a pending tracking reminder", notes = "Deletes the pending tracking reminder", response = CommonResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "reminders", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class) })
    public Response v1TrackingReminderNotificationsSkipPost(@ApiParam(value = "Id of the pending reminder to be skipped or deleted" ,required=true) TrackingReminderNotificationSkip body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1TrackingReminderNotificationsSkipPost(body,accessToken,securityContext);
    }
    @POST
    @Path("/trackingReminderNotifications/snooze")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Snooze a pending tracking reminder", notes = "Changes the reminder time to now plus one hour", response = CommonResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "reminders", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class) })
    public Response v1TrackingReminderNotificationsSnoozePost(@ApiParam(value = "Id of the pending reminder to be snoozed" ,required=true) TrackingReminderNotificationSnooze body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1TrackingReminderNotificationsSnoozePost(body,accessToken,securityContext);
    }
    @POST
    @Path("/trackingReminderNotifications/track")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Track a pending tracking reminder", notes = "Adds the default measurement for the pending tracking reminder with the reminder time as the measurment start time", response = CommonResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "reminders", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class) })
    public Response v1TrackingReminderNotificationsTrackPost(@ApiParam(value = "Id of the pending reminder to be tracked" ,required=true) TrackingReminderNotificationTrack body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1TrackingReminderNotificationsTrackPost(body,accessToken,securityContext);
    }
    @POST
    @Path("/trackingReminders/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete tracking reminder", notes = "Delete previously created tracking reminder", response = CommonResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "reminders", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class) })
    public Response v1TrackingRemindersDeletePost(@ApiParam(value = "Id of reminder to be deleted" ,required=true) TrackingReminderDelete body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1TrackingRemindersDeletePost(body,accessToken,securityContext);
    }
    @GET
    @Path("/trackingReminders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get repeating tracking reminder settings", notes = "Users can be reminded to track certain variables at a specified frequency with a default value.  ", response = InlineResponse2001.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "reminders", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2001.class) })
    public Response v1TrackingRemindersGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Limit tracking reminders to a specific variable category") @QueryParam("variableCategoryName") String variableCategoryName,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format. Time zone should be UTC and not local. ") @QueryParam("createdAt") String createdAt,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local. ") @QueryParam("updatedAt") String updatedAt,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1TrackingRemindersGet(accessToken,variableCategoryName,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @POST
    @Path("/trackingReminders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store a Tracking Reminder", notes = "This is to enable users to create reminders to track a variable with a default value at a specified frequency", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "reminders", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })
    public Response v1TrackingRemindersPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "TrackingReminder that should be stored" ) TrackingReminder body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1TrackingRemindersPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/unitCategories")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get unit categories", notes = "Get a list of the categories of measurement units such as 'Distance', 'Duration', 'Energy', 'Frequency', 'Miscellany', 'Pressure', 'Proportion', 'Rating', 'Temperature', 'Volume', and 'Weight'.", response = UnitCategory.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "units", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = UnitCategory.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = UnitCategory.class) })
    public Response v1UnitCategoriesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1UnitCategoriesGet(securityContext);
    }
    @GET
    @Path("/units")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all available units", notes = "Get all available units", response = Unit.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "units", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Unit.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Unit.class, responseContainer = "List") })
    public Response v1UnitsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Unit id") @QueryParam("id") Integer id,@ApiParam(value = "Unit name") @QueryParam("unitName") String unitName,@ApiParam(value = "Restrict the results to a specific unit by providing the unit abbreviation.") @QueryParam("abbreviatedUnitName") String abbreviatedUnitName,@ApiParam(value = "Restrict the results to a specific unit category by providing the unit category name.") @QueryParam("categoryName") String categoryName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1UnitsGet(accessToken,id,unitName,abbreviatedUnitName,categoryName,securityContext);
    }
    @GET
    @Path("/unitsVariable")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Units for Variable", notes = "Get a list of all possible units to use for a given variable", response = Unit.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "units", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Unit.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Unit.class, responseContainer = "List") })
    public Response v1UnitsVariableGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Name of Unit you want to retrieve") @QueryParam("unitName") String unitName,@ApiParam(value = "Abbreviated Unit Name of the unit you want") @QueryParam("abbreviatedUnitName") String abbreviatedUnitName,@ApiParam(value = "Name of the category you want units for") @QueryParam("categoryName") String categoryName,@ApiParam(value = "Name of the variable you want units for") @QueryParam("variable") String variable,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1UnitsVariableGet(accessToken,unitName,abbreviatedUnitName,categoryName,variable,securityContext);
    }
    @GET
    @Path("/user/me")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all available units for variableGet authenticated user", notes = "Returns user info for the currently authenticated user.", response = User.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = User.class) })
    public Response v1UserMeGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1UserMeGet(securityContext);
    }
    @POST
    @Path("/userTags/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete user tag or ingredient", notes = "Delete previously created user tags or ingredients.", response = CommonResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class) })
    public Response v1UserTagsDeletePost(@ApiParam(value = "This is the id of the variable being tagged with an ingredient or something.",required=true) @QueryParam("taggedVariableId") Integer taggedVariableId,@ApiParam(value = "This is the id of the ingredient variable whose value is determined based on the value of the tagged variable.",required=true) @QueryParam("tagVariableId") Integer tagVariableId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1UserTagsDeletePost(taggedVariableId,tagVariableId,securityContext);
    }
    @POST
    @Path("/userTags")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Post or update user tags or ingredients", notes = "This endpoint allows users to tag foods with their ingredients.  This information will then be used to infer the user intake of the different ingredients by just entering the foods. The inferred intake levels will then be used to determine the effects of different nutrients on the user during analysis.", response = CommonResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "tags", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class) })
    public Response v1UserTagsPost(@ApiParam(value = "Contains the new user tag data" ,required=true) UserTag body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1UserTagsPost(body,accessToken,securityContext);
    }
    @POST
    @Path("/userVariables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update User Settings for a Variable", notes = "Users can change the parameters used in analysis of that variable such as the expected duration of action for a variable to have an effect, the estimated delay before the onset of action. In order to filter out erroneous data, they are able to set the maximum and minimum reasonable daily values for a variable.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The received JSON was invalid or malformed", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Unknown target user ID", response = void.class) })
    public Response v1UserVariablesPost(@ApiParam(value = "Variable user settings data" ,required=true) UserVariables userVariables,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1UserVariablesPost(userVariables,securityContext);
    }
    @GET
    @Path("/variableCategories")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Variable categories", notes = "The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work.", response = VariableCategory.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = VariableCategory.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = VariableCategory.class, responseContainer = "List") })
    public Response v1VariableCategoriesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VariableCategoriesGet(securityContext);
    }
    @GET
    @Path("/variables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get variables by the category name", notes = "Get variables by the category name. <br>Supported filter parameters:<br><ul><li><b>name</b> - Original name of the variable (supports exact name match only)</li><li><b>lastUpdated</b> - Filter by the last time any of the properties of the variable were changed. Uses UTC format \"YYYY-MM-DDThh:mm:ss\"</li><li><b>source</b> - The name of the data source that created the variable (supports exact name match only). So if you have a client application and you only want variables that were last updated by your app, you can include the name of your app here</li><li><b>latestMeasurementTime</b> - Filter variables based on the last time a measurement for them was created or updated in the UTC format \"YYYY-MM-DDThh:mm:ss\"</li><li><b>numberOfMeasurements</b> - Filter variables by the total number of measurements that they have. This could be used of you want to filter or sort by popularity.</li><li><b>lastSource</b> - Limit variables to those which measurements were last submitted by a specific source. So if you have a client application and you only want variables that were last updated by your app, you can include the name of your app here. (supports exact name match only)</li></ul><br>", response = Variable.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        }),
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Variables returned", response = Variable.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Variable.class) })
    public Response v1VariablesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Common variable id") @QueryParam("id") Integer id,@ApiParam(value = "User id") @QueryParam("userId") Integer userId,@ApiParam(value = "Filter data by category") @QueryParam("category") String category,@ApiParam(value = "Original name of the variable (supports exact name match only)") @QueryParam("name") String name,@ApiParam(value = "Filter by the last time any of the properties of the variable were changed. Uses UTC format \"YYYY-MM-DDThh:mm:ss\"") @QueryParam("lastUpdated") String lastUpdated,@ApiParam(value = "The name of the data source that created the variable (supports exact name match only). So if you have a client application and you only want variables that were last updated by your app, you can include the name of your app here") @QueryParam("source") String source,@ApiParam(value = "Filter variables based on the last time a measurement for them was created or updated in the UTC format \"YYYY-MM-DDThh:mm:ss\"") @QueryParam("latestMeasurementTime") String latestMeasurementTime,@ApiParam(value = "Filter variables by the total number of measurements that they have. This could be used of you want to filter or sort by popularity.") @QueryParam("numberOfMeasurements") String numberOfMeasurements,@ApiParam(value = "Limit variables to those which measurements were last submitted by a specific source. So if you have a client application and you only want variables that were last updated by your app, you can include the name of your app here. (supports exact name match only)") @QueryParam("lastSource") String lastSource,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.") @QueryParam("limit") Integer limit,@ApiParam(value = "Now suppose you wanted to show results 11-20. You'd set the offset to 10 and the limit to 10.") @QueryParam("offset") Integer offset,@ApiParam(value = "Sort by given field. If the field is prefixed with `-, it will sort in descending order.") @QueryParam("sort") Integer sort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VariablesGet(accessToken,id,userId,category,name,lastUpdated,source,latestMeasurementTime,numberOfMeasurements,lastSource,limit,offset,sort,securityContext);
    }
    @POST
    @Path("/variables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create Variables", notes = "Allows the client to create a new variable in the `variables` table.", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Variable created", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = void.class) })
    public Response v1VariablesPost(@ApiParam(value = "Original name for the variable." ,required=true) VariablesNew body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VariablesPost(body,accessToken,securityContext);
    }
    @GET
    @Path("/variables/search/{search}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get variables by search query", notes = "Get variables containing the search characters for which the currently logged in user has measurements. Used to provide auto-complete function in variable search boxes.", response = Variable.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful operation", response = Variable.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Variable.class, responseContainer = "List") })
    public Response v1VariablesSearchSearchGet(@ApiParam(value = "Search query which may be an entire variable name or a fragment of one.",required=true) @PathParam("search") String search,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@ApiParam(value = "Filter variables by category name. The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work.") @QueryParam("categoryName") String categoryName,@ApiParam(value = "Set to true if you would like to include public variables when no user variables are found.") @QueryParam("includePublic") Boolean includePublic,@ApiParam(value = "Set to true if you would like to exlude variables like apps and website names.") @QueryParam("manualTracking") Boolean manualTracking,@ApiParam(value = "Specify a data source name to only return variables from a specific data source.") @QueryParam("source") String source,@ApiParam(value = "Indicate if you only want variables that have user correlations.  Possible values are effect and cause.") @QueryParam("effectOrCause") String effectOrCause,@ApiParam(value = "Indicate if you only want variables that have aggregated correlations.  Possible values are effect and cause.") @QueryParam("publicEffectOrCause") String publicEffectOrCause,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.") @QueryParam("limit") Integer limit,@ApiParam(value = "Now suppose you wanted to show results 11-20. You'd set the offset to 10 and the limit to 10.") @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VariablesSearchSearchGet(search,accessToken,categoryName,includePublic,manualTracking,source,effectOrCause,publicEffectOrCause,limit,offset,securityContext);
    }
    @GET
    @Path("/variables/{variableName}/causes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search user correlations for a given effect", notes = "Returns average of all correlations and votes for all user cause variables for a given effect", response = Correlation.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Correlation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Correlation.class, responseContainer = "List") })
    public Response v1VariablesVariableNameCausesGet(@ApiParam(value = "Effect variable name",required=true) @PathParam("variableName") String variableName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VariablesVariableNameCausesGet(variableName,securityContext);
    }
    @GET
    @Path("/variables/{variableName}/effects")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search user correlations for a given cause", notes = "Returns average of all correlations and votes for all user effect variables for a given cause", response = Correlation.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Correlation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Correlation.class, responseContainer = "List") })
    public Response v1VariablesVariableNameEffectsGet(@ApiParam(value = "Cause variable name",required=true) @PathParam("variableName") String variableName,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VariablesVariableNameEffectsGet(variableName,accessToken,securityContext);
    }
    @GET
    @Path("/variables/{variableName}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get info about a variable", notes = "Get all of the settings and information about a variable by its name. If the logged in user has modified the settings for the variable, these will be provided instead of the default settings for that variable.", response = Variable.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Variables returned", response = Variable.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Variable.class) })
    public Response v1VariablesVariableNameGet(@ApiParam(value = "Variable name",required=true) @PathParam("variableName") String variableName,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VariablesVariableNameGet(variableName,accessToken,securityContext);
    }
    @GET
    @Path("/variables/{variableName}/public/causes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search public correlations for a given effect", notes = "Returns average of all correlations and votes for all public cause variables for a given effect", response = Correlation.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Correlation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Correlation.class, responseContainer = "List") })
    public Response v1VariablesVariableNamePublicCausesGet(@ApiParam(value = "Effect variable name",required=true) @PathParam("variableName") String variableName,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VariablesVariableNamePublicCausesGet(variableName,accessToken,securityContext);
    }
    @GET
    @Path("/variables/{variableName}/public/effects")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Search public correlations for a given cause", notes = "Returns average of all correlations and votes for all public cause variables for a given cause", response = Correlation.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = Correlation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = Correlation.class, responseContainer = "List") })
    public Response v1VariablesVariableNamePublicEffectsGet(@ApiParam(value = "Cause variable name",required=true) @PathParam("variableName") String variableName,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VariablesVariableNamePublicEffectsGet(variableName,accessToken,securityContext);
    }
    @POST
    @Path("/votes/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete vote", notes = "Delete previously posted vote", response = CommonResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations","votes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class) })
    public Response v1VotesDeletePost(@ApiParam(value = "The cause and effect variable names for the predictor vote to be deleted." ,required=true) VoteDelete body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VotesDeletePost(body,accessToken,securityContext);
    }
    @POST
    @Path("/votes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Post or update vote", notes = "This is to enable users to indicate their opinion on the plausibility of a causal relationship between a treatment and outcome. QuantiModo incorporates crowd-sourced plausibility estimations into their algorithm. This is done allowing user to indicate their view of the plausibility of each relationship with thumbs up/down buttons placed next to each prediction.", response = CommonResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "Basic authentication")
        })
    }, tags={ "correlations","votes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful Operation", response = CommonResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not Authenticated", response = CommonResponse.class) })
    public Response v1VotesPost(@ApiParam(value = "Contains the cause variable, effect variable, and vote value." ,required=true) PostVote body,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v1VotesPost(body,accessToken,securityContext);
    }
}
