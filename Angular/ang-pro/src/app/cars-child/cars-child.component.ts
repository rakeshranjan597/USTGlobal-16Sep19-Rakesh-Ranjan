import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-cars-child',
  templateUrl: './cars-child.component.html',
  styleUrls: ['./cars-child.component.css']
})
export class CarsChildComponent implements OnInit {
  @Input() car;
  constructor() { }

  ngOnInit() {
  }

}
