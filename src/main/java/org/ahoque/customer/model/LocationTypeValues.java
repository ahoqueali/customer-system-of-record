package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets LocationTypeValues
 */
public enum LocationTypeValues {
  RESIDENCY("RESIDENCY"),
    DOMICILE("DOMICILE"),
    CURRENT_LOCATION("CURRENT_LOCATION"),
    PREVIOUS_LOCATION("PREVIOUS_LOCATION");

  private String value;

  LocationTypeValues(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LocationTypeValues fromValue(String text) {
    for (LocationTypeValues b : LocationTypeValues.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
