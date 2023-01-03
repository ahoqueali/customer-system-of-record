package org.ahoque.customer.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.ahoque.customer.model.Address;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * AllOfWriteCustomerDataCustomer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-27T20:27:40.252Z[GMT]")


public class AllOfWriteCustomerDataCustomer   {
  @JsonProperty("FirstName")
  private String firstName = null;

  @JsonProperty("Addresses")
  @Valid
  private List<Address> addresses = null;

  public AllOfWriteCustomerDataCustomer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @Schema(example = "fehguy", description = "")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AllOfWriteCustomerDataCustomer addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public AllOfWriteCustomerDataCustomer addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Address>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
   **/
  @Schema(description = "")
      @Valid
    public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfWriteCustomerDataCustomer allOfWriteCustomerDataCustomer = (AllOfWriteCustomerDataCustomer) o;
    return Objects.equals(this.firstName, allOfWriteCustomerDataCustomer.firstName) &&
        Objects.equals(this.addresses, allOfWriteCustomerDataCustomer.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfWriteCustomerDataCustomer {\n");
    
    sb.append("    FirstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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
