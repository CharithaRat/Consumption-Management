package lk.ijse.absd.consm.dto;

public class BomAssignedDTO {
    private String BOM_ID;
    private String BOM_USAGE;
    private double LENGTH;
    private double WIDTH;
    private double HEIGHT;
    private String COV_AREA_UNIT;
    private double COV_AREA;
    private double BOM_COST;
    private String ASSIGN_DATE;
    private double COST_PER_UNITAREA;

    public BomAssignedDTO() {
    }

    public BomAssignedDTO(String BOM_ID, String BOM_USAGE, double LENGTH, double WIDTH, double HEIGHT, String COV_AREA_UNIT, double COV_AREA, double BOM_COST, String ASSIGN_DATE, double COST_PER_UNITAREA) {
        this.BOM_ID = BOM_ID;
        this.BOM_USAGE = BOM_USAGE;
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.COV_AREA_UNIT = COV_AREA_UNIT;
        this.COV_AREA = COV_AREA;
        this.BOM_COST = BOM_COST;
        this.ASSIGN_DATE = ASSIGN_DATE;
        this.COST_PER_UNITAREA = COST_PER_UNITAREA;
    }

    public String getBOM_ID() {
        return BOM_ID;
    }

    public void setBOM_ID(String BOM_ID) {
        this.BOM_ID = BOM_ID;
    }

    public String getBOM_USAGE() {
        return BOM_USAGE;
    }

    public void setBOM_USAGE(String BOM_USAGE) {
        this.BOM_USAGE = BOM_USAGE;
    }

    public double getLENGTH() {
        return LENGTH;
    }

    public void setLENGTH(double LENGTH) {
        this.LENGTH = LENGTH;
    }

    public double getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(double WIDTH) {
        this.WIDTH = WIDTH;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public String getCOV_AREA_UNIT() {
        return COV_AREA_UNIT;
    }

    public void setCOV_AREA_UNIT(String COV_AREA_UNIT) {
        this.COV_AREA_UNIT = COV_AREA_UNIT;
    }

    public double getCOV_AREA() {
        return COV_AREA;
    }

    public void setCOV_AREA(double COV_AREA) {
        this.COV_AREA = COV_AREA;
    }

    public double getBOM_COST() {
        return BOM_COST;
    }

    public void setBOM_COST(double BOM_COST) {
        this.BOM_COST = BOM_COST;
    }

    public String getASSIGN_DATE() {
        return ASSIGN_DATE;
    }

    public void setASSIGN_DATE(String ASSIGN_DATE) {
        this.ASSIGN_DATE = ASSIGN_DATE;
    }

    public double getCOST_PER_UNITAREA() {
        return COST_PER_UNITAREA;
    }

    public void setCOST_PER_UNITAREA(double COST_PER_UNITAREA) {
        this.COST_PER_UNITAREA = COST_PER_UNITAREA;
    }

    @Override
    public String toString() {
        return "BomAssignedDTO{" +
                "BOM_ID='" + BOM_ID + '\'' +
                ", BOM_USAGE='" + BOM_USAGE + '\'' +
                ", LENGTH=" + LENGTH +
                ", WIDTH=" + WIDTH +
                ", HEIGHT=" + HEIGHT +
                ", COV_AREA_UNIT='" + COV_AREA_UNIT + '\'' +
                ", COV_AREA=" + COV_AREA +
                ", BOM_COST=" + BOM_COST +
                ", ASSIGN_DATE='" + ASSIGN_DATE + '\'' +
                ", COST_PER_UNITAREA=" + COST_PER_UNITAREA +
                '}';
    }
}
