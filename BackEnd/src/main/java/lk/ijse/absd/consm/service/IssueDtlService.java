package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.IssueDtlDTO;

import java.util.List;

public interface IssueDtlService {
    List<IssueDtlDTO> getAllIssuingDetails();
    IssueDtlDTO getIssuingDetails(String id);
    void saveIssuingDetails(IssueDtlDTO dto);
    void updateIssuingDetails(IssueDtlDTO dto);
    void deleteIssuingDetails(String id);
}
