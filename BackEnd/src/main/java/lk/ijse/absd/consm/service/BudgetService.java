package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.BudgetDTO;

import java.util.List;

public interface BudgetService {
    List<BudgetDTO> getAllBudgets();
    BudgetDTO getBudget(String id);
    void saveBusget(BudgetDTO dto);
    void updateBudget(BudgetDTO dto);
    void deleteBudget(String id);
}
