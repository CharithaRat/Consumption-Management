import {Component, OnInit, ViewChild} from '@angular/core';
import {Bomassign} from '../../../dto/bomassign';
import {BomassignService} from '../../../service/bomassign.service';
import {BomService} from '../../../service/bom.service';
import {Bom} from '../../../dto/bom';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-bom-assign',
  templateUrl: './bom-assign.component.html',
  styleUrls: ['./bom-assign.component.css']
})
export class BomAssignComponent implements OnInit {
  bomAssignedDetails: Bomassign[] = [];
  bomAssignedDetail: Bomassign = new Bomassign(0, '', '', null, 0, 0, 0,
    0, 0, 0, '', 0);
  selectedBomAssignedDetail: Bomassign = new Bomassign(0, '', '', null, 0, 0, 0,
    0, 0, 0, '', 0);
  boms: Bom[] = [];
  bom: Bom = new Bom(0, '', '', '', '', '', 0, '');

  @ViewChild('frmBomAssign', {static: false}) frmBomAssigned: NgForm;

  constructor(private bomAssignService: BomassignService, private bomService: BomService) {
  }

  ngOnInit() {
    this.bomService.getAllBoms().subscribe(boms => {
      this.boms = boms;
    });
    this.bomAssignService.getAllAssignedBoms().subscribe(bomAssignedDetails => {
      this.bomAssignedDetails = bomAssignedDetails;
    });
  }

  selectedBom(selectedBom: Bom): void {
    this.bom = selectedBom;
  }

  newAssignedBom(): void {
    this.frmBomAssigned.onReset();
  }

  saveAssignedBom(): void {
    console.log('');
    if (!this.frmBomAssigned.invalid) {
      this.bomAssignService.saveAssignedBom(this.selectedBomAssignedDetail)
        .subscribe(resp => {
          if (resp) {
            // alert('Bom has been saved successfully');
            console.log('Model has been saved successfully');
          } else {
            // alert('Failed to save the Bom');
            console.log('Failed to save the Model');
            this.bomAssignedDetails.push(this.selectedBomAssignedDetail);
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }
}
