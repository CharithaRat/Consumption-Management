import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Login} from '../dto/login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) {
  }

  // authenticate(username: string, password: string): Observable<null> {
  //   return this.http.post<null>('http://localhost:8080/login',
  //     new HttpParams().set('usernames', username).set('passwords', password),
  //     {
  //       headers: new HttpHeaders().set('Content-Type', 'application/x-www-form-urlencoded'),
  //       withCredentials: true
  //     });
  // }

  // logout(): Observable<null> {
  //   return this.http.get<null>('http://localhost:8080/auth/logout', {withCredentials: true});
  // }

  getPassword(username: string): Observable<Login> {
    return this.http.get<Login>('http://localhost:8080/login/' + username);
  }
}
