import {Component, OnInit, ViewChild} from '@angular/core';
import {ContractorService} from '../../../service/contractor.service';
import {Contractor} from '../../../dto/contractor';
import {Supplier} from '../../../dto/supplier';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-contractor',
  templateUrl: './contractor.component.html',
  styleUrls: ['./contractor.component.css']
})
export class ContractorComponent implements OnInit {
  contractors: Contractor[] = [];
  contractor: Contractor = new Contractor(0, '', '', '', '', '', '');
  selectedContractor: Contractor = new Contractor(0, '', '', '', '', '', '');

  @ViewChild('frmContractor', {static: false}) frmContractors: NgForm;

  constructor(private contractorService: ContractorService) {
  }

  ngOnInit() {
    this.contractorService.getAllContractors().subscribe(contractors => {
      this.contractors = contractors;
    });
  }

  newContractor(): void {
    this.frmContractors.onReset();
  }

  saveContractor(): void {
    console.log('');
    if (!this.frmContractors.invalid) {
      this.contractorService.saveContractor(this.contractor)
        .subscribe(resp => {
          if (resp) {
            // alert('Contractor has been saved successfully');
            console.log('Contractor has been saved successfully');
          } else {
            // alert('Failed to save the Supplier');
            console.log('Failed to save the Contractor');
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }

  getContractorData(selectedCont: Contractor) {
    this.selectedContractor = selectedCont;
    this.contractorService.getSelectedContractor(this.selectedContractor.contId).subscribe(contdata => {
      this.contractor = contdata;
    });
  }
}
