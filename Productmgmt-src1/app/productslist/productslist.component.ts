import { Component, OnInit } from '@angular/core';
import { ProductmanagementService } from '../productmanagementservice.service';
import { Product } from '../common/product';
import { Router } from '@angular/router';

@Component({
  selector: 'app-productslist',
  templateUrl: './productslist.component.html',
  styleUrls: ['./productslist.component.css']
})
export class ProductslistComponent implements OnInit {
  products : Product[];
  constructor(private service : ProductmanagementService, private route : Router) { }

  ngOnInit(): void {
    this.listOfProducts();
  }

  listOfProducts() {
    this.service.getAllProducts().subscribe(data => {
      this.products = data;
      console.log(data);
    })
  }

  addProducts() {
    this.route.navigateByUrl("/merchant");
  }
}
