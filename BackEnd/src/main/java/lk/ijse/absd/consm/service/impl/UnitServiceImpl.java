package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.UnitDTO;
import lk.ijse.absd.consm.entity.Unit;
import lk.ijse.absd.consm.repository.UnitRepository;
import lk.ijse.absd.consm.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UnitServiceImpl implements UnitService {

    @Autowired
    private UnitRepository unitRepository;

    @Override
    public List<UnitDTO> getAllUnits() {
        List<Unit> units = unitRepository.findAll();
        return units.stream().map(u -> new UnitDTO(u.getUNIT_ID(), u.getUNIT_DES(), u.getUNIT_SYMBOL())).collect(Collectors.toList());
    }

    @Override
    public UnitDTO getUnit(String id) {
        Unit unit = unitRepository.findById(id).get();
        return new UnitDTO(unit.getUNIT_ID(), unit.getUNIT_DES(), unit.getUNIT_SYMBOL());
    }

    @Override
    public void saveUnit(UnitDTO dto) {
        unitRepository.save(new Unit(dto.getUNIT_ID(), dto.getUNIT_DES(), dto.getUNIT_SYMBOL()));
    }

    @Override
    public void updateUnit(UnitDTO dto) {
        unitRepository.saveAndFlush(new Unit(dto.getUNIT_ID(), dto.getUNIT_DES(), dto.getUNIT_SYMBOL()));
    }

    @Override
    public void deleteUnit(String id) {
        unitRepository.deleteById(id);
    }
}
