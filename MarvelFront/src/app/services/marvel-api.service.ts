import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class MarvelApiService {

  API_URL = "http://localhost:8081/api";;

  constructor(private http : HttpClient) { }


  /** 
   * get all the marvel characters 
   * */ 
  getAllCharacters(): Observable<any> {
    return this.http.get<any>(this.API_URL+"/characters").pipe(map((data :any) => data.data.results))
  }


}
