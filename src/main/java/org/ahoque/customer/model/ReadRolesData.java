package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.ahoque.customer.model.ReadRolesDataRoleInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReadRolesData
 */

@JsonTypeName("ReadRoles_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class ReadRolesData {

  @Valid
  private List<@Valid ReadRolesDataRoleInner> role;

  public ReadRolesData role(List<@Valid ReadRolesDataRoleInner> role) {
    this.role = role;
    return this;
  }

  public ReadRolesData addRoleItem(ReadRolesDataRoleInner roleItem) {
    if (this.role == null) {
      this.role = new ArrayList<>();
    }
    this.role.add(roleItem);
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @Valid 
  @Schema(name = "Role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Role")
  public List<@Valid ReadRolesDataRoleInner> getRole() {
    return role;
  }

  public void setRole(List<@Valid ReadRolesDataRoleInner> role) {
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

