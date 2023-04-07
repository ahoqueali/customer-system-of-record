package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.ahoque.customer.model.Role;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Relationship
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class Relationship {

  private UUID relationshipId;

  /**
   * Gets or Sets relationshipType
   */
  public enum RelationshipTypeEnum {
    MARRIAGE("MARRIAGE"),
    
    PARENT("PARENT");

    private String value;

    RelationshipTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RelationshipTypeEnum fromValue(String value) {
      for (RelationshipTypeEnum b : RelationshipTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RelationshipTypeEnum relationshipType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  @Valid
  private List<@Valid Role> role;

  public Relationship relationshipId(UUID relationshipId) {
    this.relationshipId = relationshipId;
    return this;
  }

  /**
   * Get relationshipId
   * @return relationshipId
  */
  @Valid @Size(min = 36, max = 36) 
  @Schema(name = "RelationshipId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RelationshipId")
  public UUID getRelationshipId() {
    return relationshipId;
  }

  public void setRelationshipId(UUID relationshipId) {
    this.relationshipId = relationshipId;
  }

  public Relationship relationshipType(RelationshipTypeEnum relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Get relationshipType
   * @return relationshipType
  */
  
  @Schema(name = "RelationshipType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RelationshipType")
  public RelationshipTypeEnum getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(RelationshipTypeEnum relationshipType) {
    this.relationshipType = relationshipType;
  }

  public Relationship startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @Valid 
  @Schema(name = "StartDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Relationship endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "EndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndDate")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Relationship role(List<@Valid Role> role) {
    this.role = role;
    return this;
  }

  public Relationship addRoleItem(Role roleItem) {
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
  public List<@Valid Role> getRole() {
    return role;
  }

  public void setRole(List<@Valid Role> role) {
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
    Relationship relationship = (Relationship) o;
    return Objects.equals(this.relationshipId, relationship.relationshipId) &&
        Objects.equals(this.relationshipType, relationship.relationshipType) &&
        Objects.equals(this.startDate, relationship.startDate) &&
        Objects.equals(this.endDate, relationship.endDate) &&
        Objects.equals(this.role, relationship.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationshipId, relationshipType, startDate, endDate, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationship {\n");
    sb.append("    relationshipId: ").append(toIndentedString(relationshipId)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

