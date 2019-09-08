package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.DetailMasterDTO;

import java.util.List;

public interface DetailMasterService {
    List<DetailMasterDTO> getAllDetailCodes();
    DetailMasterDTO getSelectedDetailMasterDetails(String id);
    void saveDetailMasterDetails(DetailMasterDTO dto);
}
