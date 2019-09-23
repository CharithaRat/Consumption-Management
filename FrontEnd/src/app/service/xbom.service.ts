import {Injectable} from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Bom} from '../dto/bom';
import {Xbom} from '../dto/xbom';

@Injectable({
  providedIn: 'root'
})
export class XbomService {

  readonly baseUrl = environment.apiUrl + '/xbom/';

  constructor(private http: HttpClient) {
  }

  getAllXboms(): Observable<Xbom[]> {
    return this.http.get<Xbom[]>(this.baseUrl);
  }

  getSelectedXbom(id: any): Observable<Xbom> {
    return this.http.get<Xbom>(this.baseUrl + id);
  }

  saveXbom(xbom: Xbom): Observable<null> {
    return this.http.post<null>(this.baseUrl, xbom);
  }
}
