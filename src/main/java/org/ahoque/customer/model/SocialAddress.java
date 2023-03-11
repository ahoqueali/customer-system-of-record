package org.ahoque.customer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SocialAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class SocialAddress extends ContactPoint implements AnyOfReadContactPointsDataContactPointItems {
  @JsonProperty("SocialAddress")
  private String socialAddress = null;

  public SocialAddress socialAddress(String socialAddress) {
    this.socialAddress = socialAddress;
    return this;
  }

  /**
   * Get socialAddress
   * @return socialAddress
   **/
  @Schema(example = "@rosspoldark", description = "")
  
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
    SocialAddress socialAddress = (SocialAddress) o;
    return Objects.equals(this.socialAddress, socialAddress.socialAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
