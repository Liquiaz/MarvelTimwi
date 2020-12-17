import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { catchError, map } from "rxjs/operators";

/**
 * Class with API Marvel services
 */
@Injectable({
  providedIn: 'root'
})
export class MarvelApiService {

  API_URL = "http://localhost:8081/api";

  constructor(private http : HttpClient) { }

  /** 
   * get all the marvel characters 
   * */ 
  getAllCharacters(): Observable<any> {
    return this.http.get<any>(this.API_URL+"/characters").pipe(map((data :any) => data.data.results))
  }

  /** 
   * get all the marvel characters 
   * */ 
  saveCharacter(id: any): Observable<any> {
    return this.http.post<any>(this.API_URL+"/saveCharacter", id)
      .pipe(map((data :any) => data));
  }

  /** 
   * get superteam of the marvel character list 
   * */ 
  getSuperteamCharacter(): Observable<any> {
    return this.http.get<any>(this.API_URL+"/superteam").pipe(map((data :any) => data))
  }


}
