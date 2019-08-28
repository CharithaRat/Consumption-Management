package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.ProdOutputDTO;

import java.util.List;

public interface ProdOutputService {
    List<ProdOutputDTO> getAllProdDetails();
    ProdOutputDTO getProdDetail(String id);
    void saveProdDetail(ProdOutputDTO dto);
    void updateProdDetail(ProdOutputDTO dto);
    void deleteProdDetail(String id);
}
