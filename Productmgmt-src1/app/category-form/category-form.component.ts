import { Component, OnInit } from '@angular/core';
import { Productcategory } from '../common/productcategory';
import { ProductmanagementService } from '../productmanagementservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-category-form',
  templateUrl: './category-form.component.html',
  styleUrls: ['./category-form.component.css']
})
export class CategoryFormComponent implements OnInit {

  constructor(private service : ProductmanagementService, private route : Router) { }
  formModel : Productcategory = new Productcategory(0,"");
  ngOnInit(): void {
  }

  onSubmit() {
    this.service.addCategory(this.formModel).subscribe(() => {
      this.route.navigateByUrl("/productcategories");
    })
  }

}
