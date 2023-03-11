package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Relationship
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class Relationship   {
  @JsonProperty("RelationshipId")
  private UUID relationshipId = null;

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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RelationshipTypeEnum fromValue(String text) {
      for (RelationshipTypeEnum b : RelationshipTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("RelationshipType")
  private RelationshipTypeEnum relationshipType = null;

  @JsonProperty("StartDate")
  private LocalDate startDate = null;

  @JsonProperty("EndDate")
  private LocalDate endDate = null;

  @JsonProperty("Role")
  @Valid
  private List<Role> role = null;

  public Relationship relationshipId(UUID relationshipId) {
    this.relationshipId = relationshipId;
    return this;
  }

  /**
   * Get relationshipId
   * @return relationshipId
   **/
  @Schema(description = "")
  
    @Valid
  @Size(min=36,max=36)   public UUID getRelationshipId() {
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
   **/
  @Schema(description = "")
  
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
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Relationship role(List<Role> role) {
    this.role = role;
    return this;
  }

  public Relationship addRoleItem(Role roleItem) {
    if (this.role == null) {
      this.role = new ArrayList<Role>();
    }
    this.role.add(roleItem);
    return this;
  }

  /**
   * Get role
   * @return role
   **/
  @Schema(description = "")
      @Valid
    public List<Role> getRole() {
    return role;
  }

  public void setRole(List<Role> role) {
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
