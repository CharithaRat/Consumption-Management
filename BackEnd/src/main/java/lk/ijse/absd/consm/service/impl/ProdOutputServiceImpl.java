package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.ProdOutputDTO;
import lk.ijse.absd.consm.entity.ProdOutput;
import lk.ijse.absd.consm.repository.ProdOutputRepository;
import lk.ijse.absd.consm.service.ProdOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProdOutputServiceImpl implements ProdOutputService {

    @Autowired
    private ProdOutputRepository prodOutputRepository;

    @Override
    public List<ProdOutputDTO> getAllProdDetails() {
        List<ProdOutput> prodOutputs = prodOutputRepository.findAll();
        return prodOutputs.stream().map(p -> new ProdOutputDTO(p.getMODEL_ID(), p.getPRD_DATE(), p.getBOM_ID(), p.getBOM_USAGE(), p.getCOV_AREA(),
                p.getCOV_VOLUME())).collect(Collectors.toList());
    }

    @Override
    public ProdOutputDTO getProdDetail(String id) {
        ProdOutput prodOutput = prodOutputRepository.findById(id).get();
        return new ProdOutputDTO(prodOutput.getMODEL_ID(), prodOutput.getPRD_DATE(), prodOutput.getBOM_ID(), prodOutput.getBOM_USAGE(), prodOutput.getCOV_AREA(),
                prodOutput.getCOV_VOLUME());
    }

    @Override
    public void saveProdDetail(ProdOutputDTO dto) {
        prodOutputRepository.save(new ProdOutput(dto.getMODEL_ID(), dto.getPRD_DATE(), dto.getBOM_ID(), dto.getBOM_USAGE(), dto.getCOV_AREA(),
                dto.getCOV_VOLUME()));
    }

    @Override
    public void updateProdDetail(ProdOutputDTO dto) {
        prodOutputRepository.saveAndFlush(new ProdOutput(dto.getMODEL_ID(), dto.getPRD_DATE(), dto.getBOM_ID(), dto.getBOM_USAGE(), dto.getCOV_AREA(),
                dto.getCOV_VOLUME()));
    }

    @Override
    public void deleteProdDetail(String id) {
        prodOutputRepository.deleteById(id);
    }
}
