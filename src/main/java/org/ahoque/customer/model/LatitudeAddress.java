package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * LatitudeAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class LatitudeAddress extends LocationAddress implements OneOfCustomerLocationLocation {
  @JsonProperty("LatitudeAddress")
  private String latitudeAddress = null;

  public LatitudeAddress latitudeAddress(String latitudeAddress) {
    this.latitudeAddress = latitudeAddress;
    return this;
  }

  /**
   * Get latitudeAddress
   * @return latitudeAddress
   **/
  @Schema(example = "some latitude address", description = "")
  
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
    return Objects.equals(this.latitudeAddress, latitudeAddress.latitudeAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitudeAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatitudeAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
