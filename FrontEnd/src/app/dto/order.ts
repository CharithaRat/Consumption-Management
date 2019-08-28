import {DatePipe} from '@angular/common';

export class Order {
  constructor(public OID: string, public itemName: string, public unitPrice: number, public unitQty: number, public amount: number) {
  }
}
