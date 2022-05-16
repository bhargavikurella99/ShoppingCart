package com.devon4j.application.scsj.customermanagement.logic.api.to;

import com.devon4j.application.scsj.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devon4j.application.scsj.customermanagement.common.api.Customer}s.
 */
public class CustomerSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private String email;

  private String gender;

  private Long mobileNumber;

  private StringSearchConfigTo nameOption;

  private StringSearchConfigTo emailOption;

  private StringSearchConfigTo genderOption;

  /**
   * @return nameId
   */

  public String getName() {

    return name;
  }

  /**
   * @param name setter for name attribute
   */

  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return emailId
   */

  public String getEmail() {

    return email;
  }

  /**
   * @param email setter for email attribute
   */

  public void setEmail(String email) {

    this.email = email;
  }

  /**
   * @return genderId
   */

  public String getGender() {

    return gender;
  }

  /**
   * @param gender setter for gender attribute
   */

  public void setGender(String gender) {

    this.gender = gender;
  }

  /**
   * @return mobileNumberId
   */

  public Long getMobileNumber() {

    return mobileNumber;
  }

  /**
   * @param mobileNumber setter for mobileNumber attribute
   */

  public void setMobileNumber(Long mobileNumber) {

    this.mobileNumber = mobileNumber;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getName() name}.
   */
  public StringSearchConfigTo getNameOption() {

    return this.nameOption;
  }

  /**
   * @param nameOption new value of {@link #getNameOption()}.
   */
  public void setNameOption(StringSearchConfigTo nameOption) {

    this.nameOption = nameOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getEmail() email}.
   */
  public StringSearchConfigTo getEmailOption() {

    return this.emailOption;
  }

  /**
   * @param emailOption new value of {@link #getEmailOption()}.
   */
  public void setEmailOption(StringSearchConfigTo emailOption) {

    this.emailOption = emailOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getGender() gender}.
   */
  public StringSearchConfigTo getGenderOption() {

    return this.genderOption;
  }

  /**
   * @param genderOption new value of {@link #getGenderOption()}.
   */
  public void setGenderOption(StringSearchConfigTo genderOption) {

    this.genderOption = genderOption;
  }

}
