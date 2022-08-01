import { Component, OnInit } from '@angular/core';
import { Department } from '../common/department';

@Component({
  selector: 'app-add-department-form',
  templateUrl: './add-department-form.component.html',
  styleUrls: ['./add-department-form.component.css']
})
export class AddDepartmentFormComponent implements OnInit {

  constructor() { }
  formModel : Department = new Department(0, "", "");
  ngOnInit(): void {
  }

  onSubmit() {
    
  }

}
