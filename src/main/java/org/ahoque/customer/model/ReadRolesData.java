package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ReadRolesData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class ReadRolesData   {
  @JsonProperty("Role")
  @Valid
  private List<AnyOfReadRolesDataRoleItems> role = null;

  public ReadRolesData role(List<AnyOfReadRolesDataRoleItems> role) {
    this.role = role;
    return this;
  }

  public ReadRolesData addRoleItem(AnyOfReadRolesDataRoleItems roleItem) {
    if (this.role == null) {
      this.role = new ArrayList<AnyOfReadRolesDataRoleItems>();
    }
    this.role.add(roleItem);
    return this;
  }

  /**
   * Get role
   * @return role
   **/
  @Schema(description = "")
  
    public List<AnyOfReadRolesDataRoleItems> getRole() {
    return role;
  }

  public void setRole(List<AnyOfReadRolesDataRoleItems> role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadRolesData readRolesData = (ReadRolesData) o;
    return Objects.equals(this.role, readRolesData.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadRolesData {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
