package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {
    List<SupplierDTO> getAllSuppliers();
    SupplierDTO getSupplier(int id);
    void saveSupplier(SupplierDTO dto);
    void updateSupplier(SupplierDTO dto);
    void deleteSupplier(int id);
}
