package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.SupplyDTO;
import lk.ijse.absd.consm.entity.Supply;
import lk.ijse.absd.consm.repository.SupplyRepository;
import lk.ijse.absd.consm.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SupplyServiceImpl implements SupplyService {

    @Autowired
    private SupplyRepository supplyRepository;

    @Override
    public List<SupplyDTO> getAllSupplies() {
        List<Supply> supplies = supplyRepository.findAll();
        return supplies.stream().map(s->new SupplyDTO(s.getSupplyId(), s.getSupId(), s.getMatId())).collect(Collectors.toList());
    }

    @Override
    public SupplyDTO getSupply(int id) {
        Supply supply = supplyRepository.findById(id).get();
        return new SupplyDTO(supply.getSupplyId(), supply.getSupId(), supply.getMatId());
    }
}
