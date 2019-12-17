import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private service: AuthService, private router: Router) {
    this.getAllProducts();
   }

  products = new Array();
  error: string;
  selectedProduct;
  ngOnInit() {
  }

  getAllProducts() {
    this.service.getAllProducts().subscribe( data => {
    console.log(data.assetProductBeans);
    this.products = data.assetProductBeans;
    console.log(this.products);
    }, err => {
    console.log(err);
    }, () => {
    console.log('success');
    });
  }
}
