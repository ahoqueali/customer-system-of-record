package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * PhoneAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class PhoneAddress extends ContactPoint implements AnyOfReadContactPointsDataContactPointItems {
  @JsonProperty("PhoneAddress")
  private String phoneAddress = null;

  public PhoneAddress phoneAddress(String phoneAddress) {
    this.phoneAddress = phoneAddress;
    return this;
  }

  /**
   * Get phoneAddress
   * @return phoneAddress
   **/
  @Schema(example = "694234332434", description = "")
  
    public String getPhoneAddress() {
    return phoneAddress;
  }

  public void setPhoneAddress(String phoneAddress) {
    this.phoneAddress = phoneAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneAddress phoneAddress = (PhoneAddress) o;
    return Objects.equals(this.phoneAddress, phoneAddress.phoneAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    phoneAddress: ").append(toIndentedString(phoneAddress)).append("\n");
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
