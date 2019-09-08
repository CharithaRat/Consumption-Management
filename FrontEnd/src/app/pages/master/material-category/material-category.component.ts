import {Component, OnInit, ViewChild} from '@angular/core';
import {Main} from '../../../dto/main';
import {Sub} from '../../../dto/sub';
import {Detail} from '../../../dto/detail';
import {MainService} from '../../../service/main.service';
import {SubService} from '../../../service/sub.service';
import {DetailService} from '../../../service/detail.service';
import {NgForm} from '@angular/forms';
import {Unitrelation} from '../../../dto/unitrelation';

@Component({
  selector: 'app-material-category',
  templateUrl: './material-category.component.html',
  styleUrls: ['./material-category.component.css']
})
export class MaterialCategoryComponent implements OnInit {
  mainCodes: Main[] = [];
  mainCode: Main = new Main('', '');
  subCodes: Sub[] = [];
  subCode: Sub = new Sub('', '');
  detailCodes: Detail[] = [];
  detailCode: Detail = new Detail('', '');

  @ViewChild('frmMain', {static: false}) frmMainCode: NgForm;
  @ViewChild('frmSub', {static: false}) frmSubCode: NgForm;
  @ViewChild('frmDetail', {static: false}) frmDetailCode: NgForm;

  constructor(private mainService: MainService, private subService: SubService, private detailService: DetailService) {
  }

  ngOnInit() {
    this.mainService.getAllMainCodes().subscribe(maincodes => {
      this.mainCodes = maincodes;
    });
    this.subService.getAllSubCodes().subscribe(subcodes => {
      this.subCodes = subcodes;
    });
    this.detailService.getAllDetailCodes().subscribe(detailcodes => {
      this.detailCodes = detailcodes;
    });
  }

  tableRowClickMain(main: Main) {
    this.mainCode = Object.assign({}, main);
  }

  tableRowClickSub(sub: Sub) {
    this.subCode = Object.assign({}, sub);
  }

  tableRowClickDetail(detail: Detail) {
    this.detailCode = Object.assign({}, detail);
  }

  newMain(): void {
    this.frmMainCode.onReset();
  }

  newSub(): void {
    this.frmSubCode.onReset();
  }

  newDetail(): void {
    this.frmDetailCode.onReset();
  }

  saveMainCode(): void {
    if (!this.frmMainCode.invalid) {
      this.mainService.saveMainCode(this.mainCode)
        .subscribe(resp => {
          if (resp) {
            console.log('Saved Successfully');
          } else {
            console.log('Saved Not Successfully');
            this.mainCodes.push(this.mainCode);
          }
        });
    } else {
      alert('Invalid data, Please Correct...!');
    }
  }

  saveSubCode(): void {
    console.log('');
    if (!this.frmSubCode.invalid) {
      this.subService.saveSubCode(this.subCode)
        .subscribe(resp => {
          if (resp) {
            console.log('Saved Successfully');
          } else {
            console.log('Saved Not Successfully');
            this.subCodes.push(this.subCode);
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }

  saveDetailCode(): void {
    console.log('');
    if (!this.frmDetailCode.invalid) {
      this.detailService.saveDetailCode(this.detailCode)
        .subscribe(resp => {
          if (resp) {
            console.log('Saved Successfully');
          } else {
            console.log('Saved Not Successfully');
            this.detailCodes.push(this.detailCode);
          }
        });
    } else {
      alert('Invalid Data, Please Correct...!');
    }
  }

}
