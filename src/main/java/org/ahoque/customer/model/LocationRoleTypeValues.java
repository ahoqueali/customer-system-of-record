package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets LocationRoleTypeValues
 */
public enum LocationRoleTypeValues {
  DOMICILE("DOMICILE"),
    CORRESPONDENCE("CORRESPONDENCE");

  private String value;

  LocationRoleTypeValues(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LocationRoleTypeValues fromValue(String text) {
    for (LocationRoleTypeValues b : LocationRoleTypeValues.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
