import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {Employee} from '../../../dto/employee';
import {EmployeeService} from '../../../service/employee.service';
import {Observable} from 'rxjs';
import {FormControl, NgForm} from '@angular/forms';
import {map, startWith} from 'rxjs/operators';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  // myControl = new FormControl();
  public employees: Employee[] = [];
  selectedEmp: Employee = new Employee('', '', '', '', '', '', '', '');
  selectedEmployee: Employee = new Employee('', '', '', '', '', '', '', '');
  employee: Employee = new Employee('', '', '', '', '', '', '', '');
  emplId: string;

  // filteredOptions: Observable<Employee[]>;

  // @ViewChild('txtEmpId', {static: false}) empId: ElementRef;
  @ViewChild('frmEmployee', {static: false}) frmEmployees: NgForm;

  constructor(private employeeService: EmployeeService) {
  }

  ngOnInit() {
    // To get all employees
    this.employeeService.getAllEmployees().subscribe(employees => {
      console.log('Work');
      console.log(employees);
      this.employees = employees;
    });

    // To search purpose
    // this.filteredOptions = this.myControl.valueChanges
    //   .pipe(
    //     startWith(''),
    //     map(value => this._filter(value))
    //   );

    //  To get single employee dto
    // this.employeeService.getEmployeeByName()
  }

  // searchEmployee() {
  //   this.emplId = this.emplId;
  //   this.employeeService.getSelectedEmployee(this.emplId).subscribe(emp => {
  //     this.employee = emp;
  //   });
  // }

  // private _filter(value: string): Employee[] {
  //   const filterValue = value.toLowerCase();
  //
  //   return this.employees.filter(employee => employee.toLowerCase().includes(filterValue));
  // }

  saveEmployee(): void {
    console.log('Charitha');
    if (!this.frmEmployees.invalid) {
      this.employeeService.saveEmployee(this.selectedEmp)
        .subscribe(resp => {
          if (resp) {
            alert('Customer has been saved successfully');
            console.log('Success');
          } else {
            alert('Failed to save the customer');
            console.log('Fail');
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }


  getEmployeeData(selectedEmp: Employee) {
    // this.selectedEmployee = Object.assign({}, selectedEmp);
    console.log('xxx');
    this.selectedEmployee = Object.assign({}, selectedEmp);
    console.log('Selected Employee: ' + this.selectedEmployee.emp_NAME);
    this.employeeService.getSelectedEmployee(this.selectedEmployee.emp_ID).subscribe(empdata => {
      this.employee = empdata;
    });
  }
}
