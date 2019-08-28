package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.XbomDTO;

import java.util.List;

public interface XbomService {
    List<XbomDTO> getAllXboms();
    XbomDTO getXbom(String id);
    void saveXbom(XbomDTO dto);
    void updateXbom(XbomDTO dto);
    void deleteXbom(String id);
}
