import { Component, Input, OnInit } from '@angular/core';
import { Company } from 'src/app/models/company-model';
import { AuthService } from 'src/app/services/auth.service';
import { CompanyService } from 'src/app/services/company.service';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css']
})
export class CompanyComponent implements OnInit {
 
  public state:string;
  public companies:Company[];
  public pattern:string;
  public companies2:Company[];

  constructor(private authService:AuthService, private companyService:CompanyService) {
    this.state="";
    this.companies=[];
    this.pattern="";
    this.companies2=[];
  }

  ngOnInit(): void {
    this.state = this.authService.getCurrentUserRole();
    this.getAllCompanies();
    // this.companyService.apiCall().subscribe((data)=>{
    //   console.warn("get api data",data);
    //   this.companies2 = data;
    // }
    // )
  }

  public getAllCompanies(){
    this.companyService.getAllCompanies().subscribe( allCompanies => {
      this.companies = allCompanies;
      console.warn("get api data",JSON.stringify(allCompanies));
      
    });
  }

  public getCompanyByPattern(){
    if(this.pattern != ""){
      this.companyService.getCompanyByName(this.pattern).subscribe( foundCompanies => {
        this.companies = foundCompanies;
      });
    } else {
      this.getAllCompanies();
    }
  }

  public deleteCompany(id:number){
    this.companyService.deleteCompany(id).subscribe( company =>{
      console.log(company);
      this.getAllCompanies();
    })
  }
}
