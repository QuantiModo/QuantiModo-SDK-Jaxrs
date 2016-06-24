package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class ValueObject   {
  
  private Long timestamp = null;
  private Double value = null;
  private String note = null;

  /**
   * Timestamp for the measurement event in epoch time (unixtime)
   **/
  public ValueObject timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Timestamp for the measurement event in epoch time (unixtime)")
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Measurement value
   **/
  public ValueObject value(Double value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Measurement value")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Optional note to include with the measurement
   **/
  public ValueObject note(String note) {
    this.note = note;
    return this;
  }

  
  @ApiModelProperty(value = "Optional note to include with the measurement")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueObject valueObject = (ValueObject) o;
    return Objects.equals(timestamp, valueObject.timestamp) &&
        Objects.equals(value, valueObject.value) &&
        Objects.equals(note, valueObject.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, value, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueObject {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

