package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.ContractorDTO;
import lk.ijse.absd.consm.entity.Contractor;
import lk.ijse.absd.consm.repository.ContractorRepository;
import lk.ijse.absd.consm.service.ContractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ContractorServiceImpl implements ContractorService {

    @Autowired
    private ContractorRepository contractorRepository;

    @Override
    public List<ContractorDTO> getAllContractors() {
        List<Contractor> contractors = contractorRepository.findAll();
        return contractors.stream().map(c -> new ContractorDTO(c.getCONT_ID(), c.getCONT_NAME(), c.getCONT_JOIN_DATE(),
                c.getCONT_CONTACT(), c.getADDRESS1(), c.getADDRESS2(), c.getADDRESS3())).collect(Collectors.toList());
    }

    @Override
    public ContractorDTO getContractor(String id) {
        Contractor contractor = contractorRepository.findById(id).get();
        return new ContractorDTO(contractor.getCONT_ID(), contractor.getCONT_NAME(), contractor.getCONT_JOIN_DATE(), contractor.getCONT_CONTACT(),
                contractor.getADDRESS1(), contractor.getADDRESS2(), contractor.getADDRESS3());
    }

    @Override
    public void saveContractor(ContractorDTO dto) {
        contractorRepository.save(new Contractor(dto.getCONT_ID(), dto.getCONT_NAME(), dto.getCONT_JOIN_DATE(), dto.getCONT_CONTACT(), dto.getADDRESS1(),
                dto.getADDRESS2(), dto.getADDRESS3()));
    }

    @Override
    public void updateContractor(ContractorDTO dto) {
        contractorRepository.saveAndFlush(new Contractor(dto.getCONT_ID(), dto.getCONT_NAME(), dto.getCONT_JOIN_DATE(), dto.getCONT_CONTACT(), dto.getADDRESS1(),
                dto.getADDRESS2(), dto.getADDRESS3()));
    }

    @Override
    public void deleteContractor(String id) {
        contractorRepository.deleteById(id);
    }
}
