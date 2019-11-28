import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@ Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {

  get movname() {
    return this.form.get('movname');
  }

  get movtit() {
    return this.form.get('movtit');
  }

  form = new FormGroup({
      movname : new FormControl(' ', [Validators.required]),
      movtit : new FormControl(' ', [Validators.required])
    });


  constructor() { }

  ngOnInit() {
  }

}
