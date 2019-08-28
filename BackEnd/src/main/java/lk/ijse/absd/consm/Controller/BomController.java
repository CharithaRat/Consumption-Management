package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.BomDTO;
import lk.ijse.absd.consm.service.BomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/bom")
public class BomController {

    @Autowired
    private BomService bomService;

    @GetMapping
    public List<BomDTO> getAllBoms(){
        return bomService.getAllBoms();
    }

    @GetMapping("/{id}")
    public BomDTO getBom(@PathVariable("id") String id){
        return bomService.getBom(id);
    }

    @PostMapping
    public void saveBom(@RequestBody BomDTO dto){
       bomService.saveBom(dto);
    }

    @PutMapping
    public void updateBom(@RequestBody BomDTO dto){
        bomService.updateBom(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteBom(@PathVariable("id") String id){
        bomService.deleteBom(id);
    }
}
