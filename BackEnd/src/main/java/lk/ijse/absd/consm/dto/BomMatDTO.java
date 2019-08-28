package lk.ijse.absd.consm.dto;

public class BomMatDTO {
    private String BOM_ID;
    private String MAT_ID;
    private String MAT_NAME;
    private String MAT_UNIT;
    private double MAT_QTY;
    private double MAT_UNIT_COST;
    private double MAT_TTL_AMOUNT;

    public BomMatDTO() {
    }

    public BomMatDTO(String BOM_ID, String MAT_ID, String MAT_NAME, String MAT_UNIT, double MAT_QTY, double MAT_UNIT_COST, double MAT_TTL_AMOUNT) {
        this.BOM_ID = BOM_ID;
        this.MAT_ID = MAT_ID;
        this.MAT_NAME = MAT_NAME;
        this.MAT_UNIT = MAT_UNIT;
        this.MAT_QTY = MAT_QTY;
        this.MAT_UNIT_COST = MAT_UNIT_COST;
        this.MAT_TTL_AMOUNT = MAT_TTL_AMOUNT;
    }

    public String getBOM_ID() {
        return BOM_ID;
    }

    public void setBOM_ID(String BOM_ID) {
        this.BOM_ID = BOM_ID;
    }

    public String getMAT_ID() {
        return MAT_ID;
    }

    public void setMAT_ID(String MAT_ID) {
        this.MAT_ID = MAT_ID;
    }

    public String getMAT_NAME() {
        return MAT_NAME;
    }

    public void setMAT_NAME(String MAT_NAME) {
        this.MAT_NAME = MAT_NAME;
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

    public double getMAT_UNIT_COST() {
        return MAT_UNIT_COST;
    }

    public void setMAT_UNIT_COST(double MAT_UNIT_COST) {
        this.MAT_UNIT_COST = MAT_UNIT_COST;
    }

    public double getMAT_TTL_AMOUNT() {
        return MAT_TTL_AMOUNT;
    }

    public void setMAT_TTL_AMOUNT(double MAT_TTL_AMOUNT) {
        this.MAT_TTL_AMOUNT = MAT_TTL_AMOUNT;
    }

    @Override
    public String toString() {
        return "BomMatDTO{" +
                "BOM_ID='" + BOM_ID + '\'' +
                ", MAT_ID='" + MAT_ID + '\'' +
                ", MAT_NAME='" + MAT_NAME + '\'' +
                ", MAT_UNIT='" + MAT_UNIT + '\'' +
                ", MAT_QTY=" + MAT_QTY +
                ", MAT_UNIT_COST=" + MAT_UNIT_COST +
                ", MAT_TTL_AMOUNT=" + MAT_TTL_AMOUNT +
                '}';
    }
}
