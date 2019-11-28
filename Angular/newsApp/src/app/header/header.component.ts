import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  displayValue;
  constructor(public service: UserService) {
    // this.changeDisplay();
    // this.service.arr.isDisplay = this.displayValue;
    // console.log(this.displayValue);
   }
  changeDisplay() {
    this.displayValue = true;
    this.service.arr.isDisplay = this.displayValue;
  }

  ngOnInit() {
  }

}
