package lk.ijse.absd.consm.dto;

public class SupplierDTO {
    private String SUP_ID;
    private String SUP_NAME;
    private String SUP_JOIN_DATE;
    private String SUP_CONTACT;
    private String ADDRESS1;
    private String ADDRESS2;
    private String ADDRESS3;

    public SupplierDTO() {
    }

    public SupplierDTO(String SUP_ID, String SUP_NAME, String SUP_JOIN_DATE, String SUP_CONTACT, String ADDRESS1, String ADDRESS2, String ADDRESS3) {
        this.SUP_ID = SUP_ID;
        this.SUP_NAME = SUP_NAME;
        this.SUP_JOIN_DATE = SUP_JOIN_DATE;
        this.SUP_CONTACT = SUP_CONTACT;
        this.ADDRESS1 = ADDRESS1;
        this.ADDRESS2 = ADDRESS2;
        this.ADDRESS3 = ADDRESS3;
    }

    public String getSUP_ID() {
        return SUP_ID;
    }

    public void setSUP_ID(String SUP_ID) {
        this.SUP_ID = SUP_ID;
    }

    public String getSUP_NAME() {
        return SUP_NAME;
    }

    public void setSUP_NAME(String SUP_NAME) {
        this.SUP_NAME = SUP_NAME;
    }

    public String getSUP_JOIN_DATE() {
        return SUP_JOIN_DATE;
    }

    public void setSUP_JOIN_DATE(String SUP_JOIN_DATE) {
        this.SUP_JOIN_DATE = SUP_JOIN_DATE;
    }

    public String getSUP_CONTACT() {
        return SUP_CONTACT;
    }

    public void setSUP_CONTACT(String SUP_CONTACT) {
        this.SUP_CONTACT = SUP_CONTACT;
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
        return "SupplierDTO{" +
                "SUP_ID='" + SUP_ID + '\'' +
                ", SUP_NAME='" + SUP_NAME + '\'' +
                ", SUP_JOIN_DATE='" + SUP_JOIN_DATE + '\'' +
                ", SUP_CONTACT='" + SUP_CONTACT + '\'' +
                ", ADDRESS1='" + ADDRESS1 + '\'' +
                ", ADDRESS2='" + ADDRESS2 + '\'' +
                ", ADDRESS3='" + ADDRESS3 + '\'' +
                '}';
    }
}
