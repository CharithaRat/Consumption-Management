package lk.ijse.absd.consm.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MainStock {

    @Id
    private String BIN_ITEM;

    @ManyToOne
    private Grn grn;

//    @OneToMany(mappedBy = "mainStock")
//    private List<ReqNote> reqNotes = new ArrayList<>();
//
//    @OneToMany(mappedBy = "mainStks")
//    private List<IssueDtl> issueDtls = new ArrayList<>();

    private String MAT_ID;
    private String MAT_DES;
    private String MAT_UNIT;
    private double MAT_QTY;
    private double MAT_COST;
    private double TTL_AMOUNT;
    private String LOCATION;

    public MainStock() {
    }

    public MainStock(String BIN_ITEM, Grn grn, String MAT_ID, String MAT_DES, String MAT_UNIT,
                     double MAT_QTY, double MAT_COST, double TTL_AMOUNT, String LOCATION) {
        this.BIN_ITEM = BIN_ITEM;
        this.grn = grn;
        this.MAT_ID = MAT_ID;
        this.MAT_DES = MAT_DES;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_QTY = MAT_QTY;
        this.MAT_COST = MAT_COST;
        this.TTL_AMOUNT = TTL_AMOUNT;
        this.LOCATION = LOCATION;
    }
//    public MainStock(String BIN_ITEM, List<Grn> grns, String MAT_ID, String MAT_DES, String MAT_UNIT,
//                     double MAT_QTY, double MAT_COST, double TTL_AMOUNT, String LOCATION) {
//        this.BIN_ITEM = BIN_ITEM;
//        this.grns = grns;
//        this.MAT_ID = MAT_ID;
//        this.MAT_DES = MAT_DES;
//        this.MAT_UNIT = MAT_UNIT;
//        this.MAT_QTY = MAT_QTY;
//        this.MAT_COST = MAT_COST;
//        this.TTL_AMOUNT = TTL_AMOUNT;
//        this.LOCATION = LOCATION;
//    }

//    public MainStock(String BIN_ITEM, List<Grn> grns, List<ReqNote> reqNotes, List<IssueDtl> issueDtls, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_QTY, double MAT_COST, double TTL_AMOUNT, String LOCATION) {
//        this.BIN_ITEM = BIN_ITEM;
//        this.grns = grns;
//        this.reqNotes = reqNotes;
//        this.issueDtls = issueDtls;
//        this.MAT_ID = MAT_ID;
//        this.MAT_DES = MAT_DES;
//        this.MAT_UNIT = MAT_UNIT;
//        this.MAT_QTY = MAT_QTY;
//        this.MAT_COST = MAT_COST;
//        this.TTL_AMOUNT = TTL_AMOUNT;
//        this.LOCATION = LOCATION;
//    }

    public MainStock(String BIN_ITEM, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_QTY, double MAT_COST, double TTL_AMOUNT, String LOCATION) {
        this.BIN_ITEM = BIN_ITEM;
        this.MAT_ID = MAT_ID;
        this.MAT_DES = MAT_DES;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_QTY = MAT_QTY;
        this.MAT_COST = MAT_COST;
        this.TTL_AMOUNT = TTL_AMOUNT;
        this.LOCATION = LOCATION;
    }

    public String getBIN_ITEM() {
        return BIN_ITEM;
    }

    public void setBIN_ITEM(String BIN_ITEM) {
        this.BIN_ITEM = BIN_ITEM;
    }

    public String getMAT_ID() {
        return MAT_ID;
    }

    public void setMAT_ID(String MAT_ID) {
        this.MAT_ID = MAT_ID;
    }

    public String getMAT_DES() {
        return MAT_DES;
    }

    public void setMAT_DES(String MAT_DES) {
        this.MAT_DES = MAT_DES;
    }

    public String getMAT_UNIT() {
        return MAT_UNIT;
    }

    public void setMAT_UNIT(String MAT_UNIT) {
        this.MAT_UNIT = MAT_UNIT;
    }

    public double getMAT_QTY() {
        return MAT_QTY;
    }

    public void setMAT_QTY(double MAT_QTY) {
        this.MAT_QTY = MAT_QTY;
    }

    public double getMAT_COST() {
        return MAT_COST;
    }

    public void setMAT_COST(double MAT_COST) {
        this.MAT_COST = MAT_COST;
    }

    public double getTTL_AMOUNT() {
        return TTL_AMOUNT;
    }

    public void setTTL_AMOUNT(double TTL_AMOUNT) {
        this.TTL_AMOUNT = TTL_AMOUNT;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public Grn getGrn() {
        return grn;
    }

    public void setGrn(Grn grn) {
        this.grn = grn;
    }
//    public List<Grn> getGrns() {
//        return grns;
//    }
//
//    public void setGrns(List<Grn> grns) {
//        this.grns = grns;
//    }

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

//    @Override
//    public String toString() {
//        return "MainStock{" +
//                "BIN_ITEM='" + BIN_ITEM + '\'' +
//                ", grns=" + grns +
//                ", reqNotes=" + reqNotes +
//                ", issueDtls=" + issueDtls +
//                ", MAT_ID='" + MAT_ID + '\'' +
//                ", MAT_DES='" + MAT_DES + '\'' +
//                ", MAT_UNIT='" + MAT_UNIT + '\'' +
//                ", MAT_QTY=" + MAT_QTY +
//                ", MAT_COST=" + MAT_COST +
//                ", TTL_AMOUNT=" + TTL_AMOUNT +
//                ", LOCATION='" + LOCATION + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "MainStock{" +
                "BIN_ITEM='" + BIN_ITEM + '\'' +
                ", grn=" + grn +
                ", MAT_ID='" + MAT_ID + '\'' +
                ", MAT_DES='" + MAT_DES + '\'' +
                ", MAT_UNIT='" + MAT_UNIT + '\'' +
                ", MAT_QTY=" + MAT_QTY +
                ", MAT_COST=" + MAT_COST +
                ", TTL_AMOUNT=" + TTL_AMOUNT +
                ", LOCATION='" + LOCATION + '\'' +
                '}';
    }
}
