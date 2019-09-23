import {Component, OnInit, ViewChild} from '@angular/core';
import {ModelService} from '../../../service/model.service';
import {Model} from '../../../dto/model';
import {Contractor} from '../../../dto/contractor';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-model',
  templateUrl: './model.component.html',
  styleUrls: ['./model.component.css']
})
export class ModelComponent implements OnInit {
  models: Model[] = [];
  model: Model = new Model('', '', '', '', '');
  selectedmodel: Model = new Model('', '', '', '', '');

  @ViewChild('frmModel', {static: false}) frmModels: NgForm;

  constructor(private modelService: ModelService) {
  }

  ngOnInit() {
    this.modelService.getAllModels().subscribe(models => {
      this.models = models;
    });
  }

  newModel(): void {
    this.frmModels.onReset();
  }

  tableRowClick(model: Model) {
    this.selectedmodel = Object.assign({}, model);
  }

  saveModel(): void {
    console.log('');
    if (!this.frmModels.invalid) {
      this.modelService.saveModel(this.selectedmodel)
        .subscribe(resp => {
          if (resp) {
            // alert('Model has been saved successfully');
            console.log('Model has been saved successfully');
          } else {
            // alert('Failed to save the Model');
            console.log('Failed to save the Model');
            this.models.push(this.selectedmodel);
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }

  // getModelData(selectedMod: Model) {
  //   this.selectedmodel = selectedMod;
  //   this.modelService.getSelectedModel(this.selectedmodel.modelId).subscribe(moddata => {
  //     this.model = moddata;
  //   });
  // }
}
