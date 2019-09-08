import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Main} from '../dto/main';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MainService {
  readonly baseUrl = environment.apiUrl + '/main/';
  constructor(private http: HttpClient) {
  }

  getAllMainCodes(): Observable<Main[]> {
    return this.http.get<Main[]>(this.baseUrl);
  }

  saveMainCode(main: Main): Observable<null> {
    return this.http.post<null>(this.baseUrl, main);
  }
}
