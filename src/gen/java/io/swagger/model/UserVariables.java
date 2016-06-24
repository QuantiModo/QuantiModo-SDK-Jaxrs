package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class UserVariables   {
  
  private Integer user = null;
  private Integer variableId = null;
  private Integer durationOfAction = null;
  private Integer fillingValue = null;
  private String joinWith = null;
  private Float maximumAllowedValue = null;
  private Float minimumAllowedValue = null;
  private Integer onsetDelay = null;
  private String experimentStartTime = null;
  private String experimentEndTime = null;

  /**
   * User ID
   **/
  public UserVariables user(Integer user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User ID")
  @JsonProperty("user")
  public Integer getUser() {
    return user;
  }
  public void setUser(Integer user) {
    this.user = user;
  }

  /**
   * Common variable id
   **/
  public UserVariables variableId(Integer variableId) {
    this.variableId = variableId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Common variable id")
  @JsonProperty("variableId")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }

  /**
   * Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect
   **/
  public UserVariables durationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
    return this;
  }

  
  @ApiModelProperty(value = "Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect")
  @JsonProperty("durationOfAction")
  public Integer getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
  }

  /**
   * fillingValue
   **/
  public UserVariables fillingValue(Integer fillingValue) {
    this.fillingValue = fillingValue;
    return this;
  }

  
  @ApiModelProperty(value = "fillingValue")
  @JsonProperty("fillingValue")
  public Integer getFillingValue() {
    return fillingValue;
  }
  public void setFillingValue(Integer fillingValue) {
    this.fillingValue = fillingValue;
  }

  /**
   * joinWith
   **/
  public UserVariables joinWith(String joinWith) {
    this.joinWith = joinWith;
    return this;
  }

  
  @ApiModelProperty(value = "joinWith")
  @JsonProperty("joinWith")
  public String getJoinWith() {
    return joinWith;
  }
  public void setJoinWith(String joinWith) {
    this.joinWith = joinWith;
  }

  /**
   * maximumAllowedValue
   **/
  public UserVariables maximumAllowedValue(Float maximumAllowedValue) {
    this.maximumAllowedValue = maximumAllowedValue;
    return this;
  }

  
  @ApiModelProperty(value = "maximumAllowedValue")
  @JsonProperty("maximumAllowedValue")
  public Float getMaximumAllowedValue() {
    return maximumAllowedValue;
  }
  public void setMaximumAllowedValue(Float maximumAllowedValue) {
    this.maximumAllowedValue = maximumAllowedValue;
  }

  /**
   * minimumAllowedValue
   **/
  public UserVariables minimumAllowedValue(Float minimumAllowedValue) {
    this.minimumAllowedValue = minimumAllowedValue;
    return this;
  }

  
  @ApiModelProperty(value = "minimumAllowedValue")
  @JsonProperty("minimumAllowedValue")
  public Float getMinimumAllowedValue() {
    return minimumAllowedValue;
  }
  public void setMinimumAllowedValue(Float minimumAllowedValue) {
    this.minimumAllowedValue = minimumAllowedValue;
  }

  /**
   * onsetDelay
   **/
  public UserVariables onsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
    return this;
  }

  
  @ApiModelProperty(value = "onsetDelay")
  @JsonProperty("onsetDelay")
  public Integer getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
  }

  /**
   * Earliest measurement startTime that should be used in analysis in ISO format
   **/
  public UserVariables experimentStartTime(String experimentStartTime) {
    this.experimentStartTime = experimentStartTime;
    return this;
  }

  
  @ApiModelProperty(value = "Earliest measurement startTime that should be used in analysis in ISO format")
  @JsonProperty("experimentStartTime")
  public String getExperimentStartTime() {
    return experimentStartTime;
  }
  public void setExperimentStartTime(String experimentStartTime) {
    this.experimentStartTime = experimentStartTime;
  }

  /**
   * Latest measurement startTime that should be used in analysis in ISO format
   **/
  public UserVariables experimentEndTime(String experimentEndTime) {
    this.experimentEndTime = experimentEndTime;
    return this;
  }

  
  @ApiModelProperty(value = "Latest measurement startTime that should be used in analysis in ISO format")
  @JsonProperty("experimentEndTime")
  public String getExperimentEndTime() {
    return experimentEndTime;
  }
  public void setExperimentEndTime(String experimentEndTime) {
    this.experimentEndTime = experimentEndTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserVariables userVariables = (UserVariables) o;
    return Objects.equals(user, userVariables.user) &&
        Objects.equals(variableId, userVariables.variableId) &&
        Objects.equals(durationOfAction, userVariables.durationOfAction) &&
        Objects.equals(fillingValue, userVariables.fillingValue) &&
        Objects.equals(joinWith, userVariables.joinWith) &&
        Objects.equals(maximumAllowedValue, userVariables.maximumAllowedValue) &&
        Objects.equals(minimumAllowedValue, userVariables.minimumAllowedValue) &&
        Objects.equals(onsetDelay, userVariables.onsetDelay) &&
        Objects.equals(experimentStartTime, userVariables.experimentStartTime) &&
        Objects.equals(experimentEndTime, userVariables.experimentEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, variableId, durationOfAction, fillingValue, joinWith, maximumAllowedValue, minimumAllowedValue, onsetDelay, experimentStartTime, experimentEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVariables {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    durationOfAction: ").append(toIndentedString(durationOfAction)).append("\n");
    sb.append("    fillingValue: ").append(toIndentedString(fillingValue)).append("\n");
    sb.append("    joinWith: ").append(toIndentedString(joinWith)).append("\n");
    sb.append("    maximumAllowedValue: ").append(toIndentedString(maximumAllowedValue)).append("\n");
    sb.append("    minimumAllowedValue: ").append(toIndentedString(minimumAllowedValue)).append("\n");
    sb.append("    onsetDelay: ").append(toIndentedString(onsetDelay)).append("\n");
    sb.append("    experimentStartTime: ").append(toIndentedString(experimentStartTime)).append("\n");
    sb.append("    experimentEndTime: ").append(toIndentedString(experimentEndTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

