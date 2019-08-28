package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MainMaster {
    @Id
    private String MAIN_ID;
    private String MAIN_DES;

    public MainMaster() {
    }

    public MainMaster(String MAIN_ID, String MAIN_DES) {
        this.MAIN_ID = MAIN_ID;
        this.MAIN_DES = MAIN_DES;
    }

    public String getMAIN_ID() {
        return MAIN_ID;
    }

    public void setMAIN_ID(String MAIN_ID) {
        this.MAIN_ID = MAIN_ID;
    }

    public String getMAIN_DES() {
        return MAIN_DES;
    }

    public void setMAIN_DES(String MAIN_DES) {
        this.MAIN_DES = MAIN_DES;
    }

    @Override
    public String toString() {
        return "MainMaster{" +
                "MAIN_ID='" + MAIN_ID + '\'' +
                ", MAIN_DES='" + MAIN_DES + '\'' +
                '}';
    }
}
