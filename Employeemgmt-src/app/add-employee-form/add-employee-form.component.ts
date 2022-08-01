import { Component, OnInit } from '@angular/core';
import { Employee } from '../common/employee';
import { EmployeeManagementService } from '../services/employee-management-service.service';

@Component({
  selector: 'app-add-employee-form',
  templateUrl: './add-employee-form.component.html',
  styleUrls: ['./add-employee-form.component.css']
})
export class AddEmployeeFormComponent implements OnInit {

  constructor(private service : EmployeeManagementService) { }
  formModel :  Employee = new Employee(0,"","",new Date,0,0,0,0);
  ngOnInit(): void {
  }

  onSubmit() {
    this.service.employeeRegistration(this.formModel);
  }

}
