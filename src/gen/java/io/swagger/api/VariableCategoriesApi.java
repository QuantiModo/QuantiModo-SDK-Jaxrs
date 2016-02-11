package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.VariableCategoriesApiService;
import io.swagger.api.factories.VariableCategoriesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20031;
import java.math.BigDecimal;
import io.swagger.model.VariableCategory;
import io.swagger.model.InlineResponse20032;
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

@Path("/variableCategories")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the variableCategories API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class VariableCategoriesApi  {
   private final VariableCategoriesApiService delegate = VariableCategoriesApiServiceFactory.getVariableCategoriesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all VariableCategories", notes = "The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work.", response = InlineResponse20031.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableCategory",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20031.class) })

    public Response variableCategoriesGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "Name of the category") @QueryParam("name") String name
,@ApiParam(value = "Value for replacing null measurements") @QueryParam("filling_value") BigDecimal fillingValue
,@ApiParam(value = "Maximum recorded value of this category") @QueryParam("maximum_allowed_value") BigDecimal maximumAllowedValue
,@ApiParam(value = "Minimum recorded value of this category") @QueryParam("minimum_allowed_value") BigDecimal minimumAllowedValue
,@ApiParam(value = "Estimated number of seconds following the onset delay in which a stimulus produces a perceivable effect") @QueryParam("duration_of_action") Integer durationOfAction
,@ApiParam(value = "Estimated number of seconds that pass before a stimulus produces a perceivable effect") @QueryParam("onset_delay") Integer onsetDelay
,@ApiParam(value = "How to combine values of this variable (for instance, to see a summary of the values over a month) SUM or MEAN") @QueryParam("combination_operation") String combinationOperation
,@ApiParam(value = "updated") @QueryParam("updated") Integer updated
,@ApiParam(value = "A value of 1 indicates that this category is generally a cause in a causal relationship.  An example of a causeOnly category would be a category such as Work which would generally not be influenced by the behaviour of the user") @QueryParam("cause_only") Boolean causeOnly
,@ApiParam(value = "Is category public") @QueryParam("public") Integer _public
,@ApiParam(value = "outcome") @QueryParam("outcome") Boolean outcome
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "Image URL") @QueryParam("image_url") String imageUrl
,@ApiParam(value = "ID of the default unit for the category") @QueryParam("default_unit_id") Integer defaultUnitId
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableCategoriesGet(accessToken,name,fillingValue,maximumAllowedValue,minimumAllowedValue,durationOfAction,onsetDelay,combinationOperation,updated,causeOnly,_public,outcome,createdAt,updatedAt,imageUrl,defaultUnitId,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store VariableCategory", notes = "Store VariableCategory", response = InlineResponse20032.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableCategory",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20032.class) })

    public Response variableCategoriesPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "VariableCategory that should be stored" ) VariableCategory body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableCategoriesPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get VariableCategory", notes = "Get VariableCategory", response = InlineResponse20032.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableCategory",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20032.class) })

    public Response variableCategoriesIdGet(
@ApiParam(value = "id of VariableCategory",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableCategoriesIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update VariableCategory", notes = "Update VariableCategory", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableCategory",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variableCategoriesIdPut(
@ApiParam(value = "id of VariableCategory",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "VariableCategory that should be updated" ) VariableCategory body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableCategoriesIdPut(id,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete VariableCategory", notes = "Delete VariableCategory", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "VariableCategory" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response variableCategoriesIdDelete(
@ApiParam(value = "id of VariableCategory",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.variableCategoriesIdDelete(id,accessToken,securityContext);
    }
}
