package com.devon4j.application.scsj.customermanagement.dataaccess.api;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.devon4j.application.scsj.customermanagement.common.api.Customer;
import com.devon4j.application.scsj.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devon4j.application.scsj.productmanagement.dataaccess.api.ProductEntity;

/**
 * TODO bkurella This type ...
 */
@Entity
@Table(name = "Customer")
public class CustomerEntity extends ApplicationPersistenceEntity implements Customer {

  private String name;

  private String email;

  private String gender;

  private long mobileNumber;

  private List<ProductEntity> products;

  private static final long serialVersionUID = 1L;

  /**
   * The constructor.
   *
   * @param name
   * @param email
   * @param gender
   * @param mobileNumber
   * @param products
   */
  public CustomerEntity(String name, String email, String gender, long mobileNumber, List<ProductEntity> products) {

    super();
    this.name = name;
    this.email = email;
    this.gender = gender;
    this.mobileNumber = mobileNumber;
    this.products = products;
  }

  /**
   * The constructor.
   */
  public CustomerEntity() {

    super();
  }

  /**
   * @return name
   */
  @Override
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return email
   */
  @Override
  public String getEmail() {

    return this.email;
  }

  /**
   * @param email new value of {@link #getemail}.
   */
  @Override
  public void setEmail(String email) {

    this.email = email;
  }

  /**
   * @return gender
   */
  @Override
  public String getGender() {

    return this.gender;
  }

  /**
   * @param gender new value of {@link #getgender}.
   */
  @Override
  public void setGender(String gender) {

    this.gender = gender;
  }

  /**
   * @return products
   */
  @OneToMany(mappedBy = "customer")
  public List<ProductEntity> getProducts() {

    return this.products;
  }

  /**
   * @param products new value of {@link #getproducts}.
   */
  public void setProducts(List<ProductEntity> products) {

    this.products = products;
  }

  /**
   * @return mobileNumber
   */
  @Override
  public long getMobileNumber() {

    return this.mobileNumber;
  }

  /**
   * @param mobileNumber new value of {@link #getmobileNumber}.
   */
  @Override
  public void setMobileNumber(long mobileNumber) {

    this.mobileNumber = mobileNumber;
  }

}
