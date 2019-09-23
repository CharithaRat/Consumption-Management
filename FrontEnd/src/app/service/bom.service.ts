import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';
import {Observable} from 'rxjs';
import {Contractor} from '../dto/contractor';
import {Bom} from '../dto/bom';

@Injectable({
  providedIn: 'root'
})
export class BomService {

  readonly baseUrl = environment.apiUrl + '/bom/';

  constructor(private http: HttpClient) {
  }

  getAllBoms(): Observable<Bom[]> {
    return this.http.get<Bom[]>(this.baseUrl);
  }

  getSelectedBom(id: any): Observable<Bom> {
    return this.http.get<Bom>(this.baseUrl + id);
  }

  saveBom(bom: Bom): Observable<null> {
    return this.http.post<null>(this.baseUrl, bom);
  }
}
