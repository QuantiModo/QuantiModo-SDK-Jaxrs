package io.swagger.model;

import io.swagger.model.MeasurementValue;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public class MeasurementPost  {
  
  private Integer variableId = null;
  private Integer sourceId = null;
  private Integer unitId = null;
  private List<MeasurementValue> measurements = new ArrayList<MeasurementValue>();

  
  /**
   * variable_id
   **/
  @ApiModelProperty(required = true, value = "variable_id")
  @JsonProperty("variable_id")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }

  
  /**
   * source_id
   **/
  @ApiModelProperty(required = true, value = "source_id")
  @JsonProperty("source_id")
  public Integer getSourceId() {
    return sourceId;
  }
  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   * unit_id
   **/
  @ApiModelProperty(required = true, value = "unit_id")
  @JsonProperty("unit_id")
  public Integer getUnitId() {
    return unitId;
  }
  public void setUnitId(Integer unitId) {
    this.unitId = unitId;
  }

  
  /**
   * measurements
   **/
  @ApiModelProperty(required = true, value = "measurements")
  @JsonProperty("measurements")
  public List<MeasurementValue> getMeasurements() {
    return measurements;
  }
  public void setMeasurements(List<MeasurementValue> measurements) {
    this.measurements = measurements;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementPost {\n");
    
    sb.append("  variableId: ").append(variableId).append("\n");
    sb.append("  sourceId: ").append(sourceId).append("\n");
    sb.append("  unitId: ").append(unitId).append("\n");
    sb.append("  measurements: ").append(measurements).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
