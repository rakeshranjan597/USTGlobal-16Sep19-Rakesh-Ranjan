import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@ Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {
  constructor(private service: UserService) {
    this.getData();
    console.log('costructor is executed');
  }

  today = new Date();
  Users;
  selectedUser;
  ngDoCheck(): void {
    throw new Error('Method not implemented.');
  }

  ngOnInit() {
    console.log('ngOnInit is executed');
  }

  // ngDoCheck() {
  //   console.log('ngDoCheck is executed');
  // }

    ngAfterViewInit() {
      console.log('AfterViewInit is executed');
    }

    ngAfterViewChecked() {
      console.log('AfterViewChecked is executed');
    }

    ngOnDestroy() {
      console.log('onDestroy is executed');
    }
  registerData(form) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data posted successfully');
    });
  }
    getData() {
      this.service.getUsers().subscribe(data => {
        console.log(data);
        this.Users = data;
      }, err => {
        console.log(err);
      }, () => {
        console.log('data got successfully');
      });
    }

    deleteData(user) {
      console.log(user);
      this.service.deleteUser(user.id).subscribe(data => {
        console.log(data);
        this.getData();
      }, err => {
        console.log(err);
      }, () => {
        console.log('data deleted successfully');
      });
    }

    selectUser(user) {
      console.log(user);
      this.selectedUser = user;
    }

    updateData(form) {
      console.log(form.value);
      this.service.updateUser(form.value.id , form.value).subscribe(data => {
        console.log(data);
      }, err => {
        console.log(err);
      }, () => {
        console.log('data updated successfully');
      });
    }
  }

