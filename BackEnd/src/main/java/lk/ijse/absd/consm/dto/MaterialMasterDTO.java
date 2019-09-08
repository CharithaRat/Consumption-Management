package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lk.ijse.absd.consm.entity.DetailMaster;
import lk.ijse.absd.consm.entity.MainMaster;
import lk.ijse.absd.consm.entity.SubMaster;
import lk.ijse.absd.consm.entity.Unit;

import javax.xml.soap.Detail;

public class MaterialMasterDTO {
    @JsonProperty("materialId")
    private int MATERIAL_ID;
    @JsonProperty("materialIdCode")
    private String MAT_ID_CODE;
    @JsonProperty("materialName")
    private String MATERIAL_NAME;
    @JsonProperty("materialType")
    private String MATERIAL_TYPE;
    @JsonProperty("materialGrade")
    private String MATERIAL_GRADE;
    @JsonProperty("materialUnit")
    private String MATERIAL_UNIT;
    @JsonProperty("unitPrice")
    private double UNIT_PRICE;
    @JsonProperty("matDate")
    private String MAT_DATE;
    @JsonProperty("materialCode")
    private String MATERIAL_CODE;

    @JsonProperty("unit")
    private Unit unit;
    @JsonProperty("mainMaster")
    private MainMaster main;
    @JsonProperty("subMaster")
    private SubMaster sub;
    @JsonProperty("detailMaster")
    private DetailMaster details;

//    private String unit;
//    private String main;
//    private String sub;
//    private String detail;

    public MaterialMasterDTO() {
    }

//    public MaterialMasterDTO(int MATERIAL_ID, String MAT_ID_CODE, String MATERIAL_NAME, String MATERIAL_TYPE, String MATERIAL_GRADE, String MATERIAL_UNIT,
//                             double UNIT_PRICE, String MAT_DATE, String MATERIAL_CODE, String unit, String main, String sub, String detail) {
//        this.MATERIAL_ID = MATERIAL_ID;
//        this.MAT_ID_CODE = MAT_ID_CODE;
//        this.MATERIAL_NAME = MATERIAL_NAME;
//        this.MATERIAL_TYPE = MATERIAL_TYPE;
//        this.MATERIAL_GRADE = MATERIAL_GRADE;
//        this.MATERIAL_UNIT = MATERIAL_UNIT;
//        this.UNIT_PRICE = UNIT_PRICE;
//        this.MAT_DATE = MAT_DATE;
//        this.MATERIAL_CODE = MATERIAL_CODE;
//        this.unit = unit;
//        this.main = main;
//        this.sub = sub;
//        this.detail = detail;
//    }

    public MaterialMasterDTO(int MATERIAL_ID, String MAT_ID_CODE, String MATERIAL_NAME, String MATERIAL_TYPE, String MATERIAL_GRADE, String MATERIAL_UNIT, double UNIT_PRICE, String MAT_DATE, String MATERIAL_CODE,
                             Unit unit, MainMaster main, SubMaster sub, DetailMaster detail) {
        this.MATERIAL_ID = MATERIAL_ID;
        this.MAT_ID_CODE = MAT_ID_CODE;
        this.MATERIAL_NAME = MATERIAL_NAME;
        this.MATERIAL_TYPE = MATERIAL_TYPE;
        this.MATERIAL_GRADE = MATERIAL_GRADE;
        this.MATERIAL_UNIT = MATERIAL_UNIT;
        this.UNIT_PRICE = UNIT_PRICE;
        this.MAT_DATE = MAT_DATE;
        this.MATERIAL_CODE = MATERIAL_CODE;
        this.unit = unit;
        this.main = main;
        this.sub = sub;
        this.details = detail;
    }

    public MaterialMasterDTO(int MATERIAL_ID, String MAT_ID_CODE, String MATERIAL_NAME, String MATERIAL_TYPE, String MATERIAL_GRADE, String MATERIAL_UNIT,
                             double UNIT_PRICE, String MAT_DATE, String MATERIAL_CODE) {
        this.MATERIAL_ID = MATERIAL_ID;
        this.MAT_ID_CODE = MAT_ID_CODE;
        this.MATERIAL_NAME = MATERIAL_NAME;
        this.MATERIAL_TYPE = MATERIAL_TYPE;
        this.MATERIAL_GRADE = MATERIAL_GRADE;
        this.MATERIAL_UNIT = MATERIAL_UNIT;
        this.UNIT_PRICE = UNIT_PRICE;
        this.MAT_DATE = MAT_DATE;
        this.MATERIAL_CODE = MATERIAL_CODE;
    }

    public MaterialMasterDTO(int MATERIAL_ID, String MATERIAL_NAME, String MATERIAL_TYPE, String MATERIAL_UNIT,
                             double UNIT_PRICE, String MAT_DATE, String MATERIAL_CODE) {
        this.MATERIAL_ID = MATERIAL_ID;
        this.MATERIAL_NAME = MATERIAL_NAME;
        this.MATERIAL_TYPE = MATERIAL_TYPE;
        this.MATERIAL_UNIT = MATERIAL_UNIT;
        this.UNIT_PRICE = UNIT_PRICE;
        this.MAT_DATE = MAT_DATE;
        this.MATERIAL_CODE = MATERIAL_CODE;
    }

