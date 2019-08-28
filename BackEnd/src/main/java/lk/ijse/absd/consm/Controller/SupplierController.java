package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.SupplierDTO;
import lk.ijse.absd.consm.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public List<SupplierDTO> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public SupplierDTO getSupplier(@PathVariable("id") String id) {
        return supplierService.getSupplier(id);
    }

    @PostMapping
    public void saveSupplier(@RequestBody SupplierDTO dto) {
        supplierService.saveSupplier(dto);
    }

    @PutMapping
    public void updateSupplier(@RequestBody SupplierDTO dto) {
        supplierService.updateSupplier(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable("id") String id) {
        supplierService.deleteSupplier(id);
    }
}
