import {Component, OnInit, ViewChild} from '@angular/core';
import {UnitService} from '../../../service/unit.service';
import {Unit} from '../../../dto/unit';
import {Unitrelation} from '../../../dto/unitrelation';
import {UnitrelationService} from '../../../service/unitrelation.service';
import {NgForOf} from '@angular/common';
import {NgForm} from '@angular/forms';
import {Model} from '../../../dto/model';

@Component({
  selector: 'app-unit',
  templateUrl: './unit.component.html',
  styleUrls: ['./unit.component.css']
})
export class UnitComponent implements OnInit {
  units: Unit[] = [];
  unit: Unit = new Unit('', '', '');
  selectedUnit: Unit = new Unit('', '', '');

  unitRelations: Unitrelation[] = [];
  relationUnits: Unit[] = [];
  relationUnitId: string[] = [];
  rateValues: any[] = [];
  unitRelation: Unitrelation = new Unitrelation('', '', 0.0);
  selectedunitRelation: Unitrelation = new Unitrelation('', '', 0.0);

  @ViewChild('frmUnit', {static: false}) frmUnits: NgForm;
  @ViewChild('frmUnitRelation', {static: false}) frmUnitRelations: NgForm;

  constructor(private unitService: UnitService, private unitRelationService: UnitrelationService) {
  }

  selectedLevel1;
  selectedLevel2;

  selectedbaseUnit() {
    console.log('baseunit');
    console.log(this.selectedLevel1);
    this.selectedunitRelation.baseUnit = this.selectedLevel1;
  }

  selectedrelateUnit() {
    console.log('relatedunit');
    console.log(this.selectedLevel2);
    // Assign unit object to array
    // this.relationUnits = selectU;
    // Assign related unit id to array
    // this.relationUnitId = this.selectedLevel2;
    this.selectedunitRelation.relUnit = this.selectedLevel2;
  }

  ngOnInit() {
    this.unitService.getAllUnits().subscribe(units => {
      this.units = units;
    });
    this.unitRelationService.getAllUnitRelations().subscribe(unitrelations => {
      this.unitRelations = unitrelations;
    });
  }

  newUnit(): void {
    this.frmUnits.onReset();
  }

  newUnitRelation(): void {
    this.frmUnitRelations.onReset();
  }

  tableRowClick(unitr: Unitrelation) {
    this.selectedunitRelation = Object.assign({}, unitr);
  }

  saveUnit(): void {
    console.log('');
    if (!this.frmUnits.invalid) {
      this.unitService.saveUnit(this.selectedUnit)
        .subscribe(resp => {
          if (resp) {
            // alert('Unit has been saved successfully');
            console.log('Unit has been saved successfully');
          } else {
            // alert('Failed to save the Unit');
            console.log('Failed to save the Unit');
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }

  // saveUnitRate(): void {
  //   console.log('');
  //   if (!this.frmUnitRelations.invalid) {
  //     this.rateValues = this.selectedunitRelation.unitRate;
  //     this.unitRelations.push(this.selectedunitRelation);
  //   } else {
  //     alert('Invalid Data, Please Correct...!');
  //   }
  // }

  saveUnitRelation(): void {
    /*Unitrelation = new Unitrelation(this.selectedunitRelation.baseUnit, this.relationUnits,
      this.relationUnitId, this.rateValues);
    this.unitRelationService.saveUnitRelationDetails(Unitrelation)
        .subscribe(resp => {
          if (resp) {
            // alert('Unit Relation has been saved successfully');
            console.log('Unit Relation has been saved successfully');
          } else {
            // alert('Failed to save the Unit Relation');
            console.log('Failed to save the Unit Relation');
          }
        });*/
    this.selectedunitRelation.baseUnit = this.selectedLevel1;
    this.selectedunitRelation.relUnit = this.selectedLevel2;
    if (!this.frmUnitRelations.invalid) {
      this.unitRelationService.saveUnitRelation(this.selectedunitRelation)
        .subscribe(resp => {
          if (resp) {
            // alert('Unit Relation has been saved successfully');
            console.log('Unit Relation has been saved successfully');
          } else {
            // alert('Failed to save the Unit Relation');
            // Need to add this to resp=true, but jpa save method return type is void, so resp is false, but save ok in this also
            this.unitRelations.push(this.selectedunitRelation);
            console.log('Failed to save the Unit Relation');
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }
}
