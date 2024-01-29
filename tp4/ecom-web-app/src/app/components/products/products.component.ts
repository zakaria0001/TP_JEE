import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ProductsService } from '../../services/products.service';
import { Product } from '../../models/products/products';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  title: string = 'my-products-app';
  products: Product[] = [];

  p: number = 1; // Current page number
  itemsPerPage: number = 5; // Number of items to display per page

  constructor(private productsService: ProductsService) { }

  async getProducts() {
    try {
      this.products = await this.productsService.getProducts();
    } catch (error) {
      // Handle error as needed
      console.error('Error getting products in component:', error);
    }
  }

  ngOnInit() {
    this.getProducts();
  }
}
