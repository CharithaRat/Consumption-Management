package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.BomMatDTO;
import lk.ijse.absd.consm.service.BomMatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("bommaterial")
public class BomMatController {

    @Autowired
    private BomMatService bomMatService;

    @GetMapping
    public List<BomMatDTO> getAllBomMaterials(){
        return bomMatService.getAllBomMaterials();
    }

    @GetMapping("/{id}")
    public BomMatDTO getBomMaterial(@PathVariable("id") String id){
        return bomMatService.getBomMaterial(id);
    }

    @PostMapping
    public void saveBomMaterial(@RequestBody BomMatDTO dto){
        bomMatService.saveBomMaterial(dto);
    }

    @PutMapping
    public void updateBomMaterial(@RequestBody BomMatDTO dto){
        bomMatService.updateBomMaterial(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteBomMaterial(@PathVariable("id") String id){
        bomMatService.deleteBomMaterial(id);
    }
}
