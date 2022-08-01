import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { EmployeesListComponent } from './employees-list/employees-list.component';
import { DepartmentListComponent } from './department-list/department-list.component';
import { AddEmployeeFormComponent } from './add-employee-form/add-employee-form.component';
import { AddDepartmentFormComponent } from './add-department-form/add-department-form.component';

const routes: Routes = [ {path : '', component : WelcomeComponent} ,
{path : 'employees', component : EmployeesListComponent} ,
{path : 'departments', component : DepartmentListComponent} ,
{path : 'employeeform', component : AddEmployeeFormComponent} ,
{path : 'departmentform', component : AddDepartmentFormComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
