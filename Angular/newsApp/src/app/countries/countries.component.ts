import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {

  countryValue;
  newsUrl;
  countryList = [
    {
      name: 'India',
      value: 'in'
    },
    {
      name: 'USA',
      value: 'us',
    },
    {
      name: 'Russia', 
      value: 'ru'
    }
  ];
  constructor(private http: HttpClient) {
    // this.changedCountry();
    console.log(this.countryValue);
    console.log(this.newsUrl);
  }
  changedCountry(args) {
    console.log(args.target.value);
    this.countryValue = args.target.value;
    console.log(this.countryValue);
    this.getCountryNews(this.countryValue);
  }
  getCountryNews(countryValue) {
    console.log('hello');
    console.log(countryValue);
    if (this.countryValue === 'in') {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.newsUrl = data.articles;
        console.log('india');
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got successfully');
      });
    }
    if (countryValue === 'us') {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.newsUrl = data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got successfully');
      });
    }
    if (countryValue === 'ru') {
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=ru&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.newsUrl = data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got successfully');
      });
    }
  }
  // this.getCountryNews(countryValue);
  ngOnInit() {
  }
}
