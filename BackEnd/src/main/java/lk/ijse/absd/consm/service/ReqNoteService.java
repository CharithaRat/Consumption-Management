package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.ReqNoteDTO;

import java.util.List;

public interface ReqNoteService {
    List<ReqNoteDTO> getAllReqNotes();
    ReqNoteDTO getReqNote(String id);
    void saveReqNote(ReqNoteDTO dto);
    void updateReqNote(ReqNoteDTO dto);
    void deleteReqNote(String id);
}
