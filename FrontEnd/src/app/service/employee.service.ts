import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../dto/employee';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  readonly baseUrl = environment.apiUrl + '/employee/';

  constructor(private http: HttpClient) {
  }

  getAllEmployees(): Observable<Employee[]> {
    // return this.http.get<Employee[]>('http://localhost:8080/employee');
    return this.http.get<Employee[]>(this.baseUrl);
  }

  getSelectedEmployee(id: any): Observable<Employee> {
    return this.http.get<Employee>(this.baseUrl + id);
  }

  saveEmployee(employee: Employee): Observable<null> {
    return this.http.post<null>(this.baseUrl, employee);
  }

  updateEmployee(employee: Employee): Observable<null> {
    return this.http.put<null>(this.baseUrl, employee);
  }

  deleteEmployee(id: any): Observable<null> {
    return this.http.delete<null>(this.baseUrl + id);
  }

  // getEmployeeByName(name: string): Observable<Array<Employee>> {
  //   return this.http.get<Array<Employee>>('http://localhost:8080/employee/' +name);
  // }
}
