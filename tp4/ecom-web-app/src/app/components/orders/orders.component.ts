import { Component, OnInit } from '@angular/core';
import { Order } from '../../models/orders/orders';
import { OrdersService } from '../../services/orders.service';
import { FullorderComponent } from './fullorder/fullorder.component';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-orders',
  standalone: true,
  imports: [CommonModule , FullorderComponent],
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {
  title: string = 'my-Orders-app';
  Orders: Order[] = [];

  showFullOrder: boolean = false;
  selectedOrderId: number | undefined;

  constructor(private OrdersService: OrdersService) {}

  async getOrders() {
    try {
      this.Orders = await this.OrdersService.getOrders();
    } catch (error) {
      console.error('Error getting Orders in component:', error);
    }
  }

  onSvgClick(orderId: number) {
    console.log('Order ID:', orderId);
    this.showFullOrder = true;
    this.selectedOrderId = orderId;
  }

  ngOnInit() {
    this.getOrders();
  }
}
