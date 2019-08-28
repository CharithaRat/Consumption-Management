package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.IssueDtlDTO;
import lk.ijse.absd.consm.service.IssueDtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/issuedtl")
public class IssueDtlController {

    @Autowired
    private IssueDtlService issueDtlService;

    @GetMapping
    public List<IssueDtlDTO> getAllIssueDtl() {
        return issueDtlService.getAllIssuingDetails();
    }

    @GetMapping("/{id}")
    public IssueDtlDTO getIssueDtl(@PathVariable("id") String id) {
        return issueDtlService.getIssuingDetails(id);
    }

    @PostMapping
    public void saveIssueDtl(@RequestBody IssueDtlDTO dto) {
        issueDtlService.saveIssuingDetails(dto);
    }

    @PutMapping
    public void updateIssueDtl(@RequestBody IssueDtlDTO dto) {
        issueDtlService.updateIssuingDetails(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteIssueDtl(@PathVariable("id") String id) {
        issueDtlService.deleteIssuingDetails(id);
    }
}
