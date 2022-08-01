import { Component, OnInit } from '@angular/core';
import { Department } from '../common/department';
import { EmployeeManagementService } from '../services/employee-management-service.service'
import { Router } from '@angular/router';

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent implements OnInit {

  constructor(private service : EmployeeManagementService, private route : Router) {}
    departments : Department[];

  ngOnInit(): void {
    this.listOfDepartments();
  }

  listOfDepartments() {
    this.service.getAllDepartments().subscribe(data => {
      this.departments = data;
      console.log(this.departments);
    })
  }

  searchEmployees() {
    
  }

  addDepartment() {
    this.route.navigateByUrl("/departmentform");
  }

}
