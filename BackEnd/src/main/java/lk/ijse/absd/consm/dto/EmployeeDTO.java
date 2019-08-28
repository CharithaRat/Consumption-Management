package lk.ijse.absd.consm.dto;

import java.util.Date;

public class EmployeeDTO {
    private String EMP_ID;
    private String EMP_NAME;
    private Date EMP_JOIN_DATE;
    private String EMP_CONTACT;
    private String EMP_DESIGNATION;
    private String ADDRESS1;
    private String ADDRESS2;
    private String ADDRESS3;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String EMP_ID, String EMP_NAME, Date EMP_JOIN_DATE, String EMP_CONTACT, String EMP_DESIGNATION, String ADDRESS1, String ADDRESS2, String ADDRESS3) {
        this.EMP_ID = EMP_ID;
        this.EMP_NAME = EMP_NAME;
        this.EMP_JOIN_DATE = EMP_JOIN_DATE;
        this.EMP_CONTACT = EMP_CONTACT;
        this.EMP_DESIGNATION = EMP_DESIGNATION;
        this.ADDRESS1 = ADDRESS1;
        this.ADDRESS2 = ADDRESS2;
        this.ADDRESS3 = ADDRESS3;
    }

    public String getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(String EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public Date getEMP_JOIN_DATE() {
        return EMP_JOIN_DATE;
    }

    public void setEMP_JOIN_DATE(Date EMP_JOIN_DATE) {
        this.EMP_JOIN_DATE = EMP_JOIN_DATE;
    }

    public String getEMP_CONTACT() {
        return EMP_CONTACT;
    }

    public void setEMP_CONTACT(String EMP_CONTACT) {
        this.EMP_CONTACT = EMP_CONTACT;
    }

    public String getEMP_DESIGNATION() {
        return EMP_DESIGNATION;
    }

    public void setEMP_DESIGNATION(String EMP_DESIGNATION) {
        this.EMP_DESIGNATION = EMP_DESIGNATION;
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
        return "EmployeeDTO{" +
                "EMP_ID='" + EMP_ID + '\'' +
                ", EMP_NAME='" + EMP_NAME + '\'' +
                ", EMP_JOIN_DATE=" + EMP_JOIN_DATE +
                ", EMP_CONTACT='" + EMP_CONTACT + '\'' +
                ", EMP_DESIGNATION='" + EMP_DESIGNATION + '\'' +
                ", ADDRESS1='" + ADDRESS1 + '\'' +
                ", ADDRESS2='" + ADDRESS2 + '\'' +
                ", ADDRESS3='" + ADDRESS3 + '\'' +
                '}';
    }
}
