import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CountriesComponent } from './countries/countries.component';
import { CategroiesComponent } from './categroies/categroies.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchNewsComponent } from './search-news/search-news.component';

const routes: Routes = [
  { path: 'countries', component: CountriesComponent},
  { path: 'categories', component: CategroiesComponent},
  { path: 'sources', component: SourcesComponent},
  { path: 'search-news', component: SearchNewsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
