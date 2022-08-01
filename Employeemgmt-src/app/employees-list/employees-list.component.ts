import { Component, OnInit } from '@angular/core';
import { EmployeeManagementService } from '../services/employee-management-service.service';
import { Employee } from '../common/employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employees-list',
  templateUrl: './employees-list.component.html',
  styleUrls: ['./employees-list.component.css']
})
export class EmployeesListComponent implements OnInit {

  constructor(private service : EmployeeManagementService, private route : Router) { }
  employees : Employee[];
  ngOnInit(): void {
    this.listOfEmployees()
  }

  listOfEmployees() {
    this.service.getAllEmployees().subscribe(data => {
    console.log(data);
    this.employees=data;
    })
  }

  addEmployees() {
    this.route.navigateByUrl("/employeeform");
  }

}
