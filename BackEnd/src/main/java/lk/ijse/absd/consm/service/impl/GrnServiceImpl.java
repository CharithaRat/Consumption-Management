package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.GrnDTO;
import lk.ijse.absd.consm.entity.Grn;
import lk.ijse.absd.consm.repository.GrnRepository;
import lk.ijse.absd.consm.service.GrnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class GrnServiceImpl implements GrnService {

    @Autowired
    private GrnRepository grnRepository;

    @Override
    public List<GrnDTO> getAllGrns() {
        List<Grn> grns = grnRepository.findAll();
        return grns.stream().map(g -> new GrnDTO(g.getGRN_ID(), g.getGRN_DATE(), g.getSUP_ID(), g.getSUP_DES(), g.getMAT_ID(), g.getMAT_DES(),
                g.getMAT_UNIT(), g.getMAT_UNIT_PRICE(), g.getMAT_GRN_QTY(), g.getGRN_AMOUT(), g.getTTL_AMOUNT())).collect(Collectors.toList());
    }

    @Override
    public GrnDTO getGrn(String id) {
        Grn grn = grnRepository.findById(id).get();
        return new GrnDTO(grn.getGRN_ID(), grn.getGRN_DATE(), grn.getSUP_ID(), grn.getSUP_DES(), grn.getMAT_ID(), grn.getMAT_DES(),
                grn.getMAT_UNIT(), grn.getMAT_UNIT_PRICE(), grn.getMAT_GRN_QTY(), grn.getGRN_AMOUT(), grn.getTTL_AMOUNT());
    }

    @Override
    public void saveGrn(GrnDTO dto) {
        grnRepository.save(new Grn(dto.getGRN_ID(), dto.getGRN_DATE(), dto.getSUP_ID(), dto.getSUP_DES(), dto.getMAT_ID(), dto.getMAT_DES(),
                dto.getMAT_UNIT(), dto.getMAT_UNIT_PRICE(), dto.getMAT_GRN_QTY(), dto.getGRN_AMOUT(), dto.getTTL_AMOUNT()));
    }

    @Override
    public void updateGrn(GrnDTO dto) {
        grnRepository.saveAndFlush(new Grn(dto.getGRN_ID(), dto.getGRN_DATE(), dto.getSUP_ID(), dto.getSUP_DES(), dto.getMAT_ID(), dto.getMAT_DES(),
                dto.getMAT_UNIT(), dto.getMAT_UNIT_PRICE(), dto.getMAT_GRN_QTY(), dto.getGRN_AMOUT(), dto.getTTL_AMOUNT()));
    }

    @Override
    public void deleteGrn(String id) {
        grnRepository.deleteById(id);
    }
}
