package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.SupplyDTO;

import java.util.List;

public interface SupplyService {
    List<SupplyDTO> getAllSupplies();
    SupplyDTO getSupply(int id);
}
