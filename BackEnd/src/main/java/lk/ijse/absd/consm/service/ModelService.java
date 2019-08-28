package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.ModelDTO;

import java.util.List;

public interface ModelService {
    List<ModelDTO> getAllModels();
    ModelDTO getModel(String id);
    void saveModel(ModelDTO dto);
    void updateModel(ModelDTO dto);
    void deleteModel(String id);
}
