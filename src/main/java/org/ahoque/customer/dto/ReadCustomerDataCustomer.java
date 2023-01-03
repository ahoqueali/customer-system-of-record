package org.ahoque.customer.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReadCustomerDataCustomer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-27T20:27:40.252Z[GMT]")


public class ReadCustomerDataCustomer   {
  private UUID customerId = null;

  private String firstName = null;

  public ReadCustomerDataCustomer customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   **/
  @Schema(description = "")
  
  @Valid
  @JsonProperty("CustomerId")
  @Size(min=36,max=36) public UUID getCustomerId() {
    return customerId;
  }

  @JsonProperty("FirstName")
  public String getFirstName(){return firstName; }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }
  public void setFirstName(String firstName) { this.firstName = firstName; }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadCustomerDataCustomer readCustomerDataCustomer = (ReadCustomerDataCustomer) o;
    return Objects.equals(this.customerId, readCustomerDataCustomer.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadCustomerDataCustomer {\n");
    
    sb.append("    CustomerId: ").append(toIndentedString(customerId)).append("\n");
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