    public int getMATERIAL_ID() {
        return MATERIAL_ID;
    }

    public void setMATERIAL_ID(int MATERIAL_ID) {
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

    public String getMAT_ID_CODE() {
        return MAT_ID_CODE;
    }

    public void setMAT_ID_CODE(String MAT_ID_CODE) {
        this.MAT_ID_CODE = MAT_ID_CODE;
    }

    public String getMATERIAL_GRADE() {
        return MATERIAL_GRADE;
    }

    public void setMATERIAL_GRADE(String MATERIAL_GRADE) {
        this.MATERIAL_GRADE = MATERIAL_GRADE;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public MainMaster getMain() {
        return main;
    }

    public void setMain(MainMaster main) {
        this.main = main;
    }

    public SubMaster getSub() {
        return sub;
    }

    public void setSub(SubMaster sub) {
        this.sub = sub;
    }

//    public DetailMaster getDetail() {
//        return details;
//    }
//
//    public void setDetail(DetailMaster detail) {
//        this.details = detail;
//    }

    public DetailMaster getDetails() {
        return details;
    }

    public void setDetails(DetailMaster details) {
        this.details = details;
    }
//    public String getUnit() {
//        return unit;
//    }
//
//    public void setUnit(String unit) {
//        this.unit = unit;
//    }
//
//    public String getMain() {
//        return main;
//    }
//
//    public void setMain(String main) {
//        this.main = main;
//    }
//
//    public String getSub() {
//        return sub;
//    }
//
//    public void setSub(String sub) {
//        this.sub = sub;
//    }
//
//    public String getDetail() {
//        return detail;
//    }
//
//    public void setDetail(String detail) {
//        this.detail = detail;
//    }

    //    @Override
//    public String toString() {
//        return "MaterialMasterDTO{" +
//                "MATERIAL_ID='" + MATERIAL_ID + '\'' +
//                ", MATERIAL_NAME='" + MATERIAL_NAME + '\'' +
//                ", MATERIAL_TYPE='" + MATERIAL_TYPE + '\'' +
//                ", MATERIAL_UNIT='" + MATERIAL_UNIT + '\'' +
//                ", UNIT_PRICE=" + UNIT_PRICE +
//                ", MAT_DATE='" + MAT_DATE + '\'' +
//                ", MATERIAL_CODE='" + MATERIAL_CODE + '\'' +
//                '}';
//    }

//    @Override
//    public String toString() {
//        return "MaterialMasterDTO{" +
//                "MATERIAL_ID=" + MATERIAL_ID +
//                ", MAT_ID_CODE='" + MAT_ID_CODE + '\'' +
//                ", MATERIAL_NAME='" + MATERIAL_NAME + '\'' +
//                ", MATERIAL_TYPE='" + MATERIAL_TYPE + '\'' +
//                ", MATERIAL_GRADE='" + MATERIAL_GRADE + '\'' +
//                ", MATERIAL_UNIT='" + MATERIAL_UNIT + '\'' +
//                ", UNIT_PRICE=" + UNIT_PRICE +
//                ", MAT_DATE='" + MAT_DATE + '\'' +
//                ", MATERIAL_CODE='" + MATERIAL_CODE + '\'' +
//                '}';
//    }

//    @Override
//    public String toString() {
//        return "MaterialMasterDTO{" +
//                "MATERIAL_ID=" + MATERIAL_ID +
//                ", MAT_ID_CODE='" + MAT_ID_CODE + '\'' +
//                ", MATERIAL_NAME='" + MATERIAL_NAME + '\'' +
//                ", MATERIAL_TYPE='" + MATERIAL_TYPE + '\'' +
//                ", MATERIAL_GRADE='" + MATERIAL_GRADE + '\'' +
//                ", MATERIAL_UNIT='" + MATERIAL_UNIT + '\'' +
//                ", UNIT_PRICE=" + UNIT_PRICE +
//                ", MAT_DATE='" + MAT_DATE + '\'' +
//                ", MATERIAL_CODE='" + MATERIAL_CODE + '\'' +
//                ", unit=" + unit +
//                ", main=" + main +
//                ", sub=" + sub +
//                ", detail=" + detail +
//                '}';
//    }

    @Override
    public String toString() {
        return "MaterialMasterDTO{" +
                "MATERIAL_ID=" + MATERIAL_ID +
                ", MAT_ID_CODE='" + MAT_ID_CODE + '\'' +
                ", MATERIAL_NAME='" + MATERIAL_NAME + '\'' +
                ", MATERIAL_TYPE='" + MATERIAL_TYPE + '\'' +
                ", MATERIAL_GRADE='" + MATERIAL_GRADE + '\'' +
                ", MATERIAL_UNIT='" + MATERIAL_UNIT + '\'' +
                ", UNIT_PRICE=" + UNIT_PRICE +
                ", MAT_DATE='" + MAT_DATE + '\'' +
                ", MATERIAL_CODE='" + MATERIAL_CODE + '\'' +
                ", unit=" + unit +
                ", main=" + main +
                ", sub=" + sub +
                ", details=" + details +
                '}';
    }
}
