package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.DetailMasterDTO;
import lk.ijse.absd.consm.entity.DetailMaster;
import lk.ijse.absd.consm.repository.DetailMasterRepository;
import lk.ijse.absd.consm.service.DetailMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DetailMasterServiceImpl implements DetailMasterService {

    @Autowired
    private DetailMasterRepository detailMasterRepository;

    @Override
    public List<DetailMasterDTO> getAllDetailCodes() {
        List<DetailMaster> detailMasters = detailMasterRepository.findAll();
        return detailMasters.stream().map(d -> new DetailMasterDTO(d.getDETAIL_ID(), d.getDETAIL_NAME())).collect(Collectors.toList());
    }

    @Override
    public DetailMasterDTO getSelectedDetailMasterDetails(String id) {
        DetailMaster dMaster = detailMasterRepository.findById(id).get();
        return new DetailMasterDTO(dMaster.getDETAIL_ID(), dMaster.getDETAIL_NAME());
    }
}
