import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { from } from 'rxjs';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'newsApp';
  // isDisplay1 = false;
  indiaNews;
  enterTainmentNews;
  sportsNews;
  constructor(private http: HttpClient, public service: UserService) {
    this.getIndiaNews();
    this.getEntertainmentNews();
    this.getSportsNews();
    console.log(service.arr.isDisplay);
  }
  getIndiaNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
      this.indiaNews = data.articles;
      console.log(data.articles);
    }, err => {
      console.log(err);
    }, () => {
      console.log('News got successfully');
    });
  }
  getEntertainmentNews() {
    // tslint:disable-next-line:max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
      this.enterTainmentNews = data.articles;
      console.log(data.articles);
    }, err => {
      console.log(err);
    }, () => {
      console.log('News got successfully');
    });
  }
  getSportsNews() {
    // tslint:disable-next-line:max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
      this.sportsNews = data.articles;
      console.log(data.articles);
    }, err => {
      console.log(err);
    }, () => {
      console.log('News got successfully');
    });
  }
}

