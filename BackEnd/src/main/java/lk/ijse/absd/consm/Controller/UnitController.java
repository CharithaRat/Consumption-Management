package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.UnitDTO;
import lk.ijse.absd.consm.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/unit")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @GetMapping
    public List<UnitDTO> getAllUnitDetails(){
        return unitService.getAllUnits();
    }

    @GetMapping("/{id}")
    public UnitDTO getUnit(@PathVariable("id") String id){
        return unitService.getUnit(id);
    }

    @PostMapping
    public void saveUnit(@RequestBody UnitDTO dto){
        unitService.saveUnit(dto);
    }

    @PutMapping
    public void updateUnit(@RequestBody UnitDTO dto){
        unitService.updateUnit(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteUnit(@PathVariable String id){
        unitService.deleteUnit(id);
    }
}
