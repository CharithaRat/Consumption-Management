package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetailMaster {

    @Id
    private String DETAIL_ID;
    private String DETAIL_NAME;

    public DetailMaster() {
    }

    public DetailMaster(String DETAIL_ID, String DETAIL_NAME) {
        this.DETAIL_ID = DETAIL_ID;
        this.DETAIL_NAME = DETAIL_NAME;
    }

    public String getDETAIL_ID() {
        return DETAIL_ID;
    }

    public void setDETAIL_ID(String DETAIL_ID) {
        this.DETAIL_ID = DETAIL_ID;
    }

    public String getDETAIL_NAME() {
        return DETAIL_NAME;
    }

    public void setDETAIL_NAME(String DETAIL_NAME) {
        this.DETAIL_NAME = DETAIL_NAME;
    }

    @Override
    public String toString() {
        return "DetailMaster{" +
                "DETAIL_ID='" + DETAIL_ID + '\'' +
                ", DETAIL_NAME='" + DETAIL_NAME + '\'' +
                '}';
    }
}
