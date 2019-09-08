import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';
import {Sub} from '../dto/sub';
import {Observable} from 'rxjs';
import {Detail} from '../dto/detail';

@Injectable({
  providedIn: 'root'
})
export class DetailService {
  readonly baseUrl = environment.apiUrl + '/detail/';
  constructor(private http: HttpClient) {
  }

  getAllDetailCodes(): Observable<Detail[]> {
    return this.http.get<Detail[]>(this.baseUrl);
  }

  saveDetailCode(detail: Detail): Observable<null> {
    return this.http.post<null>(this.baseUrl, detail);
  }
}
