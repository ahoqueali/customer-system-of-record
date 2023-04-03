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
 * LatitudeAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T15:51:45.519635+01:00[Europe/London]")
public class LatitudeAddress implements CustomerLocationLocation {

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

  private String latitudeAddress;

  public LatitudeAddress locationId(UUID locationId) {
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

  public LatitudeAddress locationType(LocationTypeEnum locationType) {
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

  public LatitudeAddress latitudeAddress(String latitudeAddress) {
    this.latitudeAddress = latitudeAddress;
    return this;
  }

  /**
   * Get latitudeAddress
   * @return latitudeAddress
  */
  
  @Schema(name = "LatitudeAddress", example = "some latitude address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LatitudeAddress")
  public String getLatitudeAddress() {
    return latitudeAddress;
  }

  public void setLatitudeAddress(String latitudeAddress) {
    this.latitudeAddress = latitudeAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatitudeAddress latitudeAddress = (LatitudeAddress) o;
    return Objects.equals(this.locationId, latitudeAddress.locationId) &&
        Objects.equals(this.locationType, latitudeAddress.locationType) &&
        Objects.equals(this.latitudeAddress, latitudeAddress.latitudeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, locationType, latitudeAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatitudeAddress {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    latitudeAddress: ").append(toIndentedString(latitudeAddress)).append("\n");
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
