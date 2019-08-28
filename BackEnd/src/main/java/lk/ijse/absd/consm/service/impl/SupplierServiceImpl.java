package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.SupplierDTO;
import lk.ijse.absd.consm.entity.Supplier;
import lk.ijse.absd.consm.repository.SupplierRepository;
import lk.ijse.absd.consm.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<SupplierDTO> getAllSuppliers() {
        List<Supplier> suppliers = supplierRepository.findAll();
        return suppliers.stream().map(s -> new SupplierDTO(s.getSUP_ID(), s.getSUP_NAME(), s.getSUP_JOIN_DATE(),
                s.getSUP_CONTACT(), s.getADDRESS1(), s.getADDRESS2(), s.getADDRESS3())).collect(Collectors.toList());
    }

    @Override
    public SupplierDTO getSupplier(String id) {
        Supplier supplier = supplierRepository.findById(id).get();
        return new SupplierDTO(supplier.getSUP_ID(), supplier.getSUP_NAME(), supplier.getSUP_JOIN_DATE(),
                supplier.getSUP_CONTACT(), supplier.getADDRESS1(), supplier.getADDRESS2(), supplier.getADDRESS3());
    }

    @Override
    public void saveSupplier(SupplierDTO dto) {
        supplierRepository.save(new Supplier(dto.getSUP_ID(), dto.getSUP_NAME(), dto.getSUP_JOIN_DATE(), dto.getSUP_CONTACT(),
                dto.getADDRESS1(), dto.getADDRESS2(), dto.getADDRESS3()));
    }

    @Override
    public void updateSupplier(SupplierDTO dto) {
        supplierRepository.saveAndFlush(new Supplier(dto.getSUP_ID(), dto.getSUP_NAME(), dto.getSUP_JOIN_DATE(), dto.getSUP_CONTACT(),
                dto.getADDRESS1(), dto.getADDRESS2(), dto.getADDRESS3()));
    }

    @Override
    public void deleteSupplier(String id) {
        supplierRepository.deleteById(id);
    }
}
