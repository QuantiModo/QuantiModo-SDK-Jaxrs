package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class ConnectorInstruction   {
  
  private String url = null;
  private List<String> parameters = new ArrayList<String>();
  private Boolean usePopup = null;

  /**
   * url
   **/
  public ConnectorInstruction url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "url")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * parameters array
   **/
  public ConnectorInstruction parameters(List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(value = "parameters array")
  @JsonProperty("parameters")
  public List<String> getParameters() {
    return parameters;
  }
  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

  /**
   * usePopup
   **/
  public ConnectorInstruction usePopup(Boolean usePopup) {
    this.usePopup = usePopup;
    return this;
  }

  
  @ApiModelProperty(value = "usePopup")
  @JsonProperty("usePopup")
  public Boolean getUsePopup() {
    return usePopup;
  }
  public void setUsePopup(Boolean usePopup) {
    this.usePopup = usePopup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorInstruction connectorInstruction = (ConnectorInstruction) o;
    return Objects.equals(url, connectorInstruction.url) &&
        Objects.equals(parameters, connectorInstruction.parameters) &&
        Objects.equals(usePopup, connectorInstruction.usePopup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, parameters, usePopup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorInstruction {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    usePopup: ").append(toIndentedString(usePopup)).append("\n");
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

