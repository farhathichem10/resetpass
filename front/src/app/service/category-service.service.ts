import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable, Subject} from 'rxjs';
import {Category} from '../model/category';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CategoryServiceService {

  baseUrl = 'http://localhost:8082/api/allCategoies';
  constructor(private http: HttpClient) { }

  getAllCategories(): Observable<Category[]> {
    return this.http.get<Category[]>(this.baseUrl).pipe(
      map (
        response => response
      )
    )
  }

}
