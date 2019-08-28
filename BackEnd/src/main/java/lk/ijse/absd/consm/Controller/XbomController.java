package lk.ijse.absd.consm.Controller;

import javafx.geometry.Pos;
import lk.ijse.absd.consm.dto.XbomDTO;
import lk.ijse.absd.consm.entity.Xbom;
import lk.ijse.absd.consm.service.XbomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/xbom")
public class XbomController {

    @Autowired
    private XbomService xbomService;

    @GetMapping
    public List<XbomDTO> getAllXboms() {
        return xbomService.getAllXboms();
    }

    @GetMapping("/{id}")
    public XbomDTO getXbom(@PathVariable("id") String id) {
        return xbomService.getXbom(id);
    }

    @PostMapping
    public void saveXbom(@RequestBody XbomDTO dto) {
        xbomService.saveXbom(dto);
    }

    @PutMapping
    public void updateXbom(@RequestBody XbomDTO dto) {
        xbomService.updateXbom(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteXbom(@PathVariable("id") String id) {
        xbomService.deleteXbom(id);
    }
}
