package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.MainMasterDTO;
import lk.ijse.absd.consm.service.MainMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/main")
public class MainMasterController {

    @Autowired
    private MainMasterService mainMasterService;

    @GetMapping
    public List<MainMasterDTO> getAllMainCodes(){
        return mainMasterService.getAllMainCodes();
    }

    @GetMapping("/{id}")
    public MainMasterDTO getSingleMainMasterDetails(@PathVariable("id") String id){
        return mainMasterService.getSelectedMainMasterDetails(id);
    }
}
