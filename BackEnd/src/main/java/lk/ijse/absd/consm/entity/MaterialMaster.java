package lk.ijse.absd.consm.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MaterialMaster {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int MATERIAL_ID;

    private String MAT_ID_CODE;

//    @ManyToMany(mappedBy = "materials")
//    private List<Supplier> suppliers = new ArrayList<>();
//
//    @ManyToMany(mappedBy = "materialMasters")
//    private List<Bom> boms = new ArrayList<>();
//
//    @ManyToMany(mappedBy = "mats")
//    private List<Grn> grns = new ArrayList<>();
//
    @ManyToOne
    private Unit unit;

    @ManyToOne
    private MainMaster mainm;

    @ManyToOne
    private SubMaster subm;

    @ManyToOne
    private DetailMaster detailm;

    @OneToMany(mappedBy = "materialMaster")
    private List<Bom> boms;

    private String MATERIAL_NAME;
    private String MATERIAL_TYPE;
    private String MATERIAL_GRADE;
    private String MATERIAL_UNIT;
    private double UNIT_PRICE;
    private String MAT_DATE;
    private String MATERIAL_CODE;

    public MaterialMaster() {
    }

    public MaterialMaster(String MAT_ID_CODE, Unit unit, MainMaster mainm, SubMaster subm, DetailMaster detailm, List<Bom> boms, String MATERIAL_NAME, String MATERIAL_TYPE, String MATERIAL_GRADE, String MATERIAL_UNIT,
                          double UNIT_PRICE, String MAT_DATE, String MATERIAL_CODE) {
        this.MAT_ID_CODE = MAT_ID_CODE;
        this.unit = unit;
        this.mainm = mainm;
        this.subm = subm;
        this.detailm = detailm;
        this.boms = boms;
        this.MATERIAL_NAME = MATERIAL_NAME;
        this.MATERIAL_TYPE = MATERIAL_TYPE;
        this.MATERIAL_GRADE = MATERIAL_GRADE;
        this.MATERIAL_UNIT = MATERIAL_UNIT;
        this.UNIT_PRICE = UNIT_PRICE;
        this.MAT_DATE = MAT_DATE;
        this.MATERIAL_CODE = MATERIAL_CODE;
    }

//    public MaterialMaster(String MATERIAL_ID, List<Supplier> suppliers, List<Bom> boms, List<Grn> grns, Unit unit, String MATERIAL_NAME, String MATERIAL_TYPE, String MATERIAL_UNIT, double UNIT_PRICE, String MAT_DATE, String MATERIAL_CODE) {
//        this.MATERIAL_ID = MATERIAL_ID;
//        this.suppliers = suppliers;
//        this.boms = boms;
//        this.grns = grns;
//        this.unit = unit;
//        this.MATERIAL_NAME = MATERIAL_NAME;
//        this.MATERIAL_TYPE = MATERIAL_TYPE;
//        this.MATERIAL_UNIT = MATERIAL_UNIT;
//        this.UNIT_PRICE = UNIT_PRICE;
//        this.MAT_DATE = MAT_DATE;
//        this.MATERIAL_CODE = MATERIAL_CODE;
//    }

    public MaterialMaster(String MAT_ID_CODE, String MATERIAL_NAME, String MATERIAL_TYPE, String MATERIAL_GRADE, String MATERIAL_UNIT, double UNIT_PRICE, String MAT_DATE, String MATERIAL_CODE) {
        this.MAT_ID_CODE = MAT_ID_CODE;
        this.MATERIAL_NAME = MATERIAL_NAME;
        this.MATERIAL_TYPE = MATERIAL_TYPE;
        this.MATERIAL_GRADE = MATERIAL_GRADE;
        this.MATERIAL_UNIT = MATERIAL_UNIT;
        this.UNIT_PRICE = UNIT_PRICE;
        this.MAT_DATE = MAT_DATE;
        this.MATERIAL_CODE = MATERIAL_CODE;
    }

    public MaterialMaster(int MATERIAL_ID, String MATERIAL_NAME, String MATERIAL_TYPE, String MATERIAL_UNIT, double UNIT_PRICE, String MAT_DATE, String MATERIAL_CODE) {
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

//    public List<Supplier> getSuppliers() {
//        return suppliers;
//    }
//
//    public void setSuppliers(List<Supplier> suppliers) {
//        this.suppliers = suppliers;
//    }
//
//    public List<Bom> getBoms() {
//        return boms;
//    }
//
//    public void setBoms(List<Bom> boms) {
//        this.boms = boms;
//    }
//
//    public List<Grn> getGrns() {
//        return grns;
//    }
//
//    public void setGrns(List<Grn> grns) {
//        this.grns = grns;
//    }
//
    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public MainMaster getMainm() {
        return mainm;
    }

    public void setMainm(MainMaster mainm) {
        this.mainm = mainm;
    }

    public SubMaster getSubm() {
        return subm;
    }

    public void setSubm(SubMaster subm) {
        this.subm = subm;
    }

    public DetailMaster getDetailm() {
        return detailm;
    }

    public void setDetailm(DetailMaster detailm) {
        this.detailm = detailm;
    }

    public List<Bom> getBoms() {
        return boms;
    }

    public void setBoms(List<Bom> boms) {
        this.boms = boms;
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
    //    @Override
//    public String toString() {
//        return "MaterialMaster{" +
//                "MATERIAL_ID='" + MATERIAL_ID + '\'' +
//                ", MATERIAL_NAME='" + MATERIAL_NAME + '\'' +
//                ", MATERIAL_TYPE='" + MATERIAL_TYPE + '\'' +
//                ", MATERIAL_UNIT='" + MATERIAL_UNIT + '\'' +
//                ", UNIT_PRICE=" + UNIT_PRICE +
//                ", MAT_DATE='" + MAT_DATE + '\'' +
//                ", MATERIAL_CODE='" + MATERIAL_CODE + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "MaterialMaster{" +
                "MATERIAL_ID=" + MATERIAL_ID +
                ", MAT_ID_CODE='" + MAT_ID_CODE + '\'' +
                ", unit=" + unit +
                ", mainm=" + mainm +
                ", subm=" + subm +
                ", detailm=" + detailm +
                ", boms=" + boms +
                ", MATERIAL_NAME='" + MATERIAL_NAME + '\'' +
                ", MATERIAL_TYPE='" + MATERIAL_TYPE + '\'' +
                ", MATERIAL_GRADE='" + MATERIAL_GRADE + '\'' +
                ", MATERIAL_UNIT='" + MATERIAL_UNIT + '\'' +
                ", UNIT_PRICE=" + UNIT_PRICE +
                ", MAT_DATE='" + MAT_DATE + '\'' +
                ", MATERIAL_CODE='" + MATERIAL_CODE + '\'' +
                '}';
    }
}
