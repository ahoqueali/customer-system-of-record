package org.ahoque.customer.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ReadCustomerData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-27T20:27:40.252Z[GMT]")


public class ReadCustomerData   {
  @JsonProperty("Customer")
  private ReadCustomerDataCustomer customer = null;

  public ReadCustomerData customer(ReadCustomerDataCustomer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
   **/
  @Schema(description = "")
  
    @Valid
    public ReadCustomerDataCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(ReadCustomerDataCustomer customer) {
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
    ReadCustomerData readCustomerData = (ReadCustomerData) o;
    return Objects.equals(this.customer, readCustomerData.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadCustomerData {\n");
    
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
