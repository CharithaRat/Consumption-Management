package lk.ijse.absd.consm.dto;

public class DetailMasterDTO {
    private String DETAIL_ID;
    private String DETAIL_NAME;

    public DetailMasterDTO() {
    }

    public DetailMasterDTO(String DETAIL_ID, String DETAIL_NAME) {
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
        return "DetailMasterDTO{" +
                "DETAIL_ID='" + DETAIL_ID + '\'' +
                ", DETAIL_NAME='" + DETAIL_NAME + '\'' +
                '}';
    }
}
