package org.ahoque.customer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Relationship;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReadRelationshipData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class ReadRelationshipData   {
  @JsonProperty("Relationship")
  @Valid
  private List<Relationship> relationship = null;

  public ReadRelationshipData relationship(List<Relationship> relationship) {
    this.relationship = relationship;
    return this;
  }

  public ReadRelationshipData addRelationshipItem(Relationship relationshipItem) {
    if (this.relationship == null) {
      this.relationship = new ArrayList<Relationship>();
    }
    this.relationship.add(relationshipItem);
    return this;
  }

  /**
   * Get relationship
   * @return relationship
   **/
  @Schema(description = "")
      @Valid
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
