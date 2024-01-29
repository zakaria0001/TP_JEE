import { Customers } from "../customers/customers";
import { Product } from "../products/products";

// create the Order model
export class Order {

    id: number;
    createdAt : Date;

    orderStatus:string;
    customerId : number;


  constructor(id: number, createdAt : Date, orderStatus:string, customerId : number) {
    this.id = id;
    this.createdAt = createdAt;
    this.orderStatus = orderStatus;
    this.customerId = customerId;

  
  }

  getOrderId(){
    return this.id;
  }


  getOrderCreatedAt(){
    return this.createdAt;
  }


  getOrderStatus(){
    return this.orderStatus;
  }


  getOrderCustomerId(){
    return this.customerId;
  }



}




