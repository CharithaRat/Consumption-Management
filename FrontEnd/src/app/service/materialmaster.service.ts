import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Supplier} from '../dto/supplier';
import {Materialmaster} from '../dto/materialmaster';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MaterialmasterService {

  readonly baseUrl = environment.apiUrl + '/material/';

  constructor(private http: HttpClient) {
  }

  getAllMaterials(): Observable<Materialmaster[]> {
    return this.http.get<Materialmaster[]>(this.baseUrl);
  }

  getSelectedMaterial(id: any): Observable<Materialmaster> {
    return this.http.get<Materialmaster>(this.baseUrl + id);
  }

  saveMaterial(material: Materialmaster): Observable<null> {
    return this.http.post<null>(this.baseUrl, material);
  }
}
