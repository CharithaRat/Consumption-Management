package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.BomAssignedDTO;
import lk.ijse.absd.consm.entity.BomAssigned;
import lk.ijse.absd.consm.repository.BomAssignedRepository;
import lk.ijse.absd.consm.service.BomAssignedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class BomAssignedServiceImpl implements BomAssignedService {

    @Autowired
    private BomAssignedRepository bomAssignedRepository;

    @Override
    public List<BomAssignedDTO> getAllAssignedBomsDetails() {
        List<BomAssigned> assignedBoms = bomAssignedRepository.findAll();
        return assignedBoms.stream().map(a -> new BomAssignedDTO(a.getBOM_ID(), a.getBOM_USAGE(), a.getLENGTH(), a.getWIDTH(), a.getHEIGHT(), a.getCOV_AREA_UNIT(), a.getCOV_AREA(), a.getBOM_COST(), a.getASSIGN_DATE(), a.getCOST_PER_UNITAREA())).collect(Collectors.toList());
    }

    @Override
    public BomAssignedDTO getAssignedBomDetails(int id) {
        BomAssigned assignedBom = bomAssignedRepository.findById(id).get();
        return new BomAssignedDTO(assignedBom.getBOM_ID(), assignedBom.getBOM_USAGE(), assignedBom.getLENGTH(), assignedBom.getWIDTH(), assignedBom.getHEIGHT(), assignedBom.getCOV_AREA_UNIT(), assignedBom.getCOV_AREA(), assignedBom.getBOM_COST(), assignedBom.getASSIGN_DATE(), assignedBom.getCOST_PER_UNITAREA());
    }

    @Override
    public void saveAssignedBomDetails(BomAssignedDTO dto) {
        bomAssignedRepository.save(new BomAssigned(dto.getBOM_ID(), dto.getBOM_USAGE(), dto.getLENGTH(), dto.getWIDTH(), dto.getHEIGHT(), dto.getCOV_AREA_UNIT(), dto.getCOV_AREA(), dto.getBOM_COST(), dto.getASSIGN_DATE(), dto.getCOST_PER_UNITAREA()));
    }

    @Override
    public void updateAssignedBomDetails(BomAssignedDTO dto) {
        bomAssignedRepository.saveAndFlush(new BomAssigned(dto.getBOM_ID(), dto.getBOM_USAGE(), dto.getLENGTH(), dto.getWIDTH(), dto.getHEIGHT(), dto.getCOV_AREA_UNIT(), dto.getCOV_AREA(), dto.getBOM_COST(), dto.getASSIGN_DATE(), dto.getCOST_PER_UNITAREA()));
    }

    @Override
    public void deleteAssignedBomDetails(int id) {
        bomAssignedRepository.deleteById(id);
    }
}
