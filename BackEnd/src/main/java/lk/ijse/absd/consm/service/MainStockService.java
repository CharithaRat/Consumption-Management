package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.MainStockDTO;

import java.util.List;

public interface MainStockService {
    List<MainStockDTO> getAllStocks();
    MainStockDTO getStock(String id);
    void saveStock(MainStockDTO dto);
    void updateStock(MainStockDTO dto);
    void deleteStock(String id);
}
