package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class UserVariable   {
  
  private Integer parentId = null;
  private Integer userId = null;
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
  private Float minimumRecordedValue = null;
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
  private Date experimentStartTime = null;
  private Date experimentEndTime = null;
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
  public UserVariable parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "ID of the parent variable if this variable has any parent")
  @JsonProperty("parent_id")
  public Integer getParentId() {
    return parentId;
  }
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  /**
   * User ID
   **/
  public UserVariable userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "User ID")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * client_id
   **/
  public UserVariable clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  
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
  public UserVariable variableId(Integer variableId) {
    this.variableId = variableId;
    return this;
  }

  
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
  public UserVariable defaultUnitId(Integer defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
    return this;
  }

  
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
  public UserVariable minimumAllowedValue(Float minimumAllowedValue) {
    this.minimumAllowedValue = minimumAllowedValue;
    return this;
  }

  
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
  public UserVariable maximumAllowedValue(Float maximumAllowedValue) {
    this.maximumAllowedValue = maximumAllowedValue;
    return this;
  }

  
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
  public UserVariable fillingValue(Float fillingValue) {
    this.fillingValue = fillingValue;
    return this;
  }

  
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
  public UserVariable joinWith(Integer joinWith) {
    this.joinWith = joinWith;
    return this;
  }

  
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
  public UserVariable onsetDelay(Integer onsetDelay) {
    this.onsetDelay = onsetDelay;
    return this;
  }

  
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
  public UserVariable durationOfAction(Integer durationOfAction) {
    this.durationOfAction = durationOfAction;
    return this;
  }

  
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
  public UserVariable variableCategoryId(Integer variableCategoryId) {
    this.variableCategoryId = variableCategoryId;
    return this;
  }

  
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
  public UserVariable updated(Integer updated) {
    this.updated = updated;
    return this;
  }

  
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
  public UserVariable _public(Integer _public) {
    this._public = _public;
    return this;
  }

  
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
  public UserVariable causeOnly(Boolean causeOnly) {
    this.causeOnly = causeOnly;
    return this;
  }

  
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
  public UserVariable fillingType(String fillingType) {
    this.fillingType = fillingType;
    return this;
  }

  
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
  public UserVariable numberOfMeasurements(Integer numberOfMeasurements) {
    this.numberOfMeasurements = numberOfMeasurements;
    return this;
  }

  
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
  public UserVariable numberOfProcessedMeasurements(Integer numberOfProcessedMeasurements) {
    this.numberOfProcessedMeasurements = numberOfProcessedMeasurements;
    return this;
  }

  
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
  public UserVariable measurementsAtLastAnalysis(Integer measurementsAtLastAnalysis) {
    this.measurementsAtLastAnalysis = measurementsAtLastAnalysis;
    return this;
  }

  
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
  public UserVariable lastUnitId(Integer lastUnitId) {
    this.lastUnitId = lastUnitId;
    return this;
  }

  
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
  public UserVariable lastOriginalUnitId(Integer lastOriginalUnitId) {
    this.lastOriginalUnitId = lastOriginalUnitId;
    return this;
  }

  
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
  public UserVariable lastValue(Float lastValue) {
    this.lastValue = lastValue;
    return this;
  }

  
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
  public UserVariable lastOriginalValue(Integer lastOriginalValue) {
    this.lastOriginalValue = lastOriginalValue;
    return this;
  }

  
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
  public UserVariable lastSourceId(Integer lastSourceId) {
    this.lastSourceId = lastSourceId;
    return this;
  }

  
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
  public UserVariable numberOfCorrelations(Integer numberOfCorrelations) {
    this.numberOfCorrelations = numberOfCorrelations;
    return this;
  }

  
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
  public UserVariable status(String status) {
    this.status = status;
    return this;
  }

  
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
  public UserVariable errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  
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
  public UserVariable lastSuccessfulUpdateTime(Date lastSuccessfulUpdateTime) {
    this.lastSuccessfulUpdateTime = lastSuccessfulUpdateTime;
    return this;
  }

  
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
  public UserVariable standardDeviation(Float standardDeviation) {
    this.standardDeviation = standardDeviation;
    return this;
  }

  
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
  public UserVariable variance(Float variance) {
    this.variance = variance;
    return this;
  }

  
  @ApiModelProperty(value = "Variance")
  @JsonProperty("variance")
  public Float getVariance() {
    return variance;
  }
  public void setVariance(Float variance) {
    this.variance = variance;
  }

  /**
   * Minimum recorded value of this variable
   **/
  public UserVariable minimumRecordedValue(Float minimumRecordedValue) {
    this.minimumRecordedValue = minimumRecordedValue;
    return this;
  }

  
  @ApiModelProperty(value = "Minimum recorded value of this variable")
  @JsonProperty("minimum_recorded_value")
  public Float getMinimumRecordedValue() {
    return minimumRecordedValue;
  }
  public void setMinimumRecordedValue(Float minimumRecordedValue) {
    this.minimumRecordedValue = minimumRecordedValue;
  }

  /**
   * Maximum recorded daily value of this variable
   **/
  public UserVariable maximumRecordedDailyValue(Float maximumRecordedDailyValue) {
    this.maximumRecordedDailyValue = maximumRecordedDailyValue;
    return this;
  }

  
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
  public UserVariable mean(Float mean) {
    this.mean = mean;
    return this;
  }

  
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
  public UserVariable median(Float median) {
    this.median = median;
    return this;
  }

  
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
  public UserVariable mostCommonUnitId(Integer mostCommonUnitId) {
    this.mostCommonUnitId = mostCommonUnitId;
    return this;
  }

  
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
  public UserVariable mostCommonValue(Float mostCommonValue) {
    this.mostCommonValue = mostCommonValue;
    return this;
  }

  
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
  public UserVariable numberOfUniqueDailyValues(Float numberOfUniqueDailyValues) {
    this.numberOfUniqueDailyValues = numberOfUniqueDailyValues;
    return this;
  }

  
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
  public UserVariable numberOfChanges(Integer numberOfChanges) {
    this.numberOfChanges = numberOfChanges;
    return this;
  }

  
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
  public UserVariable skewness(Float skewness) {
    this.skewness = skewness;
    return this;
  }

  
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
  public UserVariable kurtosis(Float kurtosis) {
    this.kurtosis = kurtosis;
    return this;
  }

  
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
  public UserVariable latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  
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
  public UserVariable longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  
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
  public UserVariable location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "Location")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Earliest measurement start_time to be used in analysis. Use ISO 8601 datetime format
   **/
  public UserVariable experimentStartTime(Date experimentStartTime) {
    this.experimentStartTime = experimentStartTime;
    return this;
  }

  
  @ApiModelProperty(value = "Earliest measurement start_time to be used in analysis. Use ISO 8601 datetime format")
  @JsonProperty("experiment_start_time")
  public Date getExperimentStartTime() {
    return experimentStartTime;
  }
  public void setExperimentStartTime(Date experimentStartTime) {
    this.experimentStartTime = experimentStartTime;
  }

  /**
   * Latest measurement start_time to be used in analysis. Use ISO 8601 datetime format
   **/
  public UserVariable experimentEndTime(Date experimentEndTime) {
    this.experimentEndTime = experimentEndTime;
    return this;
  }

  
  @ApiModelProperty(value = "Latest measurement start_time to be used in analysis. Use ISO 8601 datetime format")
  @JsonProperty("experiment_end_time")
  public Date getExperimentEndTime() {
    return experimentEndTime;
  }
  public void setExperimentEndTime(Date experimentEndTime) {
    this.experimentEndTime = experimentEndTime;
  }

  /**
   * When the record was first created. Use ISO 8601 datetime format
   **/
  public UserVariable createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "When the record was first created. Use ISO 8601 datetime format")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * When the record in the database was last updated. Use ISO 8601 datetime format
   **/
  public UserVariable updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "When the record in the database was last updated. Use ISO 8601 datetime format")
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
  public UserVariable outcome(Boolean outcome) {
    this.outcome = outcome;
    return this;
  }

  
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
  public UserVariable sources(String sources) {
    this.sources = sources;
    return this;
  }

  
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
  public UserVariable earliestSourceTime(Integer earliestSourceTime) {
    this.earliestSourceTime = earliestSourceTime;
    return this;
  }

  
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
  public UserVariable latestSourceTime(Integer latestSourceTime) {
    this.latestSourceTime = latestSourceTime;
    return this;
  }

  
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
  public UserVariable earliestMeasurementTime(Integer earliestMeasurementTime) {
    this.earliestMeasurementTime = earliestMeasurementTime;
    return this;
  }

  
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
  public UserVariable latestMeasurementTime(Integer latestMeasurementTime) {
    this.latestMeasurementTime = latestMeasurementTime;
    return this;
  }

  
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
  public UserVariable earliestFillingTime(Integer earliestFillingTime) {
    this.earliestFillingTime = earliestFillingTime;
    return this;
  }

  
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
  public UserVariable latestFillingTime(Integer latestFillingTime) {
    this.latestFillingTime = latestFillingTime;
    return this;
  }

  
  @ApiModelProperty(value = "Latest filling time")
  @JsonProperty("latest_filling_time")
  public Integer getLatestFillingTime() {
    return latestFillingTime;
  }
  public void setLatestFillingTime(Integer latestFillingTime) {
    this.latestFillingTime = latestFillingTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserVariable userVariable = (UserVariable) o;
    return Objects.equals(parentId, userVariable.parentId) &&
        Objects.equals(userId, userVariable.userId) &&
        Objects.equals(clientId, userVariable.clientId) &&
        Objects.equals(variableId, userVariable.variableId) &&
        Objects.equals(defaultUnitId, userVariable.defaultUnitId) &&
        Objects.equals(minimumAllowedValue, userVariable.minimumAllowedValue) &&
        Objects.equals(maximumAllowedValue, userVariable.maximumAllowedValue) &&
        Objects.equals(fillingValue, userVariable.fillingValue) &&
        Objects.equals(joinWith, userVariable.joinWith) &&
        Objects.equals(onsetDelay, userVariable.onsetDelay) &&
        Objects.equals(durationOfAction, userVariable.durationOfAction) &&
        Objects.equals(variableCategoryId, userVariable.variableCategoryId) &&
        Objects.equals(updated, userVariable.updated) &&
        Objects.equals(_public, userVariable._public) &&
        Objects.equals(causeOnly, userVariable.causeOnly) &&
        Objects.equals(fillingType, userVariable.fillingType) &&
        Objects.equals(numberOfMeasurements, userVariable.numberOfMeasurements) &&
        Objects.equals(numberOfProcessedMeasurements, userVariable.numberOfProcessedMeasurements) &&
        Objects.equals(measurementsAtLastAnalysis, userVariable.measurementsAtLastAnalysis) &&
        Objects.equals(lastUnitId, userVariable.lastUnitId) &&
        Objects.equals(lastOriginalUnitId, userVariable.lastOriginalUnitId) &&
        Objects.equals(lastValue, userVariable.lastValue) &&
        Objects.equals(lastOriginalValue, userVariable.lastOriginalValue) &&
        Objects.equals(lastSourceId, userVariable.lastSourceId) &&
        Objects.equals(numberOfCorrelations, userVariable.numberOfCorrelations) &&
        Objects.equals(status, userVariable.status) &&
        Objects.equals(errorMessage, userVariable.errorMessage) &&
        Objects.equals(lastSuccessfulUpdateTime, userVariable.lastSuccessfulUpdateTime) &&
        Objects.equals(standardDeviation, userVariable.standardDeviation) &&
        Objects.equals(variance, userVariable.variance) &&
        Objects.equals(minimumRecordedValue, userVariable.minimumRecordedValue) &&
        Objects.equals(maximumRecordedDailyValue, userVariable.maximumRecordedDailyValue) &&
        Objects.equals(mean, userVariable.mean) &&
        Objects.equals(median, userVariable.median) &&
        Objects.equals(mostCommonUnitId, userVariable.mostCommonUnitId) &&
        Objects.equals(mostCommonValue, userVariable.mostCommonValue) &&
        Objects.equals(numberOfUniqueDailyValues, userVariable.numberOfUniqueDailyValues) &&
        Objects.equals(numberOfChanges, userVariable.numberOfChanges) &&
        Objects.equals(skewness, userVariable.skewness) &&
        Objects.equals(kurtosis, userVariable.kurtosis) &&
        Objects.equals(latitude, userVariable.latitude) &&
        Objects.equals(longitude, userVariable.longitude) &&
        Objects.equals(location, userVariable.location) &&
        Objects.equals(experimentStartTime, userVariable.experimentStartTime) &&
        Objects.equals(experimentEndTime, userVariable.experimentEndTime) &&
        Objects.equals(createdAt, userVariable.createdAt) &&
        Objects.equals(updatedAt, userVariable.updatedAt) &&
        Objects.equals(outcome, userVariable.outcome) &&
        Objects.equals(sources, userVariable.sources) &&
        Objects.equals(earliestSourceTime, userVariable.earliestSourceTime) &&
        Objects.equals(latestSourceTime, userVariable.latestSourceTime) &&
        Objects.equals(earliestMeasurementTime, userVariable.earliestMeasurementTime) &&
        Objects.equals(latestMeasurementTime, userVariable.latestMeasurementTime) &&
        Objects.equals(earliestFillingTime, userVariable.earliestFillingTime) &&
        Objects.equals(latestFillingTime, userVariable.latestFillingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, userId, clientId, variableId, defaultUnitId, minimumAllowedValue, maximumAllowedValue, fillingValue, joinWith, onsetDelay, durationOfAction, variableCategoryId, updated, _public, causeOnly, fillingType, numberOfMeasurements, numberOfProcessedMeasurements, measurementsAtLastAnalysis, lastUnitId, lastOriginalUnitId, lastValue, lastOriginalValue, lastSourceId, numberOfCorrelations, status, errorMessage, lastSuccessfulUpdateTime, standardDeviation, variance, minimumRecordedValue, maximumRecordedDailyValue, mean, median, mostCommonUnitId, mostCommonValue, numberOfUniqueDailyValues, numberOfChanges, skewness, kurtosis, latitude, longitude, location, experimentStartTime, experimentEndTime, createdAt, updatedAt, outcome, sources, earliestSourceTime, latestSourceTime, earliestMeasurementTime, latestMeasurementTime, earliestFillingTime, latestFillingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVariable {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    defaultUnitId: ").append(toIndentedString(defaultUnitId)).append("\n");
    sb.append("    minimumAllowedValue: ").append(toIndentedString(minimumAllowedValue)).append("\n");
    sb.append("    maximumAllowedValue: ").append(toIndentedString(maximumAllowedValue)).append("\n");
    sb.append("    fillingValue: ").append(toIndentedString(fillingValue)).append("\n");
    sb.append("    joinWith: ").append(toIndentedString(joinWith)).append("\n");
    sb.append("    onsetDelay: ").append(toIndentedString(onsetDelay)).append("\n");
    sb.append("    durationOfAction: ").append(toIndentedString(durationOfAction)).append("\n");
    sb.append("    variableCategoryId: ").append(toIndentedString(variableCategoryId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    causeOnly: ").append(toIndentedString(causeOnly)).append("\n");
    sb.append("    fillingType: ").append(toIndentedString(fillingType)).append("\n");
    sb.append("    numberOfMeasurements: ").append(toIndentedString(numberOfMeasurements)).append("\n");
    sb.append("    numberOfProcessedMeasurements: ").append(toIndentedString(numberOfProcessedMeasurements)).append("\n");
    sb.append("    measurementsAtLastAnalysis: ").append(toIndentedString(measurementsAtLastAnalysis)).append("\n");
    sb.append("    lastUnitId: ").append(toIndentedString(lastUnitId)).append("\n");
    sb.append("    lastOriginalUnitId: ").append(toIndentedString(lastOriginalUnitId)).append("\n");
    sb.append("    lastValue: ").append(toIndentedString(lastValue)).append("\n");
    sb.append("    lastOriginalValue: ").append(toIndentedString(lastOriginalValue)).append("\n");
    sb.append("    lastSourceId: ").append(toIndentedString(lastSourceId)).append("\n");
    sb.append("    numberOfCorrelations: ").append(toIndentedString(numberOfCorrelations)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    lastSuccessfulUpdateTime: ").append(toIndentedString(lastSuccessfulUpdateTime)).append("\n");
    sb.append("    standardDeviation: ").append(toIndentedString(standardDeviation)).append("\n");
    sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
    sb.append("    minimumRecordedValue: ").append(toIndentedString(minimumRecordedValue)).append("\n");
    sb.append("    maximumRecordedDailyValue: ").append(toIndentedString(maximumRecordedDailyValue)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    mostCommonUnitId: ").append(toIndentedString(mostCommonUnitId)).append("\n");
    sb.append("    mostCommonValue: ").append(toIndentedString(mostCommonValue)).append("\n");
    sb.append("    numberOfUniqueDailyValues: ").append(toIndentedString(numberOfUniqueDailyValues)).append("\n");
    sb.append("    numberOfChanges: ").append(toIndentedString(numberOfChanges)).append("\n");
    sb.append("    skewness: ").append(toIndentedString(skewness)).append("\n");
    sb.append("    kurtosis: ").append(toIndentedString(kurtosis)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    experimentStartTime: ").append(toIndentedString(experimentStartTime)).append("\n");
    sb.append("    experimentEndTime: ").append(toIndentedString(experimentEndTime)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    earliestSourceTime: ").append(toIndentedString(earliestSourceTime)).append("\n");
    sb.append("    latestSourceTime: ").append(toIndentedString(latestSourceTime)).append("\n");
    sb.append("    earliestMeasurementTime: ").append(toIndentedString(earliestMeasurementTime)).append("\n");
    sb.append("    latestMeasurementTime: ").append(toIndentedString(latestMeasurementTime)).append("\n");
    sb.append("    earliestFillingTime: ").append(toIndentedString(earliestFillingTime)).append("\n");
    sb.append("    latestFillingTime: ").append(toIndentedString(latestFillingTime)).append("\n");
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

