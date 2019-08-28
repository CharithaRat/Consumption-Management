package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.MainStockDTO;
import lk.ijse.absd.consm.entity.MainStock;
import lk.ijse.absd.consm.repository.MainStockRepository;
import lk.ijse.absd.consm.service.MainStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MainStockServiceImpl implements MainStockService {

    @Autowired
    private MainStockRepository mainStockRepository;

    @Override
    public List<MainStockDTO> getAllStocks() {
        List<MainStock> mainStocks = mainStockRepository.findAll();
        return mainStocks.stream().map(m -> new MainStockDTO(m.getBIN_ITEM(), m.getMAT_ID(), m.getMAT_DES(), m.getMAT_UNIT(), m.getMAT_QTY(),
                m.getMAT_COST(), m.getTTL_AMOUNT(), m.getLOCATION())).collect(Collectors.toList());
    }

    @Override
    public MainStockDTO getStock(String id) {
        MainStock mainStock = mainStockRepository.findById(id).get();
        return new MainStockDTO(mainStock.getBIN_ITEM(), mainStock.getMAT_ID(), mainStock.getMAT_DES(), mainStock.getMAT_UNIT(), mainStock.getMAT_QTY(),
                mainStock.getMAT_COST(), mainStock.getTTL_AMOUNT(), mainStock.getLOCATION());
    }

    @Override
    public void saveStock(MainStockDTO dto) {
        mainStockRepository.save(new MainStock(dto.getBIN_ITEM(), dto.getMAT_ID(), dto.getMAT_DES(), dto.getMAT_UNIT(), dto.getMAT_QTY(),
                dto.getMAT_COST(), dto.getTTL_AMOUNT(), dto.getLOCATION()));
    }

    @Override
    public void updateStock(MainStockDTO dto) {
        mainStockRepository.saveAndFlush(new MainStock(dto.getBIN_ITEM(), dto.getMAT_ID(), dto.getMAT_DES(), dto.getMAT_UNIT(), dto.getMAT_QTY(),
                dto.getMAT_COST(), dto.getTTL_AMOUNT(), dto.getLOCATION()));
    }

    @Override
    public void deleteStock(String id) {
        mainStockRepository.deleteById(id);
    }
}
