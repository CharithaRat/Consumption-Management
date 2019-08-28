package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.BomMatDTO;
import lk.ijse.absd.consm.entity.BomMat;
import lk.ijse.absd.consm.repository.BomMatRepository;
import lk.ijse.absd.consm.service.BomMatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BomMatServiceImpl implements BomMatService {

    @Autowired
    private BomMatRepository bomMatRepository;

    @Override
    public List<BomMatDTO> getAllBomMaterials() {
        List<BomMat> bomMaterials = bomMatRepository.findAll();
        return bomMaterials.stream().map(b -> new BomMatDTO(b.getBOM_ID(), b.getMAT_ID(), b.getMAT_NAME(), b.getMAT_UNIT(), b.getMAT_QTY(), b.getMAT_UNIT_COST(), b.getMAT_TTL_AMOUNT()
        )).collect(Collectors.toList());
    }

    @Override
    public BomMatDTO getBomMaterial(String id) {
        BomMat bomMaterial = bomMatRepository.findById(id).get();
        return new BomMatDTO(bomMaterial.getBOM_ID(), bomMaterial.getMAT_ID(), bomMaterial.getMAT_NAME(), bomMaterial.getMAT_UNIT(), bomMaterial.getMAT_QTY(), bomMaterial.getMAT_UNIT_COST(), bomMaterial.getMAT_TTL_AMOUNT());
    }

    @Override
    public void saveBomMaterial(BomMatDTO dto) {
        bomMatRepository.save(new BomMat(dto.getBOM_ID(), dto.getMAT_ID(), dto.getMAT_NAME(), dto.getMAT_UNIT(), dto.getMAT_QTY(), dto.getMAT_UNIT_COST(), dto.getMAT_TTL_AMOUNT()));
    }

    @Override
    public void updateBomMaterial(BomMatDTO dto) {
        bomMatRepository.saveAndFlush(new BomMat(dto.getBOM_ID(), dto.getMAT_ID(), dto.getMAT_NAME(), dto.getMAT_UNIT(), dto.getMAT_QTY(), dto.getMAT_UNIT_COST(), dto.getMAT_TTL_AMOUNT()));
    }

    @Override
    public void deleteBomMaterial(String id) {
        bomMatRepository.deleteById(id);
    }
}
