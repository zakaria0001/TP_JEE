import { Order } from "../orders/orders";

// create the product model
export class Customers {

  id: number;
  name: string;
  email: string;
  orders: Order[] = [];

constructor(id: number, name: string, email: string) {
  this.id = id;
  this.name = name;
  this.email = email;
  
}

getCustomerName(){
  return this.name;
}
getCustomerEmail(){
  return this.email;
}
getCustomerId(){
  return this.id;
}

}