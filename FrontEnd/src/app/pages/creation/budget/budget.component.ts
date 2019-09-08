import {Component, OnInit} from '@angular/core';
import {Budget} from '../../../dto/budget';
import {BudgetService} from '../../../service/budget.service';

@Component({
  selector: 'app-budget',
  templateUrl: './budget.component.html',
  styleUrls: ['./budget.component.css']
})
export class BudgetComponent implements OnInit {
  budgets: Budget[] = [];

  budget: Budget = new Budget(0, '', '', '', '', '', '', 0, 0, 0,
    0, 0, 0, 0, 0, '', 0);

  constructor(private budgetService: BudgetService) {
  }

  ngOnInit() {
    // this.budgetService.getAllBudgets().subscribe(budgets => {
    //   this.budgets = budgets;
    // });
  }

  CallReport(): void {
    console.log('Test1');
    this.budgetService.getReports().subscribe(reports => {
      console.log('Test2');
    });
  }

}
