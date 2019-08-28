import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {Order} from '../../dto/order';
import {OrderService} from '../../service/order.service';
import {Customer} from '../../dto/customer';
import {Item} from '../../dto/item';
import {CustomerService} from '../../service/customer.service';
import {ItemService} from '../../service/item.service';

@Component({
  selector: 'app-manage-order',
  templateUrl: './manage-order.component.html',
  styleUrls: ['./manage-order.component.css']
})
export class ManageOrderComponent implements OnInit {
  orders: Order [] = [];
  customers: Customer [] = [];
  selectCustomer = new Customer('', '', '');
  dbCustomer = new Customer('', '', '');
  items: Item [] = [];
  selectedItem = new Item('', '', 0, 0);
  selectedCusName: string;

  // @ViewChild('sCus', {static: false}) seCustomer: ElementRef;

  constructor(private orderService: OrderService, private customerService: CustomerService, private itemService: ItemService) {
  }

  selectCustomerName(customer: Customer): void {
    console.log('IN');
    this.selectedCusName = customer.name;
    // const name1 = this.selectCustomer.name;
    console.log(this.selectedCusName);
    this.orderService.getSelectedCustomer(this.selectedCusName).subscribe(customers => {
      this.dbCustomer = customers;
    });
  }

  ngOnInit() {
    this.orderService.getAllOrders().subscribe(orders => {
      this.orders = orders;
    });

    this.customerService.getAllCustomers().subscribe(customers => {
      this.customers = customers;
    });

    this.itemService.getAllItems().subscribe(items => {
      this.items = items;
    });


  }

}
