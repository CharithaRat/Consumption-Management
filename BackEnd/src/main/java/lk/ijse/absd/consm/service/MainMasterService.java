package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.MainMasterDTO;

import java.util.List;

public interface MainMasterService {
    List<MainMasterDTO> getAllMainCodes();
    MainMasterDTO getSelectedMainMasterDetails(String id);
}
