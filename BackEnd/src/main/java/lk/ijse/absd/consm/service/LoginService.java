package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.LoginDTO;

import java.util.List;

public interface LoginService {
    List<LoginDTO> getAllUsers();

        LoginDTO getUser(String id);
//    boolean getUser(String id);

    void saveUser(LoginDTO dto);

    void updateUser(LoginDTO dto);

    void deleteUser(String id);
}
