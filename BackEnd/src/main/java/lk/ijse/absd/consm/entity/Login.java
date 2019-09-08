package lk.ijse.absd.consm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Login {

    @Id
    private String USER_NAME;

    @OneToOne
    private Employee employee;

    private String PASSWORD;
    private String USER_TYPE;
    private String S_PASSWORD;

    public Login() {
    }

    public Login(String USER_NAME, String PASSWORD, String USER_TYPE, String s_PASSWORD) {
        this.USER_NAME = USER_NAME;
        this.PASSWORD = PASSWORD;
        this.USER_TYPE = USER_TYPE;
        S_PASSWORD = s_PASSWORD;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getUSER_TYPE() {
        return USER_TYPE;
    }

    public void setUSER_TYPE(String USER_TYPE) {
        this.USER_TYPE = USER_TYPE;
    }

    public String getS_PASSWORD() {
        return S_PASSWORD;
    }

    public void setS_PASSWORD(String s_PASSWORD) {
        S_PASSWORD = s_PASSWORD;
    }

    @Override
    public String toString() {
        return "Login{" +
                "USER_NAME='" + USER_NAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", USER_TYPE='" + USER_TYPE + '\'' +
                ", S_PASSWORD='" + S_PASSWORD + '\'' +
                '}';
    }
}
