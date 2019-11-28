import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { CarsParentComponent } from './cars-parent/cars-parent.component';
import { CarsChildComponent } from './cars-child/cars-child.component';
import { HomeComponent } from './home/home.component';
import { BikesParentComponent } from './bikes-parent/bikes-parent.component';
import { BikesChildComponent } from './bikes-child/bikes-child.component';
import { MoviesParentComponent } from './movies-parent/movies-parent.component';
import { MoviesChildComponent } from './movies-child/movies-child.component';
import { LaptopsParentComponent } from './laptops-parent/laptops-parent.component';
import { LaptopsChildComponent } from './laptops-child/laptops-child.component';
import { MobilesParentComponent } from './mobiles-parent/mobiles-parent.component';
import { MobilesChildComponent } from './mobiles-child/mobiles-child.component';
import { PracComponent } from './prac/prac.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CarsParentComponent,
    CarsChildComponent,
    HomeComponent,
    BikesParentComponent,
    BikesChildComponent,
    MoviesParentComponent,
    MoviesChildComponent,
    LaptopsParentComponent,
    LaptopsChildComponent,
    MobilesParentComponent,
    MobilesChildComponent,
    PracComponent
  ],
  imports: [
    BrowserModule,
    // AppRoutingModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'cars', component : CarsParentComponent},
      {path : 'bikes', component : BikesParentComponent},
      {path : 'movies', component : MoviesParentComponent},
      {path : 'laptops', component : LaptopsParentComponent},
      {path : 'mobiles', component : MobilesParentComponent},
      {path : 'prac', component : PracComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
