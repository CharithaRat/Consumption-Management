package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.MaterialMasterDTO;
import lk.ijse.absd.consm.service.MaterialMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/material")
public class MaterialMasterController {

    @Autowired
    private MaterialMasterService materialMasterService;

    @GetMapping
    public List<MaterialMasterDTO> getAllMaterials() {
        return materialMasterService.getAllMaterials();
    }

    @GetMapping("/{id}")
    public MaterialMasterDTO getMaterial(@PathVariable String id) {
        return materialMasterService.getMaterial(id);
    }

    @PostMapping
    public void saveMaterial(@RequestBody MaterialMasterDTO dto) {
        materialMasterService.saveMaterial(dto);
    }

    @PutMapping
    public void updateMaterial(@RequestBody MaterialMasterDTO dto) {
        materialMasterService.updateMaterial(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable("id") String id) {
        materialMasterService.deleteMaterial(id);
    }
}
