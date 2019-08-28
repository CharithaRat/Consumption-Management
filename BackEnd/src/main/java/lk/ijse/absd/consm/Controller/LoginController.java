package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.LoginDTO;
import lk.ijse.absd.consm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public List<LoginDTO> getAllUsers(){
        return loginService.getAllUsers();
    }

    @GetMapping("/{id}")
    public LoginDTO getUser(@PathVariable("id")String id){
        return loginService.getUser(id);
    }

//    @GetMapping("/{id}")
//    public boolean getUser(@PathVariable("id")String id){
//        return loginService.getUser(id);
//    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") String id){
        loginService.deleteUser(id);
    }

    @PostMapping
    public void saveUser(@RequestBody LoginDTO user){
        loginService.saveUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody LoginDTO user){
        loginService.updateUser(user);
    }
}
