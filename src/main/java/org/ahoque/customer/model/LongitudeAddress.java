package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * LongitudeAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class LongitudeAddress extends LocationAddress implements OneOfCustomerLocationLocation {
  @JsonProperty("LongitudeAddress")
  private String longitudeAddress = null;

  public LongitudeAddress longitudeAddress(String longitudeAddress) {
    this.longitudeAddress = longitudeAddress;
    return this;
  }

  /**
   * Get longitudeAddress
   * @return longitudeAddress
   **/
  @Schema(example = "some longitude address", description = "")
  
    public String getLongitudeAddress() {
    return longitudeAddress;
  }

  public void setLongitudeAddress(String longitudeAddress) {
    this.longitudeAddress = longitudeAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongitudeAddress longitudeAddress = (LongitudeAddress) o;
    return Objects.equals(this.longitudeAddress, longitudeAddress.longitudeAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longitudeAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongitudeAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    longitudeAddress: ").append(toIndentedString(longitudeAddress)).append("\n");
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
