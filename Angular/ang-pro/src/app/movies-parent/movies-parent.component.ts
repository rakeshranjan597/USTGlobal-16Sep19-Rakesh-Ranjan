import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies-parent',
  templateUrl: './movies-parent.component.html',
  styleUrls: ['./movies-parent.component.css']
})
export class MoviesParentComponent implements OnInit {
  selectedMovie;
  movies = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
      name : 'Adventure',
      // tslint:disable-next-line: max-line-length
      about : 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
    },
    {
      imgUrl : 'https://image.shutterstock.com/image-photo/natural-quartz-sandstone-pillar-avatar-260nw-1148627891.jpg',
      name : 'Life Of Pi',
      // tslint:disable-next-line: max-line-length
      about : 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
    },
    {
      imgUrl : 'https://image.shutterstock.com/image-photo/avatar-woman-magical-forest-260nw-308973533.jpg',
      name : 'Avatar',
      // tslint:disable-next-line: max-line-length
      about : ''
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
      name : 'Iron Man',
      // tslint:disable-next-line: max-line-length
      about : 'When an industrialist is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/07/14/12/58/superhero-2503808__340.jpg',
      name : 'Gixer',
      // tslint:disable-next-line: max-line-length
      about : 'Superman is a fictional superhero. The character was created by writer Jerry Siegel and artist Joe Shuster, and first appeared in Action Comics #1, a comic book published on April 18, 1938.'
    },
  ];

  constructor() { }

  ngOnInit() {
  }

  sendMovie(movie) {
    this.selectedMovie = movie;
    console.log(movie);
  }

}
