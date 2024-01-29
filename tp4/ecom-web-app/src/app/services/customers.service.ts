import { Injectable } from '@angular/core';
import { Customers } from '../models/customers/customers';

@Injectable({
  providedIn: 'root'
})
export class CustomersService {

  customers: Customers[] = [];

  constructor() { }

  async getcustomers(): Promise<Customers[]> {
    const url = 'http://localhost:9999/customer-service/customers?&projection=fullCustomer';

    try {
      this.customers = [];
      const response = await fetch(url);
      const data = await response.json();

      for (let i = 0; i < data._embedded.customers.length; i++) {
        const pr = data._embedded.customers[i];
        this.customers.push(new Customers(pr.id, pr.name, pr.email));
      }

      return this.customers;
    } catch (error) {
      console.error('Error fetching customers:', error);
      throw error; // You may want to handle the error appropriately in your application
    }
  }
}
