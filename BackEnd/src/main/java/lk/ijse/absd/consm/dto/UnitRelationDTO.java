package lk.ijse.absd.consm.dto;

public class UnitRelationDTO {
    private String BASE_UNIT;
    private String REL_UNIT;
    private String UNIT_RATE;

    public UnitRelationDTO() {
    }

    public UnitRelationDTO(String BASE_UNIT, String REL_UNIT, String UNIT_RATE) {
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

    public String getUNIT_RATE() {
        return UNIT_RATE;
    }

    public void setUNIT_RATE(String UNIT_RATE) {
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
