import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  isUser = false;
  isAdmin = false;
  isManager = false;
  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/asset/register', user);
  }

  loginUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/asset/login', user);
  }

  addProduct(user): Observable<any> {
    return this.http.post('http://localhost:8080/asset/add', user);
  }

  modifyProduct(user): Observable<any> {
    return this.http.put('http://localhost:8080/asset/modify', user);
  }

  deleteProduct(pid): Observable<any> {
    return this.http.delete(`http://localhost:8080/asset/deleteProduct/${pid}`);
  }

  getProduct(): Observable<any> {
    return this.http.get('http://localhost:8080/asset/get');
  }

  getAllProducts(): Observable<any> {
    return this.http.get('http://localhost:8080/asset/get-all');
  }

}
