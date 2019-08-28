package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.GrnDTO;
import lk.ijse.absd.consm.service.GrnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/grn")
public class GrnController {

    @Autowired
    private GrnService grnService;

    @GetMapping
    public List<GrnDTO> getAllGrnDetails() {
        return grnService.getAllGrns();
    }

    @GetMapping("/{id}")
    public GrnDTO getGrnDetail(@PathVariable("id") String id) {
        return grnService.getGrn(id);
    }

    @PostMapping
    public void saveGrnDetail(@RequestBody GrnDTO dto) {
        grnService.saveGrn(dto);
    }

    @PutMapping
    public void updateGrnDetail(@RequestBody GrnDTO dto) {
        grnService.updateGrn(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteGrnDetail(@PathVariable("id") String id) {
        grnService.deleteGrn(id);
    }
}
