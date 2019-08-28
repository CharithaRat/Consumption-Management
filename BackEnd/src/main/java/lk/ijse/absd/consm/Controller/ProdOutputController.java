package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.ProdOutputDTO;
import lk.ijse.absd.consm.service.ProdOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/prodoutput")
public class ProdOutputController {

    @Autowired
    private ProdOutputService prodOutputService;

    @GetMapping
    public List<ProdOutputDTO> getAllProdOutput() {
        return prodOutputService.getAllProdDetails();
    }

    @GetMapping("/{id}")
    public ProdOutputDTO getProdOutput(@PathVariable("id") String id) {
        return prodOutputService.getProdDetail(id);
    }

    @PostMapping
    public void saveProdOutput(@RequestBody ProdOutputDTO dto) {
        prodOutputService.saveProdDetail(dto);
    }

    @PutMapping
    public void updateProdOutput(@RequestBody ProdOutputDTO dto) {
        prodOutputService.updateProdDetail(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteProdOutput(@PathVariable("id") String id) {
        prodOutputService.deleteProdDetail(id);
    }
}
