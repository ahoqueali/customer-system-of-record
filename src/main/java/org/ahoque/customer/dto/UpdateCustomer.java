package org.ahoque.customer.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * UpdateCustomer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-27T20:27:40.252Z[GMT]")


public class UpdateCustomer   {
  @JsonProperty("Data")
  private ReadCustomerData data = null;

  public UpdateCustomer data(ReadCustomerData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    @Valid
    public ReadCustomerData getData() {
    return data;
  }

  public void setData(ReadCustomerData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomer updateCustomer = (UpdateCustomer) o;
    return Objects.equals(this.data, updateCustomer.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomer {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
