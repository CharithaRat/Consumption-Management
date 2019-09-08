import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';
import {Employee} from '../dto/employee';
import {Observable} from 'rxjs';
import {Budget} from '../dto/budget';

@Injectable({
  providedIn: 'root'
})
export class BudgetService {
  readonly baseUrl = environment.apiUrl + '/report/bugetreport';

  constructor(private http: HttpClient) {
  }

  // getAllBudgets(): Observable<Budget[]> {
  //   return this.http.get<Budget[]>(this.baseUrl);
  // }

  // getSelectedBudget(id: any): Observable<Budget> {
  //   return this.http.get<Budget>(this.baseUrl + id);
  // }
  //
  // saveBudget(budget: Budget): Observable<null> {
  //   return this.http.post<null>(this.baseUrl, budget);
  // }
  getReports(): Observable<object> {
    // return this.http.get<null>(this.baseUrl);
    return this.http.get<object>(this.baseUrl);
  }
}
