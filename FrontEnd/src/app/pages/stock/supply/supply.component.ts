import {Component, OnInit} from '@angular/core';
import {Supplier} from '../../../dto/supplier';
import {SupplierService} from '../../../service/supplier.service';
import {MaterialmasterService} from '../../../service/materialmaster.service';
import {Materialmaster} from '../../../dto/materialmaster';

@Component({
  selector: 'app-supply',
  templateUrl: './supply.component.html',
  styleUrls: ['./supply.component.css']
})
export class SupplyComponent implements OnInit {
  public suppliers: Supplier[] = [];
  materials: Materialmaster[] = [];

  constructor(private supplierService: SupplierService, private materialMasterService: MaterialmasterService) {
  }

  ngOnInit() {
    this.supplierService.getAllSuppliers().subscribe(suppliers => {
      this.suppliers = suppliers;
    });

    this.materialMasterService.getAllMaterials().subscribe(materials => {
      this.materials = materials;
    });
  }

  // this function does the job of sending the selected countried out the component
  public sendCheckedCountries(): void {
    const selectedCountries = this.materials.filter( (material) => material.checked );
    // you could use an EventEmitter and emit the selected values here, or send them to another API with some service

    console.log (selectedCountries);
  }
}
