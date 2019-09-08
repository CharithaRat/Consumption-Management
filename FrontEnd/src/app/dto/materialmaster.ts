import {Unit} from './unit';
import {Main} from './main';
import {Sub} from './sub';
import {Detail} from './detail';

export class Materialmaster {
  constructor(public materialId: any, public materialIdCode: string, public materialName: string, public materialType: string,
              public materialGrade: string, public materialUnit: string, public unitPrice: any, public matDate: string,
              public materialCode, public unit: Unit, public mainMaster: Main, public subMaster: Sub, public detailMaster: Detail,
              public checked: false) {
  }
  // constructor(public materialId: any, public materialIdCode: string, public materialName: string, public materialType: string,
  //             public materialGrade: string, public materialUnit: string, public unitPrice: any, public matDate: string,
  //             public materialCode: string, public unit: string, public main: string, public sub: string, public detail: string,
  //             public checked: false) {
  // }
}
