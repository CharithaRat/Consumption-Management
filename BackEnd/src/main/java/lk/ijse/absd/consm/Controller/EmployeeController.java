package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.dto.EmployeeDTO;
import lk.ijse.absd.consm.entity.Employee;
import lk.ijse.absd.consm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployee(@PathVariable("id") String id) {
        return employeeService.getEmployee(id);
    }

//    @RequestMapping("/otherMapping")
//    public String otherMapping() {
//        return "Greetings from Spring Boot!";
//    }

    /*@GetMapping("/{name}")
    public Employee findEmployeeBy(@PathVariable("name") String name){
        return employeeService.findEmployeeBy(name);
    }*/

//    @GetMapping
//    public Employee findEmployeeBy(){
//        return employeeService.findEmployeeBy();
//    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") String id){
        employeeService.deleteEmployee(id);
    }

    @PostMapping
    public void saveEmployee(@RequestBody EmployeeDTO dto){
        employeeService.saveEmployee(dto);
    }

    @PutMapping
    public void updateEmployee(@RequestBody EmployeeDTO dto){
        employeeService.updateEmployee(dto);
    }
}
