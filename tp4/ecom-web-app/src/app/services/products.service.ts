import { Injectable } from '@angular/core';
import { Product } from '../models/products/products';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  products: Product[] = [];

  constructor() { }

  async getProducts(): Promise<Product[]> {
    const url = 'http://localhost:9999/inventory-service/products';

    try {
      this.products = [];
      const response = await fetch(url);
      const data = await response.json();

      for (let i = 0; i < data._embedded.products.length; i++) {
        const pr = data._embedded.products[i];
        this.products.push(new Product(pr.id, pr.name, pr.price, pr.quantity));
      }

      return this.products;
    } catch (error) {
      console.error('Error fetching products:', error);
      throw error; // You may want to handle the error appropriately in your application
    }
  }
}
