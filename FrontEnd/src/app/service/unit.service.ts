import { Injectable } from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Model} from '../dto/model';
import {Unit} from '../dto/unit';

@Injectable({
  providedIn: 'root'
})
export class UnitService {
  readonly baseUrl = environment.apiUrl + '/unit/';
  constructor(private http: HttpClient) {
  }

  getAllUnits(): Observable<Unit[]> {
    return this.http.get<Unit[]>(this.baseUrl);
  }

  getSelectedUnit(id: any): Observable<Unit> {
    return this.http.get<Unit>(this.baseUrl + id);
  }

  saveUnit(unit: Unit): Observable<null> {
    return this.http.post<null>(this.baseUrl, unit);
  }
}
