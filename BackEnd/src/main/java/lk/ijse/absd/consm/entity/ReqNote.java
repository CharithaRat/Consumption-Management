package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ReqNote {

    @Id
    private String REQ_NO;

    @ManyToOne
    private MainStock mainStock;

    @ManyToOne
    private Contractor contractor;

    private String REQ_DATE;
    private String REQ_BY;
    private String MODEL_ID;
    private String MAT_ID;
    private String MAT_DES;
    private String MAT_UNIT;
    private double MAT_QTY;

    public ReqNote() {
    }

    public ReqNote(String REQ_NO, MainStock mainStock, Contractor contractor, String REQ_DATE, String REQ_BY, String MODEL_ID, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_QTY) {
        this.REQ_NO = REQ_NO;
        this.mainStock = mainStock;
        this.contractor = contractor;
        this.REQ_DATE = REQ_DATE;
        this.REQ_BY = REQ_BY;
        this.MODEL_ID = MODEL_ID;
        this.MAT_ID = MAT_ID;
        this.MAT_DES = MAT_DES;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_QTY = MAT_QTY;
    }

    public ReqNote(String REQ_NO, String REQ_DATE, String REQ_BY, String MODEL_ID, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_QTY) {
        this.REQ_NO = REQ_NO;
        this.REQ_DATE = REQ_DATE;
        this.REQ_BY = REQ_BY;
        this.MODEL_ID = MODEL_ID;
        this.MAT_ID = MAT_ID;
        this.MAT_DES = MAT_DES;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_QTY = MAT_QTY;
    }

    public String getREQ_NO() {
        return REQ_NO;
    }

    public void setREQ_NO(String REQ_NO) {
        this.REQ_NO = REQ_NO;
    }

    public String getREQ_DATE() {
        return REQ_DATE;
    }

    public void setREQ_DATE(String REQ_DATE) {
        this.REQ_DATE = REQ_DATE;
    }

    public String getREQ_BY() {
        return REQ_BY;
    }

    public void setREQ_BY(String REQ_BY) {
        this.REQ_BY = REQ_BY;
    }

    public String getMODEL_ID() {
        return MODEL_ID;
    }

    public void setMODEL_ID(String MODEL_ID) {
        this.MODEL_ID = MODEL_ID;
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

    public MainStock getMainStock() {
        return mainStock;
    }

    public void setMainStock(MainStock mainStock) {
        this.mainStock = mainStock;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    @Override
    public String toString() {
        return "ReqNote{" +
                "REQ_NO='" + REQ_NO + '\'' +
                ", mainStock=" + mainStock +
                ", contractor=" + contractor +
                ", REQ_DATE='" + REQ_DATE + '\'' +
                ", REQ_BY='" + REQ_BY + '\'' +
                ", MODEL_ID='" + MODEL_ID + '\'' +
                ", MAT_ID='" + MAT_ID + '\'' +
                ", MAT_DES='" + MAT_DES + '\'' +
                ", MAT_UNIT='" + MAT_UNIT + '\'' +
                ", MAT_QTY=" + MAT_QTY +
                '}';
    }
}
