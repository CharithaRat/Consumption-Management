package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReqNoteDTO {
    @JsonProperty("reqNo")
    private int REQ_NO;
    @JsonProperty("reqDate")
    private String REQ_DATE;
    @JsonProperty("reqBy")
    private String REQ_BY;
    @JsonProperty("modelId")
    private String MODEL_ID;
    @JsonProperty("matId")
    private String MAT_ID;
    @JsonProperty("matDes")
    private String MAT_DES;
    @JsonProperty("matUnit")
    private String MAT_UNIT;
    @JsonProperty("matQty")
    private double MAT_QTY;

    @JsonProperty("binItem")
    private String BIN_ITEM;
    @JsonProperty("contId")
    private int CONT_ID;

    public ReqNoteDTO() {
    }

    public ReqNoteDTO(int REQ_NO, String REQ_DATE, String REQ_BY,
                      String MODEL_ID, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_QTY, String BIN_ITEM, int CONT_ID) {
        this.REQ_NO = REQ_NO;
        this.REQ_DATE = REQ_DATE;
        this.REQ_BY = REQ_BY;
        this.MODEL_ID = MODEL_ID;
        this.MAT_ID = MAT_ID;
        this.MAT_DES = MAT_DES;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_QTY = MAT_QTY;
        this.BIN_ITEM = BIN_ITEM;
        this.CONT_ID = CONT_ID;
    }

    public ReqNoteDTO(int REQ_NO, String REQ_DATE, String REQ_BY, String MODEL_ID, String MAT_ID, String MAT_DES, String MAT_UNIT,
                      double MAT_QTY) {
        this.REQ_NO = REQ_NO;
        this.REQ_DATE = REQ_DATE;
        this.REQ_BY = REQ_BY;
        this.MODEL_ID = MODEL_ID;
        this.MAT_ID = MAT_ID;
        this.MAT_DES = MAT_DES;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_QTY = MAT_QTY;
    }

    public int getREQ_NO() {
        return REQ_NO;
    }

    public void setREQ_NO(int REQ_NO) {
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

    public String getBIN_ITEM() {
        return BIN_ITEM;
    }

    public void setBIN_ITEM(String BIN_ITEM) {
        this.BIN_ITEM = BIN_ITEM;
    }

    public int getCONT_ID() {
        return CONT_ID;
    }

    public void setCONT_ID(int CONT_ID) {
        this.CONT_ID = CONT_ID;
    }

//    @Override
//    public String toString() {
//        return "ReqNoteDTO{" +
//                "REQ_NO='" + REQ_NO + '\'' +
//                ", REQ_DATE='" + REQ_DATE + '\'' +
//                ", REQ_BY='" + REQ_BY + '\'' +
//                ", MODEL_ID='" + MODEL_ID + '\'' +
//                ", MAT_ID='" + MAT_ID + '\'' +
//                ", MAT_DES='" + MAT_DES + '\'' +
//                ", MAT_UNIT='" + MAT_UNIT + '\'' +
//                ", MAT_QTY=" + MAT_QTY +
//                '}';
//    }

    @Override
    public String toString() {
        return "ReqNoteDTO{" +
                "REQ_NO=" + REQ_NO +
                ", REQ_DATE='" + REQ_DATE + '\'' +
                ", REQ_BY='" + REQ_BY + '\'' +
                ", MODEL_ID='" + MODEL_ID + '\'' +
                ", MAT_ID='" + MAT_ID + '\'' +
                ", MAT_DES='" + MAT_DES + '\'' +
                ", MAT_UNIT='" + MAT_UNIT + '\'' +
                ", MAT_QTY=" + MAT_QTY +
                ", BIN_ITEM='" + BIN_ITEM + '\'' +
                ", CONT_ID=" + CONT_ID +
                '}';
    }
}
