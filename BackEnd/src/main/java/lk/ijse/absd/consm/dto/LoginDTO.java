package lk.ijse.absd.consm.dto;

public class LoginDTO {
    private String USER_NAME;
    private String PASSWORD;
    private String USER_TYPE;
    private String S_PASSWORD;

    public LoginDTO() {
    }

    public LoginDTO(String USER_NAME, String PASSWORD, String USER_TYPE, String s_PASSWORD) {
        this.USER_NAME = USER_NAME;
        this.PASSWORD = PASSWORD;
        this.USER_TYPE = USER_TYPE;
        this.S_PASSWORD = s_PASSWORD;
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
        return "LoginDTO{" +
                "USER_NAME='" + USER_NAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", USER_TYPE='" + USER_TYPE + '\'' +
                ", S_PASSWORD='" + S_PASSWORD + '\'' +
                '}';
    }
}
