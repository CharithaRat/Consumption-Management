package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.dto.EmployeeDTO;
import lk.ijse.absd.consm.entity.Employee;
import lk.ijse.absd.consm.repository.EmployeeRepository;
import lk.ijse.absd.consm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(e -> new EmployeeDTO(e.getEMP_ID(), e.getEMP_NAME(), e.getEMP_JOIN_DATE(), e.getEMP_CONTACT(),
                e.getEMP_DESIGNATION(), e.getADDRESS1(), e.getADDRESS2(), e.getADDRESS3())).collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO getEmployee(String id) {
        Employee employee = employeeRepository.findById(id).get();
        return new EmployeeDTO(employee.getEMP_ID(), employee.getEMP_NAME(), employee.getEMP_JOIN_DATE(), employee.getEMP_CONTACT(),
                employee.getEMP_DESIGNATION(), employee.getADDRESS1(), employee.getADDRESS2(), employee.getADDRESS3());
    }

    @Override
    public void saveEmployee(EmployeeDTO dto) {
        employeeRepository.save(new Employee(dto.getEMP_ID(), dto.getEMP_NAME(), dto.getEMP_JOIN_DATE(), dto.getEMP_CONTACT(), dto.getEMP_DESIGNATION(),
                dto.getADDRESS1(), dto.getADDRESS2(), dto.getADDRESS3()));
    }

    @Override
    public void updateEmployee(EmployeeDTO dto) {
        employeeRepository.saveAndFlush(new Employee(dto.getEMP_ID(), dto.getEMP_NAME(), dto.getEMP_JOIN_DATE(), dto.getEMP_CONTACT(), dto.getEMP_DESIGNATION(),
                dto.getADDRESS1(), dto.getADDRESS2(), dto.getADDRESS3()));
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }

//    @Override
//    public Employee findEmployeeBy() {
//        return employeeRepository.findEmployeeBy();
//    }

//    @Override
//    public Employee findEmployeeBy(String name) {
//        return employeeRepository.findEmployeeBy(name);
//    }

    /*@Override
    public Employee findEmployeeBy(String name) {
        return employeeRepository.findEmployeeBy(name);
    }*/
}
