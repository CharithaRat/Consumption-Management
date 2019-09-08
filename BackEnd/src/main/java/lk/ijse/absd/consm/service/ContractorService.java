package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.ContractorDTO;

import java.util.List;

public interface ContractorService {
    List<ContractorDTO> getAllContractors();
    ContractorDTO getContractor(int id);
    void saveContractor(ContractorDTO dto);
    void updateContractor(ContractorDTO dto);
    void deleteContractor(int id);
}
