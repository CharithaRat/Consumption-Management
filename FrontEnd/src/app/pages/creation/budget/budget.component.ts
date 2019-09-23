import {Component, OnInit, ViewChild} from '@angular/core';
import {Budget} from '../../../dto/budget';
import {BudgetService} from '../../../service/budget.service';
import {BomService} from '../../../service/bom.service';
import {XbomService} from '../../../service/xbom.service';
import {BomassignService} from '../../../service/bomassign.service';
import {Bom} from '../../../dto/bom';
import {Xbom} from '../../../dto/xbom';
import {Bomassign} from '../../../dto/bomassign';
import {NgForm} from '@angular/forms';
import {ModelService} from '../../../service/model.service';
import {Model} from '../../../dto/model';

@Component({
  selector: 'app-budget',
  templateUrl: './budget.component.html',
  styleUrls: ['./budget.component.css']
})
export class BudgetComponent implements OnInit {
  budgets: Budget[] = [];

  budget: Budget = new Budget(0, '', '', '', '', '', '', 0, 0, 0,
    0, 0, 0, 0, 0, '', 0);

  selectedBudget: Budget = new Budget(0, '', '', '', '', '', '', 0, 0, 0,
    0, 0, 0, 0, 0, '', 0);

  boms: Bom[] = [];
  xboms: Xbom[] = [];
  bomAssigns: Bomassign[] = [];
  models: Model[] = [];

  bomTypes = ['Level 1', 'Level 2', 'Level 3'];

  @ViewChild('frmBudget', {static: false}) frmBudgets: NgForm;

  constructor(private budgetService: BudgetService, private bomService: BomService, private xbomService: XbomService,
              private bomAssignService: BomassignService, private modelService: ModelService) {
  }

  ngOnInit() {
    this.budgetService.getAllBudgets().subscribe(budgets => {
      this.budgets = budgets;
    });
    this.bomService.getAllBoms().subscribe(boms => {
      this.boms = boms;
    });
    this.xbomService.getAllXboms().subscribe(xboms => {
      this.xboms = xboms;
    });
    this.bomAssignService.getAllAssignedBoms().subscribe(assignboms => {
      this.bomAssigns = assignboms;
    });
    this.modelService.getAllModels().subscribe(models => {
      this.models = models;
    });
  }

  CallReport(): void {
    console.log('Test1');
    this.budgetService.getReports().subscribe(reports => {
      console.log('Test2');
    });
  }

  newBudget(): void {
    this.frmBudgets.onReset();
  }

  saveBudget(): void {
    console.log('save budget');
    if (!this.frmBudgets.invalid) {
      this.budgetService.saveBudget(this.selectedBudget)
        .subscribe(resp => {
          if (resp) {
            // alert('Budget has been saved successfully');
            console.log('Success');
          } else {
            // alert('Failed to save the Budget');
            console.log('Fail');
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }
}
