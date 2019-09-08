package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.DetailMasterDTO;
import lk.ijse.absd.consm.service.DetailMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/detail")
public class DetailMasterController {

    @Autowired
    private DetailMasterService detailMasterService;

    @GetMapping
    public List<DetailMasterDTO> getAllDetailCodes() {
        return detailMasterService.getAllDetailCodes();
    }

    @GetMapping("/{id}")
    public DetailMasterDTO getSingleDetailMasterDetails(@PathVariable("id") String id) {
        return detailMasterService.getSelectedDetailMasterDetails(id);
    }

    @PostMapping
    public void saveDetailMaster(@RequestBody DetailMasterDTO dto) {
        System.out.println(dto);
        detailMasterService.saveDetailMasterDetails(dto);
    }
}
