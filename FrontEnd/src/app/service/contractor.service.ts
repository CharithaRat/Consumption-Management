import {Injectable} from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Supplier} from '../dto/supplier';
import {Contractor} from '../dto/contractor';

@Injectable({
  providedIn: 'root'
})
export class ContractorService {

  readonly baseUrl = environment.apiUrl + '/contractor/';

  constructor(private http: HttpClient) {
  }

  getAllContractors(): Observable<Contractor[]> {
    return this.http.get<Contractor[]>(this.baseUrl);
  }

  getSelectedContractor(id: any): Observable<Contractor> {
    return this.http.get<Contractor>(this.baseUrl + id);
  }

  saveContractor(contractor: Contractor): Observable<null> {
    return this.http.post<null>(this.baseUrl, contractor);
  }
}
