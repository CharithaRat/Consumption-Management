import {Component, OnInit, ViewChild} from '@angular/core';
import {Bom} from '../../../dto/bom';
import {BomService} from '../../../service/bom.service';
import {NgForm} from '@angular/forms';
import {UnitService} from '../../../service/unit.service';
import {Unit} from '../../../dto/unit';

@Component({
  selector: 'app-bom',
  templateUrl: './bom.component.html',
  styleUrls: ['./bom.component.css'],
})
export class BomComponent implements OnInit {
  boms: Bom[] = [];
  bom: Bom = new Bom(0, '', '', '', '', '', 0, '');
  selectedBom: Bom = new Bom(0, '', '', '', '', '', 0, '');
  bomTypes = ['Level 1', 'Level 2', 'Level 3'];
  units: Unit[] = [];

  @ViewChild('frmBom', {static: false}) frmBoms: NgForm;

  constructor(private bomService: BomService, private unitService: UnitService) {
  }

  ngOnInit() {
    this.bomService.getAllBoms().subscribe(boms => {
      this.boms = boms;
    });
    this.unitService.getAllUnits().subscribe(units => {
      this.units = units;
    });
  }

  newBom(): void {
    this.frmBoms.onReset();
  }

  saveBom(): void {
    console.log('');
    if (!this.frmBoms.invalid) {
      this.bomService.saveBom(this.selectedBom)
        .subscribe(resp => {
          if (resp) {
            // alert('Bom has been saved successfully');
            console.log('Model has been saved successfully');
          } else {
            // alert('Failed to save the Bom');
            console.log('Failed to save the Model');
            this.boms.push(this.selectedBom);
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }
}
