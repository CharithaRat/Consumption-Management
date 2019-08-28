import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/internal/Observable';
import {Order} from '../dto/order';
import {Customer} from '../dto/customer';
import {Item} from '../dto/item';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http: HttpClient) {
  }

  getAllOrders(): Observable<Order[]> {
    return this.http.get<Order[]>('http://localhost:8080/pos/orders');
  }

  getSelectedCustomer(name: string): Observable<Customer> {
    return this.http.get<Customer>('http://localhost:8080/pos/customers?=' + name);
  }

  getSelectedItem(name: string): Observable<Item> {
    return this.http.get<Item>('http://localhost:8080/pos/items?=' + name);
  }
}
