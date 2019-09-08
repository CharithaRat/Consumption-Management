package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.ContractorDTO;
import lk.ijse.absd.consm.service.ContractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/contractor")
public class ContractorController {

    @Autowired
    private ContractorService contractorService;

    @GetMapping
    public List<ContractorDTO> getAllContractors() {
        return contractorService.getAllContractors();
    }

    @GetMapping("/{id}")
    public ContractorDTO getContractor(@PathVariable("id") int id) {
        return contractorService.getContractor(id);
    }

    @PostMapping
    public void saveContractor(@RequestBody ContractorDTO dto) {
        contractorService.saveContractor(dto);
    }

    @PutMapping
    public void updateContractor(@RequestBody ContractorDTO dto) {
        contractorService.updateContractor(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteContractor(@PathVariable("id") int id) {
        contractorService.deleteContractor(id);
    }
}
