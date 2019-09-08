package lk.ijse.absd.consm.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Xbom implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int XBOM_ID;

    private String XBOM_CODE;

    @ManyToOne
    private Bom bom;

    @OneToMany(mappedBy = "xbom")
    private List<Budget> budgets = new ArrayList<>();

    @OneToMany(mappedBy = "xbomM")
    private List<Model> models = new ArrayList<>();

    private String BOM_ID;
    private String BOM_TYPE;
    private String MODEL_ID;
    private double BOM_COST;
    private String XBOM_GUR_PER;

    public Xbom() {
    }

//    public Xbom(int XBOM_ID, List<Bom> boms, List<Budget> budgets, Model model, String BOM_ID, String BOM_TYPE, String MODEL_ID, double BOM_COST, String XBOM_GUR_PER) {
//        this.XBOM_ID = XBOM_ID;
//        this.boms = boms;
//        this.budgets = budgets;
//        this.model = model;
//        this.BOM_ID = BOM_ID;
//        this.BOM_TYPE = BOM_TYPE;
//        this.MODEL_ID = MODEL_ID;
//        this.BOM_COST = BOM_COST;
//        this.XBOM_GUR_PER = XBOM_GUR_PER;
//    }

    public Xbom(String XBOM_CODE, Bom bom, List<Budget> budgets, List<Model> models, String BOM_ID, String BOM_TYPE, String MODEL_ID, double BOM_COST, String XBOM_GUR_PER) {
        this.XBOM_CODE = XBOM_CODE;
        this.bom = bom;
        this.budgets = budgets;
        this.models = models;
        this.BOM_ID = BOM_ID;
        this.BOM_TYPE = BOM_TYPE;
        this.MODEL_ID = MODEL_ID;
        this.BOM_COST = BOM_COST;
        this.XBOM_GUR_PER = XBOM_GUR_PER;
    }

    public Xbom(String XBOM_CODE, String BOM_ID, String BOM_TYPE, String MODEL_ID, double BOM_COST, String XBOM_GUR_PER) {
        this.XBOM_CODE = XBOM_CODE;
        this.BOM_ID = BOM_ID;
        this.BOM_TYPE = BOM_TYPE;
        this.MODEL_ID = MODEL_ID;
        this.BOM_COST = BOM_COST;
        this.XBOM_GUR_PER = XBOM_GUR_PER;
    }

    public Xbom(int XBOM_ID, String BOM_ID, String BOM_TYPE, String MODEL_ID, double BOM_COST, String XBOM_GUR_PER) {
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

//    public List<Bom> getBoms() {
//        return boms;
//    }
//
//    public void setBoms(List<Bom> boms) {
//        this.boms = boms;
//    }

    public List<Budget> getBudgets() {
        return budgets;
    }

    public void setBudgets(List<Budget> budgets) {
        this.budgets = budgets;
    }

    public String getXBOM_CODE() {
        return XBOM_CODE;
    }

    public void setXBOM_CODE(String XBOM_CODE) {
        this.XBOM_CODE = XBOM_CODE;
    }

    public Bom getBom() {
        return bom;
    }

    public void setBom(Bom bom) {
        this.bom = bom;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

//    @Override
//    public String toString() {
//        return "Xbom{" +
//                "XBOM_ID='" + XBOM_ID + '\'' +
//                ", boms=" + boms +
//                ", budgets=" + budgets +
//                ", model=" + model +
//                ", BOM_ID='" + BOM_ID + '\'' +
//                ", BOM_TYPE='" + BOM_TYPE + '\'' +
//                ", MODEL_ID='" + MODEL_ID + '\'' +
//                ", BOM_COST=" + BOM_COST +
//                ", XBOM_GUR_PER='" + XBOM_GUR_PER + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Xbom{" +
                "XBOM_ID=" + XBOM_ID +
                ", XBOM_CODE='" + XBOM_CODE + '\'' +
                ", bom=" + bom +
                ", budgets=" + budgets +
                ", models=" + models +
                ", BOM_ID='" + BOM_ID + '\'' +
                ", BOM_TYPE='" + BOM_TYPE + '\'' +
                ", MODEL_ID='" + MODEL_ID + '\'' +
                ", BOM_COST=" + BOM_COST +
                ", XBOM_GUR_PER='" + XBOM_GUR_PER + '\'' +
                '}';
    }
}
