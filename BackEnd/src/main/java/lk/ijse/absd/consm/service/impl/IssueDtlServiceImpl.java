package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.IssueDtlDTO;
import lk.ijse.absd.consm.entity.IssueDtl;
import lk.ijse.absd.consm.repository.IssueDtlRepository;
import lk.ijse.absd.consm.service.IssueDtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class IssueDtlServiceImpl implements IssueDtlService {

    @Autowired
    private IssueDtlRepository issueDtlRepository;

    @Override
    public List<IssueDtlDTO> getAllIssuingDetails() {
        List<IssueDtl> issueDtls = issueDtlRepository.findAll();
        return issueDtls.stream().map(i -> new IssueDtlDTO(i.getISU_NOTE_NO(), i.getISU_DATE(), i.getISU_BY(), i.getREQ_BY(), i.getREQ_ID(),
                i.getREQ_DATE(), i.getMAT_ID(), i.getMAT_DES(), i.getMAT_UNIT(), i.getMAT_REQ_QTY(), i.getMAT_ISU_QTY(), i.getMAT_SER_NO())).collect(Collectors.toList());
    }

    @Override
    public IssueDtlDTO getIssuingDetails(String id) {
        IssueDtl issueDtl = issueDtlRepository.findById(id).get();
        return new IssueDtlDTO(issueDtl.getISU_NOTE_NO(), issueDtl.getISU_DATE(), issueDtl.getISU_BY(), issueDtl.getREQ_BY(), issueDtl.getREQ_ID(),
                issueDtl.getREQ_DATE(), issueDtl.getMAT_ID(), issueDtl.getMAT_DES(), issueDtl.getMAT_UNIT(), issueDtl.getMAT_REQ_QTY(), issueDtl.getMAT_ISU_QTY(), issueDtl.getMAT_SER_NO());
    }

    @Override
    public void saveIssuingDetails(IssueDtlDTO dto) {
        issueDtlRepository.save(new IssueDtl(dto.getISU_NOTE_NO(), dto.getISU_DATE(), dto.getISU_BY(), dto.getREQ_BY(), dto.getREQ_ID(),
                dto.getREQ_DATE(), dto.getMAT_ID(), dto.getMAT_DES(), dto.getMAT_UNIT(), dto.getMAT_REQ_QTY(), dto.getMAT_ISU_QTY(), dto.getMAT_SER_NO()));
    }

    @Override
    public void updateIssuingDetails(IssueDtlDTO dto) {
        issueDtlRepository.saveAndFlush(new IssueDtl(dto.getISU_NOTE_NO(), dto.getISU_DATE(), dto.getISU_BY(), dto.getREQ_BY(), dto.getREQ_ID(),
                dto.getREQ_DATE(), dto.getMAT_ID(), dto.getMAT_DES(), dto.getMAT_UNIT(), dto.getMAT_REQ_QTY(), dto.getMAT_ISU_QTY(), dto.getMAT_SER_NO()));
    }

    @Override
    public void deleteIssuingDetails(String id) {
        issueDtlRepository.deleteById(id);
    }
}
