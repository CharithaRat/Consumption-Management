package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.XbomDTO;
import lk.ijse.absd.consm.entity.Xbom;
import lk.ijse.absd.consm.repository.XbomRepository;
import lk.ijse.absd.consm.service.XbomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class XbomServiceImpl implements XbomService {

    @Autowired
    private XbomRepository xbomRepository;

    @Override
    public List<XbomDTO> getAllXboms() {
        List<Xbom> xboms = xbomRepository.findAll();
        return xboms.stream().map(x -> new XbomDTO(x.getXBOM_ID(), x.getBOM_ID(), x.getBOM_TYPE(), x.getMODEL_ID(), x.getBOM_COST(), x.getXBOM_GUR_PER())).collect(Collectors.toList());
    }

    @Override
    public XbomDTO getXbom(String id) {
        Xbom xbom = xbomRepository.findById(id).get();
        return new XbomDTO(xbom.getXBOM_ID(), xbom.getBOM_ID(), xbom.getBOM_TYPE(), xbom.getMODEL_ID(), xbom.getBOM_COST(), xbom.getXBOM_GUR_PER());
    }

    @Override
    public void saveXbom(XbomDTO dto) {
        xbomRepository.save(new Xbom(dto.getXBOM_ID(), dto.getBOM_ID(), dto.getBOM_TYPE(), dto.getMODEL_ID(), dto.getBOM_COST(), dto.getXBOM_GUR_PER()));
    }

    @Override
    public void updateXbom(XbomDTO dto) {
        xbomRepository.saveAndFlush(new Xbom(dto.getXBOM_ID(), dto.getBOM_ID(), dto.getBOM_TYPE(), dto.getMODEL_ID(), dto.getBOM_COST(), dto.getXBOM_GUR_PER()));
    }

    @Override
    public void deleteXbom(String id) {
        xbomRepository.deleteById(id);
    }
}
