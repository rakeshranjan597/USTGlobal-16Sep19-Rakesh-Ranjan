import { Component, OnInit } from '@angular/core';

@ Component({
  selector: 'app-property-bindings',
  templateUrl: './property-bindings.component.html',
  styleUrls: ['./property-bindings.component.css']
})
export class PropertyBindingsComponent implements OnInit {
  name = 'Sarah';
  imgurl = 'https://cdn.pixabay.com/photo/2017/01/23/19/40/woman-2003647__340.jpg';
  address = 'Los Angles, USA';
  colorName = 'grey';
  isActive = false ;
  colspanValue = 2;
  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'brown';
      this.isActive = !this.isActive;
    }, 500);
  }

}
