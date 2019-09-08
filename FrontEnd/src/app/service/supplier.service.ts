import {Injectable} from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../dto/employee';
import {Supplier} from '../dto/supplier';


@Injectable({
  providedIn: 'root'
})
export class SupplierService {

  readonly baseUrl = environment.apiUrl + '/supplier/';

  constructor(private http: HttpClient) {
  }

  getAllSuppliers(): Observable<Supplier[]> {
    return this.http.get<Supplier[]>(this.baseUrl);
  }

  getSelectedSupplier(id: any): Observable<Supplier> {
    return this.http.get<Supplier>(this.baseUrl + id);
  }

  saveSupplier(supplier: Supplier): Observable<null> {
    return this.http.post<null>(this.baseUrl, supplier);
  }
}
