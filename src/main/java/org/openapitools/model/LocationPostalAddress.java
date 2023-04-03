package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LocationPostalAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T15:51:45.519635+01:00[Europe/London]")
public class LocationPostalAddress implements CustomerLocationLocation {

  private UUID locationId;

  /**
   * Gets or Sets locationType
   */
  public enum LocationTypeEnum {
    LOCATION_ELECTRONIC_ADDRESS("LOCATION_ELECTRONIC_ADDRESS"),
    
    LOCATION_POSTAL_ADDRESS("LOCATION_POSTAL_ADDRESS"),
    
    GEOLOCATION_ADDRESS("GEOLOCATION_ADDRESS"),
    
    LATITUDE_ADDRESS("LATITUDE_ADDRESS"),
    
    LONGITUDE_ADDRESS("LONGITUDE_ADDRESS");

    private String value;

    LocationTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LocationTypeEnum fromValue(String value) {
      for (LocationTypeEnum b : LocationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LocationTypeEnum locationType;

  private String line1;

  private String line2;

  private String line3;

  private String line4;

  public LocationPostalAddress locationId(UUID locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  */
  @Valid @Size(min = 36, max = 36) 
  @Schema(name = "LocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocationId")
  public UUID getLocationId() {
    return locationId;
  }

  public void setLocationId(UUID locationId) {
    this.locationId = locationId;
  }

  public LocationPostalAddress locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * Get locationType
   * @return locationType
  */
  
  @Schema(name = "LocationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocationType")
  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }

  public LocationPostalAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Get line1
   * @return line1
  */
  
  @Schema(name = "Line1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Line1")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public LocationPostalAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Get line2
   * @return line2
  */
  
  @Schema(name = "Line2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Line2")
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public LocationPostalAddress line3(String line3) {
    this.line3 = line3;
    return this;
  }

  /**
   * Get line3
   * @return line3
  */
  
  @Schema(name = "Line3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Line3")
  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public LocationPostalAddress line4(String line4) {
    this.line4 = line4;
    return this;
  }

  /**
   * Get line4
   * @return line4
  */
  
  @Schema(name = "Line4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Line4")
  public String getLine4() {
    return line4;
  }

  public void setLine4(String line4) {
    this.line4 = line4;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationPostalAddress locationPostalAddress = (LocationPostalAddress) o;
    return Objects.equals(this.locationId, locationPostalAddress.locationId) &&
        Objects.equals(this.locationType, locationPostalAddress.locationType) &&
        Objects.equals(this.line1, locationPostalAddress.line1) &&
        Objects.equals(this.line2, locationPostalAddress.line2) &&
        Objects.equals(this.line3, locationPostalAddress.line3) &&
        Objects.equals(this.line4, locationPostalAddress.line4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, locationType, line1, line2, line3, line4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationPostalAddress {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    line4: ").append(toIndentedString(line4)).append("\n");
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

