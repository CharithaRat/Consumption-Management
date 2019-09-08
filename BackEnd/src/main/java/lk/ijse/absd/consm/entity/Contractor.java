package lk.ijse.absd.consm.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Contractor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CONT_ID;

//    @OneToMany(mappedBy = "contractor")
//    private List<ReqNote> reqNotes = new ArrayList<>();
//
//    @OneToMany(mappedBy = "contractordet")
//    private List<IssueDtl> issueDtls = new ArrayList<>();

    @OneToMany(mappedBy = "contractordata")
    private List<ProdOutput> prodOutputs = new ArrayList<>();

    private String CONT_NAME;
    private String CONT_JOIN_DATE;
    private String CONT_CONTACT;
    private String ADDRESS1;
    private String ADDRESS2;
    private String ADDRESS3;

    public Contractor() {
    }

    public Contractor(List<ProdOutput> prodOutputs, String CONT_NAME, String CONT_JOIN_DATE,
                      String CONT_CONTACT, String ADDRESS1, String ADDRESS2, String ADDRESS3) {
        this.prodOutputs = prodOutputs;
        this.CONT_NAME = CONT_NAME;
        this.CONT_JOIN_DATE = CONT_JOIN_DATE;
        this.CONT_CONTACT = CONT_CONTACT;
        this.ADDRESS1 = ADDRESS1;
        this.ADDRESS2 = ADDRESS2;
        this.ADDRESS3 = ADDRESS3;
    }

    //    public Contractor(int CONT_ID, List<ReqNote> reqNotes, List<IssueDtl> issueDtls, List<ProdOutput> prodOutputs, String CONT_NAME, String CONT_JOIN_DATE, String CONT_CONTACT, String ADDRESS1, String ADDRESS2, String ADDRESS3) {
//        this.CONT_ID = CONT_ID;
//        this.reqNotes = reqNotes;
//        this.issueDtls = issueDtls;
//        this.prodOutputs = prodOutputs;
//        this.CONT_NAME = CONT_NAME;
//        this.CONT_JOIN_DATE = CONT_JOIN_DATE;
//        this.CONT_CONTACT = CONT_CONTACT;
//        this.ADDRESS1 = ADDRESS1;
//        this.ADDRESS2 = ADDRESS2;
//        this.ADDRESS3 = ADDRESS3;
//    }

    public Contractor(int CONT_ID, String CONT_NAME, String CONT_JOIN_DATE, String CONT_CONTACT, String ADDRESS1, String ADDRESS2, String ADDRESS3) {
        this.CONT_ID = CONT_ID;
        this.CONT_NAME = CONT_NAME;
        this.CONT_JOIN_DATE = CONT_JOIN_DATE;
        this.CONT_CONTACT = CONT_CONTACT;
        this.ADDRESS1 = ADDRESS1;
        this.ADDRESS2 = ADDRESS2;
        this.ADDRESS3 = ADDRESS3;
    }

    public Contractor(String CONT_NAME, String CONT_JOIN_DATE, String CONT_CONTACT, String ADDRESS1, String ADDRESS2, String ADDRESS3) {
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

//    public List<ReqNote> getReqNotes() {
//        return reqNotes;
//    }
//
//    public void setReqNotes(List<ReqNote> reqNotes) {
//        this.reqNotes = reqNotes;
//    }
//
//    public List<IssueDtl> getIssueDtls() {
//        return issueDtls;
//    }
//
//    public void setIssueDtls(List<IssueDtl> issueDtls) {
//        this.issueDtls = issueDtls;
//    }

    public List<ProdOutput> getProdOutputs() {
        return prodOutputs;
    }

    public void setProdOutputs(List<ProdOutput> prodOutputs) {
        this.prodOutputs = prodOutputs;
    }

//    @Override
//    public String toString() {
//        return "Contractor{" +
//                "CONT_ID='" + CONT_ID + '\'' +
//                ", reqNotes=" + reqNotes +
//                ", issueDtls=" + issueDtls +
//                ", prodOutputs=" + prodOutputs +
//                ", CONT_NAME='" + CONT_NAME + '\'' +
//                ", CONT_JOIN_DATE='" + CONT_JOIN_DATE + '\'' +
//                ", CONT_CONTACT='" + CONT_CONTACT + '\'' +
//                ", ADDRESS1='" + ADDRESS1 + '\'' +
//                ", ADDRESS2='" + ADDRESS2 + '\'' +
//                ", ADDRESS3='" + ADDRESS3 + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Contractor{" +
                "CONT_ID=" + CONT_ID +
                ", prodOutputs=" + prodOutputs +
                ", CONT_NAME='" + CONT_NAME + '\'' +
                ", CONT_JOIN_DATE='" + CONT_JOIN_DATE + '\'' +
                ", CONT_CONTACT='" + CONT_CONTACT + '\'' +
                ", ADDRESS1='" + ADDRESS1 + '\'' +
                ", ADDRESS2='" + ADDRESS2 + '\'' +
                ", ADDRESS3='" + ADDRESS3 + '\'' +
                '}';
    }
}
