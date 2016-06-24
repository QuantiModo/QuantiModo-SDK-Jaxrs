package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class MeasurementDelete   {
  
  private Integer variableId = null;
  private Integer startTime = null;

  /**
   * Variable id of the measurement to be deleted
   **/
  public MeasurementDelete variableId(Integer variableId) {
    this.variableId = variableId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Variable id of the measurement to be deleted")
  @JsonProperty("variableId")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }

  /**
   * Start time of the measurement to be deleted
   **/
  public MeasurementDelete startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Start time of the measurement to be deleted")
  @JsonProperty("startTime")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementDelete measurementDelete = (MeasurementDelete) o;
    return Objects.equals(variableId, measurementDelete.variableId) &&
        Objects.equals(startTime, measurementDelete.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableId, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementDelete {\n");
    
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

