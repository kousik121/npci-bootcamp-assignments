import { Injectable } from '@angular/core';
import { Employee } from '../common/employee';
import { HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';
import { Department } from '../common/department'

@Injectable({
  providedIn: 'root'
})
export class EmployeeManagementService {
  empurl = "http://localhost:8080/api/emp";
  depturl = "http://localhost:8080/api/dept";
  constructor(private httpClient : HttpClient) { }
  public employeeRegistration(Employee) {
    return this.httpClient.post("http://localhost:8080/api/emp", Employee, {responseType : 'text' as 'json'});
  }
  getAllEmployees() : Observable<Employee[]> {
    console.log(this.httpClient.get<getEmployeeResponse>(this.empurl).pipe(map(Response => Response._embedded.employees)));
    return this.httpClient.get<getEmployeeResponse>(this.empurl).pipe(map(Response => Response._embedded.employees));
  }
  getAllDepartments() : Observable<Department[]> {
    return this.httpClient.get<getDepartmentResponse>(this.depturl).pipe(map(Response => Response._embedded.departments));
  }
}

interface getEmployeeResponse {
  _embedded : {
    employees : Employee[];
  }
}

interface getDepartmentResponse {
  _embedded : {
    departments : Department[];
  }
}
