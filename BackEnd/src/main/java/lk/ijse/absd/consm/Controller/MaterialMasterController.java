package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.BomDTO;
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
//    public List<MaterialMasterDTO> getAllMaterials() {
//        return materialMasterService.getAllMaterials();
//    }
    public List<MaterialMasterDTO> findAllMaterials() {
        return materialMasterService.findAllMaterials();
    }

    @GetMapping("/{id}")
    public MaterialMasterDTO getMaterial(@PathVariable int id) {
        return materialMasterService.getMaterial(id);
    }

    @PostMapping
    public void saveMaterial(@RequestBody MaterialMasterDTO dto) {
        System.out.println(dto);
        materialMasterService.saveMaterial(dto);
    }

//    @PostMapping
//    public void saveMaterial(@RequestBody MaterialMasterDTO dto) {
//        System.out.println(dto);
//        MaterialMasterDTO masterDTO = new MaterialMasterDTO();
//
//        materialMasterService.saveMaterial(dto);
//    }

    @PutMapping
    public void updateMaterial(@RequestBody MaterialMasterDTO dto) {
        materialMasterService.updateMaterial(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable("id") int id) {
        materialMasterService.deleteMaterial(id);
    }
}
