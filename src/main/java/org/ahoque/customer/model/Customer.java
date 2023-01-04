package org.ahoque.customer.model;

import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-27T20:27:40.252Z[GMT]")

@Entity
@Table(name = "customer")
public class Customer   {

  @Id
  private UUID customerId = null;
  private String firstName = null;

  //@JsonProperty("Addresses")
  //@Valid
  //private List<Address> addresses = null;

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public UUID getCustomerId(){
    return customerId;
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

//  public Customer addresses(List<Address> addresses) {
//    this.addresses = addresses;
//    return this;
//  }

//  public Customer addAddressesItem(Address addressesItem) {
//    if (this.addresses == null) {
//      this.addresses = new ArrayList<Address>();
//    }
//    this.addresses.add(addressesItem);
//    return this;
//  }

  /**
   * Get addresses
   * @return addresses
   **/
//  @Schema(description = "")
//      @Valid
//    public List<Address> getAddresses() {
//    return addresses;
//  }

//  public void setAddresses(List<Address> addresses) {
//    this.addresses = addresses;
//  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.firstName, customer.firstName); // &&
//        Objects.equals(this.addresses, customer.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName /**, addresses**/);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
//    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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
