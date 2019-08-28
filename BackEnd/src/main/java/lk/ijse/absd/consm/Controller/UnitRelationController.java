package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.UnitRelationDTO;
import lk.ijse.absd.consm.service.UnitRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/unitrelation")
public class UnitRelationController {

    @Autowired
    private UnitRelationService unitRelationService;

    @GetMapping
    public List<UnitRelationDTO> getAllUnitDetails(){
        return unitRelationService.getAllUnitRelations();
    }

    @GetMapping("/{id}")
    public UnitRelationDTO getUnit(@PathVariable("id") String id){
        return unitRelationService.getUnitRelation(id);
    }

    @PostMapping
    public void saveUnit(@RequestBody UnitRelationDTO dto){
        unitRelationService.saveUnitRelation(dto);
    }

    @PutMapping
    public void updateUnit(@RequestBody UnitRelationDTO dto){
        unitRelationService.updateUnitRelation(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteUnit(@PathVariable String id){
        unitRelationService.deleteUnitRelation(id);
    }
}
