import {Component, OnInit, ViewChild} from '@angular/core';
import {Supplier} from '../../../dto/supplier';
import {SupplierService} from '../../../service/supplier.service';
import {Employee} from '../../../dto/employee';
import {Materialmaster} from '../../../dto/materialmaster';
import {MaterialmasterService} from '../../../service/materialmaster.service';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.css']
})
export class SupplierComponent implements OnInit {
  public suppliers: Supplier[] = [];
  supplier: Supplier = new Supplier(0, '', '', '', '', '', '');
  selectedSupplier: Supplier = new Supplier(0, '', '', '', '', '', '');
  // materials: Materialmaster[] = [];
  // selectedMaterials: Materialmaster[] = [];
  supId: string;

  @ViewChild('frmSupplier', {static: false}) frmSuppliers: NgForm;
  constructor(private supplierService: SupplierService, private materialMasterService: MaterialmasterService) {
  }

  ngOnInit() {
    this.supplierService.getAllSuppliers().subscribe(suppliers => {
      this.suppliers = suppliers;
    });

    // this.materialMasterService.getAllMaterials().subscribe(materials => {
    //   this.materials = materials;
    // });
  }

  newSupplier(): void {
    this.frmSuppliers.onReset();
  }

  saveSupplier(): void {
    console.log('');
    if (!this.frmSuppliers.invalid) {
      this.supplierService.saveSupplier(this.supplier)
        .subscribe(resp => {
          if (resp) {
            // alert('Supplier has been saved successfully');
            console.log('Success');
          } else {
            // alert('Failed to save the Supplier');
            console.log('Fail');
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }

  getSupplierData(selectedSup: Supplier) {
    this.selectedSupplier = selectedSup;
    this.supplierService.getSelectedSupplier(this.selectedSupplier.supId).subscribe(supdata => {
      this.supplier = supdata;
    });
  }

  // setMaterial(selectMat: Materialmaster) {
  //   this.selectedMaterials = selectMat;
  // }
}
