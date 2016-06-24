package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class V1ApiServiceImpl extends V1ApiService {
    @Override
    public Response v1AggregatedCorrelationsGet(String accessToken, String effect, String cause, String correlationCoefficient, String onsetDelay, String durationOfAction, String lastUpdated, Integer limit, Integer offset, Integer sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1AggregatedCorrelationsPost(PostCorrelation body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1ConnectJsGet(String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1ConnectMobileGet(String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1ConnectorsConnectorConnectGet(String connector, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1ConnectorsConnectorConnectInstructionsGet(String connector, String parameters, String url, Boolean usePopup, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1ConnectorsConnectorConnectParameterGet(String connector, String displayName, String key, String placeholder, String type, Boolean usePopup, String accessToken, String defaultValue, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1ConnectorsConnectorDisconnectGet(String connector, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1ConnectorsConnectorInfoGet(String connector, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1ConnectorsConnectorUpdateGet(String connector, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1ConnectorsListGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1CorrelationsGet(String accessToken, String effect, String cause, String correlationCoefficient, String onsetDelay, String durationOfAction, String lastUpdated, Integer limit, Integer offset, Integer sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1MeasurementSourcesGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1MeasurementSourcesPost(MeasurementSource body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1MeasurementsDailyGet(String variableName, String accessToken, String abbreviatedUnitName, String startTime, String endTime, Integer groupingWidth, String groupingTimezone, Integer limit, Integer offset, Integer sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1MeasurementsDeletePost(MeasurementDelete body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1MeasurementsGet(String accessToken, String variableName, String variableCategoryName, String source, String value, String lastUpdated, String unit, String startTime, String createdAt, String updatedAt, String endTime, Integer groupingWidth, String groupingTimezone, Integer limit, Integer offset, Integer sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1MeasurementsPost(MeasurementSet body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1MeasurementsRangeGet(String sources, Integer user, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1OrganizationsOrganizationIdUsersPost(Integer organizationId, UserTokenRequest body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet(Integer organizationId, Integer userId, String variableName, String organizationToken, String accessToken, String includePublic, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet(Integer organizationId, Integer userId, String variableName, String organizationToken, String accessToken, String includePublic, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1PairsCsvGet(String cause, String effect, String accessToken, String causeSource, String causeUnit, String delay, String duration, String effectSource, String effectUnit, String endTime, String startTime, Integer limit, Integer offset, Integer sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1PairsGet(String cause, String effect, String accessToken, String causeSource, String causeUnit, String delay, String duration, String effectSource, String effectUnit, String endTime, String startTime, Integer limit, Integer offset, Integer sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1PublicCorrelationsSearchSearchGet(String search, String effectOrCause, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1PublicVariablesGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1PublicVariablesSearchSearchGet(String search, String accessToken, String categoryName, String source, String effectOrCause, String publicEffectOrCause, Integer limit, Integer offset, Integer sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1TrackingReminderNotificationsGet(String accessToken, String variableCategoryName, String createdAt, String updatedAt, Integer limit, Integer offset, String sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1TrackingReminderNotificationsSkipPost(TrackingReminderNotificationSkip body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1TrackingReminderNotificationsSnoozePost(TrackingReminderNotificationSnooze body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1TrackingReminderNotificationsTrackPost(TrackingReminderNotificationTrack body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1TrackingRemindersDeletePost(TrackingReminderDelete body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1TrackingRemindersGet(String accessToken, String variableCategoryName, String createdAt, String updatedAt, Integer limit, Integer offset, String sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1TrackingRemindersPost(String accessToken, TrackingReminder body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1UnitCategoriesGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1UnitsGet(String accessToken, Integer id, String unitName, String abbreviatedUnitName, String categoryName, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1UnitsVariableGet(String accessToken, String unitName, String abbreviatedUnitName, String categoryName, String variable, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1UserMeGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1UserTagsDeletePost(Integer taggedVariableId, Integer tagVariableId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1UserTagsPost(UserTag body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1UserVariablesPost(UserVariables userVariables, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VariableCategoriesGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VariablesGet(String accessToken, Integer id, Integer userId, String category, String name, String lastUpdated, String source, String latestMeasurementTime, String numberOfMeasurements, String lastSource, Integer limit, Integer offset, Integer sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VariablesPost(VariablesNew body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VariablesSearchSearchGet(String search, String accessToken, String categoryName, Boolean includePublic, Boolean manualTracking, String source, String effectOrCause, String publicEffectOrCause, Integer limit, Integer offset, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VariablesVariableNameCausesGet(String variableName, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VariablesVariableNameEffectsGet(String variableName, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VariablesVariableNameGet(String variableName, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VariablesVariableNamePublicCausesGet(String variableName, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VariablesVariableNamePublicEffectsGet(String variableName, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VotesDeletePost(VoteDelete body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response v1VotesPost(PostVote body, String accessToken, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
