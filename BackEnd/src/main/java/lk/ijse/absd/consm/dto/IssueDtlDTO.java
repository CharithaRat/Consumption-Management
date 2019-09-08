package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueDtlDTO {
    @JsonProperty("isuNoteNo")
    private int ISU_NOTE_NO;
    @JsonProperty("isuDate")
    private String ISU_DATE;
    @JsonProperty("isuBy")
    private String ISU_BY;
    @JsonProperty("reqBy")
    private String REQ_BY;
    @JsonProperty("reqId")
    private String REQ_ID;
    @JsonProperty("reqDate")
    private String REQ_DATE;
    @JsonProperty("matId")
    private String MAT_ID;
    @JsonProperty("matDes")
    private String MAT_DES;
    @JsonProperty("matUnit")
    private String MAT_UNIT;
    @JsonProperty("matReqQty")
    private double MAT_REQ_QTY;
    @JsonProperty("matIsuQty")
    private double MAT_ISU_QTY;
    @JsonProperty("matSerNo")
    private String MAT_SER_NO;

    @JsonProperty("binItem")
    private String BIN_ITEM;
    @JsonProperty("contId")
    private int CONT_ID;

    public IssueDtlDTO() {
    }

    public IssueDtlDTO(int ISU_NOTE_NO, String ISU_DATE, String ISU_BY, String REQ_BY, String REQ_ID, String REQ_DATE, String MAT_ID, String MAT_DES,
                       String MAT_UNIT, double MAT_REQ_QTY, double MAT_ISU_QTY, String MAT_SER_NO, String BIN_ITEM, int CONT_ID) {
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
        this.BIN_ITEM = BIN_ITEM;
        this.CONT_ID = CONT_ID;
    }

    public IssueDtlDTO(int ISU_NOTE_NO, String ISU_DATE, String ISU_BY, String REQ_BY, String REQ_ID, String REQ_DATE, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_REQ_QTY, double MAT_ISU_QTY, String MAT_SER_NO) {
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

    public int getISU_NOTE_NO() {
        return ISU_NOTE_NO;
    }

    public void setISU_NOTE_NO(int ISU_NOTE_NO) {
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
//        return "IssueDtlDTO{" +
//                "ISU_NOTE_NO='" + ISU_NOTE_NO + '\'' +
//                ", ISU_DATE='" + ISU_DATE + '\'' +
//                ", ISU_BY='" + ISU_BY + '\'' +
//                ", REQ_BY='" + REQ_BY + '\'' +
//                ", REQ_ID='" + REQ_ID + '\'' +
//                ", REQ_DATE='" + REQ_DATE + '\'' +
//                ", MAT_ID='" + MAT_ID + '\'' +
//                ", MAT_DES='" + MAT_DES + '\'' +
//                ", MAT_UNIT='" + MAT_UNIT + '\'' +
//                ", MAT_REQ_QTY=" + MAT_REQ_QTY +
//                ", MAT_ISU_QTY=" + MAT_ISU_QTY +
//                ", MAT_SER_NO='" + MAT_SER_NO + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "IssueDtlDTO{" +
                "ISU_NOTE_NO=" + ISU_NOTE_NO +
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
                ", BIN_ITEM='" + BIN_ITEM + '\'' +
                ", CONT_ID=" + CONT_ID +
                '}';
    }
}
