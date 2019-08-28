package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.SubMasterDTO;

import java.util.List;

public interface SubMasterService {
    List<SubMasterDTO>  getAllSubCodes();
    SubMasterDTO getSelectedSubMasterDetails(String id);;
}
