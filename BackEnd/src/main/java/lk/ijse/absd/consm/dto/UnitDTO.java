package lk.ijse.absd.consm.dto;

public class UnitDTO {
    private String UNIT_ID;
    private String UNIT_DES;
    private String UNIT_SYMBOL;

    public UnitDTO() {
    }

    public UnitDTO(String UNIT_ID, String UNIT_DES, String UNIT_SYMBOL) {
        this.UNIT_ID = UNIT_ID;
        this.UNIT_DES = UNIT_DES;
        this.UNIT_SYMBOL = UNIT_SYMBOL;
    }

    public String getUNIT_ID() {
        return UNIT_ID;
    }

    public void setUNIT_ID(String UNIT_ID) {
        this.UNIT_ID = UNIT_ID;
    }

    public String getUNIT_DES() {
        return UNIT_DES;
    }

    public void setUNIT_DES(String UNIT_DES) {
        this.UNIT_DES = UNIT_DES;
    }

    public String getUNIT_SYMBOL() {
        return UNIT_SYMBOL;
    }

    public void setUNIT_SYMBOL(String UNIT_SYMBOL) {
        this.UNIT_SYMBOL = UNIT_SYMBOL;
    }

    @Override
    public String toString() {
        return "UnitDTO{" +
                "UNIT_ID='" + UNIT_ID + '\'' +
                ", UNIT_DES='" + UNIT_DES + '\'' +
                ", UNIT_SYMBOL='" + UNIT_SYMBOL + '\'' +
                '}';
    }
}
