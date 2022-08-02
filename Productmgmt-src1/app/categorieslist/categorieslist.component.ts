import { Component, OnInit } from '@angular/core';
import { Productcategory } from '../common/productcategory';
import { ProductmanagementService } from '../productmanagementservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-categorieslist',
  templateUrl: './categorieslist.component.html',
  styleUrls: ['./categorieslist.component.css']
})
export class CategorieslistComponent implements OnInit {
  
  constructor(private service : ProductmanagementService, private route : Router) {}

    categories : Productcategory[];

  ngOnInit(): void {
    this.listOfCategories();
  }

  listOfCategories() {
    this.service.getAllCategories().subscribe(data => {
      this.categories = data;
      console.log(this.categories);
    })
  }

  searchProducts() {

  }

  addCategory() {
    this.route.navigateByUrl("/categoryform");
  }

}
