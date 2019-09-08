package lk.ijse.absd.consm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnitRelationDTO {
    @JsonProperty("baseUnit")
    private String BASE_UNIT;
    @JsonProperty("relUnit")
    private String REL_UNIT;
    @JsonProperty("unitRate")
    private double UNIT_RATE;

    public UnitRelationDTO() {
    }

    public UnitRelationDTO(String BASE_UNIT, String REL_UNIT, double UNIT_RATE) {
        this.BASE_UNIT = BASE_UNIT;
        this.REL_UNIT = REL_UNIT;
        this.UNIT_RATE = UNIT_RATE;
    }

    public String getBASE_UNIT() {
        return BASE_UNIT;
    }

    public void setBASE_UNIT(String BASE_UNIT) {
        this.BASE_UNIT = BASE_UNIT;
    }

    public String getREL_UNIT() {
        return REL_UNIT;
    }

    public void setREL_UNIT(String REL_UNIT) {
        this.REL_UNIT = REL_UNIT;
    }

    public double getUNIT_RATE() {
        return UNIT_RATE;
    }

    public void setUNIT_RATE(double UNIT_RATE) {
        this.UNIT_RATE = UNIT_RATE;
    }

    @Override
    public String toString() {
        return "UnitRelationDTO{" +
                "BASE_UNIT='" + BASE_UNIT + '\'' +
                ", REL_UNIT='" + REL_UNIT + '\'' +
                ", UNIT_RATE='" + UNIT_RATE + '\'' +
                '}';
    }
}
