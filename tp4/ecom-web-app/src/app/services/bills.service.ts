import { Injectable } from '@angular/core';
import { Bills } from '../models/bills/bills';

@Injectable({
  providedIn: 'root'
})
export class BillsService {

  Bills: Bills[] = [];

  constructor() { }

  async getBills(): Promise<Bills[]> {
    const url = 'http://localhost:9999/bills-service/Bills';

    try {
      this.Bills = [];
      const response = await fetch(url);
      const data = await response.json();

      for (let i = 0; i < data._embedded.Bills.length; i++) {
        const pr = data._embedded.Bills[i];
        this.Bills.push(new Bills());
      }

      return this.Bills;
    } catch (error) {
      console.error('Error fetching Bills:', error);
      throw error; // You may want to handle the error appropriately in your application
    }
  }
}
