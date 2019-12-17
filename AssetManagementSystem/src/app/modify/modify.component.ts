import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Validators, FormControl, FormGroup, NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-modify',
  templateUrl: './modify.component.html',
  styleUrls: ['./modify.component.css']
})
export class ModifyComponent implements OnInit {
  message;
  get pid() {
    return this.form.get('pid');
  }
  get pname() {
    return this.form.get('pid');
  }
  get pprice() {
    return this.form.get('pid');
  }
  get quantity() {
    return this.form.get('pid');
  }
  constructor(private auth: AuthService, private router: Router) { }
  form = new FormGroup({
    pid : new FormControl('', [Validators.required]),
    pname : new FormControl(''),
    pprice : new FormControl(''),
    quantity : new FormControl('')
  });
  error: string;

  modify(form: NgForm) {
    this.error = null;
    console.log(form);
    this.auth.modifyProduct(form.value).subscribe(res => {
      console.log(res);
      this.router.navigateByUrl('/get-all');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}
