package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class Permission   {
  
  private Integer target = null;
  private String variableName = null;
  private Integer minTimestamp = null;
  private Integer maxTimestamp = null;
  private Integer minTimeOfDay = null;
  private Integer maxTimeOfDay = null;
  private String week = null;

  /**
   * Grant permission to target user or public so they may access measurements within the given parameters. TODO: Rename target to something more intuitive.
   **/
  public Permission target(Integer target) {
    this.target = target;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Grant permission to target user or public so they may access measurements within the given parameters. TODO: Rename target to something more intuitive.")
  @JsonProperty("target")
  public Integer getTarget() {
    return target;
  }
  public void setTarget(Integer target) {
    this.target = target;
  }

  /**
   * ORIGINAL Variable name
   **/
  public Permission variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ORIGINAL Variable name")
  @JsonProperty("variableName")
  public String getVariableName() {
    return variableName;
  }
  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  /**
   * Earliest time when measurements will be accessible in epoch seconds
   **/
  public Permission minTimestamp(Integer minTimestamp) {
    this.minTimestamp = minTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Earliest time when measurements will be accessible in epoch seconds")
  @JsonProperty("minTimestamp")
  public Integer getMinTimestamp() {
    return minTimestamp;
  }
  public void setMinTimestamp(Integer minTimestamp) {
    this.minTimestamp = minTimestamp;
  }

  /**
   * Latest time when measurements will be accessible in epoch seconds
   **/
  public Permission maxTimestamp(Integer maxTimestamp) {
    this.maxTimestamp = maxTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Latest time when measurements will be accessible in epoch seconds")
  @JsonProperty("maxTimestamp")
  public Integer getMaxTimestamp() {
    return maxTimestamp;
  }
  public void setMaxTimestamp(Integer maxTimestamp) {
    this.maxTimestamp = maxTimestamp;
  }

  /**
   * Earliest time of day when measurements will be accessible in epoch seconds
   **/
  public Permission minTimeOfDay(Integer minTimeOfDay) {
    this.minTimeOfDay = minTimeOfDay;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Earliest time of day when measurements will be accessible in epoch seconds")
  @JsonProperty("minTimeOfDay")
  public Integer getMinTimeOfDay() {
    return minTimeOfDay;
  }
  public void setMinTimeOfDay(Integer minTimeOfDay) {
    this.minTimeOfDay = minTimeOfDay;
  }

  /**
   * Latest time of day when measurements will be accessible in epoch seconds
   **/
  public Permission maxTimeOfDay(Integer maxTimeOfDay) {
    this.maxTimeOfDay = maxTimeOfDay;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Latest time of day when measurements will be accessible in epoch seconds")
  @JsonProperty("maxTimeOfDay")
  public Integer getMaxTimeOfDay() {
    return maxTimeOfDay;
  }
  public void setMaxTimeOfDay(Integer maxTimeOfDay) {
    this.maxTimeOfDay = maxTimeOfDay;
  }

  /**
   * Maybe specifies if only weekday measurements should be accessible
   **/
  public Permission week(String week) {
    this.week = week;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Maybe specifies if only weekday measurements should be accessible")
  @JsonProperty("week")
  public String getWeek() {
    return week;
  }
  public void setWeek(String week) {
    this.week = week;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(target, permission.target) &&
        Objects.equals(variableName, permission.variableName) &&
        Objects.equals(minTimestamp, permission.minTimestamp) &&
        Objects.equals(maxTimestamp, permission.maxTimestamp) &&
        Objects.equals(minTimeOfDay, permission.minTimeOfDay) &&
        Objects.equals(maxTimeOfDay, permission.maxTimeOfDay) &&
        Objects.equals(week, permission.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, variableName, minTimestamp, maxTimestamp, minTimeOfDay, maxTimeOfDay, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    minTimestamp: ").append(toIndentedString(minTimestamp)).append("\n");
    sb.append("    maxTimestamp: ").append(toIndentedString(maxTimestamp)).append("\n");
    sb.append("    minTimeOfDay: ").append(toIndentedString(minTimeOfDay)).append("\n");
    sb.append("    maxTimeOfDay: ").append(toIndentedString(maxTimeOfDay)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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

