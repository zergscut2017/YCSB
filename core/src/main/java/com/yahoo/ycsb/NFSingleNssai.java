package com.yahoo.ycsb;

/**
 * Creates a NFSingleNssai Data type.
 * 
 */

public class NFSingleNssai {
	
  private int sd;
  private int sst;

  public NFSingleNssai() {
  }

  public NFSingleNssai(int sd, int sst) {
    this.sd = sd;
    this.sst = sst;
  }

  public int getSd() {
    return sd;
  }

  public void setSd(int sd) {
    this.sd = sd;
  }

  public int getSst() {
    return sst;
  }

  public void setSst(int sst) {
    this.sst = sst;
  }
}
