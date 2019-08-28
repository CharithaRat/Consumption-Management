package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.MainMasterDTO;
import lk.ijse.absd.consm.entity.MainMaster;
import lk.ijse.absd.consm.repository.MainMasterRepository;
import lk.ijse.absd.consm.service.MainMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MainMasterServiceImpl implements MainMasterService {

    @Autowired
    private MainMasterRepository mainMasterRepository;

    @Override
    public List<MainMasterDTO> getAllMainCodes() {
        List<MainMaster> mainMasters = mainMasterRepository.findAll();
        return mainMasters.stream().map(m -> new MainMasterDTO(m.getMAIN_ID(), m.getMAIN_DES())).collect(Collectors.toList());
    }

    @Override
    public MainMasterDTO getSelectedMainMasterDetails(String id) {
        MainMaster master = mainMasterRepository.findById(id).get();
        return new MainMasterDTO(master.getMAIN_ID(), master.getMAIN_DES());
    }
}
