import { Component, OnInit } from '@angular/core';
import { Product } from '../common/product';
import { ProductmanagementService } from '../productmanagementservice.service';
import { Router } from '@angular/router';
import { Productcategory } from '../common/productcategory';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  categories : Productcategory[];
  formModel : Product = new Product(0,0,"","",0,"",0,0,"","",0);
  constructor(private service : ProductmanagementService, private route : Router) { }
  
  ngOnInit(): void {
    this.listOfCategories();
  }

  listOfCategories() {
    this.service.getAllCategories().subscribe(data => {
      this.categories = data;
    })
  }

  onSubmit() {
    this.service.addProduct(this.formModel).subscribe(() => {
      this.route.navigateByUrl("/shop");
    })
  }

}
