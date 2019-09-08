package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.BomAssignedDTO;
import lk.ijse.absd.consm.service.BomAssignedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/bomassigned")
public class BomAssignedController {

    @Autowired
    private BomAssignedService bomAssignedService;

    @GetMapping
    public List<BomAssignedDTO> getAllAsignedBoms(){
        return bomAssignedService.getAllAssignedBomsDetails();
    }

    @GetMapping("/{id}")
    public BomAssignedDTO getAssignedBom(@PathVariable("id") int id){
        return bomAssignedService.getAssignedBomDetails(id);
    }

    @PostMapping
    public void saveAssignedBomDetails(@RequestBody BomAssignedDTO dto){
        bomAssignedService.saveAssignedBomDetails(dto);
    }

    @PutMapping
    public void updateAssignedBomDetails(@RequestBody BomAssignedDTO dto){
        bomAssignedService.updateAssignedBomDetails(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteAssignedBom(@PathVariable("id") int id){
        bomAssignedService.deleteAssignedBomDetails(id);
    }
}
