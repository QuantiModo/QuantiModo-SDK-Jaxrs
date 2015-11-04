package io.swagger.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class UserVariable  {
  
  private Integer parentId = null;
  private String clientId = null;
  private Integer variableId = null;
  private Integer defaultUnitId = null;
  private Float minimumAllowedValue = null;
  private Float maximumAllowedValue = null;
  private Float fillingValue = null;
  private Integer joinWith = null;
  private Integer onsetDelay = null;
  private Integer durationOfAction = null;
  private Integer variableCategoryId = null;
  private Integer updated = null;
  private Integer _public = null;
  private Boolean causeOnly = null;
  private String fillingType = null;
  private Integer numberOfMeasurements = null;
  private Integer numberOfProcessedMeasurements = null;
  private Integer measurementsAtLastAnalysis = null;
  private Integer lastUnitId = null;
  private Integer lastOriginalUnitId = null;
  private Float lastValue = null;
  private Integer lastOriginalValue = null;
  private Integer lastSourceId = null;
  private Integer numberOfCorrelations = null;
  private String status = null;
  private String errorMessage = null;
  private Date lastSuccessfulUpdateTime = null;
  private Float standardDeviation = null;
  private Float variance = null;
  private Float minimumRecordedDailyValue = null;
  private Float maximumRecordedDailyValue = null;
  private Float mean = null;
  private Float median = null;
  private Integer mostCommonUnitId = null;
  private Float mostCommonValue = null;
  private Float numberOfUniqueDailyValues = null;
  private Integer numberOfChanges = null;
  private Float skewness = null;
  private Float kurtosis = null;
  private Float latitude = null;
  private Float longitude = null;
  private String location = null;
  private Date createdAt = null;
  private Date updatedAt = null;
  private Boolean outcome = null;
  private String sources = null;
  private Integer earliestSourceTime = null;
  private Integer latestSourceTime = null;
  private Integer earliestMeasurementTime = null;
  private Integer latestMeasurementTime = null;
  private Integer earliestFillingTime = null;
  private Integer latestFillingTime = null;

  
  /**
   * ID of the parent variable if this variable has any parent
   **/
  @ApiModelProperty(value = "ID of the parent variable if this variable has any parent")
  @JsonProperty("parent_id")
  public Integer getParentId() {
    return parentId;
  }
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  
  /**
   * client_id
   **/
  @ApiModelProperty(value = "client_id")
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   * ID of variable
   **/
  @ApiModelProperty(required = true, value = "ID of variable")
  @JsonProperty("variable_id")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }

  
  /**
   * ID of unit to use for this variable
   **/
  @ApiModelProperty(value = "ID of unit to use for this variable")
  @JsonProperty("default_unit_id")
  public Integer getDefaultUnitId() {
    return defaultUnitId;
  }
  public void setDefaultUnitId(Integer defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  
  /**
   * Minimum reasonable value for this variable (uses default unit)
   **/
  @ApiModelProperty(value = "Minimum reasonable value for this variable (uses default unit)")
  @JsonProperty("minimum_allowed_value")
  public Float getMinimumAllowedValue() {
    return minimumAllowedValue;
  }
  public void setMinimumAllowedValue(Float minimumAllowedValue) {
    this.minimumAllowedValue = minimumAllowedValue;
  }

  
  /**
   * Maximum reasonable value for this variable (uses default unit)
   **/
  @ApiModelProperty(value = "Maximum reasonable value for this variable (uses default unit)")
  @JsonProperty("maximum_allowed_value")
  public Float getMaximumAllowedValue() {
    return maximumAllowedValue;
  }
  public void setMaximumAllowedValue(Float maximumAllowedValue) {
    this.maximumAllowedValue = maximumAllowedValue;
  }

  
  /**
   * Value for replacing null measurements
   **/
  @ApiModelProperty(value = "Value for replacing null measurements")
  @JsonProperty("filling_value")
  public Float getFillingValue() {
    return fillingValue;
  }
  public void setFillingValue(Float fillingValue) {
    this.fillingValue = fillingValue;
  }

  
  /**
   * The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables
   **/
  @ApiModelProperty(value = "The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables")
  @JsonProperty("join_with")
  public Integer getJoinWith() {
    return joinWith;
  }
  public void setJoinWith(Integer joinWith) {
    this.joinWith = joinWith;
  }

  
  /**
   * How long it takes for a measurement in this variable to take effect
   **/
  @ApiModelProperty(value = "How long it takes for a measurement in this variable to take effect")
  @JsonProperty("onset_delay")
  public Integer getOnsetDelay() {
    return onsetDelay;
  }
  public void setOnsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
  }

  
  /**
   * Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect
   **/
  @ApiModelProperty(value = "Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect")
  @JsonProperty("duration_of_action")
  public Integer getDurationOfAction() {
    return durationOfAction;
  }
  public void setDurationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
  }

  
  /**
   * ID of variable category
   **/
  @ApiModelProperty(value = "ID of variable category")
  @JsonProperty("variable_category_id")
  public Integer getVariableCategoryId() {
    return variableCategoryId;
  }
  public void setVariableCategoryId(Integer variableCategoryId) {
    this.variableCategoryId = variableCategoryId;
  }

  
  /**
   * updated
   **/
  @ApiModelProperty(value = "updated")
  @JsonProperty("updated")
  public Integer getUpdated() {
    return updated;
  }
  public void setUpdated(Integer updated) {
    this.updated = updated;
  }

  
  /**
   * Is variable public
   **/
  @ApiModelProperty(value = "Is variable public")
  @JsonProperty("public")
  public Integer getPublic() {
    return _public;
  }
  public void setPublic(Integer _public) {
    this._public = _public;
  }

  
  /**
   * A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user
   **/
  @ApiModelProperty(value = "A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user")
  @JsonProperty("cause_only")
  public Boolean getCauseOnly() {
    return causeOnly;
  }
  public void setCauseOnly(Boolean causeOnly) {
    this.causeOnly = causeOnly;
  }

  
  /**
   * 0 -> No filling, 1 -> Use filling-value
   **/
  @ApiModelProperty(value = "0 -> No filling, 1 -> Use filling-value")
  @JsonProperty("filling_type")
  public String getFillingType() {
    return fillingType;
  }
  public void setFillingType(String fillingType) {
    this.fillingType = fillingType;
  }

  
  /**
   * Number of measurements
   **/
  @ApiModelProperty(value = "Number of measurements")
  @JsonProperty("number_of_measurements")
  public Integer getNumberOfMeasurements() {
    return numberOfMeasurements;
  }
  public void setNumberOfMeasurements(Integer numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
  }

  
  /**
   * Number of processed measurements
   **/
  @ApiModelProperty(value = "Number of processed measurements")
  @JsonProperty("number_of_processed_measurements")
  public Integer getNumberOfProcessedMeasurements() {
    return numberOfProcessedMeasurements;
  }
  public void setNumberOfProcessedMeasurements(Integer numberOfProcessedMeasurements) {
    this.numberOfProcessedMeasurements = numberOfProcessedMeasurements;
  }

  
  /**
   * Number of measurements at last analysis
   **/
  @ApiModelProperty(value = "Number of measurements at last analysis")
  @JsonProperty("measurements_at_last_analysis")
  public Integer getMeasurementsAtLastAnalysis() {
    return measurementsAtLastAnalysis;
  }
  public void setMeasurementsAtLastAnalysis(Integer measurementsAtLastAnalysis) {
    this.measurementsAtLastAnalysis = measurementsAtLastAnalysis;
  }

  
  /**
   * ID of last Unit
   **/
  @ApiModelProperty(value = "ID of last Unit")
  @JsonProperty("last_unit_id")
  public Integer getLastUnitId() {
    return lastUnitId;
  }
  public void setLastUnitId(Integer lastUnitId) {
    this.lastUnitId = lastUnitId;
  }

  
  /**
   * ID of last original Unit
   **/
  @ApiModelProperty(value = "ID of last original Unit")
  @JsonProperty("last_original_unit_id")
  public Integer getLastOriginalUnitId() {
    return lastOriginalUnitId;
  }
  public void setLastOriginalUnitId(Integer lastOriginalUnitId) {
    this.lastOriginalUnitId = lastOriginalUnitId;
  }

  
  /**
   * Last Value
   **/
  @ApiModelProperty(value = "Last Value")
  @JsonProperty("last_value")
  public Float getLastValue() {
    return lastValue;
  }
  public void setLastValue(Float lastValue) {
    this.lastValue = lastValue;
  }

  
  /**
   * Last original value which is stored
   **/
  @ApiModelProperty(value = "Last original value which is stored")
  @JsonProperty("last_original_value")
  public Integer getLastOriginalValue() {
    return lastOriginalValue;
  }
  public void setLastOriginalValue(Integer lastOriginalValue) {
    this.lastOriginalValue = lastOriginalValue;
  }

  
  /**
   * ID of last source
   **/
  @ApiModelProperty(value = "ID of last source")
  @JsonProperty("last_source_id")
  public Integer getLastSourceId() {
    return lastSourceId;
  }
  public void setLastSourceId(Integer lastSourceId) {
    this.lastSourceId = lastSourceId;
  }

  
  /**
   * Number of correlations for this variable
   **/
  @ApiModelProperty(value = "Number of correlations for this variable")
  @JsonProperty("number_of_correlations")
  public Integer getNumberOfCorrelations() {
    return numberOfCorrelations;
  }
  public void setNumberOfCorrelations(Integer numberOfCorrelations) {
    this.numberOfCorrelations = numberOfCorrelations;
  }

  
  /**
   * status
   **/
  @ApiModelProperty(value = "status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * error_message
   **/
  @ApiModelProperty(value = "error_message")
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   * When this variable or its settings were last updated
   **/
  @ApiModelProperty(value = "When this variable or its settings were last updated")
  @JsonProperty("last_successful_update_time")
  public Date getLastSuccessfulUpdateTime() {
    return lastSuccessfulUpdateTime;
  }
  public void setLastSuccessfulUpdateTime(Date lastSuccessfulUpdateTime) {
    this.lastSuccessfulUpdateTime = lastSuccessfulUpdateTime;
  }

  
  /**
   * Standard deviation
   **/
  @ApiModelProperty(value = "Standard deviation")
  @JsonProperty("standard_deviation")
  public Float getStandardDeviation() {
    return standardDeviation;
  }
  public void setStandardDeviation(Float standardDeviation) {
    this.standardDeviation = standardDeviation;
  }

  
  /**
   * Variance
   **/
  @ApiModelProperty(value = "Variance")
  @JsonProperty("variance")
  public Float getVariance() {
    return variance;
  }
  public void setVariance(Float variance) {
    this.variance = variance;
  }

  
  /**
   * Minimum recorded daily value of this variable
   **/
  @ApiModelProperty(value = "Minimum recorded daily value of this variable")
  @JsonProperty("minimum_recorded_daily_value")
  public Float getMinimumRecordedDailyValue() {
    return minimumRecordedDailyValue;
  }
  public void setMinimumRecordedDailyValue(Float minimumRecordedDailyValue) {
    this.minimumRecordedDailyValue = minimumRecordedDailyValue;
  }

  
  /**
   * Maximum recorded daily value of this variable
   **/
  @ApiModelProperty(value = "Maximum recorded daily value of this variable")
  @JsonProperty("maximum_recorded_daily_value")
  public Float getMaximumRecordedDailyValue() {
    return maximumRecordedDailyValue;
  }
  public void setMaximumRecordedDailyValue(Float maximumRecordedDailyValue) {
    this.maximumRecordedDailyValue = maximumRecordedDailyValue;
  }

  
  /**
   * Mean
   **/
  @ApiModelProperty(value = "Mean")
  @JsonProperty("mean")
  public Float getMean() {
    return mean;
  }
  public void setMean(Float mean) {
    this.mean = mean;
  }

  
  /**
   * Median
   **/
  @ApiModelProperty(value = "Median")
  @JsonProperty("median")
  public Float getMedian() {
    return median;
  }
  public void setMedian(Float median) {
    this.median = median;
  }

  
  /**
   * Most common Unit ID
   **/
  @ApiModelProperty(value = "Most common Unit ID")
  @JsonProperty("most_common_unit_id")
  public Integer getMostCommonUnitId() {
    return mostCommonUnitId;
  }
  public void setMostCommonUnitId(Integer mostCommonUnitId) {
    this.mostCommonUnitId = mostCommonUnitId;
  }

  
  /**
   * Most common value
   **/
  @ApiModelProperty(value = "Most common value")
  @JsonProperty("most_common_value")
  public Float getMostCommonValue() {
    return mostCommonValue;
  }
  public void setMostCommonValue(Float mostCommonValue) {
    this.mostCommonValue = mostCommonValue;
  }

  
  /**
   * Number of unique daily values
   **/
  @ApiModelProperty(value = "Number of unique daily values")
  @JsonProperty("number_of_unique_daily_values")
  public Float getNumberOfUniqueDailyValues() {
    return numberOfUniqueDailyValues;
  }
  public void setNumberOfUniqueDailyValues(Float numberOfUniqueDailyValues) {
    this.numberOfUniqueDailyValues = numberOfUniqueDailyValues;
  }

  
  /**
   * Number of changes
   **/
  @ApiModelProperty(value = "Number of changes")
  @JsonProperty("number_of_changes")
  public Integer getNumberOfChanges() {
    return numberOfChanges;
  }
  public void setNumberOfChanges(Integer numberOfChanges) {
    this.numberOfChanges = numberOfChanges;
  }

  
  /**
   * Skewness
   **/
  @ApiModelProperty(value = "Skewness")
  @JsonProperty("skewness")
  public Float getSkewness() {
    return skewness;
  }
  public void setSkewness(Float skewness) {
    this.skewness = skewness;
  }

  
  /**
   * Kurtosis
   **/
  @ApiModelProperty(value = "Kurtosis")
  @JsonProperty("kurtosis")
  public Float getKurtosis() {
    return kurtosis;
  }
  public void setKurtosis(Float kurtosis) {
    this.kurtosis = kurtosis;
  }

  
  /**
   * Latitude
   **/
  @ApiModelProperty(value = "Latitude")
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitude
   **/
  @ApiModelProperty(value = "Longitude")
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Location
   **/
  @ApiModelProperty(value = "Location")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   * created_at
   **/
  @ApiModelProperty(value = "created_at")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * updated_at
   **/
  @ApiModelProperty(value = "updated_at")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  /**
   * Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables
   **/
  @ApiModelProperty(value = "Outcome variables (those with `outcome` == 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables")
  @JsonProperty("outcome")
  public Boolean getOutcome() {
    return outcome;
  }
  public void setOutcome(Boolean outcome) {
    this.outcome = outcome;
  }

  
  /**
   * Comma-separated list of source names to limit variables to those sources
   **/
  @ApiModelProperty(value = "Comma-separated list of source names to limit variables to those sources")
  @JsonProperty("sources")
  public String getSources() {
    return sources;
  }
  public void setSources(String sources) {
    this.sources = sources;
  }

  
  /**
   * Earliest source time
   **/
  @ApiModelProperty(value = "Earliest source time")
  @JsonProperty("earliest_source_time")
  public Integer getEarliestSourceTime() {
    return earliestSourceTime;
  }
  public void setEarliestSourceTime(Integer earliestSourceTime) {
    this.earliestSourceTime = earliestSourceTime;
  }

  
  /**
   * Latest source time
   **/
  @ApiModelProperty(value = "Latest source time")
  @JsonProperty("latest_source_time")
  public Integer getLatestSourceTime() {
    return latestSourceTime;
  }
  public void setLatestSourceTime(Integer latestSourceTime) {
    this.latestSourceTime = latestSourceTime;
  }

  
  /**
   * Earliest measurement time
   **/
  @ApiModelProperty(value = "Earliest measurement time")
  @JsonProperty("earliest_measurement_time")
  public Integer getEarliestMeasurementTime() {
    return earliestMeasurementTime;
  }
  public void setEarliestMeasurementTime(Integer earliestMeasurementTime) {
    this.earliestMeasurementTime = earliestMeasurementTime;
  }

  
  /**
   * Latest measurement time
   **/
  @ApiModelProperty(value = "Latest measurement time")
  @JsonProperty("latest_measurement_time")
  public Integer getLatestMeasurementTime() {
    return latestMeasurementTime;
  }
  public void setLatestMeasurementTime(Integer latestMeasurementTime) {
    this.latestMeasurementTime = latestMeasurementTime;
  }

  
  /**
   * Earliest filling time
   **/
  @ApiModelProperty(value = "Earliest filling time")
  @JsonProperty("earliest_filling_time")
  public Integer getEarliestFillingTime() {
    return earliestFillingTime;
  }
  public void setEarliestFillingTime(Integer earliestFillingTime) {
    this.earliestFillingTime = earliestFillingTime;
  }

  
  /**
   * Latest filling time
   **/
  @ApiModelProperty(value = "Latest filling time")
  @JsonProperty("latest_filling_time")
  public Integer getLatestFillingTime() {
    return latestFillingTime;
  }
  public void setLatestFillingTime(Integer latestFillingTime) {
    this.latestFillingTime = latestFillingTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVariable {\n");
    
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  variableId: ").append(variableId).append("\n");
    sb.append("  defaultUnitId: ").append(defaultUnitId).append("\n");
    sb.append("  minimumAllowedValue: ").append(minimumAllowedValue).append("\n");
    sb.append("  maximumAllowedValue: ").append(maximumAllowedValue).append("\n");
    sb.append("  fillingValue: ").append(fillingValue).append("\n");
    sb.append("  joinWith: ").append(joinWith).append("\n");
    sb.append("  onsetDelay: ").append(onsetDelay).append("\n");
    sb.append("  durationOfAction: ").append(durationOfAction).append("\n");
    sb.append("  variableCategoryId: ").append(variableCategoryId).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  _public: ").append(_public).append("\n");
    sb.append("  causeOnly: ").append(causeOnly).append("\n");
    sb.append("  fillingType: ").append(fillingType).append("\n");
    sb.append("  numberOfMeasurements: ").append(numberOfMeasurements).append("\n");
    sb.append("  numberOfProcessedMeasurements: ").append(numberOfProcessedMeasurements).append("\n");
    sb.append("  measurementsAtLastAnalysis: ").append(measurementsAtLastAnalysis).append("\n");
    sb.append("  lastUnitId: ").append(lastUnitId).append("\n");
    sb.append("  lastOriginalUnitId: ").append(lastOriginalUnitId).append("\n");
    sb.append("  lastValue: ").append(lastValue).append("\n");
    sb.append("  lastOriginalValue: ").append(lastOriginalValue).append("\n");
    sb.append("  lastSourceId: ").append(lastSourceId).append("\n");
    sb.append("  numberOfCorrelations: ").append(numberOfCorrelations).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  errorMessage: ").append(errorMessage).append("\n");
    sb.append("  lastSuccessfulUpdateTime: ").append(lastSuccessfulUpdateTime).append("\n");
    sb.append("  standardDeviation: ").append(standardDeviation).append("\n");
    sb.append("  variance: ").append(variance).append("\n");
    sb.append("  minimumRecordedDailyValue: ").append(minimumRecordedDailyValue).append("\n");
    sb.append("  maximumRecordedDailyValue: ").append(maximumRecordedDailyValue).append("\n");
    sb.append("  mean: ").append(mean).append("\n");
    sb.append("  median: ").append(median).append("\n");
    sb.append("  mostCommonUnitId: ").append(mostCommonUnitId).append("\n");
    sb.append("  mostCommonValue: ").append(mostCommonValue).append("\n");
    sb.append("  numberOfUniqueDailyValues: ").append(numberOfUniqueDailyValues).append("\n");
    sb.append("  numberOfChanges: ").append(numberOfChanges).append("\n");
    sb.append("  skewness: ").append(skewness).append("\n");
    sb.append("  kurtosis: ").append(kurtosis).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  outcome: ").append(outcome).append("\n");
    sb.append("  sources: ").append(sources).append("\n");
    sb.append("  earliestSourceTime: ").append(earliestSourceTime).append("\n");
    sb.append("  latestSourceTime: ").append(latestSourceTime).append("\n");
    sb.append("  earliestMeasurementTime: ").append(earliestMeasurementTime).append("\n");
    sb.append("  latestMeasurementTime: ").append(latestMeasurementTime).append("\n");
    sb.append("  earliestFillingTime: ").append(earliestFillingTime).append("\n");
    sb.append("  latestFillingTime: ").append(latestFillingTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
