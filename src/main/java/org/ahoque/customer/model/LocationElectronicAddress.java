package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * LocationElectronicAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class LocationElectronicAddress extends LocationAddress implements OneOfCustomerLocationLocation {
  @JsonProperty("ElectronicAddress")
  private String electronicAddress = null;

  public LocationElectronicAddress electronicAddress(String electronicAddress) {
    this.electronicAddress = electronicAddress;
    return this;
  }

  /**
   * Get electronicAddress
   * @return electronicAddress
   **/
  @Schema(example = "ross.poldark@gmail.com", description = "")
  
    public String getElectronicAddress() {
    return electronicAddress;
  }

  public void setElectronicAddress(String electronicAddress) {
    this.electronicAddress = electronicAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationElectronicAddress locationElectronicAddress = (LocationElectronicAddress) o;
    return Objects.equals(this.electronicAddress, locationElectronicAddress.electronicAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electronicAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationElectronicAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    electronicAddress: ").append(toIndentedString(electronicAddress)).append("\n");
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
