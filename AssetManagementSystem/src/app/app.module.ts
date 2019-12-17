import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { RegisterComponent } from './register/register.component';
import { UserComponent } from './user/user.component';
import { HeaderComponent } from './header/header.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { LoginComponent } from './login/login.component';
import { ManagerComponent } from './manager/manager.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AddComponent } from './add/add.component';
import { ModifyComponent } from './modify/modify.component';
import { GetAllComponent } from './get-all/get-all.component';
import { FooterComponent } from './footer/footer.component';
import { AuthGuard } from './auth.guard';
import { FilterPipe } from './filter.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdminComponent,
    RegisterComponent,
    UserComponent,
    HeaderComponent,
    PageNotFoundComponent,
    LoginComponent,
    ManagerComponent,
    AddComponent,
    ModifyComponent,
    GetAllComponent,
    FooterComponent,
    FilterPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'register', component: RegisterComponent},
      {path: 'login', component: LoginComponent},
      {path: 'home', component: HomeComponent},
      {path: 'user', component: UserComponent,
      canActivate: [AuthGuard], data: { role: ['user', 'manager', 'admin'] }
    },
      {path: 'admin', component: AdminComponent,
      canActivate: [AuthGuard], data: { role: ['admin'] }

    },
      {path: 'manager', component: ManagerComponent,
      canActivate: [AuthGuard], data: { role: ['manager', 'admin'] }

    },
      {path: 'add', component: AddComponent},
      {path: 'modify', component: ModifyComponent},
      {path: 'get-all', component: GetAllComponent},
      {path: 'footer', component: FooterComponent}
  ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
