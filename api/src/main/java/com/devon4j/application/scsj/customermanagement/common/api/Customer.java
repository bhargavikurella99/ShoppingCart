package com.devon4j.application.scsj.customermanagement.common.api;

import com.devon4j.application.scsj.general.common.api.ApplicationEntity;

public interface Customer extends ApplicationEntity {

  /**
   * @return nameId
   */

  public String getName();

  /**
   * @param name setter for name attribute
   */

  public void setName(String name);

  /**
   * @return emailId
   */

  public String getEmail();

  /**
   * @param email setter for email attribute
   */

  public void setEmail(String email);

  /**
   * @return genderId
   */

  public String getGender();

  /**
   * @param gender setter for gender attribute
   */

  public void setGender(String gender);

  /**
   * @return mobileNumberId
   */

  public long getMobileNumber();

  /**
   * @param mobileNumber setter for mobileNumber attribute
   */

  public void setMobileNumber(long mobileNumber);

}
