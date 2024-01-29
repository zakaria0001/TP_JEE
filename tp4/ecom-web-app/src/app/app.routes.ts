import { Routes } from '@angular/router';
import { ProductsComponent } from './components/products/products.component';
import { HomeComponent } from './components/home/home.component';
import { CustomersComponent } from './components/customers/customers.component';
import { OrdersComponent } from './components/orders/orders.component';
import { FullorderComponent } from './components/orders/fullorder/fullorder.component';
import { BillsComponent } from './components/bills/bills.component';

export const routes: Routes = [

{path: "products", component: ProductsComponent},
{path: "orders", component: OrdersComponent},
{path: "bills", component: BillsComponent},
{path: "fullOrder", component: FullorderComponent},
{path: "customers", component: CustomersComponent},
{path: "", component: HomeComponent},



];
