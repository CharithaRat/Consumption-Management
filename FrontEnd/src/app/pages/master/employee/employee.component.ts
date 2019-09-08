import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {Employee} from '../../../dto/employee';
import {EmployeeService} from '../../../service/employee.service';
import {Observable} from 'rxjs';
import {FormControl, NgForm, NgModel} from '@angular/forms';
import {map, startWith} from 'rxjs/operators';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  // myControl = new FormControl();
  public employees: Employee[] = [];
  selectedEmp: Employee = new Employee(0, '', '', '', '', '', '', '');
  selectedEmployee: Employee = new Employee(0, '', '', '', '', '', '', '');
  employee: Employee = new Employee(0, '', '', '', '', '', '', '');
  emplId: string;

  jQuery: any;
  selectedId;

  // filteredOptions: Observable<Employee[]>;

  @ViewChild('txtName', {static: false}) empName: ElementRef;
  @ViewChild('frmEmployee', {static: false}) frmEmployees: NgForm;

  // @ViewChild('modal-search', {static: false}) public modal: ModalDirective;

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


  getEmployeeId(): void {
    // console.log('In');
    // console.log(this.selectedId);
    this.selectedEmployee.empId = this.selectedId;
    this.employeeService.getSelectedEmployee(this.selectedEmployee.empId).subscribe(empdata => {
      this.employee = empdata;
    });
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

  newEmployee(): void {
    this.frmEmployees.onReset();
    this.empName.nativeElement.focus();
  }

  saveEmployee(): void {
    console.log('save employee');
    if (!this.frmEmployees.invalid) {
      this.employeeService.saveEmployee(this.employee)
        .subscribe(resp => {
          if (resp) {
            // alert('Customer has been saved successfully');
            console.log('Success');
          } else {
            // alert('Failed to save the customer');
            console.log('Fail');
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }


  getEmployeeData(selectedEmp: Employee) {
    // this.selectedEmployee = Object.assign({}, selectedEmp);
    // console.log('xxx');
    this.selectedEmployee = selectedEmp;
    // console.log('Selected Employee: ' + this.selectedEmployee.empName);
    this.employeeService.getSelectedEmployee(this.selectedEmployee.empId).subscribe(empdata => {
      this.employee = empdata;
      this.jQuery('#modal-search').modal('hide');
    });
  }

  updateEmployee(): void {
    console.log('update employee');
    if (!this.frmEmployees.invalid) {
      this.employeeService.updateEmployee(this.employee)
        .subscribe(resp => {
          if (resp) {
            // alert('Customer has been updated successfully');
            console.log('Success');
          } else {
            // alert('Failed to update the customer');
            console.log('Fail');
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }

  deleteEmployee(): void {
    console.log('Delete Method');
    this.employeeService.deleteEmployee(this.employee.empId);
  }
}
