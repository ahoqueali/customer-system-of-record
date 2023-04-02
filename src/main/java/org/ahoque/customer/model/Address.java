package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Address
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
public class Address {

  @JsonProperty("Line1")
  private String line1;

  @JsonProperty("Line2")
  private String line2;

  @JsonProperty("Line3")
  private String line3;

  @JsonProperty("Line4")
  private String line4;

  public Address line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Get line1
   * @return line1
  */
  
  @Schema(name = "Line1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public Address line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Get line2
   * @return line2
  */
  
  @Schema(name = "Line2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public Address line3(String line3) {
    this.line3 = line3;
    return this;
  }

  /**
   * Get line3
   * @return line3
  */
  
  @Schema(name = "Line3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public Address line4(String line4) {
    this.line4 = line4;
    return this;
  }

  /**
   * Get line4
   * @return line4
  */
  
  @Schema(name = "Line4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLine4() {
    return line4;
  }

  public void setLine4(String line4) {
    this.line4 = line4;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.line2, address.line2) &&
        Objects.equals(this.line3, address.line3) &&
        Objects.equals(this.line4, address.line4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, line3, line4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    line4: ").append(toIndentedString(line4)).append("\n");
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

