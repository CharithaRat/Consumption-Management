package lk.ijse.absd.consm.dto;

public class ModelDTO {
    private String MODEL_ID;
    private String MODEL_NAME;
    private String MODEL_CRE_DATE;
    private String MODEL_TYPE;

    public ModelDTO() {
    }

    public ModelDTO(String MODEL_ID, String MODEL_NAME, String MODEL_CRE_DATE, String MODEL_TYPE) {
        this.MODEL_ID = MODEL_ID;
        this.MODEL_NAME = MODEL_NAME;
        this.MODEL_CRE_DATE = MODEL_CRE_DATE;
        this.MODEL_TYPE = MODEL_TYPE;
    }

    public String getMODEL_ID() {
        return MODEL_ID;
    }

    public void setMODEL_ID(String MODEL_ID) {
        this.MODEL_ID = MODEL_ID;
    }

    public String getMODEL_NAME() {
        return MODEL_NAME;
    }

    public void setMODEL_NAME(String MODEL_NAME) {
        this.MODEL_NAME = MODEL_NAME;
    }

    public String getMODEL_CRE_DATE() {
        return MODEL_CRE_DATE;
    }

    public void setMODEL_CRE_DATE(String MODEL_CRE_DATE) {
        this.MODEL_CRE_DATE = MODEL_CRE_DATE;
    }

    public String getMODEL_TYPE() {
        return MODEL_TYPE;
    }

    public void setMODEL_TYPE(String MODEL_TYPE) {
        this.MODEL_TYPE = MODEL_TYPE;
    }

    @Override
    public String toString() {
        return "ModelDTO{" +
                "MODEL_ID='" + MODEL_ID + '\'' +
                ", MODEL_NAME='" + MODEL_NAME + '\'' +
                ", MODEL_CRE_DATE='" + MODEL_CRE_DATE + '\'' +
                ", MODEL_TYPE='" + MODEL_TYPE + '\'' +
                '}';
    }
}
