package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.MaterialMasterDTO;

import java.util.List;

public interface MaterialMasterService {
    List<MaterialMasterDTO> getAllMaterials();

    MaterialMasterDTO getMaterial(int id);

    void saveMaterial(MaterialMasterDTO dto);
//    MaterialMasterDTO saveMaterial(MaterialMasterDTO dto);

    void updateMaterial(MaterialMasterDTO dto);

    void deleteMaterial(int id);

    List<MaterialMasterDTO> findAllMaterials();

    MaterialMasterDTO findByFirstName(String id);
}
