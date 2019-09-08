import { Injectable } from '@angular/core';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../dto/employee';
import {Model} from '../dto/model';

@Injectable({
  providedIn: 'root'
})
export class ModelService {
  readonly baseUrl = environment.apiUrl + '/model/';
  constructor(private http: HttpClient) {
  }

  getAllModels(): Observable<Model[]> {
    return this.http.get<Model[]>(this.baseUrl);
  }

  getSelectedModel(id: any): Observable<Model> {
    return this.http.get<Model>(this.baseUrl + id);
  }

  saveModel(model: Model): Observable<null> {
    return this.http.post<null>(this.baseUrl, model);
  }
}
