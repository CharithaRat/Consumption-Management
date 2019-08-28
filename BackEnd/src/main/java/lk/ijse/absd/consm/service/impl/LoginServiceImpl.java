package lk.ijse.absd.consm.service.impl;


import lk.ijse.absd.consm.dto.LoginDTO;
import lk.ijse.absd.consm.entity.Login;
import lk.ijse.absd.consm.repository.LoginRepository;
import lk.ijse.absd.consm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public List<LoginDTO> getAllUsers() {
        List<Login> users = loginRepository.findAll();
        return users.stream().map(u -> new LoginDTO(u.getUSER_NAME(), u.getS_PASSWORD(), u.getUSER_TYPE(), u.getS_PASSWORD())).collect(Collectors.toList());
    }

    @Override
    public LoginDTO getUser(String id) {
        Login user = loginRepository.findById(id).get();
        return new LoginDTO(user.getUSER_NAME(), user.getPASSWORD(), user.getUSER_TYPE(), user.getS_PASSWORD());
    }

//    @Override
//    public boolean getUser(String id) {
//        Login user = loginRepository.findById(id).get();
//        boolean state = checkPasswords(id, user.getS_PASSWORD());
//        return state;
//    }
//
//    public boolean checkPasswords(String p1, String p2){
//        if(p1.equals(p2)){
//            return true;
//        } else{
//            return false;
//        }
//    }

    @Override
    public void saveUser(LoginDTO dto) {
        loginRepository.save(new Login(dto.getUSER_NAME(), dto.getPASSWORD(), dto.getUSER_TYPE(), dto.getS_PASSWORD()));
    }

    @Override
    public void updateUser(LoginDTO dto) {
        loginRepository.saveAndFlush(new Login(dto.getUSER_NAME(), dto.getPASSWORD(), dto.getUSER_TYPE(), dto.getS_PASSWORD()));
    }

    @Override
    public void deleteUser(String id) {
        loginRepository.deleteById(id);
    }
}
