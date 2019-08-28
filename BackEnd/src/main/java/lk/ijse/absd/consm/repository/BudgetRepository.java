package lk.ijse.absd.consm.repository;

import lk.ijse.absd.consm.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, String> {
}
