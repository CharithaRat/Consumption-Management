package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.MaterialMasterDTO;
import lk.ijse.absd.consm.entity.MaterialMaster;
import lk.ijse.absd.consm.repository.MaterialMasterRepository;
import lk.ijse.absd.consm.service.MaterialMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MaterialMasterServiceImpl implements MaterialMasterService {

    @Autowired
    private MaterialMasterRepository materialMasterRepository;

    @Override
    public List<MaterialMasterDTO> getAllMaterials() {
        List<MaterialMaster> materials = materialMasterRepository.findAll();
        return materials.stream().map(m -> new MaterialMasterDTO(
                m.getMATERIAL_ID(),
                m.getMAT_ID_CODE(),
                m.getMATERIAL_NAME(),
                m.getMATERIAL_TYPE(),
                m.getMATERIAL_GRADE(),
                m.getMATERIAL_UNIT(),
                m.getUNIT_PRICE(),
                m.getMAT_DATE(),
                m.getMATERIAL_CODE(),
                m.getUnit(),
                m.getMainm(),
                m.getSubm(),
                m.getDetailm())).collect(Collectors.toList());

//                m.getMATERIAL_ID(),
//                m.getMAT_ID_CODE(),
//                m.getMATERIAL_NAME(),
//                m.getMATERIAL_TYPE(),
//                m.getMATERIAL_GRADE(),
//                m.getMATERIAL_UNIT(),
//                m.getUNIT_PRICE(),
//                m.getMAT_DATE(),
//                m.getMATERIAL_CODE())).collect(Collectors.toList());
    }

    @Override
    public MaterialMasterDTO getMaterial(int id) {
        MaterialMaster material = materialMasterRepository.findById(id).get();
        return new MaterialMasterDTO(
                material.getMATERIAL_ID(),
                material.getMAT_ID_CODE(),
                material.getMATERIAL_NAME(),
                material.getMATERIAL_TYPE(),
                material.getMATERIAL_GRADE(),
                material.getMATERIAL_UNIT(),
                material.getUNIT_PRICE(),
                material.getMAT_DATE(),
                material.getMATERIAL_CODE());
    }

    @Override
    public void saveMaterial(MaterialMasterDTO dto) {
        materialMasterRepository.save(new MaterialMaster(
                dto.getMAT_ID_CODE(),
                dto.getMATERIAL_NAME(),
                dto.getMATERIAL_TYPE(),
                dto.getMATERIAL_GRADE(),
                dto.getMATERIAL_UNIT(),
                dto.getUNIT_PRICE(),
                dto.getMAT_DATE(),
                dto.getMATERIAL_CODE(),
                dto.getUnit(),
                dto.getMain(),
                dto.getSub(),
                dto.getDetails()));
    }

    @Override
    public void updateMaterial(MaterialMasterDTO dto) {
        materialMasterRepository.saveAndFlush(
                new MaterialMaster(dto.getMAT_ID_CODE(),
                        dto.getMATERIAL_NAME(),
                        dto.getMATERIAL_TYPE(),
                        dto.getMATERIAL_GRADE(),
                        dto.getMATERIAL_UNIT(),
                        dto.getUNIT_PRICE(),
                        dto.getMAT_DATE(),
                        dto.getMATERIAL_CODE()));
    }

    @Override
    public void deleteMaterial(int id) {
        materialMasterRepository.deleteById(id);
    }

    @Override
    public List<MaterialMasterDTO> findAllMaterials() {
        List<MaterialMaster> materials = materialMasterRepository.findAll();
        return materials.stream().map(m -> new MaterialMasterDTO(
                m.getMATERIAL_ID(),
                m.getMAT_ID_CODE(),
                m.getMATERIAL_NAME(),
                m.getMATERIAL_TYPE(),
                m.getMATERIAL_GRADE(),
                m.getMATERIAL_UNIT(),
                m.getUNIT_PRICE(),
                m.getMAT_DATE(),
                m.getMATERIAL_CODE(),
                m.getUnit(),
                m.getMainm(),
                m.getSubm(),
                m.getDetailm())).collect(Collectors.toList());
    }

    @Override
    public MaterialMasterDTO findByFirstName(String id) {
        return null;
    }

}
