import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/auth.service';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  message;
  get pname() {
    return this.form.get('pname');
  }
  get pprice() {
    return this.form.get('pprice');
  }
  get quantity() {
    return this.form.get('quantity');
  }

  constructor(private auth: AuthService, private router: Router) { }
  form = new FormGroup({
    pname : new FormControl('', [Validators.required]),
    pprice : new FormControl('', [Validators.required]),
    quantity : new FormControl('', [Validators.required])
  });

  error: string;

  add(form: NgForm) {
    this.error = null;
    this.auth.addProduct(form.value).subscribe(res => {
      console.log(res);
      alert('Added successfully');
      this.router.navigateByUrl('/add');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }
}
