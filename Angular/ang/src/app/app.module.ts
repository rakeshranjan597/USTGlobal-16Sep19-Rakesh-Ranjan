import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './Header/header.component';
import { HomeComponent } from './Home/home.component';
import { RouterModule } from '@angular/router';
import { AboutComponent } from './About/about.component';
import { HelpComponent } from './Help/help.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingsComponent } from './data-bindings/property-bindings/property-bindings.component';
import { EventBindingsComponent } from './data-bindings/event-bindings/event-bindings.component';
import { TwoWayBindingComponent } from './data-bindings/two-way-binding/two-way-binding.component';
import { DirectiveComponent } from './directive/directive.component';
import { StructuralDirectiveComponent } from './directive/structural-directive/structural-directive.component';
import { NgIfComponent } from './directive/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './directive/structural-directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './directive/structural-directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { RegisterPageComponent } from './register-page/register-page.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';
import { HomepageComponent } from './homepage/homepage.component';


@ NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    FooterComponent,
    DataBindingsComponent,
    PropertyBindingsComponent,
    EventBindingsComponent,
    TwoWayBindingComponent,
    DirectiveComponent,
    StructuralDirectiveComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    RegisterPageComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
    HomepageComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'about' , component : AboutComponent},
      {path : 'help' , component : HelpComponent},
      {path : 'property-bindings' , component : PropertyBindingsComponent},
      {path : 'event-bindings' , component : EventBindingsComponent},
      {path : 'twoway-bindings' , component : TwoWayBindingComponent},
      {path : 'login' , component : NgIfComponent},
      {path : 'food' , component : NgForComponent},
      {path : 'ng-switch' , component : NgSwitchComponent},
      {path : 'register' , component : RegisterComponent},
      {path : 'form1' , component : Form1Component},
      {path : 'form2' , component : Form2Component},
      {path : 'form3' , component : Form3Component},
      {path : 'form4' , component : Form4Component},
      {path : 'register-page' , component : RegisterPageComponent},
      {path : 'parent' , component : ParentComponent},
      {path : 'comment-details' , component : CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
