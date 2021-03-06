package lk.ijse.absd.consm.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int BUDGET_ID;

    private String BUDGET_CODE;

    @OneToOne
    private BomAssigned assDtl;

    @ManyToOne
    private Xbom xbom;

//    @ManyToOne
//    private Model model;

    private String BOM_ID;
    private String MODEL_ID;
    private String XBOM_ID;
    private String BOM_TYPE;
    private String BOM_USAGE;
    private double LENGTH;
    private double WIDTH;
    private double HEIGHT;
    private double BOM_COST;
    private double NO_OF_BOM_UNITS;
    private double REQ_AREA;
    private double COV_AREA_BY_CMT;
    private double ACT_COST;
    private String BUD_DATE;
    private double TTL_BUDGET_COST;

    public Budget() {
    }

//    public Budget(int BUDGET_ID, List<BomAssigned> bomAssigneds, Xbom xbom, Model model, String BOM_ID, String MODEL_ID, String XBOM_ID, String BOM_TYPE, String BOM_USAGE, double LENGTH, double WIDTH, double HEIGHT, double BOM_COST, double NO_OF_BOM_UNITS, double REQ_AREA, double COV_AREA_BY_CMT, double ACT_COST, String BUD_DATE, double TTL_BUDGET_COST) {
//        this.BUDGET_ID = BUDGET_ID;
//        this.bomAssigneds = bomAssigneds;
//        this.xbom = xbom;
//        this.model = model;
//        this.BOM_ID = BOM_ID;
//        this.MODEL_ID = MODEL_ID;
//        this.XBOM_ID = XBOM_ID;
//        this.BOM_TYPE = BOM_TYPE;
//        this.BOM_USAGE = BOM_USAGE;
//        this.LENGTH = LENGTH;
//        this.WIDTH = WIDTH;
//        this.HEIGHT = HEIGHT;
//        this.BOM_COST = BOM_COST;
//        this.NO_OF_BOM_UNITS = NO_OF_BOM_UNITS;
//        this.REQ_AREA = REQ_AREA;
//        this.COV_AREA_BY_CMT = COV_AREA_BY_CMT;
//        this.ACT_COST = ACT_COST;
//        this.BUD_DATE = BUD_DATE;
//        this.TTL_BUDGET_COST = TTL_BUDGET_COST;
//    }


    public Budget(String BUDGET_CODE, BomAssigned assDtl, Xbom xbom, String BOM_ID, String MODEL_ID, String XBOM_ID, String BOM_TYPE, String BOM_USAGE, double LENGTH, double WIDTH, double HEIGHT, double BOM_COST, double NO_OF_BOM_UNITS, double REQ_AREA,
                  double COV_AREA_BY_CMT, double ACT_COST, String BUD_DATE, double TTL_BUDGET_COST) {
        this.BUDGET_CODE = BUDGET_CODE;
        this.assDtl = assDtl;
        this.xbom = xbom;
        this.BOM_ID = BOM_ID;
        this.MODEL_ID = MODEL_ID;
        this.XBOM_ID = XBOM_ID;
        this.BOM_TYPE = BOM_TYPE;
        this.BOM_USAGE = BOM_USAGE;
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.BOM_COST = BOM_COST;
        this.NO_OF_BOM_UNITS = NO_OF_BOM_UNITS;
        this.REQ_AREA = REQ_AREA;
        this.COV_AREA_BY_CMT = COV_AREA_BY_CMT;
        this.ACT_COST = ACT_COST;
        this.BUD_DATE = BUD_DATE;
        this.TTL_BUDGET_COST = TTL_BUDGET_COST;
    }

    public Budget(String BUDGET_CODE, String BOM_ID, String MODEL_ID, String XBOM_ID, String BOM_TYPE, String BOM_USAGE, double LENGTH, double WIDTH, double HEIGHT, double BOM_COST, double NO_OF_BOM_UNITS, double REQ_AREA, double COV_AREA_BY_CMT, double ACT_COST, String BUD_DATE, double TTL_BUDGET_COST) {
        this.BUDGET_CODE = BUDGET_CODE;
        this.BOM_ID = BOM_ID;
        this.MODEL_ID = MODEL_ID;
        this.XBOM_ID = XBOM_ID;
        this.BOM_TYPE = BOM_TYPE;
        this.BOM_USAGE = BOM_USAGE;
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.BOM_COST = BOM_COST;
        this.NO_OF_BOM_UNITS = NO_OF_BOM_UNITS;
        this.REQ_AREA = REQ_AREA;
        this.COV_AREA_BY_CMT = COV_AREA_BY_CMT;
        this.ACT_COST = ACT_COST;
        this.BUD_DATE = BUD_DATE;
        this.TTL_BUDGET_COST = TTL_BUDGET_COST;
    }

    public Budget(int BUDGET_ID, String BOM_ID, String MODEL_ID, String XBOM_ID, String BOM_TYPE, String BOM_USAGE, double LENGTH, double WIDTH, double HEIGHT, double BOM_COST, double NO_OF_BOM_UNITS, double REQ_AREA, double COV_AREA_BY_CMT, double ACT_COST, String BUD_DATE, double TTL_BUDGET_COST) {
        this.BUDGET_ID = BUDGET_ID;
        this.BOM_ID = BOM_ID;
        this.MODEL_ID = MODEL_ID;
        this.XBOM_ID = XBOM_ID;
        this.BOM_TYPE = BOM_TYPE;
        this.BOM_USAGE = BOM_USAGE;
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.BOM_COST = BOM_COST;
        this.NO_OF_BOM_UNITS = NO_OF_BOM_UNITS;
        this.REQ_AREA = REQ_AREA;
        this.COV_AREA_BY_CMT = COV_AREA_BY_CMT;
        this.ACT_COST = ACT_COST;
        this.BUD_DATE = BUD_DATE;
        this.TTL_BUDGET_COST = TTL_BUDGET_COST;
    }

    public int getBUDGET_ID() {
        return BUDGET_ID;
    }

    public void setBUDGET_ID(int BUDGET_ID) {
        this.BUDGET_ID = BUDGET_ID;
    }

    public String getBOM_ID() {
        return BOM_ID;
    }

    public void setBOM_ID(String BOM_ID) {
        this.BOM_ID = BOM_ID;
    }

    public String getMODEL_ID() {
        return MODEL_ID;
    }

    public void setMODEL_ID(String MODEL_ID) {
        this.MODEL_ID = MODEL_ID;
    }

    public String getXBOM_ID() {
        return XBOM_ID;
    }

    public void setXBOM_ID(String XBOM_ID) {
        this.XBOM_ID = XBOM_ID;
    }

    public String getBOM_TYPE() {
        return BOM_TYPE;
    }

    public void setBOM_TYPE(String BOM_TYPE) {
        this.BOM_TYPE = BOM_TYPE;
    }

    public String getBOM_USAGE() {
        return BOM_USAGE;
    }

    public void setBOM_USAGE(String BOM_USAGE) {
        this.BOM_USAGE = BOM_USAGE;
    }

    public double getLENGTH() {
        return LENGTH;
    }

    public void setLENGTH(double LENGTH) {
        this.LENGTH = LENGTH;
    }

    public double getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(double WIDTH) {
        this.WIDTH = WIDTH;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public double getBOM_COST() {
        return BOM_COST;
    }

    public void setBOM_COST(double BOM_COST) {
        this.BOM_COST = BOM_COST;
    }

    public double getNO_OF_BOM_UNITS() {
        return NO_OF_BOM_UNITS;
    }

    public void setNO_OF_BOM_UNITS(double NO_OF_BOM_UNITS) {
        this.NO_OF_BOM_UNITS = NO_OF_BOM_UNITS;
    }

    public double getREQ_AREA() {
        return REQ_AREA;
    }

    public void setREQ_AREA(double REQ_AREA) {
        this.REQ_AREA = REQ_AREA;
    }

    public double getCOV_AREA_BY_CMT() {
        return COV_AREA_BY_CMT;
    }

    public void setCOV_AREA_BY_CMT(double COV_AREA_BY_CMT) {
        this.COV_AREA_BY_CMT = COV_AREA_BY_CMT;
    }

    public double getACT_COST() {
        return ACT_COST;
    }

    public void setACT_COST(double ACT_COST) {
        this.ACT_COST = ACT_COST;
    }

    public String getBUD_DATE() {
        return BUD_DATE;
    }

    public void setBUD_DATE(String BUD_DATE) {
        this.BUD_DATE = BUD_DATE;
    }

    public double getTTL_BUDGET_COST() {
        return TTL_BUDGET_COST;
    }

    public void setTTL_BUDGET_COST(double TTL_BUDGET_COST) {
        this.TTL_BUDGET_COST = TTL_BUDGET_COST;
    }

//    public List<BomAssigned> getBomAssigneds() {
//        return bomAssigneds;
//    }
//
//    public void setBomAssigneds(List<BomAssigned> bomAssigneds) {
//        this.bomAssigneds = bomAssigneds;
//    }

    public Xbom getXbom() {
        return xbom;
    }

    public void setXbom(Xbom xbom) {
        this.xbom = xbom;
    }

//    public Model getModel() {
//        return model;
//    }
//
//    public void setModel(Model model) {
//        this.model = model;
//    }

    public BomAssigned getAssDtl() {
        return assDtl;
    }

    public void setAssDtl(BomAssigned assDtl) {
        this.assDtl = assDtl;
    }

    public String getBUDGET_CODE() {
        return BUDGET_CODE;
    }

    public void setBUDGET_CODE(String BUDGET_CODE) {
        this.BUDGET_CODE = BUDGET_CODE;
    }
//    @Override
//    public String toString() {
//        return "Budget{" +
//                "BUDGET_ID='" + BUDGET_ID + '\'' +
//                ", bomAssigneds=" + bomAssigneds +
//                ", xbom=" + xbom +
//                ", model=" + model +
//                ", BOM_ID='" + BOM_ID + '\'' +
//                ", MODEL_ID='" + MODEL_ID + '\'' +
//                ", XBOM_ID='" + XBOM_ID + '\'' +
//                ", BOM_TYPE='" + BOM_TYPE + '\'' +
//                ", BOM_USAGE='" + BOM_USAGE + '\'' +
//                ", LENGTH=" + LENGTH +
//                ", WIDTH=" + WIDTH +
//                ", HEIGHT=" + HEIGHT +
//                ", BOM_COST=" + BOM_COST +
//                ", NO_OF_BOM_UNITS=" + NO_OF_BOM_UNITS +
//                ", REQ_AREA=" + REQ_AREA +
//                ", COV_AREA_BY_CMT=" + COV_AREA_BY_CMT +
//                ", ACT_COST=" + ACT_COST +
//                ", BUD_DATE='" + BUD_DATE + '\'' +
//                ", TTL_BUDGET_COST=" + TTL_BUDGET_COST +
//                '}';
//    }

    @Override
    public String toString() {
        return "Budget{" +
                "BUDGET_ID=" + BUDGET_ID +
                ", BUDGET_CODE='" + BUDGET_CODE + '\'' +
                ", assDtl=" + assDtl +
                ", xbom=" + xbom +
                ", BOM_ID='" + BOM_ID + '\'' +
                ", MODEL_ID='" + MODEL_ID + '\'' +
                ", XBOM_ID='" + XBOM_ID + '\'' +
                ", BOM_TYPE='" + BOM_TYPE + '\'' +
                ", BOM_USAGE='" + BOM_USAGE + '\'' +
                ", LENGTH=" + LENGTH +
                ", WIDTH=" + WIDTH +
                ", HEIGHT=" + HEIGHT +
                ", BOM_COST=" + BOM_COST +
                ", NO_OF_BOM_UNITS=" + NO_OF_BOM_UNITS +
                ", REQ_AREA=" + REQ_AREA +
                ", COV_AREA_BY_CMT=" + COV_AREA_BY_CMT +
                ", ACT_COST=" + ACT_COST +
                ", BUD_DATE='" + BUD_DATE + '\'' +
                ", TTL_BUDGET_COST=" + TTL_BUDGET_COST +
                '}';
    }
}
