import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {
  orders: any;
  addBtnTitle: string = "Add";
  
  constructor(private service: OrderService) { }
  
  ngOnInit(): void {
    let response = this.service.getOrders();
    response.subscribe(data => this.orders = data);
  }

  saveAndExit() {
  }
}
