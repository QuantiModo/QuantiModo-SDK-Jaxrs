package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.VariablesApiService;
import io.swagger.api.factories.VariablesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20034;
import java.math.BigDecimal;
import io.swagger.model.Variable;
import io.swagger.model.InlineResponse20035;
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

@Path("/variables")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the variables API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class VariablesApi  {
   private final VariablesApiService delegate = VariablesApiServiceFactory.getVariablesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Variables", notes = "Get all Variables", response = InlineResponse20034.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Variable",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20034.class) })

    public Response variablesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "id") @QueryParam("id") Integer id
,@ApiParam(value = "The ID of the client application which last created or updated this common variable") @QueryParam("client_id") String clientId
,@ApiParam(value = "ID of the parent variable if this variable has any parent") @QueryParam("parent_id") Integer parentId
,@ApiParam(value = "User-defined variable display name") @QueryParam("name") String name
,@ApiParam(value = "Variable category ID") @QueryParam("variable_category_id") Integer variableCategoryId
,@ApiParam(value = "ID of the default unit for the variable") @QueryParam("default_unit_id") Integer defaultUnitId
,@ApiParam(value = "How to combine values of this variable (for instance, to see a summary of the values over a month) SUM or MEAN") @QueryParam("combination_operation") String combinationOperation
,@ApiParam(value = "Value for replacing null measurements") @QueryParam("filling_value") BigDecimal fillingValue
,@ApiParam(value = "Maximum reasonable value for this variable (uses default unit)") @QueryParam("maximum_allowed_value") BigDecimal maximumAllowedValue
,@ApiParam(value = "Minimum reasonable value for this variable (uses default unit)") @QueryParam("minimum_allowed_value") BigDecimal minimumAllowedValue
,@ApiParam(value = "Estimated number of seconds that pass before a stimulus produces a perceivable effect") @QueryParam("onset_delay") Integer onsetDelay
,@ApiParam(value = "Estimated number of seconds following the onset delay in which a stimulus produces a perceivable effect") @QueryParam("duration_of_action") Integer durationOfAction
,@ApiParam(value = "Is variable public") @QueryParam("public") Integer _public
,@ApiParam(value = "A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user") @QueryParam("cause_only") Boolean causeOnly
,@ApiParam(value = "Most common value") @QueryParam("most_common_value") BigDecimal mostCommonValue
,@ApiParam(value = "Most common Unit") @QueryParam("most_common_unit_id") Integer mostCommonUnitId
,@ApiParam(value = "Standard Deviation") @QueryParam("standard_deviation") BigDecimal standardDeviation
,@ApiParam(value = "Average variance for this variable based on all user data") @QueryParam("variance") BigDecimal variance
,@ApiParam(value = "Mean for this variable based on all user data") @QueryParam("mean") BigDecimal mean
,@ApiParam(value = "Median for this variable based on all user data") @QueryParam("median") BigDecimal median
,@ApiParam(value = "Number of measurements for this variable based on all user data") @QueryParam("number_of_measurements") BigDecimal numberOfMeasurements
,@ApiParam(value = "Number of unique values for this variable based on all user data") @QueryParam("number_of_unique_values") BigDecimal numberOfUniqueValues
,@ApiParam(value = "Skewness for this variable based on all user data") @QueryParam("skewness") BigDecimal skewness
,@ApiParam(value = "Kurtosis for this variable based on all user data") @QueryParam("kurtosis") BigDecimal kurtosis
,@ApiParam(value = "status") @QueryParam("status") String status
,@ApiParam(value = "error_message") @QueryParam("error_message") String errorMessage
,@ApiParam(value = "When this variable or its settings were last updated") @QueryParam("last_successful_update_time") String lastSuccessfulUpdateTime
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "Product URL") @QueryParam("product_url") String productUrl
,@ApiParam(value = "Image URL") @QueryParam("image_url") String imageUrl
,@ApiParam(value = "Price") @QueryParam("price") BigDecimal price
,@ApiParam(value = "Number of users who have data for this variable") @QueryParam("number_of_user_variables") Integer numberOfUserVariables
,@ApiParam(value = "Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables.") @QueryParam("outcome") Boolean outcome
,@ApiParam(value = "Minimum recorded value of this variable based on all user data") @QueryParam("minimum_recorded_value") BigDecimal minimumRecordedValue
,@ApiParam(value = "Maximum recorded value of this variable based on all user data") @QueryParam("maximum_recorded_value") BigDecimal maximumRecordedValue
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort records by a given field name. If the field name is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variablesGet(accessToken,id,clientId,parentId,name,variableCategoryId,defaultUnitId,combinationOperation,fillingValue,maximumAllowedValue,minimumAllowedValue,onsetDelay,durationOfAction,_public,causeOnly,mostCommonValue,mostCommonUnitId,standardDeviation,variance,mean,median,numberOfMeasurements,numberOfUniqueValues,skewness,kurtosis,status,errorMessage,lastSuccessfulUpdateTime,createdAt,updatedAt,productUrl,imageUrl,price,numberOfUserVariables,outcome,minimumRecordedValue,maximumRecordedValue,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Variable", notes = "Allows the client to create a new variable in the `variables` table.", response = InlineResponse20035.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Variable",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20035.class) })

    public Response variablesPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Variable that should be stored" ) Variable body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variablesPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Variable", notes = "Get Variable", response = InlineResponse20035.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Variable",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20035.class) })

    public Response variablesIdGet(
@ApiParam(value = "id of Variable",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variablesIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Variable", notes = "Update Variable", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Variable",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variablesIdPut(
@ApiParam(value = "id of Variable",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Variable that should be updated" ) Variable body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variablesIdPut(id,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Variable", notes = "Delete Variable", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Variable" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variablesIdDelete(
@ApiParam(value = "id of Variable",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variablesIdDelete(id,accessToken,securityContext);
    }
}
