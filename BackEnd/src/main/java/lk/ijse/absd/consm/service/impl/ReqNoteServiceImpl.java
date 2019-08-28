package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.ReqNoteDTO;
import lk.ijse.absd.consm.entity.ReqNote;
import lk.ijse.absd.consm.repository.ReqNoteRepository;
import lk.ijse.absd.consm.service.ReqNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ReqNoteServiceImpl implements ReqNoteService {

    @Autowired
    private ReqNoteRepository reqNoteRepository;

    @Override
    public List<ReqNoteDTO> getAllReqNotes() {
        List<ReqNote> reqNotes = reqNoteRepository.findAll();
        return reqNotes.stream().map(r -> new ReqNoteDTO(r.getREQ_NO(), r.getREQ_DATE(), r.getREQ_BY(), r.getMODEL_ID(), r.getMAT_ID(),
                r.getMAT_DES(), r.getMAT_UNIT(), r.getMAT_QTY())).collect(Collectors.toList());
    }

    @Override
    public ReqNoteDTO getReqNote(String id) {
        ReqNote reqNote = reqNoteRepository.findById(id).get();
        return new ReqNoteDTO(reqNote.getREQ_NO(), reqNote.getREQ_DATE(), reqNote.getREQ_BY(), reqNote.getMODEL_ID(), reqNote.getMAT_ID(),
                reqNote.getMAT_DES(), reqNote.getMAT_UNIT(), reqNote.getMAT_QTY());
    }

    @Override
    public void saveReqNote(ReqNoteDTO dto) {
        reqNoteRepository.save(new ReqNote(dto.getREQ_NO(), dto.getREQ_DATE(), dto.getREQ_BY(), dto.getMODEL_ID(), dto.getMAT_ID(),
                dto.getMAT_DES(), dto.getMAT_UNIT(), dto.getMAT_QTY()));
    }

    @Override
    public void updateReqNote(ReqNoteDTO dto) {
        reqNoteRepository.saveAndFlush(new ReqNote(dto.getREQ_NO(), dto.getREQ_DATE(), dto.getREQ_BY(), dto.getMODEL_ID(), dto.getMAT_ID(),
                dto.getMAT_DES(), dto.getMAT_UNIT(), dto.getMAT_QTY()));
    }

    @Override
    public void deleteReqNote(String id) {
        reqNoteRepository.deleteById(id);
    }
}
