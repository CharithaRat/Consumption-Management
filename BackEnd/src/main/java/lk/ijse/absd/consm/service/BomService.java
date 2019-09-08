package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.BomDTO;

import java.util.List;

public interface BomService {
    List<BomDTO> getAllBoms();
    BomDTO getBom(int id);
    void saveBom(BomDTO dto);
    void updateBom(BomDTO dto);
    void deleteBom(int id);
}
