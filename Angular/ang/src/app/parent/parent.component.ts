import { Component, OnInit } from '@angular/core';

@ Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedCar;
  Cars = [
    {
      name : 'Volkswagon',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/23/17/24/automobile-1853936__340.jpg'
    },
    {
      name : 'Mercedes-Benz',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg'
    },
    {
      name : 'Ford',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/21/14/03/beautiful-1845572__340.jpg'
    },
    {
      name : 'AutoRikshaw',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/03/27/14/37/asia-2179107__340.jpg'
    }
];
  constructor() { }

  ngOnInit() {
  }

  sendCar(car) {
    this.selectedCar = car;
    console.log(car);
  }

}
