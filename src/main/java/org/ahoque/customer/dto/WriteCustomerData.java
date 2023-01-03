package org.ahoque.customer.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * WriteCustomerData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-27T20:27:40.252Z[GMT]")


public class WriteCustomerData   {
  @JsonProperty("Customer")
  private AllOfWriteCustomerDataCustomer customer = null;

  public WriteCustomerData customer(AllOfWriteCustomerDataCustomer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
   **/
  @Schema(description = "")
  
    public AllOfWriteCustomerDataCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(AllOfWriteCustomerDataCustomer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WriteCustomerData writeCustomerData = (WriteCustomerData) o;
    return Objects.equals(this.customer, writeCustomerData.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WriteCustomerData {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
