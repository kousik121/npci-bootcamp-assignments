import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { Product } from './common/product';
import { Productcategory } from './common/productcategory';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductmanagementService {
  produrl="http://localhost:8080/api/prod";
  prodcaturl="http://localhost:8080/api/prodcat";
  constructor(private httpClient : HttpClient) { }

  addProduct(product) : Observable<Product> {
    const httpOptions = {
      headers : new HttpHeaders ({
        'Content-type' : 'application/json' ,
        'Authorization' : 'auth-token' ,
        'Access-Control-Allow-Origin' : '*'
      })
    };
    console.log(product);
    return this.httpClient.post<Product>(this.produrl, product, httpOptions);
  }

  addCategory(category) : Observable<Productcategory> {
    const httpOptions = {
      headers : new HttpHeaders ({
        'Content-type' : 'application/json' ,
        'Authorization' : 'auth-token' ,
        'Access-Control-Allow-Origin' : '*'
      })
    };
    console.log(category);
    return this.httpClient.post<Productcategory>(this.prodcaturl, category, httpOptions);
  }

  getAllProducts() : Observable<Product[]> {
    return this.httpClient.get<getProductResponse>(this.produrl).pipe(map(Response => Response._embedded.products));
  }

  getAllCategories() : Observable<Productcategory[]> {
    return this.httpClient.get<getCategoryResponse>(this.prodcaturl).pipe(map(Response => Response._embedded.productCategories));
  }

}

interface getProductResponse {
  _embedded : {
    products : Product[];
  }
}

interface getCategoryResponse {
  _embedded : {
    productCategories : Productcategory[];
  }
}
