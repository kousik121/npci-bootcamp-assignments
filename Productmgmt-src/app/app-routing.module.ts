import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductslistComponent } from './productslist/productslist.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { CategorieslistComponent } from './categorieslist/categorieslist.component';
import { ProductFormComponent } from './product-form/product-form.component';
import { CategoryFormComponent } from './category-form/category-form.component';

const routes: Routes = [
  {path : '', component : WelcomeComponent},
  {path : 'products', component : ProductslistComponent},
  {path : 'productcategories', component : CategorieslistComponent} ,
  {path : 'productform', component : ProductFormComponent} ,
  {path : 'categoryform', component : CategoryFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
