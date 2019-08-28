package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.UnitRelationDTO;
import lk.ijse.absd.consm.entity.UnitRelation;
import lk.ijse.absd.consm.repository.UnitRelationRepository;
import lk.ijse.absd.consm.service.UnitRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UnitRelationServiceImpl implements UnitRelationService {

    @Autowired
    private UnitRelationRepository unitRelationRepository;

    @Override
    public List<UnitRelationDTO> getAllUnitRelations() {
        List<UnitRelation> unitRelTypes = unitRelationRepository.findAll();
        return unitRelTypes.stream().map(u -> new UnitRelationDTO(u.getBASE_UNIT(), u.getREL_UNIT(), u.getUNIT_RATE())).collect(Collectors.toList());
    }

    @Override
    public UnitRelationDTO getUnitRelation(String id) {
        UnitRelation unitRelation = unitRelationRepository.findById(id).get();
        return new UnitRelationDTO(unitRelation.getBASE_UNIT(), unitRelation.getREL_UNIT(), unitRelation.getUNIT_RATE());
    }

    @Override
    public void saveUnitRelation(UnitRelationDTO dto) {
        unitRelationRepository.save(new UnitRelation(dto.getBASE_UNIT(), dto.getREL_UNIT(), dto.getUNIT_RATE()));
    }

    @Override
    public void updateUnitRelation(UnitRelationDTO dto) {
        unitRelationRepository.saveAndFlush(new UnitRelation(dto.getBASE_UNIT(), dto.getREL_UNIT(), dto.getUNIT_RATE()));
    }

    @Override
    public void deleteUnitRelation(String id) {
        unitRelationRepository.deleteById(id);
    }
}
