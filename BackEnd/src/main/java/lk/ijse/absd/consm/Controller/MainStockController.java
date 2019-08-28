package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.MainStockDTO;
import lk.ijse.absd.consm.entity.MainStock;
import lk.ijse.absd.consm.service.MainStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/mainstock")
public class MainStockController {

    @Autowired
    private MainStockService mainStockService;

    @GetMapping
    public List<MainStockDTO> getAllStocks(){
        return mainStockService.getAllStocks();
    }

    @GetMapping("/{id}")
    public MainStockDTO getStock(@PathVariable("id") String id){
        return mainStockService.getStock(id);
    }

    @PostMapping
    public void saveStock(@RequestBody MainStockDTO dto){
        mainStockService.saveStock(dto);
    }

    @PutMapping
    public void updateStock(@RequestBody MainStockDTO dto){
        mainStockService.updateStock(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteStock(@PathVariable("id") String id){
        mainStockService.deleteStock(id);
    }
}
