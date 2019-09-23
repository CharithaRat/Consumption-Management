import {Injectable} from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Bomassign} from '../dto/bomassign';

@Injectable({
  providedIn: 'root'
})
export class BomassignService {

  readonly baseUrl = environment.apiUrl + '/bomassigned/';

  constructor(private http: HttpClient) {
  }

  getAllAssignedBoms(): Observable<Bomassign[]> {
    return this.http.get<Bomassign[]>(this.baseUrl);
  }

  getSelectedAssignedBom(id: any): Observable<Bomassign> {
    return this.http.get<Bomassign>(this.baseUrl + id);
  }

  saveAssignedBom(asbom: Bomassign): Observable<null> {
    return this.http.post<null>(this.baseUrl, asbom);
  }
}
