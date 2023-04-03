package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SocialAddressAllOf
 */

@JsonTypeName("SocialAddress_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T15:51:45.519635+01:00[Europe/London]")
public class SocialAddressAllOf {

  private String socialAddress;

  public SocialAddressAllOf socialAddress(String socialAddress) {
    this.socialAddress = socialAddress;
    return this;
  }

  /**
   * Get socialAddress
   * @return socialAddress
  */
  
  @Schema(name = "SocialAddress", example = "@rosspoldark", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SocialAddress")
  public String getSocialAddress() {
    return socialAddress;
  }

  public void setSocialAddress(String socialAddress) {
    this.socialAddress = socialAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialAddressAllOf socialAddressAllOf = (SocialAddressAllOf) o;
    return Objects.equals(this.socialAddress, socialAddressAllOf.socialAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialAddressAllOf {\n");
    sb.append("    socialAddress: ").append(toIndentedString(socialAddress)).append("\n");
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

