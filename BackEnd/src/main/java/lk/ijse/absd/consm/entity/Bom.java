package lk.ijse.absd.consm.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bom {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int BOM_ID;

    private String BOM_CODE;

    @ManyToOne
    private MaterialMaster materialMaster;

    @OneToMany(mappedBy = "bom")
    private List<Xbom> xboms = new ArrayList<>();

    @OneToMany(mappedBy = "bomA")
    private List<BomAssigned> bomAssigneds = new ArrayList<>();

    private String BOM_DES;
    private String BOM_TYPE;
    private String BOM_UNIT;
    private String BOM_DATE;
    private double BOM_VALUE;
    private String BOM_GUR_PER;

    public Bom() {
    }

    public Bom(String BOM_CODE, MaterialMaster materialMaster, List<Xbom> xboms, List<BomAssigned> bomAssigneds,
               String BOM_DES, String BOM_TYPE, String BOM_UNIT, String BOM_DATE, double BOM_VALUE, String BOM_GUR_PER) {
        this.BOM_CODE = BOM_CODE;
        this.materialMaster = materialMaster;
        this.xboms = xboms;
        this.bomAssigneds = bomAssigneds;
        this.BOM_DES = BOM_DES;
        this.BOM_TYPE = BOM_TYPE;
        this.BOM_UNIT = BOM_UNIT;
        this.BOM_DATE = BOM_DATE;
        this.BOM_VALUE = BOM_VALUE;
        this.BOM_GUR_PER = BOM_GUR_PER;
    }
//    public Bom(String BOM_ID, List<MaterialMaster> materialMasters, List<Xbom> xboms, List<BomAssigned> bomAssigneds, String BOM_DES, String BOM_TYPE, String BOM_UNIT, String BOM_DATE, double BOM_VALUE, String BOM_GUR_PER) {
//        this.BOM_ID = BOM_ID;
//        this.materialMasters = materialMasters;
//        this.xboms = xboms;
//        this.bomAssigneds = bomAssigneds;
//        this.BOM_DES = BOM_DES;
//        this.BOM_TYPE = BOM_TYPE;
//        this.BOM_UNIT = BOM_UNIT;
//        this.BOM_DATE = BOM_DATE;
//        this.BOM_VALUE = BOM_VALUE;
//        this.BOM_GUR_PER = BOM_GUR_PER;
//    }

    public Bom(String BOM_CODE, String BOM_DES, String BOM_TYPE, String BOM_UNIT, String BOM_DATE, double BOM_VALUE, String BOM_GUR_PER) {
        this.BOM_ID = BOM_ID;
        this.BOM_CODE = BOM_CODE;
        this.BOM_DES = BOM_DES;
        this.BOM_TYPE = BOM_TYPE;
        this.BOM_UNIT = BOM_UNIT;
        this.BOM_DATE = BOM_DATE;
        this.BOM_VALUE = BOM_VALUE;
        this.BOM_GUR_PER = BOM_GUR_PER;
    }

    public Bom(int BOM_ID, String BOM_DES, String BOM_TYPE, String BOM_UNIT, String BOM_DATE, double BOM_VALUE, String BOM_GUR_PER) {
        this.BOM_ID = BOM_ID;
        this.BOM_DES = BOM_DES;
        this.BOM_TYPE = BOM_TYPE;
        this.BOM_UNIT = BOM_UNIT;
        this.BOM_DATE = BOM_DATE;
        this.BOM_VALUE = BOM_VALUE;
        this.BOM_GUR_PER = BOM_GUR_PER;
    }

    public int getBOM_ID() {
        return BOM_ID;
    }

    public void setBOM_ID(int BOM_ID) {
        this.BOM_ID = BOM_ID;
    }

    public String getBOM_DES() {
        return BOM_DES;
    }

    public void setBOM_DES(String BOM_DES) {
        this.BOM_DES = BOM_DES;
    }

    public String getBOM_TYPE() {
        return BOM_TYPE;
    }

    public void setBOM_TYPE(String BOM_TYPE) {
        this.BOM_TYPE = BOM_TYPE;
    }

    public String getBOM_UNIT() {
        return BOM_UNIT;
    }

    public void setBOM_UNIT(String BOM_UNIT) {
        this.BOM_UNIT = BOM_UNIT;
    }

    public String getBOM_DATE() {
        return BOM_DATE;
    }

    public void setBOM_DATE(String BOM_DATE) {
        this.BOM_DATE = BOM_DATE;
    }

    public double getBOM_VALUE() {
        return BOM_VALUE;
    }

    public void setBOM_VALUE(double BOM_VALUE) {
        this.BOM_VALUE = BOM_VALUE;
    }

    public String getBOM_GUR_PER() {
        return BOM_GUR_PER;
    }

    public void setBOM_GUR_PER(String BOM_GUR_PER) {
        this.BOM_GUR_PER = BOM_GUR_PER;
    }

//    public List<MaterialMaster> getMaterialMasters() {
//        return materialMasters;
//    }
//
//    public void setMaterialMasters(List<MaterialMaster> materialMasters) {
//        this.materialMasters = materialMasters;
//    }

    public List<Xbom> getXboms() {
        return xboms;
    }

    public void setXboms(List<Xbom> xboms) {
        this.xboms = xboms;
    }

    public List<BomAssigned> getBomAssigneds() {
        return bomAssigneds;
    }

    public void setBomAssigneds(List<BomAssigned> bomAssigneds) {
        this.bomAssigneds = bomAssigneds;
    }

    public String getBOM_CODE() {
        return BOM_CODE;
    }

    public void setBOM_CODE(String BOM_CODE) {
        this.BOM_CODE = BOM_CODE;
    }

    public MaterialMaster getMaterialMaster() {
        return materialMaster;
    }

    public void setMaterialMaster(MaterialMaster materialMaster) {
        this.materialMaster = materialMaster;
    }
//    @Override
//    public String toString() {
//        return "Bom{" +
//                "BOM_ID='" + BOM_ID + '\'' +
//                ", materialMasters=" + materialMasters +
//                ", xboms=" + xboms +
//                ", bomAssigneds=" + bomAssigneds +
//                ", BOM_DES='" + BOM_DES + '\'' +
//                ", BOM_TYPE='" + BOM_TYPE + '\'' +
//                ", BOM_UNIT='" + BOM_UNIT + '\'' +
//                ", BOM_DATE='" + BOM_DATE + '\'' +
//                ", BOM_VALUE=" + BOM_VALUE +
//                ", BOM_GUR_PER='" + BOM_GUR_PER + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Bom{" +
                "BOM_ID=" + BOM_ID +
                ", BOM_CODE='" + BOM_CODE + '\'' +
                ", materialMaster=" + materialMaster +
                ", xboms=" + xboms +
                ", bomAssigneds=" + bomAssigneds +
                ", BOM_DES='" + BOM_DES + '\'' +
                ", BOM_TYPE='" + BOM_TYPE + '\'' +
                ", BOM_UNIT='" + BOM_UNIT + '\'' +
                ", BOM_DATE='" + BOM_DATE + '\'' +
                ", BOM_VALUE=" + BOM_VALUE +
                ", BOM_GUR_PER='" + BOM_GUR_PER + '\'' +
                '}';
    }
}
