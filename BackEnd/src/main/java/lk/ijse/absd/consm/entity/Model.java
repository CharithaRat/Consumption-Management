package lk.ijse.absd.consm.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Model {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int MODEL_ID;

    private String MODEL_CODE;

    @ManyToOne
    private Xbom xbomM;

//    @OneToMany(mappedBy = "model")
//    private List<Budget> budgets = new ArrayList<>();

    private String MODEL_NAME;
    private String MODEL_CRE_DATE;
    private String MODEL_TYPE;

    public Model() {
    }

//    public Model(String MODEL_ID, List<Xbom> xboms, List<Budget> budgets, String MODEL_NAME, String MODEL_CRE_DATE, String MODEL_TYPE) {
//        this.MODEL_ID = MODEL_ID;
//        this.xboms = xboms;
//        this.budgets = budgets;
//        this.MODEL_NAME = MODEL_NAME;
//        this.MODEL_CRE_DATE = MODEL_CRE_DATE;
//        this.MODEL_TYPE = MODEL_TYPE;
//    }

    public Model(String MODEL_CODE, Xbom xbomM, String MODEL_NAME, String MODEL_CRE_DATE, String MODEL_TYPE) {
        this.MODEL_CODE = MODEL_CODE;
        this.xbomM = xbomM;
        this.MODEL_NAME = MODEL_NAME;
        this.MODEL_CRE_DATE = MODEL_CRE_DATE;
        this.MODEL_TYPE = MODEL_TYPE;
    }

    public Model(String MODEL_CODE, String MODEL_NAME, String MODEL_CRE_DATE, String MODEL_TYPE) {
        this.MODEL_CODE = MODEL_CODE;
        this.MODEL_NAME = MODEL_NAME;
        this.MODEL_CRE_DATE = MODEL_CRE_DATE;
        this.MODEL_TYPE = MODEL_TYPE;
    }

    public Model(int MODEL_ID, String MODEL_NAME, String MODEL_CRE_DATE, String MODEL_TYPE) {
        this.MODEL_ID = MODEL_ID;
        this.MODEL_NAME = MODEL_NAME;
        this.MODEL_CRE_DATE = MODEL_CRE_DATE;
        this.MODEL_TYPE = MODEL_TYPE;
    }

    public int getMODEL_ID() {
        return MODEL_ID;
    }

    public void setMODEL_ID(int MODEL_ID) {
        this.MODEL_ID = MODEL_ID;
    }

    public String getMODEL_NAME() {
        return MODEL_NAME;
    }

    public void setMODEL_NAME(String MODEL_NAME) {
        this.MODEL_NAME = MODEL_NAME;
    }

    public String getMODEL_CRE_DATE() {
        return MODEL_CRE_DATE;
    }

    public void setMODEL_CRE_DATE(String MODEL_CRE_DATE) {
        this.MODEL_CRE_DATE = MODEL_CRE_DATE;
    }

    public String getMODEL_TYPE() {
        return MODEL_TYPE;
    }

    public void setMODEL_TYPE(String MODEL_TYPE) {
        this.MODEL_TYPE = MODEL_TYPE;
    }

    public String getMODEL_CODE() {
        return MODEL_CODE;
    }

    public void setMODEL_CODE(String MODEL_CODE) {
        this.MODEL_CODE = MODEL_CODE;
    }

    public Xbom getXbomM() {
        return xbomM;
    }

    public void setXbomM(Xbom xbomM) {
        this.xbomM = xbomM;
    }
//    public List<Xbom> getXboms() {
//        return xboms;
//    }
//
//    public void setXboms(List<Xbom> xboms) {
//        this.xboms = xboms;
//    }

//    public List<Budget> getBudgets() {
//        return budgets;
//    }
//
//    public void setBudgets(List<Budget> budgets) {
//        this.budgets = budgets;
//    }

//    @Override
//    public String toString() {
//        return "Model{" +
//                "MODEL_ID='" + MODEL_ID + '\'' +
//                ", xboms=" + xboms +
//                ", budgets=" + budgets +
//                ", MODEL_NAME='" + MODEL_NAME + '\'' +
//                ", MODEL_CRE_DATE='" + MODEL_CRE_DATE + '\'' +
//                ", MODEL_TYPE='" + MODEL_TYPE + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Model{" +
                "MODEL_ID=" + MODEL_ID +
                ", MODEL_CODE='" + MODEL_CODE + '\'' +
                ", xbomM=" + xbomM +
                ", MODEL_NAME='" + MODEL_NAME + '\'' +
                ", MODEL_CRE_DATE='" + MODEL_CRE_DATE + '\'' +
                ", MODEL_TYPE='" + MODEL_TYPE + '\'' +
                '}';
    }
}
