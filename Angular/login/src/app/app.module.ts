import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';

import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';

import {MatToolbarModule} from '@angular/material/toolbar';

import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { NavbarComponent } from './components/navbar/navbar.component';
import { AddExchangeComponent } from './components/add-exchange/add-exchange.component';
import { CompanyComponent } from './components/company/company.component';
import { ExchangeComponent } from './components/exchange/exchange.component';
import { IpoComponent } from './components/ipo/ipo.component';

import { SectorComponent } from './components/sector/sector.component';
import { SignupComponent } from './components/signup/signup.component';
import { CompanyService } from './services/company.service';

@NgModule({
  declarations: [
    AppComponent,
    
    HomeComponent,
    LoginComponent,
    DashboardComponent,
    NavbarComponent,
    AddExchangeComponent,
    CompanyComponent,
    ExchangeComponent,
    IpoComponent,
    
    SectorComponent,
    SignupComponent
    
  ],
  imports: [
    CommonModule,
    BrowserModule,
    FormsModule,
    HttpClientModule,
    MatToolbarModule,
    MatButtonModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
