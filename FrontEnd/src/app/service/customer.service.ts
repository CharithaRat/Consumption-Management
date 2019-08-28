import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/internal/Observable';
import {Customer} from '../dto/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http: HttpClient) {
  }

  getAllCustomers(): Observable<Customer[]> {
    return this.http.get<Customer[]>('http://localhost:8080/pos/customers');
  }

  getSelectedCustomer(id: string): Observable<Customer> {
    return this.http.get<Customer>('http://localhost:8080/pos/customers?id=' + id);
  }

  saveCustomer(customer: Customer): Observable<boolean> {
    return this.http.post<boolean>('http://localhost:8080/pos/customers', customer);
  }

  // Angular will automatically convert object in to Json Object

  deleteCustomer(id: string): Observable<boolean> {
    return this.http.delete<boolean>('http://localhost:8080/pos/customers?id=' + id);
  }

  editCustomer(cid: string, customer: Customer): Observable<boolean> {
    return this.http.put<boolean>('http://localhost:8080/pos/customers?id=' + cid, customer);
  }
}
