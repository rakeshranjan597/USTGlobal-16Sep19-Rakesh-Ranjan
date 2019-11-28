import { Component, OnInit } from '@angular/core';
import { log } from 'util';

@ Component({
  selector: 'app-event-bindings',
  templateUrl: './event-bindings.component.html',
  styleUrls: ['./event-bindings.component.css']
})
export class EventBindingsComponent implements OnInit {
  inputValue = '';
  constructor() { }

  ngOnInit() {
  }

  printMessage() {
    alert('Hello How Are You');
  }
  dataInput(event) {
    console.log(event.target.value);
    this.inputValue = event.target.value;
  }
}
