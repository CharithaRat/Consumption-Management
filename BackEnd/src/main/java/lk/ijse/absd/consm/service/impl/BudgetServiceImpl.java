package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.BudgetDTO;
import lk.ijse.absd.consm.entity.Budget;
import lk.ijse.absd.consm.repository.BudgetRepository;
import lk.ijse.absd.consm.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BudgetServiceImpl implements BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    @Override
    public List<BudgetDTO> getAllBudgets() {
        List<Budget> budgets = budgetRepository.findAll();
        return budgets.stream().map(b -> new BudgetDTO(b.getBUDGET_ID(), b.getBUDGET_CODE(), b.getMODEL_ID(), b.getXBOM_ID(), b.getBOM_ID(), b.getBOM_TYPE(), b.getBOM_USAGE(),
                b.getLENGTH(), b.getWIDTH(), b.getHEIGHT(), b.getBOM_COST(), b.getNO_OF_BOM_UNITS(), b.getREQ_AREA(), b.getCOV_AREA_BY_CMT(),
                b.getACT_COST(), b.getBUD_DATE(), b.getTTL_BUDGET_COST())).collect(Collectors.toList());
    }

    @Override
    public BudgetDTO getBudget(int id) {
        Budget bud = budgetRepository.findById(id).get();
        return new BudgetDTO(bud.getBUDGET_ID(), bud.getBUDGET_CODE(), bud.getMODEL_ID(), bud.getXBOM_ID(), bud.getBOM_ID(), bud.getBOM_TYPE(), bud.getBOM_USAGE(),
                bud.getLENGTH(), bud.getWIDTH(), bud.getHEIGHT(), bud.getBOM_COST(), bud.getNO_OF_BOM_UNITS(), bud.getREQ_AREA(), bud.getCOV_AREA_BY_CMT(),
                bud.getACT_COST(), bud.getBUD_DATE(), bud.getTTL_BUDGET_COST());
    }

    @Override
    public void saveBusget(BudgetDTO dto) {
        budgetRepository.save(new Budget(dto.getBUDGET_CODE(), dto.getBOM_ID(), dto.getMODEL_ID(), dto.getXBOM_ID(), dto.getBOM_TYPE(), dto.getBOM_USAGE(),
                dto.getLENGTH(), dto.getWIDTH(), dto.getHEIGHT(), dto.getBOM_COST(), dto.getNO_OF_BOM_UNITS(), dto.getREQ_AREA(), dto.getCOV_AREA_BY_CMT(),
                dto.getACT_COST(), dto.getBUD_DATE(), dto.getTTL_BUDGET_COST()));
    }

    @Override
    public void updateBudget(BudgetDTO dto) {
        budgetRepository.saveAndFlush(new Budget(dto.getBUDGET_CODE(), dto.getBOM_ID(), dto.getMODEL_ID(), dto.getXBOM_ID(), dto.getBOM_TYPE(), dto.getBOM_USAGE(),
                dto.getLENGTH(), dto.getWIDTH(), dto.getHEIGHT(), dto.getBOM_COST(), dto.getNO_OF_BOM_UNITS(), dto.getREQ_AREA(), dto.getCOV_AREA_BY_CMT(),
                dto.getACT_COST(), dto.getBUD_DATE(), dto.getTTL_BUDGET_COST()));
    }

    @Override
    public void deleteBudget(int id) {
        budgetRepository.deleteById(id);
    }
}
