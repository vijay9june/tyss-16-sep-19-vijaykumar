import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
// import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-bindings/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-bindings/two-way-binding/two-way-binding.component';
import { NgIfComponent } from './directive/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './directive/structural-directive/ng-for/ng-for.component';
import { PropertyBindingComponent } from './data-bindings/property-binding/property-binding.component';
import { NgSwitchComponent } from './directive/structural-directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ChildComponent } from './child/child.component';
import { ParentComponent } from './parent/parent.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDatailsComponent } from './comment-datails/comment-datails.component';
import { DollarPipe } from './dollar.pipe';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ChildComponent,
    ParentComponent,
    CommentComponent,
    CommentDatailsComponent,
    DollarPipe,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : '' , component : HomeComponent},
      {path : 'about' , component : AboutComponent},
      {path : 'help' , component : HelpComponent},
      {path : 'property-binding' , component : PropertyBindingComponent},
      {path: 'event-binding', component : EventBindingComponent},
      {path: 'searchValue', component : TwoWayBindingComponent},
      {path: 'ng-for', component : NgForComponent},
      {path: 'ng-if', component : NgIfComponent},
      {path: 'ng-switch', component : NgSwitchComponent},
      {path : 'register' , component : RegisterComponent},
      {path : 'form1' , component : Form1Component},
      {path : 'form2' , component : Form2Component},
      {path : 'form3' , component : Form3Component},
      {path : 'form4' , component : Form4Component},
      {path : 'reactive-form' , component : ReactiveFormComponent},
      {path : 'parent' , component : ParentComponent},
      {path : 'comment-details' , component : CommentDatailsComponent}



    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
