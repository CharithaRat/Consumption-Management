package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.ModelDTO;
import lk.ijse.absd.consm.entity.Model;
import lk.ijse.absd.consm.repository.ModelRepository;
import lk.ijse.absd.consm.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public List<ModelDTO> getAllModels() {
        List<Model> models = modelRepository.findAll();
        return models.stream().map(m -> new ModelDTO(m.getMODEL_ID(), m.getMODEL_NAME(), m.getMODEL_CRE_DATE(),
                m.getMODEL_TYPE())).collect(Collectors.toList());
    }

    @Override
    public ModelDTO getModel(String id) {
        Model model = modelRepository.findById(id).get();
        return new ModelDTO(model.getMODEL_ID(), model.getMODEL_NAME(), model.getMODEL_CRE_DATE(), model.getMODEL_TYPE());
    }

    @Override
    public void saveModel(ModelDTO dto) {
        modelRepository.save(new Model(dto.getMODEL_ID(), dto.getMODEL_NAME(), dto.getMODEL_CRE_DATE(), dto.getMODEL_TYPE()));
    }

    @Override
    public void updateModel(ModelDTO dto) {
        modelRepository.saveAndFlush(new Model(dto.getMODEL_ID(), dto.getMODEL_NAME(), dto.getMODEL_CRE_DATE(), dto.getMODEL_TYPE()));
    }

    @Override
    public void deleteModel(String id) {
        modelRepository.deleteById(id);
    }
}
