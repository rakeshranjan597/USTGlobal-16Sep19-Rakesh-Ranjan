import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  search;
  searchMovies;
  constructor(public http: HttpClient) {   }

  ngOnInit() {

  }

  cFun(event) {
    this.http.get<any>('http://www.omdbapi.com/?apikey=96b4fb25&s=' + event.target.value).subscribe(data => {
    this.searchMovies = data.Search;
    }, err => {
        console.log(err);
    }, () => {
        console.log(' Got Successfuly');
    });

  }

}
