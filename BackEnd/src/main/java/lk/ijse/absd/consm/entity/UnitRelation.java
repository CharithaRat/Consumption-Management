package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UnitRelation {

    @Id
    private String BASE_UNIT;

    @ManyToMany
    private List<Unit> units = new ArrayList<>();

    private String REL_UNIT;
    private String UNIT_RATE;

    public UnitRelation() {
    }

    public UnitRelation(String BASE_UNIT, List<Unit> units, String REL_UNIT, String UNIT_RATE) {
        this.BASE_UNIT = BASE_UNIT;
        this.units = units;
        this.REL_UNIT = REL_UNIT;
        this.UNIT_RATE = UNIT_RATE;
    }

    public UnitRelation(String BASE_UNIT, String REL_UNIT, String UNIT_RATE) {
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

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "UnitRelation{" +
                "BASE_UNIT='" + BASE_UNIT + '\'' +
                ", units=" + units +
                ", REL_UNIT='" + REL_UNIT + '\'' +
                ", UNIT_RATE='" + UNIT_RATE + '\'' +
                '}';
    }
}
