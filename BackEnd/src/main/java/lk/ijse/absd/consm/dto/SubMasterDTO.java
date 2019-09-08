package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubMasterDTO {
    @JsonProperty("subId")
    private String SUB_ID;
    @JsonProperty("subDes")
    private String SUB_DES;

    public SubMasterDTO() {
    }

    public SubMasterDTO(String SUB_ID, String SUB_DES) {
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
        return "SubMasterDTO{" +
                "SUB_ID='" + SUB_ID + '\'' +
                ", SUB_DES='" + SUB_DES + '\'' +
                '}';
    }
}
