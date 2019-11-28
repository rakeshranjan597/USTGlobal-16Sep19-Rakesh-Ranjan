import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categroies',
  templateUrl: './categroies.component.html',
  styleUrls: ['./categroies.component.css']
})
export class CategroiesComponent implements OnInit {

  categoryValue;
  categoryUrl;
  CategoryList = [
    {
      name: 'Entertainment',
      value: 'entertainment'
    },
    {
      name: 'Business',
      value: 'business',
    },
    {
      name: 'General',
      value: 'general'
    },
    {
      name: 'Health',
      value: 'health'
    },
    {
      name: 'Science',
      value: 'science'
    },
    {
      name: 'Sports',
      value: 'sports'
    },
    {
      name: 'Technology',
      value: 'technology'
    }
  ];
  constructor(private http: HttpClient) {
  }
  changedCategories(args) {
    this.categoryValue = args.target.value;
    console.log(this.categoryValue);
    this.getCategoriesNews(this.categoryValue);
  }
  getCategoriesNews(categoryValue) {
    if (categoryValue === 'entertainment') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.categoryUrl = data.articles;
        // console.log('vvgvhgvhg');
        // console.log(this.categoryValue);
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got sucessfully');
      });
    }
    if (categoryValue === 'business') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.categoryUrl = data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got sucessfully');
      });
    }
    if (categoryValue === 'general') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.categoryUrl = data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got sucessfully');
      });
    }
    if (categoryValue === 'health') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=health&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.categoryUrl = data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got sucessfully');
      });
    }
    if (categoryValue === 'technology') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=technology&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.categoryUrl = data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got sucessfully');
      });
    }
    if (categoryValue === 'sports') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.categoryUrl = data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got sucessfully');
      });
    }
    if (categoryValue === 'entertainment') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.categoryUrl = data.articles;
      }, err => {
        console.log(err);
      }, () => {
        console.log('news got sucessfully');
      });
    }
  }
  ngOnInit() {
  }

}
