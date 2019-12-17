import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-all',
  templateUrl: './get-all.component.html',
  styleUrls: ['./get-all.component.css']
})
export class GetAllComponent implements OnInit {
  constructor(private service: AuthService, private router: Router) {
    this.getAllProducts();
   }

  products = new Array();
  error: string;
  selectedProduct;
  ngOnInit() {
  }

  delete(product) {
    console.log(product);
    this.service.deleteProduct(product.pid).subscribe( data => {
    console.log(data);
    this.getAllProducts();
  }, err => {
    console.log(err);
  }, () => {
    console.log('sucess');
  });
  }

  modify(form) {
    this.error = null;
    this.selectedProduct = form;
  }
  editProduct(form) {
    console.log(form.value);
    this.service.modifyProduct(form.value).subscribe(data => {
      console.log(data);
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    });
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
