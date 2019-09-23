import {Component, OnInit, ViewChild} from '@angular/core';
import {UnitService} from '../../../service/unit.service';
import {MainService} from '../../../service/main.service';
import {SubService} from '../../../service/sub.service';
import {DetailService} from '../../../service/detail.service';
import {Unit} from '../../../dto/unit';
import {Main} from '../../../dto/main';
import {Sub} from '../../../dto/sub';
import {Detail} from '../../../dto/detail';
import {NgForm} from '@angular/forms';
import {MaterialmasterService} from '../../../service/materialmaster.service';
import {Materialmaster} from '../../../dto/materialmaster';

@Component({
  selector: 'app-material-master',
  templateUrl: './material-master.component.html',
  styleUrls: ['./material-master.component.css']
})
export class MaterialMasterComponent implements OnInit {
  units: Unit[] = [];
  unit: Unit = new Unit('', '', '');
  mains: Main[] = [];
  mainId: Main = new Main('', '');
  subs: Sub[] = [];
  subId: Sub = new Sub('', '');
  details: Detail[] = [];
  detailId: Detail = new Detail('', '');
  grade: string;
  materials: Materialmaster[] = [];
  material: Materialmaster = new Materialmaster(0, '', '', '', '', '', '',
    '', '', null, null, null, null, false);

  selectedMaterial: Materialmaster = new Materialmaster(0, '', '', '', '', '', '',
    '', '', null, null, null, null, false);

  // grades: string[];
  grades = ['Grade A', 'Grade B', 'Grade C', 'Grade D', 'Grade E'];

  selectedUnit;
  selectedGrade;
  selectedMainId;
  selectedSubId;
  selectedDetailId;
  materialTypes;

  @ViewChild('frmMaterial', {static: false}) frmMaterials: NgForm;

  constructor(private unitService: UnitService, private mainService: MainService, private subService: SubService,
              private detailService: DetailService, private materilService: MaterialmasterService) {
  }

  ngOnInit() {
    this.unitService.getAllUnits().subscribe(units => {
      this.units = units;
    });
    this.mainService.getAllMainCodes().subscribe(mains => {
      this.mains = mains;
    });
    this.subService.getAllSubCodes().subscribe(subs => {
      this.subs = subs;
    });
    this.detailService.getAllDetailCodes().subscribe(details => {
      this.details = details;
    });
    this.materilService.getAllMaterials().subscribe(materials => {
      this.materials = materials;
    });
  }

  getSelectedUnit(): void {
    this.unit = this.selectedUnit;
    console.log('Unit ' + this.unit);
  }

  getSelectedGrade(): void {
    this.grade = this.selectedGrade;
    console.log('Grade ' + this.grade);
  }

  getSelectedMainId(): void {
    this.mainId = this.selectedMainId;
    console.log('Main Id ' + this.mainId);
  }

  getSelectedSubId(): void {
    this.subId = this.selectedSubId;
    console.log('Sub Id ' + this.subId);
  }

  getSelectedDetailId(): void {
    this.detailId = this.selectedDetailId;
    console.log('Detail Id ' + this.detailId);
  }

  newMaterial(): void {
    this.frmMaterials.onReset();
  }

  onChange(args) {
    if (args.isSelected()) {
      alert('checkbox has been checked');
      console.log('checkbox has been checked');
      this.materialTypes = 'B';
    } else {
      alert('checkbox has been unchecked');
      console.log('checkbox has been unchecked');
      this.materialTypes = 'N';
    }
  }

  saveMaterial(): void {
    // console.log('Charitha');
    if (!this.frmMaterials.invalid) {
      console.log(this.selectedMaterial.mainMaster);
      console.log(this.selectedMaterial.subMaster);
      console.log(this.selectedMaterial.detailMaster);
      this.selectedMaterial.materialCode = this.selectedMaterial.mainMaster.mainId + this.selectedMaterial.subMaster.subId
        + this.selectedMaterial.detailMaster.detailId;
      console.log(this.selectedMaterial.materialCode)
      this.selectedMaterial.materialType = this.materialTypes;
      console.log(this.selectedMaterial.materialType);

      this.materilService.saveMaterial(this.selectedMaterial)
        .subscribe(resp => {
          if (resp) {
            // alert('Customer has been saved successfully');
            console.log('Success');
          } else {
            // alert('Failed to save the customer');
            console.log('Fail');
            this.materials.push(this.material);
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }
}
