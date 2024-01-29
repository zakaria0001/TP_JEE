import { Injectable } from '@angular/core';
import { Order } from '../models/orders/orders';
import { FullOrder } from '../models/orders/FullOrders';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  Orders: Order[] = [];
  Order: Order | undefined;
  FullOrder: FullOrder | undefined;
  constructor() { }

  async getOrders(): Promise<Order[]> {
    const url = 'http://localhost:9999/order-service/allOrders';

    try {
      this.Orders = [];
      const response = await fetch(url);
      const data = await response.json();
      for (let i = 0; i < data.length; i++) {
        const ord= data[i];
     
        this.Orders.push(new Order( ord.id , ord.createdAt , ord.orderStatus ,ord.customer.id));
     
     
      }

      return this.Orders;
    } catch (error) {
      console.error('Error fetching Orders:', error);
      throw error; // You may want to handle the error appropriately in your application
    }
  }


  async getOrder(id : number): Promise<FullOrder> {
    const url = 'http://localhost:9999/order-service/fullOrder/'+id;

    try {
      this.FullOrder=undefined;
      const response = await fetch(url);
      const data = await response.json();
     
        this.FullOrder = new FullOrder( data.id , data.createdAt , data.orderStatus ,data.customer.id , data.customer ,data.productItems);
       console.log(this.Order);
        return this.FullOrder;
    } catch (error) {
      console.error('Error fetching Orders:', error);
      throw error; // You may want to handle the error appropriately in your application
    }
  }


  async getOrdersbyCustomerId(id : number): Promise<Order[]> {
    const url = 'http://localhost:9999/order-service/orders/search/byCustomerId?customerId='+id+'&projection=fullorder';
   

    try {
      this.Orders = [];
      const response = await fetch(url);
      const data = await response.json();
      for (let i = 0; i < data._embedded.orders.length; i++) {
        const ord= data._embedded.orders[i];

        this.Order = new Order( ord.id , ord.createdAt , ord.orderStatus ,ord.customerId);
        this.Orders.push(this.Order);
      }
      //loop on orders and log them 
      for (let i = 0; i < this.Orders.length; i++) {
        const ord= this.Orders[i];
        console.log(ord);
      }
      return this.Orders; 

      

    } catch (error) {
      throw error; // You may want to handle the error appropriately in your application
    }
  }

}
