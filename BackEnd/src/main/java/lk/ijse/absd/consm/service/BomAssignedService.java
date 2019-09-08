package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.BomAssignedDTO;

import java.util.List;

public interface BomAssignedService {
    List<BomAssignedDTO> getAllAssignedBomsDetails();
    BomAssignedDTO getAssignedBomDetails(int id);
    void saveAssignedBomDetails(BomAssignedDTO dto);
    void updateAssignedBomDetails(BomAssignedDTO dto);
    void deleteAssignedBomDetails(int id);
}
