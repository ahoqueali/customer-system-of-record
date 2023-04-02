package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.ahoque.customer.model.Relationship;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReadRelationshipData
 */

@JsonTypeName("ReadRelationship_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
public class ReadRelationshipData {

  @JsonProperty("Relationship")
  @Valid
  private List<Relationship> relationship = null;

  public ReadRelationshipData relationship(List<Relationship> relationship) {
    this.relationship = relationship;
    return this;
  }

  public ReadRelationshipData addRelationshipItem(Relationship relationshipItem) {
    if (this.relationship == null) {
      this.relationship = new ArrayList<>();
    }
    this.relationship.add(relationshipItem);
    return this;
  }

  /**
   * Get relationship
   * @return relationship
  */
  @Valid 
  @Schema(name = "Relationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Relationship> getRelationship() {
    return relationship;
  }

  public void setRelationship(List<Relationship> relationship) {
    this.relationship = relationship;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadRelationshipData readRelationshipData = (ReadRelationshipData) o;
    return Objects.equals(this.relationship, readRelationshipData.relationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadRelationshipData {\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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

