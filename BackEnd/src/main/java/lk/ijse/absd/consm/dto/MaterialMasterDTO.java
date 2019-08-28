package lk.ijse.absd.consm.dto;

public class MaterialMasterDTO {
    private String MATERIAL_ID;
    private String MATERIAL_NAME;
    private String MATERIAL_TYPE;
    private String MATERIAL_UNIT;
    private double UNIT_PRICE;
    private String MAT_DATE;
    private String MATERIAL_CODE;

    public MaterialMasterDTO() {
    }

    public MaterialMasterDTO(String MATERIAL_ID, String MATERIAL_NAME, String MATERIAL_TYPE, String MATERIAL_UNIT, double UNIT_PRICE, String MAT_DATE, String MATERIAL_CODE) {
        this.MATERIAL_ID = MATERIAL_ID;
        this.MATERIAL_NAME = MATERIAL_NAME;
        this.MATERIAL_TYPE = MATERIAL_TYPE;
        this.MATERIAL_UNIT = MATERIAL_UNIT;
        this.UNIT_PRICE = UNIT_PRICE;
        this.MAT_DATE = MAT_DATE;
        this.MATERIAL_CODE = MATERIAL_CODE;
    }

    public String getMATERIAL_ID() {
        return MATERIAL_ID;
    }

    public void setMATERIAL_ID(String MATERIAL_ID) {
        this.MATERIAL_ID = MATERIAL_ID;
    }

    public String getMATERIAL_NAME() {
        return MATERIAL_NAME;
    }

    public void setMATERIAL_NAME(String MATERIAL_NAME) {
        this.MATERIAL_NAME = MATERIAL_NAME;
    }

    public String getMATERIAL_TYPE() {
        return MATERIAL_TYPE;
    }

    public void setMATERIAL_TYPE(String MATERIAL_TYPE) {
        this.MATERIAL_TYPE = MATERIAL_TYPE;
    }

    public String getMATERIAL_UNIT() {
        return MATERIAL_UNIT;
    }

    public void setMATERIAL_UNIT(String MATERIAL_UNIT) {
        this.MATERIAL_UNIT = MATERIAL_UNIT;
    }

    public double getUNIT_PRICE() {
        return UNIT_PRICE;
    }

    public void setUNIT_PRICE(double UNIT_PRICE) {
        this.UNIT_PRICE = UNIT_PRICE;
    }

    public String getMAT_DATE() {
        return MAT_DATE;
    }

    public void setMAT_DATE(String MAT_DATE) {
        this.MAT_DATE = MAT_DATE;
    }

    public String getMATERIAL_CODE() {
        return MATERIAL_CODE;
    }

    public void setMATERIAL_CODE(String MATERIAL_CODE) {
        this.MATERIAL_CODE = MATERIAL_CODE;
    }

    @Override
    public String toString() {
        return "MaterialMasterDTO{" +
                "MATERIAL_ID='" + MATERIAL_ID + '\'' +
                ", MATERIAL_NAME='" + MATERIAL_NAME + '\'' +
                ", MATERIAL_TYPE='" + MATERIAL_TYPE + '\'' +
                ", MATERIAL_UNIT='" + MATERIAL_UNIT + '\'' +
                ", UNIT_PRICE=" + UNIT_PRICE +
                ", MAT_DATE='" + MAT_DATE + '\'' +
                ", MATERIAL_CODE='" + MATERIAL_CODE + '\'' +
                '}';
    }
}
