package lk.ijse.absd.consm.repository;

import lk.ijse.absd.consm.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

//    @Query("SELECT EMP_NAME FROM Employee WHERE EMP_NAME =?1")
//    Employee findEmployeeBy(String name);

//    @Query("SELECT EMP_NAME FROM Employee")
//    Employee findEmployeeBy();

    /*@Query("SELECT EMP_ID, EMP_NAME, EMP_JOIN_DATE, EMP_CONTACT, EMP_DESIGNATION, ADDRESS1, ADDRESS2, ADDRESS3 FROM EMPLOYEE WHERE EMP_NAME=?1")
    Employee findEmployeeBy(String name);*/
}
