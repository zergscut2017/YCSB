package com.yahoo.ycsb;

import org.apache.geode.pdx.PdxReader;
import org.apache.geode.pdx.PdxSerializable;
import org.apache.geode.pdx.PdxWriter;

import com.yahoo.ycsb.NFSingleNssai;

/*
* Creates a NFProfile Data type.
* 
*/

public class NFProfile implements PdxSerializable {

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

  public void toData(PdxWriter writer) {
    writer.writeString("nfProfileID", nfProfileID)
// The markIdentifyField call for a field must 
// come after the field's write method 
    .markIdentityField("nfProfileID")
    .writeString("nfType", nfType)
    .writeString("plmn", plmn)
    .writeObject("snssai", snssai);

  }

  public void fromData(PdxReader reader) {
    nfProfileID = reader.readString("nfProfileID");
	nfType = reader.readString("nfType");
	plmn = reader.readString("plmn");
	snssai = reader.readObject("snssai");
  }	
  
  
}
