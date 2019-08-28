package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.MaterialMasterDTO;

import java.util.List;

public interface MaterialMasterService {
    List<MaterialMasterDTO> getAllMaterials();
    MaterialMasterDTO getMaterial(String id);
    void saveMaterial(MaterialMasterDTO dto);
    void updateMaterial(MaterialMasterDTO dto);
    void deleteMaterial(String id);
}
