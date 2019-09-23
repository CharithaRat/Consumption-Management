import {Component, OnInit, ViewChild} from '@angular/core';
import {XbomService} from '../../../service/xbom.service';
import {ModelService} from '../../../service/model.service';
import {Xbom} from '../../../dto/xbom';
import {Model} from '../../../dto/model';
import {NgForm} from '@angular/forms';
import {Bom} from '../../../dto/bom';
import {BomService} from '../../../service/bom.service';

@Component({
  selector: 'app-xbom',
  templateUrl: './xbom.component.html',
  styleUrls: ['./xbom.component.css']
})
export class XbomComponent implements OnInit {
  xboms: Xbom[] = [];
  xbom: Xbom = new Xbom(0, '', '', '', '', 0, '');
  selectedXbom: Xbom = new Xbom(0, '', '', '', '', 0, '');
  models: Model[] = [];
  boms: Bom[] = [];
  bomTypes = ['Level 1', 'Level 2', 'Level 3'];
  model: Model = new Model('', '', '', '', '');

  @ViewChild('frmXBom', {static: false}) frmXBoms: NgForm;

  constructor(private xbomService: XbomService, private modelService: ModelService, private bomService: BomService) {
  }

  ngOnInit() {
    this.modelService.getAllModels().subscribe(models => {
      this.models = models;
    });
    this.xbomService.getAllXboms().subscribe(xboms => {
      this.xboms = xboms;
    });
    this.bomService.getAllBoms().subscribe(boms => {
      this.boms = boms;
    });
  }

  selectedModel(selectModel: Model): void {
    this.model = selectModel;
  }

  newXBom(): void {
    this.frmXBoms.onReset();
  }

  saveXBom(): void {
    console.log('');
    if (!this.frmXBoms.invalid) {
      this.xbomService.saveXbom(this.selectedXbom)
        .subscribe(resp => {
          if (resp) {
            // alert('Bom has been saved successfully');
            console.log('Model has been saved successfully');
          } else {
            // alert('Failed to save the Bom');
            console.log('Failed to save the Model');
            this.xboms.push(this.selectedXbom);
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }
}
