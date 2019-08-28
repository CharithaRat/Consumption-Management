package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class IssueDtl {

    @Id
    private String ISU_NOTE_NO;

    @ManyToOne
    private MainStock mainStks;

    @ManyToOne
    private Contractor contractordet;

    private String ISU_DATE;
    private String ISU_BY;
    private String REQ_BY;
    private String REQ_ID;
    private String REQ_DATE;
    private String MAT_ID;
    private String MAT_DES;
    private String MAT_UNIT;
    private double MAT_REQ_QTY;
    private double MAT_ISU_QTY;
    private String MAT_SER_NO;

    public IssueDtl() {
    }

    public IssueDtl(String ISU_NOTE_NO, MainStock mainStks, Contractor contractordet, String ISU_DATE, String ISU_BY, String REQ_BY, String REQ_ID, String REQ_DATE, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_REQ_QTY, double MAT_ISU_QTY, String MAT_SER_NO) {
        this.ISU_NOTE_NO = ISU_NOTE_NO;
        this.mainStks = mainStks;
        this.contractordet = contractordet;
        this.ISU_DATE = ISU_DATE;
        this.ISU_BY = ISU_BY;
        this.REQ_BY = REQ_BY;
        this.REQ_ID = REQ_ID;
        this.REQ_DATE = REQ_DATE;
        this.MAT_ID = MAT_ID;
        this.MAT_DES = MAT_DES;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_REQ_QTY = MAT_REQ_QTY;
        this.MAT_ISU_QTY = MAT_ISU_QTY;
        this.MAT_SER_NO = MAT_SER_NO;
    }

    public IssueDtl(String ISU_NOTE_NO, String ISU_DATE, String ISU_BY, String REQ_BY, String REQ_ID, String REQ_DATE, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_REQ_QTY, double MAT_ISU_QTY, String MAT_SER_NO) {
        this.ISU_NOTE_NO = ISU_NOTE_NO;
        this.ISU_DATE = ISU_DATE;
        this.ISU_BY = ISU_BY;
        this.REQ_BY = REQ_BY;
        this.REQ_ID = REQ_ID;
        this.REQ_DATE = REQ_DATE;
        this.MAT_ID = MAT_ID;
        this.MAT_DES = MAT_DES;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_REQ_QTY = MAT_REQ_QTY;
        this.MAT_ISU_QTY = MAT_ISU_QTY;
        this.MAT_SER_NO = MAT_SER_NO;
    }

    public String getISU_NOTE_NO() {
        return ISU_NOTE_NO;
    }

    public void setISU_NOTE_NO(String ISU_NOTE_NO) {
        this.ISU_NOTE_NO = ISU_NOTE_NO;
    }

    public String getISU_DATE() {
        return ISU_DATE;
    }

    public void setISU_DATE(String ISU_DATE) {
        this.ISU_DATE = ISU_DATE;
    }

    public String getISU_BY() {
        return ISU_BY;
    }

    public void setISU_BY(String ISU_BY) {
        this.ISU_BY = ISU_BY;
    }

    public String getREQ_BY() {
        return REQ_BY;
    }

    public void setREQ_BY(String REQ_BY) {
        this.REQ_BY = REQ_BY;
    }

    public String getREQ_ID() {
        return REQ_ID;
    }

    public void setREQ_ID(String REQ_ID) {
        this.REQ_ID = REQ_ID;
    }

    public String getREQ_DATE() {
        return REQ_DATE;
    }

    public void setREQ_DATE(String REQ_DATE) {
        this.REQ_DATE = REQ_DATE;
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

    public double getMAT_REQ_QTY() {
        return MAT_REQ_QTY;
    }

    public void setMAT_REQ_QTY(double MAT_REQ_QTY) {
        this.MAT_REQ_QTY = MAT_REQ_QTY;
    }

    public double getMAT_ISU_QTY() {
        return MAT_ISU_QTY;
    }

    public void setMAT_ISU_QTY(double MAT_ISU_QTY) {
        this.MAT_ISU_QTY = MAT_ISU_QTY;
    }

    public String getMAT_SER_NO() {
        return MAT_SER_NO;
    }

    public void setMAT_SER_NO(String MAT_SER_NO) {
        this.MAT_SER_NO = MAT_SER_NO;
    }

    public MainStock getMainStks() {
        return mainStks;
    }

    public void setMainStks(MainStock mainStks) {
        this.mainStks = mainStks;
    }

    public Contractor getContractordet() {
        return contractordet;
    }

    public void setContractordet(Contractor contractordet) {
        this.contractordet = contractordet;
    }

    @Override
    public String toString() {
        return "IssueDtl{" +
                "ISU_NOTE_NO='" + ISU_NOTE_NO + '\'' +
                ", mainStks=" + mainStks +
                ", contractordet=" + contractordet +
                ", ISU_DATE='" + ISU_DATE + '\'' +
                ", ISU_BY='" + ISU_BY + '\'' +
                ", REQ_BY='" + REQ_BY + '\'' +
                ", REQ_ID='" + REQ_ID + '\'' +
                ", REQ_DATE='" + REQ_DATE + '\'' +
                ", MAT_ID='" + MAT_ID + '\'' +
                ", MAT_DES='" + MAT_DES + '\'' +
                ", MAT_UNIT='" + MAT_UNIT + '\'' +
                ", MAT_REQ_QTY=" + MAT_REQ_QTY +
                ", MAT_ISU_QTY=" + MAT_ISU_QTY +
                ", MAT_SER_NO='" + MAT_SER_NO + '\'' +
                '}';
    }
}
