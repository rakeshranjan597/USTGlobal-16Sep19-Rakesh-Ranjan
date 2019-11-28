import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-laptops-child',
  templateUrl: './laptops-child.component.html',
  styleUrls: ['./laptops-child.component.css']
})
export class LaptopsChildComponent implements OnInit {
  @Input() laptop;
  constructor() { }

  ngOnInit() {
  }

}
