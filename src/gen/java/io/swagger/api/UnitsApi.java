package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UnitsApiService;
import io.swagger.api.factories.UnitsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20026;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20027;
import io.swagger.model.Unit;
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

@Path("/units")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the units API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class UnitsApi  {
   private final UnitsApiService delegate = UnitsApiServiceFactory.getUnitsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all available units", notes = "Get all available units", response = InlineResponse20026.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Unit",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20026.class) })

    public Response unitsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "The ID of the client application which last created or updated this unit") @QueryParam("client_id") String clientId
,@ApiParam(value = "Unit name") @QueryParam("name") String name
,@ApiParam(value = "Unit abbreviation") @QueryParam("abbreviated_name") String abbreviatedName
,@ApiParam(value = "Unit category ID") @QueryParam("category_id") Integer categoryId
,@ApiParam(value = "Minimum value permitted for this unit") @QueryParam("minimum_value") BigDecimal minimumValue
,@ApiParam(value = "Maximum value permitted for this unit") @QueryParam("maximum_value") BigDecimal maximumValue
,@ApiParam(value = "updated") @QueryParam("updated") Integer updated
,@ApiParam(value = "ID of default unit for this units category") @QueryParam("default_unit_id") Integer defaultUnitId
,@ApiParam(value = "Value multiplied to convert to default unit in this unit category") @QueryParam("multiply") BigDecimal multiply
,@ApiParam(value = "Value which should be added to convert to default unit") @QueryParam("add") BigDecimal add
,@ApiParam(value = "When the record was first created. Use ISO 8601 datetime format") @QueryParam("created_at") String createdAt
,@ApiParam(value = "When the record was last updated. Use ISO 8601 datetime format") @QueryParam("updated_at") String updatedAt
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.unitsGet(accessToken,clientId,name,abbreviatedName,categoryId,minimumValue,maximumValue,updated,defaultUnitId,multiply,add,createdAt,updatedAt,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Unit", notes = "Store Unit", response = InlineResponse20027.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Unit",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20027.class) })

    public Response unitsPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Unit that should be stored" ) Unit body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.unitsPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Unit", notes = "Get Unit", response = InlineResponse20027.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Unit",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20027.class) })

    public Response unitsIdGet(
@ApiParam(value = "id of Unit",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.unitsIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Unit", notes = "Update Unit", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Unit",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response unitsIdPut(
@ApiParam(value = "id of Unit",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "Unit that should be updated" ) Unit body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.unitsIdPut(id,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Unit", notes = "Delete Unit", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "Unit" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response unitsIdDelete(
@ApiParam(value = "id of Unit",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.unitsIdDelete(id,accessToken,securityContext);
    }
}
