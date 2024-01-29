import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomersService } from '../../services/customers.service';
import { Customers } from '../../models/customers/customers';
import { OrdersService } from '../../services/orders.service';
import { CustomersOrdersComponent } from './customers-orders/customers-orders.component';
@Component({
  selector: 'app-customers',
  standalone: true,
  imports: [CommonModule , CustomersOrdersComponent],
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  title: string = 'my-customers-app';
  customers: Customers[] = [];
  selectedCustomer: Customers | null = null; // Track the selected customer

  p: number = 1; // Current page number
  itemsPerPage: number = 5; // Number of items to display per page

  constructor(private customersService: CustomersService, private ordersService: OrdersService) {}

  async getCustomers() {
    try {
      this.customers = await this.customersService.getcustomers();
    } catch (error) {
      // Handle error as needed
      console.error('Error getting customers in component:', error);
    }
  }

  ngOnInit() {
    this.getCustomers();
  }

  getOrdersByCustomerId(customer: Customers) {
    
    this.ordersService.getOrdersbyCustomerId(customer.id).then((orders) => {
      console.log(orders);
      customer.orders = orders;
      this.selectedCustomer = customer;
    }
    );
  }

  // Function to open the modal and set the selected customer
  openEditUserModal(item: Customers): void {
    this.selectedCustomer = item;
    const modal = document.getElementById('editUserModal');
    this.getOrdersByCustomerId(item)
    if (modal) {
      modal.classList.remove('hidden');
    }
  }

  // Function to close the modal
  closeEditUserModal(): void {
    this.selectedCustomer = null; // Reset selectedCustomer
    const modal = document.getElementById('editUserModal');
    if (modal) {
      modal.classList.add('hidden');
    }
  }


}
