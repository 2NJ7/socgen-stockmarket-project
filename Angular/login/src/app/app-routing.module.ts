import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddExchangeComponent } from './components/add-exchange/add-exchange.component';
import { CompanyComponent } from './components/company/company.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { ExchangeComponent } from './components/exchange/exchange.component';
import { HomeComponent } from './components/home/home.component';
import { IpoComponent } from './components/ipo/ipo.component';
import { LoginComponent } from './components/login/login.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SectorComponent } from './components/sector/sector.component';
import { SignupComponent } from './components/signup/signup.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },
  { path: 'company', component: CompanyComponent },
  //{ path: 'addCompany', component: AddCompanyComponent },
  //{ path: 'updateCompany/:id', component: AddCompanyComponent },
  //{ path: 'comparison', component: ComparisonComponent },
  { path: 'exchange', component: ExchangeComponent },
  { path: 'addExchange', component: AddExchangeComponent },
  { path: 'ipo', component: IpoComponent },
  //{ path: 'addIpo', component: AddIpoComponent },
  //{ path: 'updateIpo/:id', component: AddIpoComponent },
  { path: 'sector', component: SectorComponent },
  //{ path: 'stock', component: StockComponent },
 // { path: 'importData', component: ExcelDataComponent },
 // { path: '**', component: NotFoundComponent }
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
