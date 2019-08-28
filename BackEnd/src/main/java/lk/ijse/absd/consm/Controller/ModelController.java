package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.ModelDTO;
import lk.ijse.absd.consm.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/model")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping
    public List<ModelDTO> getAllModels() {
        return modelService.getAllModels();
    }

    @GetMapping("/{id}")
    public ModelDTO getModel(@PathVariable("id") String id) {
        return modelService.getModel(id);
    }

    @PostMapping
    public void saveModel(@RequestBody ModelDTO dto) {
        modelService.saveModel(dto);
    }

    @PutMapping
    public void updateModel(@RequestBody ModelDTO dto) {
        modelService.updateModel(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteModel(@PathVariable("id") String id) {
        modelService.deleteModel(id);
    }
}

