package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.BomMatDTO;

import java.util.List;

public interface BomMatService {
    List<BomMatDTO> getAllBomMaterials();
    BomMatDTO getBomMaterial(String id);
    void saveBomMaterial(BomMatDTO dto);
    void updateBomMaterial(BomMatDTO dto);
    void deleteBomMaterial(String id);
}
