package lk.ijse.absd.consm.repository;

import lk.ijse.absd.consm.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test,String> {
}
