package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.EmployeeDTO;
import lk.ijse.absd.consm.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployee(String id);

    void saveEmployee(EmployeeDTO dto);

    void updateEmployee(EmployeeDTO dto);

    void deleteEmployee(String id);

    //    Employee findEmployeeBy(String name);
    //    Employee findEmployeeBy();

  /*  Employee findEmployeeBy(String name);*/
}
