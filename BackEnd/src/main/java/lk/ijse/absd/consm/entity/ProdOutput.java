package lk.ijse.absd.consm.entity;

import javax.persistence.*;

@Entity
public class ProdOutput {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PRD_ID;

    private String PRD_DATE;

    @ManyToOne
    private Contractor contractordata;

    private String MODEL_ID;
    private String BOM_ID;
    private String BOM_USAGE;
    private double COV_AREA;
    private double COV_VOLUME;

    public ProdOutput() {
    }

    public ProdOutput(String PRD_DATE, Contractor contractordata, String MODEL_ID, String BOM_ID, String BOM_USAGE, double COV_AREA, double COV_VOLUME) {
        this.PRD_DATE = PRD_DATE;
        this.contractordata = contractordata;
        this.MODEL_ID = MODEL_ID;
        this.BOM_ID = BOM_ID;
        this.BOM_USAGE = BOM_USAGE;
        this.COV_AREA = COV_AREA;
        this.COV_VOLUME = COV_VOLUME;
    }

    public ProdOutput(String PRD_DATE, String MODEL_ID, String BOM_ID, String BOM_USAGE, double COV_AREA, double COV_VOLUME) {
        this.PRD_DATE = PRD_DATE;
        this.MODEL_ID = MODEL_ID;
        this.BOM_ID = BOM_ID;
        this.BOM_USAGE = BOM_USAGE;
        this.COV_AREA = COV_AREA;
        this.COV_VOLUME = COV_VOLUME;
    }

    public String getPRD_DATE() {
        return PRD_DATE;
    }

    public void setPRD_DATE(String PRD_DATE) {
        this.PRD_DATE = PRD_DATE;
    }

    public String getMODEL_ID() {
        return MODEL_ID;
    }

    public void setMODEL_ID(String MODEL_ID) {
        this.MODEL_ID = MODEL_ID;
    }

    public String getBOM_ID() {
        return BOM_ID;
    }

    public void setBOM_ID(String BOM_ID) {
        this.BOM_ID = BOM_ID;
    }

    public String getBOM_USAGE() {
        return BOM_USAGE;
    }

    public void setBOM_USAGE(String BOM_USAGE) {
        this.BOM_USAGE = BOM_USAGE;
    }

    public double getCOV_AREA() {
        return COV_AREA;
    }

    public void setCOV_AREA(double COV_AREA) {
        this.COV_AREA = COV_AREA;
    }

    public double getCOV_VOLUME() {
        return COV_VOLUME;
    }

    public void setCOV_VOLUME(double COV_VOLUME) {
        this.COV_VOLUME = COV_VOLUME;
    }

    public Contractor getContractordata() {
        return contractordata;
    }

    public void setContractordata(Contractor contractordata) {
        this.contractordata = contractordata;
    }

    public int getPRD_ID() {
        return PRD_ID;
    }

    public void setPRD_ID(int PRD_ID) {
        this.PRD_ID = PRD_ID;
    }

//    @Override
//    public String toString() {
//        return "ProdOutput{" +
//                "PRD_DATE='" + PRD_DATE + '\'' +
//                ", contractordata=" + contractordata +
//                ", MODEL_ID='" + MODEL_ID + '\'' +
//                ", BOM_ID='" + BOM_ID + '\'' +
//                ", BOM_USAGE='" + BOM_USAGE + '\'' +
//                ", COV_AREA=" + COV_AREA +
//                ", COV_VOLUME=" + COV_VOLUME +
//                '}';
//    }

    @Override
    public String toString() {
        return "ProdOutput{" +
                "PRD_ID=" + PRD_ID +
                ", PRD_DATE='" + PRD_DATE + '\'' +
                ", contractordata=" + contractordata +
                ", MODEL_ID='" + MODEL_ID + '\'' +
                ", BOM_ID='" + BOM_ID + '\'' +
                ", BOM_USAGE='" + BOM_USAGE + '\'' +
                ", COV_AREA=" + COV_AREA +
                ", COV_VOLUME=" + COV_VOLUME +
                '}';
    }
}
