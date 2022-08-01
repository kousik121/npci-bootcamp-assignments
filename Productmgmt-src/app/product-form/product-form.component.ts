import { Component, OnInit } from '@angular/core';
import { Product } from '../common/product';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  constructor() { }
  formModel : Product = new Product(0,0,"","",0,"",0,0,"","",0);
  ngOnInit(): void {
  }

  onSubmit() {
    
  }

}
