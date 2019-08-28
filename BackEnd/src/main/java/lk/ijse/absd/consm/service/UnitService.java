package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.UnitDTO;

import java.util.List;

public interface UnitService {
    List<UnitDTO> getAllUnits();
    UnitDTO getUnit(String id);
    void saveUnit(UnitDTO dto);
    void updateUnit(UnitDTO dto);
    void deleteUnit(String id);
}
