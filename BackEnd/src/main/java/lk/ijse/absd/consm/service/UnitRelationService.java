package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.UnitRelationDTO;

import java.util.List;

public interface UnitRelationService {
    List<UnitRelationDTO> getAllUnitRelations();
    UnitRelationDTO getUnitRelation(String id);
    void saveUnitRelation(UnitRelationDTO dto);
    void updateUnitRelation(UnitRelationDTO dto);
    void deleteUnitRelation(String id);
}
