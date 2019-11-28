import { Component, OnInit } from '@angular/core';

@ Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  products = [
    {
      img : 'https://cdn.pixabay.com/photo/2016/03/05/22/59/food-1239423__340.jpg',
      name : 'Onions',
    },
    {
      img : 'https://cdn.pixabay.com/photo/2014/12/11/02/55/corn-syrup-563796__340.jpg',
      name : 'Coffee',
    },
    {
      img : 'https://cdn.pixabay.com/photo/2017/12/10/14/47/piza-3010062__340.jpg',
      name : 'Pizza',
    }
  ];
  constructor() { }

  ngOnInit() {
  }

}
