import { Component, OnInit } from '@angular/core';
import { Salesperson } from '../salesperson';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {
  name : string = "koushik"
  s1 : Salesperson = new Salesperson("Jeevan", "Kesari", "jeevan@gmail.com", 30000, 500);
  salesPersonList : Salesperson[] = [this.s1, new Salesperson("Suresh", "Varma", "ramesh@gmail.com", 10000, 200)];
  formModel : Salesperson = new Salesperson ("","","",0,0);
  constructor() { }

  ngOnInit(): void {
    console.log(this.formModel);
  }
  onSubmit() {
    this.salesPersonList.push(this.formModel);
  }

}
