import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class LoginService {

  apiUrl = "http://localhost:8080/auth/login";

  constructor(private http: HttpClient) { }

  login(email: string, password: string) {
    return this.http.post<any>(this.apiUrl,{email, password});
  }
}
