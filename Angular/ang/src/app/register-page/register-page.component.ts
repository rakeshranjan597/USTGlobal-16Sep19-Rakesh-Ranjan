import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidation } from './custom.validation';

@ Component({
  selector: 'app-register-page',
  templateUrl: './register-page.component.html',
  styleUrls: ['./register-page.component.css']
})
export class RegisterPageComponent implements OnInit {

  get email() {
    return this.form.get('email');
  }
  get password() {
    return this.form.get('password');
  }


  form = new FormGroup({
    email : new FormControl('', [Validators.required, CustomValidation.unique]),
    password : new FormControl('', [Validators.required])
  });

  constructor() { }

  ngOnInit() {
  }

  loginData(form) {
    console.log(form);
  }

}
