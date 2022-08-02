import { Component, OnInit } from '@angular/core';
import { ProductmanagementService } from '../productmanagementservice.service';
import { Product } from '../common/product';
import { Router } from '@angular/router';

@Component({
  selector: 'app-display-product',
  templateUrl: './display-product.component.html',
  styleUrls: ['./display-product.component.css']
})
export class DisplayProductComponent implements OnInit {
  products : Product[];
  constructor(private service : ProductmanagementService, private route : Router) { }

  ngOnInit(): void {
    this.listOfProducts();
  }

  listOfProducts() {
    this.service.getAllProducts().subscribe(data => {
      this.products = data;
    })
  }

  addProducts() {
    this.route.navigateByUrl("/merchant");
  }

  addToCart() {
    
  }

}
