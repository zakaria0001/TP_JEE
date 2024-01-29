import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Order } from '../../../models/orders/orders';

@Component({
  selector: 'app-customers-orders',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './customers-orders.component.html',
  styleUrl: './customers-orders.component.css'
})
export class CustomersOrdersComponent {
  
  @Input() orders: Order[] = [];

 
  constructor() { }
  
}
