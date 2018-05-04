package com.yahoo.ycsb;

public class NFProfile {

  private String nfProfileID;

  private String nfType;

  private String plmn;

  private NFSingleNssai snssai;


  public NFProfile() {
  }

  public NFProfile(String nfProfileID, String nfType, String plmn, NFSingleNssai snssai) {
    this.nfProfileID = nfProfileID;
    this.nfType = nfType;
    this.plmn = plmn;
    this.snssai = snssai;
  }

  public String getNfProfileID() {
    return nfProfileID;
  }

  public void setNfProfileID(String nfProfileID) {
    this.nfProfileID = nfProfileID;
  }

  public String getNfType() {
    return nfType;
  }

  public void setNfType(String nfType) {
    this.nfType = nfType;
  }

  public String getPlmn() {
    return plmn;
  }

  public void setPlmn(String plmn) {
    this.plmn = plmn;
  }

  public NFSingleNssai getSnssai() {
    return snssai;
  }

  public void setSnssai(NFSingleNssai snssai) {
    this.snssai = snssai;
  }

	
}
