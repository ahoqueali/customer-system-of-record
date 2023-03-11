package org.ahoque.customer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * CustomerRelationshipInvolvement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class CustomerRelationshipInvolvement extends Role implements AnyOfReadRolesDataRoleItems {
  @JsonProperty("CustomerRelationshipInvolvementType")
  private String customerRelationshipInvolvementType = null;

  public CustomerRelationshipInvolvement customerRelationshipInvolvementType(String customerRelationshipInvolvementType) {
    this.customerRelationshipInvolvementType = customerRelationshipInvolvementType;
    return this;
  }

  /**
   * Get customerRelationshipInvolvementType
   * @return customerRelationshipInvolvementType
   **/
  @Schema(description = "")
  
    public String getCustomerRelationshipInvolvementType() {
    return customerRelationshipInvolvementType;
  }

  public void setCustomerRelationshipInvolvementType(String customerRelationshipInvolvementType) {
    this.customerRelationshipInvolvementType = customerRelationshipInvolvementType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRelationshipInvolvement customerRelationshipInvolvement = (CustomerRelationshipInvolvement) o;
    return Objects.equals(this.customerRelationshipInvolvementType, customerRelationshipInvolvement.customerRelationshipInvolvementType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerRelationshipInvolvementType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRelationshipInvolvement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customerRelationshipInvolvementType: ").append(toIndentedString(customerRelationshipInvolvementType)).append("\n");
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
