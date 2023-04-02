package org.ahoque.customer.model;

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
 * GeolocationAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
public class GeolocationAddress implements CustomerLocationLocation {

  @JsonProperty("LocationId")
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

  @JsonProperty("LocationType")
  private LocationTypeEnum locationType;

  @JsonProperty("Geolocation")
  private String geolocation;

  public GeolocationAddress locationId(UUID locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  */
  @Valid @Size(min = 36, max = 36) 
  @Schema(name = "LocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UUID getLocationId() {
    return locationId;
  }

  public void setLocationId(UUID locationId) {
    this.locationId = locationId;
  }

  public GeolocationAddress locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * Get locationType
   * @return locationType
  */
  
  @Schema(name = "LocationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }

  public GeolocationAddress geolocation(String geolocation) {
    this.geolocation = geolocation;
    return this;
  }

  /**
   * Get geolocation
   * @return geolocation
  */
  
  @Schema(name = "Geolocation", example = "some geolocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGeolocation() {
    return geolocation;
  }

  public void setGeolocation(String geolocation) {
    this.geolocation = geolocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeolocationAddress geolocationAddress = (GeolocationAddress) o;
    return Objects.equals(this.locationId, geolocationAddress.locationId) &&
        Objects.equals(this.locationType, geolocationAddress.locationType) &&
        Objects.equals(this.geolocation, geolocationAddress.geolocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, locationType, geolocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeolocationAddress {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
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

