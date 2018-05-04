package com.yahoo.ycsb;

/**
* Creates a NFSingleNssai Data type.
*/

public class NFSingleNssai {

  private int sd;
  private int sst;

  public NFSingleNssai() {
  }

  /**
  * Creates a NFSingleNssai Data type.
  * @param sd sd value
  * @param sst sst value
  */
  public NFSingleNssai(int sd, int sst) {
    this.sd = sd;
    this.sst = sst;
  }

  public int getSd() {
    return sd;
  }

  /**
  * Creates a NFSingleNssai Data type.
  * @param sd sd value
  */
  public void setSd(int sd) {
    this.sd = sd;
  }

  public int getSst() {
    return sst;
  }

  /**
  * Creates a NFSingleNssai Data type.
  * @param sst sst value
  */
  public void setSst(int sst) {
    this.sst = sst;
  }
}
