import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesListComponent } from './employees-list/employees-list.component';
import { DepartmentListComponent } from './department-list/department-list.component';
import { FormsModule } from '@angular/forms';
import { WelcomeComponent } from './welcome/welcome.component';
import { AddEmployeeFormComponent } from './add-employee-form/add-employee-form.component';
import { AddDepartmentFormComponent } from './add-department-form/add-department-form.component';


@NgModule({
  declarations: [
    AppComponent,
    EmployeesListComponent,
    DepartmentListComponent,
    WelcomeComponent,
    AddEmployeeFormComponent,
    AddDepartmentFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
