package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class DetailMaster {

    @Id
    private String DETAIL_ID;

    @OneToMany(mappedBy = "detailm", fetch = FetchType.EAGER)
    private List<MaterialMaster> materialdetail;

    private String DETAIL_NAME;

    public DetailMaster() {
    }

    public DetailMaster(String DETAIL_ID, List<MaterialMaster> materialdetail, String DETAIL_NAME) {
        this.DETAIL_ID = DETAIL_ID;
        this.materialdetail = materialdetail;
        this.DETAIL_NAME = DETAIL_NAME;
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

    public List<MaterialMaster> getMaterialdetail() {
        return materialdetail;
    }

    public void setMaterialdetail(List<MaterialMaster> materialdetail) {
        this.materialdetail = materialdetail;
    }

//    @Override
//    public String toString() {
//        return "DetailMaster{" +
//                "DETAIL_ID='" + DETAIL_ID + '\'' +
//                ", DETAIL_NAME='" + DETAIL_NAME + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "DetailMaster{" +
                "DETAIL_ID='" + DETAIL_ID + '\'' +
                ", materialdetail=" + materialdetail +
                ", DETAIL_NAME='" + DETAIL_NAME + '\'' +
                '}';
    }
}
