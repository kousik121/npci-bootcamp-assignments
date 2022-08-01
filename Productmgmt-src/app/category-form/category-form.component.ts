import { Component, OnInit } from '@angular/core';
import { Productcategory } from '../common/productcategory';

@Component({
  selector: 'app-category-form',
  templateUrl: './category-form.component.html',
  styleUrls: ['./category-form.component.css']
})
export class CategoryFormComponent implements OnInit {

  constructor() { }
  formModel : Productcategory = new Productcategory(0,"");
  ngOnInit(): void {
  }

  onSubmit() {

  }

}
