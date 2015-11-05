package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.VotesApiService;
import io.swagger.api.factories.VotesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20029;
import io.swagger.model.Vote;
import io.swagger.model.InlineResponse20030;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/votes")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/votes", description = "the votes API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class VotesApi  {

   private final VotesApiService delegate = VotesApiServiceFactory.getVotesApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Votes", notes = "Get all Votes", response = InlineResponse20029.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20029.class) })

    public Response votesGet(@ApiParam(value = "client_id") @QueryParam("client_id") String clientId,
    @ApiParam(value = "user_id") @QueryParam("user_id") Integer userId,
    @ApiParam(value = "cause_id") @QueryParam("cause_id") Integer causeId,
    @ApiParam(value = "effect_id") @QueryParam("effect_id") Integer effectId,
    @ApiParam(value = "value") @QueryParam("value") Integer value,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.votesGet(clientId,userId,causeId,effectId,value,createdAt,updatedAt,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Vote", notes = "Store Vote", response = InlineResponse20030.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20030.class) })

    public Response votesPost(@ApiParam(value = "Vote that should be stored" ) Vote body)
    throws NotFoundException {
        return delegate.votesPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Vote", notes = "Get Vote", response = InlineResponse20030.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20030.class) })

    public Response votesIdGet(@ApiParam(value = "id of Vote",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.votesIdGet(id);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Vote", notes = "Update Vote", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response votesIdPut(@ApiParam(value = "id of Vote",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "Vote that should be updated" ) Vote body)
    throws NotFoundException {
        return delegate.votesIdPut(id,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Vote", notes = "Delete Vote", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response votesIdDelete(@ApiParam(value = "id of Vote",required=true) @PathParam("id") Integer id)
    throws NotFoundException {
        return delegate.votesIdDelete(id);
    }
}

