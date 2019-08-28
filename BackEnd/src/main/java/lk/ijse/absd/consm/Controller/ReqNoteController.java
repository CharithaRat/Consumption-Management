package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.ReqNoteDTO;
import lk.ijse.absd.consm.service.ReqNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/reqnote")
public class ReqNoteController {

    @Autowired
    private ReqNoteService reqNoteService;

    @GetMapping
    public List<ReqNoteDTO> getAllReqNotes() {
        return reqNoteService.getAllReqNotes();
    }

    @GetMapping("/{id}")
    public ReqNoteDTO getReqNote(@PathVariable("id") String id) {
        return reqNoteService.getReqNote(id);
    }

    @PostMapping
    public void saveReqNote(@RequestBody ReqNoteDTO dto) {
        reqNoteService.saveReqNote(dto);
    }

    @PutMapping
    public void updateReqNote(@RequestBody ReqNoteDTO dto){
        reqNoteService.updateReqNote(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteReqNote(@PathVariable("id") String id){
        reqNoteService.deleteReqNote(id);
    }
}
