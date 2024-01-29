import { Customers } from "../customers/customers";
import { ProductItem } from "../productItem/productItem";
import { Product } from "../products/products";

// create the Order model
export class FullOrder {

    id: number;
    createdAt : Date;

    orderStatus:string;
    customerId : number;
    customer:Customers;
    ProductItems : ProductItem[];


  constructor(id: number, createdAt : Date, orderStatus:string, customerId : number, customer:Customers, ProductItems : ProductItem[]) {
    this.id = id;
    this.createdAt = createdAt;
    this.orderStatus = orderStatus;
    this.customerId = customerId;
    this.customer = new Customers(customer.id, customer.name, customer.email);
    this.ProductItems=new Array<ProductItem>();
    for (let i = 0; i < ProductItems.length; i++) {
      this.ProductItems.push(new ProductItem(ProductItems[i].id, ProductItems[i].productid, new Product(ProductItems[i].product.id, ProductItems[i].product.name, ProductItems[i].product.price, ProductItems[i].product.quantity), ProductItems[i].price, ProductItems[i].quantitystk, ProductItems[i].discount));
    }

  
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


  getOrderCustomer(){
    return this.customer;
  }


  getOrderProductItems(){
    return this.ProductItems;
  }




}




