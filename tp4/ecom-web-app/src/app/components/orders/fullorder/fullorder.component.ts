import { Component, Input, OnInit, OnChanges } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OrdersService } from '../../../services/orders.service';
import { Order } from '../../../models/orders/orders';
import { Product } from '../../../models/products/products';
import { RouterModule } from '@angular/router';
import { FullOrder } from '../../../models/orders/FullOrders';
import { ProductItem } from '../../../models/productItem/productItem';

@Component({
  selector: 'app-fullorder',
  standalone: true,
  imports: [CommonModule , RouterModule],
  templateUrl: './fullorder.component.html',
  styleUrls: ['./fullorder.component.css']
})
export class FullorderComponent implements OnInit {

  @Input() orderId: number | undefined;
  activeTab: string = 'about'; // Set the default active tab
  fullorders: FullOrder | undefined;
  
  
showTab(arg0: string) {

  this.activeTab = arg0;
}
  constructor(private orderService: OrdersService) {}



  switchTab(tab: string) {
    this.activeTab = tab;
  }

  relode() {
    window.location.reload();
  }

  ngOnInit() {
    console.log(this.orderId);
    if (this.orderId) {
      this.orderService.getOrder(this.orderId).then((fullorders) => {
        this.fullorders = fullorders;
      
      });
    }

  }


}












