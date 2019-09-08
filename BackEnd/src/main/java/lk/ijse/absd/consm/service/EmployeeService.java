package lk.ijse.absd.consm.service;

import lk.ijse.absd.consm.dto.EmployeeDTO;
import lk.ijse.absd.consm.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployee(int id);

    void saveEmployee(EmployeeDTO dto);
//    boolean saveEmployee(EmployeeDTO dto);

    void updateEmployee(EmployeeDTO dto);

    void deleteEmployee(int id);

    //    Employee findEmployeeBy(String name);
    //    Employee findEmployeeBy();

  /*  Employee findEmployeeBy(String name);*/

//    List<EmployeeDTO> saveEmployeeData(EmployeeDTO dto);
}
