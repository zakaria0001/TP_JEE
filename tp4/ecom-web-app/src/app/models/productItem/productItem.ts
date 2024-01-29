import { Product } from "../products/products";

// create the ProductItem model
export class ProductItem {

    id : number;
    productid: number;
    product:Product;
    price: Number;
    quantitystk: Number;
    discount: Number;
  
    constructor(id: number, productid: number, product:Product, price: Number, quantitystk: Number , discount: Number) {
      this.id = id;
      this.productid = productid;
      this.product = product;
      this.price = price;
      this.quantitystk = quantitystk;
        this.discount = discount;
    }

    getProductItemId(){
      return this.id;
    }

    getProductItemProductId(){
      return this.productid;
    }

    getProductItemProduct(){
      return this.product;
    }

    getProductItemPrice(){
      return this.price;
    }

    getProductItemQuantity(){
      return this.quantitystk;
    }


    getProductItemDiscount(){
      return this.discount;
    }



    
  
  }