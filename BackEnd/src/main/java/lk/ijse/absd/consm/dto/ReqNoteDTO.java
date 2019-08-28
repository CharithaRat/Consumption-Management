package lk.ijse.absd.consm.dto;

public class ReqNoteDTO {
    private String REQ_NO;
    private String REQ_DATE;
    private String REQ_BY;
    private String MODEL_ID;
    private String MAT_ID;
    private String MAT_DES;
    private String MAT_UNIT;
    private double MAT_QTY;

    public ReqNoteDTO() {
    }

    public ReqNoteDTO(String REQ_NO, String REQ_DATE, String REQ_BY, String MODEL_ID, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_QTY) {
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

    @Override
    public String toString() {
        return "ReqNoteDTO{" +
                "REQ_NO='" + REQ_NO + '\'' +
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
