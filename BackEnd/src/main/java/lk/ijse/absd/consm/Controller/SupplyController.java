package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.SupplyDTO;
import lk.ijse.absd.consm.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/supply")
public class SupplyController {

    @Autowired
    private SupplyService supplyService;

    @GetMapping
    public List<SupplyDTO> getAllSupplies(){
        return supplyService.getAllSupplies();
    }

    @GetMapping("/{id}")
    public SupplyDTO getSupply(@PathVariable("id") int id){
        return supplyService.getSupply(id);
    }
}
