package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.SubMasterDTO;
import lk.ijse.absd.consm.service.SubMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/sub")
public class SubMasterController {

    @Autowired
    private SubMasterService subMasterService;

    @GetMapping
    public List<SubMasterDTO> getAllSubCodes(){
        return subMasterService.getAllSubCodes();
    }

    @GetMapping("/{id}")
    public SubMasterDTO getSingleSubMasterDetails(@PathVariable("id") String id){
        return subMasterService.getSelectedSubMasterDetails(id);
    }

    @PostMapping
    public void saveSubMasterDetails(@RequestBody SubMasterDTO dto){
        subMasterService.saveSubMasterDetails(dto);
    }
}
