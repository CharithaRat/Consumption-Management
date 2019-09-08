package lk.ijse.absd.consm.dto;

public class SupplyDTO {
    private int supplyId;
    private String supId;
    private String matId;

    public SupplyDTO() {
    }

    public SupplyDTO(int supplyId, String supId, String matId) {
        this.supplyId = supplyId;
        this.supId = supId;
        this.matId = matId;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public String getSupId() {
        return supId;
    }

    public void setSupId(String supId) {
        this.supId = supId;
    }

    public String getMatId() {
        return matId;
    }

    public void setMatId(String matId) {
        this.matId = matId;
    }

    @Override
    public String toString() {
        return "SupplyDTO{" +
                "supplyId=" + supplyId +
                ", supId='" + supId + '\'' +
                ", matId='" + matId + '\'' +
                '}';
    }
}
