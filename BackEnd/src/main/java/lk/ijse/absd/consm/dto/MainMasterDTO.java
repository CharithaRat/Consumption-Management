package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainMasterDTO {
    @JsonProperty("mainId")
    private String MAIN_ID;
    @JsonProperty("mainDes")
    private String MAIN_DES;

    public MainMasterDTO() {
    }

    public MainMasterDTO(String MAIN_ID, String MAIN_DES) {
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
        return "MainMasterDTO{" +
                "MAIN_ID='" + MAIN_ID + '\'' +
                ", MAIN_DES='" + MAIN_DES + '\'' +
                '}';
    }
}
