import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {

  sourcesValue;
  sourcesUrl;
  sourcesList = [
    {
      name: 'The Times Of India',
      value: 'ttoi'
    },
    {
      name: 'BBC News',
      value: 'bbc',
    },
    {
      name: 'ESPN',
      value: 'espn'
    },
    {
      name: 'The Hindu',
      value: 'th'
    },
    {
      name: 'USA Today',
      value: 'usa'
    }
  ];
  constructor(private http: HttpClient) { }

  changedSources(args) {
    this.sourcesValue = args.target.value;
    this.getSourcesNews(this.sourcesValue);
  }
  getSourcesNews(sourcesValue) {
    if (sourcesValue === 'ttoi') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=the-times-of-india&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.sourcesUrl = data.articles;
      });
    }
    if (sourcesValue === 'bbc') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.sourcesUrl = data.articles;
      });
    }
    if (sourcesValue === 'espn') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=espn&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.sourcesUrl = data.articles;
      });
    }
    if (sourcesValue === 'th') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=the-hindu&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.sourcesUrl = data.articles;
      });
    }
    if (sourcesValue === 'usa') {
      // tslint:disable-next-line:max-line-length
      this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=usa-today&apiKey=87f98b996fbf48e4b4ff0e00db63b02b').subscribe(data => {
        this.sourcesUrl = data.articles;
      });
    }
  }
  ngOnInit() {
  }

}
