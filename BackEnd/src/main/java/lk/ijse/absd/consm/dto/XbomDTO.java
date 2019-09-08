package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class XbomDTO {
    @JsonProperty("xbomId")
    private int XBOM_ID;
    @JsonProperty("xbomCode")
    private String XBOM_CODE;
    @JsonProperty("bomId")
    private String BOM_ID;
    @JsonProperty("bomType")
    private String BOM_TYPE;
    @JsonProperty("modelId")
    private String MODEL_ID;
    @JsonProperty("bomCost")
    private double BOM_COST;
    @JsonProperty("xbomGurPeriod")
    private String XBOM_GUR_PER;

    public XbomDTO() {
    }

    public XbomDTO(int XBOM_ID, String XBOM_CODE, String BOM_ID, String BOM_TYPE, String MODEL_ID, double BOM_COST, String XBOM_GUR_PER) {
        this.XBOM_ID = XBOM_ID;
        this.XBOM_CODE = XBOM_CODE;
        this.BOM_ID = BOM_ID;
        this.BOM_TYPE = BOM_TYPE;
        this.MODEL_ID = MODEL_ID;
        this.BOM_COST = BOM_COST;
        this.XBOM_GUR_PER = XBOM_GUR_PER;
    }

    public XbomDTO(int XBOM_ID, String BOM_ID, String BOM_TYPE, String MODEL_ID, double BOM_COST, String XBOM_GUR_PER) {
        this.XBOM_ID = XBOM_ID;
        this.BOM_ID = BOM_ID;
        this.BOM_TYPE = BOM_TYPE;
        this.MODEL_ID = MODEL_ID;
        this.BOM_COST = BOM_COST;
        this.XBOM_GUR_PER = XBOM_GUR_PER;
    }

    public int getXBOM_ID() {
        return XBOM_ID;
    }

    public void setXBOM_ID(int XBOM_ID) {
        this.XBOM_ID = XBOM_ID;
    }

    public String getBOM_ID() {
        return BOM_ID;
    }

    public void setBOM_ID(String BOM_ID) {
        this.BOM_ID = BOM_ID;
    }

    public String getBOM_TYPE() {
        return BOM_TYPE;
    }

    public void setBOM_TYPE(String BOM_TYPE) {
        this.BOM_TYPE = BOM_TYPE;
    }

    public String getMODEL_ID() {
        return MODEL_ID;
    }

    public void setMODEL_ID(String MODEL_ID) {
        this.MODEL_ID = MODEL_ID;
    }

    public double getBOM_COST() {
        return BOM_COST;
    }

    public void setBOM_COST(double BOM_COST) {
        this.BOM_COST = BOM_COST;
    }

    public String getXBOM_GUR_PER() {
        return XBOM_GUR_PER;
    }

    public void setXBOM_GUR_PER(String XBOM_GUR_PER) {
        this.XBOM_GUR_PER = XBOM_GUR_PER;
    }

    public String getXBOM_CODE() {
        return XBOM_CODE;
    }

    public void setXBOM_CODE(String XBOM_CODE) {
        this.XBOM_CODE = XBOM_CODE;
    }

//    @Override
//    public String toString() {
//        return "XbomDTO{" +
//                "XBOM_ID='" + XBOM_ID + '\'' +
//                ", BOM_ID='" + BOM_ID + '\'' +
//                ", BOM_TYPE='" + BOM_TYPE + '\'' +
//                ", MODEL_ID='" + MODEL_ID + '\'' +
//                ", BOM_COST=" + BOM_COST +
//                ", XBOM_GUR_PER='" + XBOM_GUR_PER + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "XbomDTO{" +
                "XBOM_ID=" + XBOM_ID +
                ", XBOM_CODE='" + XBOM_CODE + '\'' +
                ", BOM_ID='" + BOM_ID + '\'' +
                ", BOM_TYPE='" + BOM_TYPE + '\'' +
                ", MODEL_ID='" + MODEL_ID + '\'' +
                ", BOM_COST=" + BOM_COST +
                ", XBOM_GUR_PER='" + XBOM_GUR_PER + '\'' +
                '}';
    }
}
