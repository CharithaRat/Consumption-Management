package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.BudgetDTO;
import lk.ijse.absd.consm.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/budget")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @GetMapping
    public List<BudgetDTO> getAllBudgets() {
        return budgetService.getAllBudgets();
    }

    @GetMapping("/{id}")
    public BudgetDTO getBudget(@PathVariable("id") int id) {
        return budgetService.getBudget(id);
    }

    @PostMapping
    public void saveBudget(@RequestBody BudgetDTO dto) {
        budgetService.saveBusget(dto);
    }

    @PutMapping
    public void updateBudget(@RequestBody BudgetDTO dto) {
        budgetService.updateBudget(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteBudget(@PathVariable("id") int id) {
        budgetService.deleteBudget(id);
    }

}
