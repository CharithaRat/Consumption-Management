package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supply {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int supplyId;
    private String supId;
    private String matId;

    public Supply() {
    }

    public Supply(String supId, String matId) {
        this.supId = supId;
        this.matId = matId;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public String getSupId() {
        return supId;
    }

    public void setSupId(String supId) {
        this.supId = supId;
    }

    public String getMatId() {
        return matId;
    }

    public void setMatId(String matId) {
        this.matId = matId;
    }

    @Override
    public String toString() {
        return "Supply{" +
                "supplyId=" + supplyId +
                ", supId='" + supId + '\'' +
                ", matId='" + matId + '\'' +
                '}';
    }
}
