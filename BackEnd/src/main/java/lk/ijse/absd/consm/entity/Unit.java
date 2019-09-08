package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Unit {

    @Id
    private String UNIT_ID;

//    @ManyToMany(mappedBy = "units")
//    private List<UnitRelation> relations = new ArrayList<>();

    @OneToMany(mappedBy = "unit")
    private List<MaterialMaster> materialMasterList = new ArrayList<>();

    private String UNIT_DES;
    private String UNIT_SYMBOL;

    public Unit() {
    }

//    public Unit(String UNIT_ID, List<UnitRelation> relations, List<MaterialMaster> materialMasterList, String UNIT_DES, String UNIT_SYMBOL) {
//        this.UNIT_ID = UNIT_ID;
//        this.relations = relations;
//        this.materialMasterList = materialMasterList;
//        this.UNIT_DES = UNIT_DES;
//        this.UNIT_SYMBOL = UNIT_SYMBOL;
//    }

    public Unit(String UNIT_ID, String UNIT_DES, String UNIT_SYMBOL) {
        this.UNIT_ID = UNIT_ID;
        this.UNIT_DES = UNIT_DES;
        this.UNIT_SYMBOL = UNIT_SYMBOL;
    }

    public String getUNIT_ID() {
        return UNIT_ID;
    }

    public void setUNIT_ID(String UNIT_ID) {
        this.UNIT_ID = UNIT_ID;
    }

    public String getUNIT_DES() {
        return UNIT_DES;
    }

    public void setUNIT_DES(String UNIT_DES) {
        this.UNIT_DES = UNIT_DES;
    }

    public String getUNIT_SYMBOL() {
        return UNIT_SYMBOL;
    }

    public void setUNIT_SYMBOL(String UNIT_SYMBOL) {
        this.UNIT_SYMBOL = UNIT_SYMBOL;
    }

//    public List<UnitRelation> getRelations() {
//        return relations;
//    }

//    public void setRelations(List<UnitRelation> relations) {
//        this.relations = relations;
//    }

    public List<MaterialMaster> getMaterialMasterList() {
        return materialMasterList;
    }

    public void setMaterialMasterList(List<MaterialMaster> materialMasterList) {
        this.materialMasterList = materialMasterList;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "UNIT_ID='" + UNIT_ID + '\'' +
                ", materialMasterList=" + materialMasterList +
                ", UNIT_DES='" + UNIT_DES + '\'' +
                ", UNIT_SYMBOL='" + UNIT_SYMBOL + '\'' +
                '}';
    }
}
