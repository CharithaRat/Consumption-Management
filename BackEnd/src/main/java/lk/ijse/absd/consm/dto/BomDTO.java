package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BomDTO {
    @JsonProperty("bomId")
    private int BOM_ID;
    @JsonProperty("bomCode")
    private String BOM_CODE;
    @JsonProperty("bomDes")
    private String BOM_DES;
    @JsonProperty("bomType")
    private String BOM_TYPE;
    @JsonProperty("bomUnit")
    private String BOM_UNIT;
    @JsonProperty("bomDate")
    private String BOM_DATE;
    @JsonProperty("bomValue")
    private double BOM_VALUE;
    @JsonProperty("bomGurPeriod")
    private String BOM_GUR_PER;

    public BomDTO() {
    }

    public BomDTO(int BOM_ID, String BOM_CODE, String BOM_DES, String BOM_TYPE, String BOM_UNIT, String BOM_DATE, double BOM_VALUE, String BOM_GUR_PER) {
        this.BOM_ID = BOM_ID;
        this.BOM_CODE = BOM_CODE;
        this.BOM_DES = BOM_DES;
        this.BOM_TYPE = BOM_TYPE;
        this.BOM_UNIT = BOM_UNIT;
        this.BOM_DATE = BOM_DATE;
        this.BOM_VALUE = BOM_VALUE;
        this.BOM_GUR_PER = BOM_GUR_PER;
    }

    public BomDTO(int BOM_ID, String BOM_DES, String BOM_TYPE, String BOM_UNIT, String BOM_DATE, double BOM_VALUE, String BOM_GUR_PER) {
        this.BOM_ID = BOM_ID;
        this.BOM_DES = BOM_DES;
        this.BOM_TYPE = BOM_TYPE;
        this.BOM_UNIT = BOM_UNIT;
        this.BOM_DATE = BOM_DATE;
        this.BOM_VALUE = BOM_VALUE;
        this.BOM_GUR_PER = BOM_GUR_PER;
    }

    public int getBOM_ID() {
        return BOM_ID;
    }

    public void setBOM_ID(int BOM_ID) {
        this.BOM_ID = BOM_ID;
    }

    public String getBOM_DES() {
        return BOM_DES;
    }

    public void setBOM_DES(String BOM_DES) {
        this.BOM_DES = BOM_DES;
    }

    public String getBOM_TYPE() {
        return BOM_TYPE;
    }

    public void setBOM_TYPE(String BOM_TYPE) {
        this.BOM_TYPE = BOM_TYPE;
    }

    public String getBOM_UNIT() {
        return BOM_UNIT;
    }

    public void setBOM_UNIT(String BOM_UNIT) {
        this.BOM_UNIT = BOM_UNIT;
    }

    public String getBOM_DATE() {
        return BOM_DATE;
    }

    public void setBOM_DATE(String BOM_DATE) {
        this.BOM_DATE = BOM_DATE;
    }

    public double getBOM_VALUE() {
        return BOM_VALUE;
    }

    public void setBOM_VALUE(double BOM_VALUE) {
        this.BOM_VALUE = BOM_VALUE;
    }

    public String getBOM_GUR_PER() {
        return BOM_GUR_PER;
    }

    public void setBOM_GUR_PER(String BOM_GUR_PER) {
        this.BOM_GUR_PER = BOM_GUR_PER;
    }

    public String getBOM_CODE() {
        return BOM_CODE;
    }

    public void setBOM_CODE(String BOM_CODE) {
        this.BOM_CODE = BOM_CODE;
    }

//    @Override
//    public String toString() {
//        return "BomDTO{" +
//                "BOM_ID='" + BOM_ID + '\'' +
//                ", BOM_DES='" + BOM_DES + '\'' +
//                ", BOM_TYPE='" + BOM_TYPE + '\'' +
//                ", BOM_UNIT='" + BOM_UNIT + '\'' +
//                ", BOM_DATE='" + BOM_DATE + '\'' +
//                ", BOM_VALUE=" + BOM_VALUE +
//                ", BOM_GUR_PER='" + BOM_GUR_PER + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "BomDTO{" +
                "BOM_ID=" + BOM_ID +
                ", BOM_CODE='" + BOM_CODE + '\'' +
                ", BOM_DES='" + BOM_DES + '\'' +
                ", BOM_TYPE='" + BOM_TYPE + '\'' +
                ", BOM_UNIT='" + BOM_UNIT + '\'' +
                ", BOM_DATE='" + BOM_DATE + '\'' +
                ", BOM_VALUE=" + BOM_VALUE +
                ", BOM_GUR_PER='" + BOM_GUR_PER + '\'' +
                '}';
    }
}
