package lk.ijse.absd.consm.dto;

public class GrnDTO {
    private String GRN_ID;
    private String GRN_DATE;
    private String SUP_ID;
    private String SUP_DES;
    private String MAT_ID;
    private String MAT_DES;
    private String MAT_UNIT;
    private double MAT_UNIT_PRICE;
    private double MAT_GRN_QTY;
    private double GRN_AMOUT;
    private double TTL_AMOUNT;

    public GrnDTO() {
    }

    public GrnDTO(String GRN_ID, String GRN_DATE, String SUP_ID, String SUP_DES, String MAT_ID, String MAT_DES, String MAT_UNIT, double MAT_UNIT_PRICE, double MAT_GRN_QTY, double GRN_AMOUT, double TTL_AMOUNT) {
        this.GRN_ID = GRN_ID;
        this.GRN_DATE = GRN_DATE;
        this.SUP_ID = SUP_ID;
        this.SUP_DES = SUP_DES;
        this.MAT_ID = MAT_ID;
        this.MAT_DES = MAT_DES;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_UNIT_PRICE = MAT_UNIT_PRICE;
        this.MAT_GRN_QTY = MAT_GRN_QTY;
        this.GRN_AMOUT = GRN_AMOUT;
        this.TTL_AMOUNT = TTL_AMOUNT;
    }

    public String getGRN_ID() {
        return GRN_ID;
    }

    public void setGRN_ID(String GRN_ID) {
        this.GRN_ID = GRN_ID;
    }

    public String getGRN_DATE() {
        return GRN_DATE;
    }

    public void setGRN_DATE(String GRN_DATE) {
        this.GRN_DATE = GRN_DATE;
    }

    public String getSUP_ID() {
        return SUP_ID;
    }

    public void setSUP_ID(String SUP_ID) {
        this.SUP_ID = SUP_ID;
    }

    public String getSUP_DES() {
        return SUP_DES;
    }

    public void setSUP_DES(String SUP_DES) {
        this.SUP_DES = SUP_DES;
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

    public double getMAT_UNIT_PRICE() {
        return MAT_UNIT_PRICE;
    }

    public void setMAT_UNIT_PRICE(double MAT_UNIT_PRICE) {
        this.MAT_UNIT_PRICE = MAT_UNIT_PRICE;
    }

    public double getMAT_GRN_QTY() {
        return MAT_GRN_QTY;
    }

    public void setMAT_GRN_QTY(double MAT_GRN_QTY) {
        this.MAT_GRN_QTY = MAT_GRN_QTY;
    }

    public double getGRN_AMOUT() {
        return GRN_AMOUT;
    }

    public void setGRN_AMOUT(double GRN_AMOUT) {
        this.GRN_AMOUT = GRN_AMOUT;
    }

    public double getTTL_AMOUNT() {
        return TTL_AMOUNT;
    }

    public void setTTL_AMOUNT(double TTL_AMOUNT) {
        this.TTL_AMOUNT = TTL_AMOUNT;
    }

    @Override
    public String toString() {
        return "GrnDTO{" +
                "GRN_ID='" + GRN_ID + '\'' +
                ", GRN_DATE='" + GRN_DATE + '\'' +
                ", SUP_ID='" + SUP_ID + '\'' +
                ", SUP_DES='" + SUP_DES + '\'' +
                ", MAT_ID='" + MAT_ID + '\'' +
                ", MAT_DES='" + MAT_DES + '\'' +
                ", MAT_UNIT='" + MAT_UNIT + '\'' +
                ", MAT_UNIT_PRICE=" + MAT_UNIT_PRICE +
                ", MAT_GRN_QTY=" + MAT_GRN_QTY +
                ", GRN_AMOUT=" + GRN_AMOUT +
                ", TTL_AMOUNT=" + TTL_AMOUNT +
                '}';
    }
}
