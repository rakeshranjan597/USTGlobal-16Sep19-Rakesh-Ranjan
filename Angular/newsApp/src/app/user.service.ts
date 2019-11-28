import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  arr = {
    isDisplay : false
  };
  constructor() {
    // console.log(this.isDisplay);
  }
}
