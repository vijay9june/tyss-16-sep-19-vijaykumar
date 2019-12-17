import { Component, OnInit, DoCheck } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  admin;
  manager;
  user;
  constructor(private service: AuthService, private router: Router) { }

  isLoginIn(): boolean {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails) {
      return true;
    } else {
      return false;
    }
  }

  isAdmin() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.role === 'admin') {
      return true;
    } else {
      return false;
    }
  }
  isManager() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.role === 'manager') {
      return true;
    } else {
      return false;
    }
  }
  isUser() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.role === 'user') {
      return true;
    } else {
      return false;
    }

  }

  logout() {
    localStorage.removeItem('userDetails');
    return this.router.navigateByUrl('/login');
  }

}
