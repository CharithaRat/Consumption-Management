import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';
import {Observable} from 'rxjs';
import {Sub} from '../dto/sub';

@Injectable({
  providedIn: 'root'
})
export class SubService {
  readonly baseUrl = environment.apiUrl + '/sub/';
  constructor(private http: HttpClient) {
  }

  getAllSubCodes(): Observable<Sub[]> {
    return this.http.get<Sub[]>(this.baseUrl);
  }

  saveSubCode(sub: Sub): Observable<null> {
    return this.http.post<null>(this.baseUrl, sub);
  }
}
