package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.BomDTO;
import lk.ijse.absd.consm.entity.Bom;
import lk.ijse.absd.consm.repository.BomRepository;
import lk.ijse.absd.consm.service.BomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BomServiceImpl implements BomService {

    @Autowired
    private BomRepository bomRepository;


    @Override
    public List<BomDTO> getAllBoms() {
        List<Bom> boms = bomRepository.findAll();
        return boms.stream().map(b -> new BomDTO(b.getBOM_ID(), b.getBOM_CODE(), b.getBOM_DES(), b.getBOM_TYPE(), b.getBOM_UNIT(), b.getBOM_DATE(),
                b.getBOM_VALUE(), b.getBOM_GUR_PER())).collect(Collectors.toList());
    }

    @Override
    public BomDTO getBom(int id) {
        Bom bomd = bomRepository.findById(id).get();
        return new BomDTO(bomd.getBOM_ID(), bomd.getBOM_CODE(), bomd.getBOM_DES(), bomd.getBOM_TYPE(), bomd.getBOM_UNIT(), bomd.getBOM_DATE(),
                bomd.getBOM_VALUE(), bomd.getBOM_GUR_PER());
    }

    @Override
    public void saveBom(BomDTO dto) {
        bomRepository.save(new Bom(dto.getBOM_CODE(), dto.getBOM_DES(), dto.getBOM_TYPE(), dto.getBOM_UNIT(), dto.getBOM_DATE(),
                dto.getBOM_VALUE(), dto.getBOM_GUR_PER()));
    }

    @Override
    public void updateBom(BomDTO dto) {
        bomRepository.saveAndFlush(new Bom(dto.getBOM_CODE(), dto.getBOM_DES(), dto.getBOM_TYPE(), dto.getBOM_UNIT(), dto.getBOM_DATE(),
                dto.getBOM_VALUE(), dto.getBOM_GUR_PER()));
    }

    @Override
    public void deleteBom(int id) {
        bomRepository.deleteById(id);
    }
}
