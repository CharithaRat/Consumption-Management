import { Injectable } from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Unit} from '../dto/unit';
import {Unitrelation} from '../dto/unitrelation';

@Injectable({
  providedIn: 'root'
})
export class UnitrelationService {
  readonly baseUrl = environment.apiUrl + '/unitrelation/';
  constructor(private http: HttpClient) {
  }

  getAllUnitRelations(): Observable<Unitrelation[]> {
    return this.http.get<Unitrelation[]>(this.baseUrl);
  }

  getSelectedUnitRelation(id: any): Observable<Unitrelation> {
    return this.http.get<Unitrelation>(this.baseUrl + id);
  }

  saveUnitRelation(unitr: Unitrelation): Observable<null> {
    return this.http.post<null>(this.baseUrl, unitr);
  }

  // saveUnitRelationDetails(unitr: Unitrelation): Observable<null> {
  //   return this.http.post<null>(this.baseUrl, unitr);
  // }
}
