package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeolocationAddressAllOf
 */

@JsonTypeName("GeolocationAddress_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
public class GeolocationAddressAllOf {

  @JsonProperty("Geolocation")
  private String geolocation;

  public GeolocationAddressAllOf geolocation(String geolocation) {
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
    GeolocationAddressAllOf geolocationAddressAllOf = (GeolocationAddressAllOf) o;
    return Objects.equals(this.geolocation, geolocationAddressAllOf.geolocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geolocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeolocationAddressAllOf {\n");
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

