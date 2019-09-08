package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractorDTO {
    @JsonProperty("contId")
    private int CONT_ID;
    @JsonProperty("contName")
    private String CONT_NAME;
    @JsonProperty("contJoinDate")
    private String CONT_JOIN_DATE;
    @JsonProperty("contContact")
    private String CONT_CONTACT;
    @JsonProperty("contAddress1")
    private String ADDRESS1;
    @JsonProperty("contAddress2")
    private String ADDRESS2;
    @JsonProperty("contAddress3")
    private String ADDRESS3;

    public ContractorDTO() {
    }

    public ContractorDTO(String CONT_NAME, String CONT_JOIN_DATE, String CONT_CONTACT, String ADDRESS1, String ADDRESS2, String ADDRESS3) {
        this.CONT_ID = CONT_ID;
        this.CONT_NAME = CONT_NAME;
        this.CONT_JOIN_DATE = CONT_JOIN_DATE;
        this.CONT_CONTACT = CONT_CONTACT;
        this.ADDRESS1 = ADDRESS1;
        this.ADDRESS2 = ADDRESS2;
        this.ADDRESS3 = ADDRESS3;
    }

    public ContractorDTO(int CONT_ID, String CONT_NAME, String CONT_JOIN_DATE, String CONT_CONTACT, String ADDRESS1, String ADDRESS2, String ADDRESS3) {
        this.CONT_ID = CONT_ID;
        this.CONT_NAME = CONT_NAME;
        this.CONT_JOIN_DATE = CONT_JOIN_DATE;
        this.CONT_CONTACT = CONT_CONTACT;
        this.ADDRESS1 = ADDRESS1;
        this.ADDRESS2 = ADDRESS2;
        this.ADDRESS3 = ADDRESS3;
    }

    public int getCONT_ID() {
        return CONT_ID;
    }

    public void setCONT_ID(int CONT_ID) {
        this.CONT_ID = CONT_ID;
    }

    public String getCONT_NAME() {
        return CONT_NAME;
    }

    public void setCONT_NAME(String CONT_NAME) {
        this.CONT_NAME = CONT_NAME;
    }

    public String getCONT_JOIN_DATE() {
        return CONT_JOIN_DATE;
    }

    public void setCONT_JOIN_DATE(String CONT_JOIN_DATE) {
        this.CONT_JOIN_DATE = CONT_JOIN_DATE;
    }

    public String getCONT_CONTACT() {
        return CONT_CONTACT;
    }

    public void setCONT_CONTACT(String CONT_CONTACT) {
        this.CONT_CONTACT = CONT_CONTACT;
    }

    public String getADDRESS1() {
        return ADDRESS1;
    }

    public void setADDRESS1(String ADDRESS1) {
        this.ADDRESS1 = ADDRESS1;
    }

    public String getADDRESS2() {
        return ADDRESS2;
    }

    public void setADDRESS2(String ADDRESS2) {
        this.ADDRESS2 = ADDRESS2;
    }

    public String getADDRESS3() {
        return ADDRESS3;
    }

    public void setADDRESS3(String ADDRESS3) {
        this.ADDRESS3 = ADDRESS3;
    }

    @Override
    public String toString() {
        return "ContractorDTO{" +
                "CONT_ID='" + CONT_ID + '\'' +
                ", CONT_NAME='" + CONT_NAME + '\'' +
                ", CONT_JOIN_DATE='" + CONT_JOIN_DATE + '\'' +
                ", CONT_CONTACT='" + CONT_CONTACT + '\'' +
                ", ADDRESS1='" + ADDRESS1 + '\'' +
                ", ADDRESS2='" + ADDRESS2 + '\'' +
                ", ADDRESS3='" + ADDRESS3 + '\'' +
                '}';
    }
}
