// create the product model
export class Product {

    id: number;
    name: string;
    price: Number;
    quantity: Number;
  
    constructor(id: number, name: string, price: Number, quantity: Number ) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.quantity = quantity;
    }

    getProductId(){
      return this.id;
    }
    getProductName(){
      return this.name;
    }
    getProductPrice(){
      return this.price;
    }
    getProductQuantity(){
      return this.quantity;
    }
  
  }