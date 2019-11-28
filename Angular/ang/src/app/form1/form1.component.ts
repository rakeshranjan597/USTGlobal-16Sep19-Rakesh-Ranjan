import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@ Component({
  selector: 'app-form1',
  templateUrl: './form1.component.html',
  styleUrls: ['./form1.component.css']
})
export class Form1Component implements OnInit {
  registerData(form: NgForm) {
    console.log(form);
  }
  constructor() { }

  ngOnInit() {
  }

}
