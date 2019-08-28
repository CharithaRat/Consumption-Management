package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.SubMasterDTO;
import lk.ijse.absd.consm.entity.SubMaster;
import lk.ijse.absd.consm.repository.SubMasterRepository;
import lk.ijse.absd.consm.service.SubMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SubMasterServiceImpl implements SubMasterService {

    @Autowired
    private SubMasterRepository subMasterRepository;

    @Override
    public List<SubMasterDTO> getAllSubCodes() {
        List<SubMaster> subMasters = subMasterRepository.findAll();
        return subMasters.stream().map(s -> new SubMasterDTO(s.getSUB_ID(), s.getSUB_DES())).collect(Collectors.toList());
    }

    @Override
    public SubMasterDTO getSelectedSubMasterDetails(String id) {
        SubMaster sMaster = subMasterRepository.findById(id).get();
        return new SubMasterDTO(sMaster.getSUB_ID(), sMaster.getSUB_DES());
    }
}
