package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelDTO {
    @JsonProperty("modelId")
    private int MODEL_ID;
    @JsonProperty("modelCode")
    private String MODEL_CODE;
    @JsonProperty("modelName")
    private String MODEL_NAME;
    @JsonProperty("modelCreDate")
    private String MODEL_CRE_DATE;
    @JsonProperty("modelType")
    private String MODEL_TYPE;

    public ModelDTO() {
    }

    public ModelDTO(int MODEL_ID, String MODEL_CODE, String MODEL_NAME, String MODEL_CRE_DATE, String MODEL_TYPE) {
        this.MODEL_ID = MODEL_ID;
        this.MODEL_CODE = MODEL_CODE;
        this.MODEL_NAME = MODEL_NAME;
        this.MODEL_CRE_DATE = MODEL_CRE_DATE;
        this.MODEL_TYPE = MODEL_TYPE;
    }

    public ModelDTO(int MODEL_ID, String MODEL_NAME, String MODEL_CRE_DATE, String MODEL_TYPE) {
        this.MODEL_ID = MODEL_ID;
        this.MODEL_NAME = MODEL_NAME;
        this.MODEL_CRE_DATE = MODEL_CRE_DATE;
        this.MODEL_TYPE = MODEL_TYPE;
    }

    public int getMODEL_ID() {
        return MODEL_ID;
    }

    public void setMODEL_ID(int MODEL_ID) {
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

    public String getMODEL_CODE() {
        return MODEL_CODE;
    }

    public void setMODEL_CODE(String MODEL_CODE) {
        this.MODEL_CODE = MODEL_CODE;
    }

//    @Override
//    public String toString() {
//        return "ModelDTO{" +
//                "MODEL_ID='" + MODEL_ID + '\'' +
//                ", MODEL_NAME='" + MODEL_NAME + '\'' +
//                ", MODEL_CRE_DATE='" + MODEL_CRE_DATE + '\'' +
//                ", MODEL_TYPE='" + MODEL_TYPE + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "ModelDTO{" +
                "MODEL_ID='" + MODEL_ID + '\'' +
                ", MODEL_CODE='" + MODEL_CODE + '\'' +
                ", MODEL_NAME='" + MODEL_NAME + '\'' +
                ", MODEL_CRE_DATE='" + MODEL_CRE_DATE + '\'' +
                ", MODEL_TYPE='" + MODEL_TYPE + '\'' +
                '}';
    }
}
