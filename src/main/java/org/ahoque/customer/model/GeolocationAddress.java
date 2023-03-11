package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * GeolocationAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class GeolocationAddress extends LocationAddress implements OneOfCustomerLocationLocation {
  @JsonProperty("Geolocation")
  private String geolocation = null;

  public GeolocationAddress geolocation(String geolocation) {
    this.geolocation = geolocation;
    return this;
  }

  /**
   * Get geolocation
   * @return geolocation
   **/
  @Schema(example = "some geolocation", description = "")
  
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
    return Objects.equals(this.geolocation, geolocationAddress.geolocation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geolocation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeolocationAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
