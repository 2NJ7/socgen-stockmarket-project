import { Component } from '@angular/core';
import { AuthService } from './services/auth.service';
import { CompanyService } from './services/company.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Stock Market Charting';
  constructor() {
    
  }
 
}
