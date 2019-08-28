package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
    @Id
    private int id;

    public Test() {
    }

    public Test(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                '}';
    }
}
