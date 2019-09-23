package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class MainMaster {
    @Id
    private String MAIN_ID;

    @OneToMany(mappedBy = "mainm", fetch = FetchType.EAGER)
    private List<MaterialMaster> materialmain;

    private String MAIN_DES;

    public MainMaster() {
    }

    public MainMaster(String MAIN_ID, List<MaterialMaster> materialmain, String MAIN_DES) {
        this.MAIN_ID = MAIN_ID;
        this.materialmain = materialmain;
        this.MAIN_DES = MAIN_DES;
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

    public List<MaterialMaster> getMaterialmain() {
        return materialmain;
    }

    public void setMaterialmain(List<MaterialMaster> materialmain) {
        this.materialmain = materialmain;
    }

//    @Override
//    public String toString() {
//        return "MainMaster{" +
//                "MAIN_ID='" + MAIN_ID + '\'' +
//                ", MAIN_DES='" + MAIN_DES + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "MainMaster{" +
                "MAIN_ID='" + MAIN_ID + '\'' +
                ", materialmain=" + materialmain +
                ", MAIN_DES='" + MAIN_DES + '\'' +
                '}';
    }
}
