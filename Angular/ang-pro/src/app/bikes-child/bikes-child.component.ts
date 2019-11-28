import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bikes-child',
  templateUrl: './bikes-child.component.html',
  styleUrls: ['./bikes-child.component.css']
})
export class BikesChildComponent implements OnInit {
  @Input() bike;
  constructor() { }

  ngOnInit() {
  }

}
