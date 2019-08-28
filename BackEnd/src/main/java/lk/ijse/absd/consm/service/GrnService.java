package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.GrnDTO;

import java.util.List;

public interface GrnService {
    List<GrnDTO> getAllGrns();
    GrnDTO getGrn(String id);
    void saveGrn(GrnDTO dto);
    void updateGrn(GrnDTO dto);
    void deleteGrn(String id);
}
