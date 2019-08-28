package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubMaster {

    @Id
    private String SUB_ID;
    private String SUB_DES;

    public SubMaster() {
    }

    public SubMaster(String SUB_ID, String SUB_DES) {
        this.SUB_ID = SUB_ID;
        this.SUB_DES = SUB_DES;
    }

    public String getSUB_ID() {
        return SUB_ID;
    }

    public void setSUB_ID(String SUB_ID) {
        this.SUB_ID = SUB_ID;
    }

    public String getSUB_DES() {
        return SUB_DES;
    }

    public void setSUB_DES(String SUB_DES) {
        this.SUB_DES = SUB_DES;
    }

    @Override
    public String toString() {
        return "SubMaster{" +
                "SUB_ID='" + SUB_ID + '\'' +
                ", SUB_DES='" + SUB_DES + '\'' +
                '}';
    }
}
