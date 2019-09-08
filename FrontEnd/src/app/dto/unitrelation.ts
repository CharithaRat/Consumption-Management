import {Unit} from './unit';

export class Unitrelation {
  constructor(public baseUnit: string, public relUnit: string, public unitRate: any) {
  }
  // constructor(public baseUnit: string, public unitList: Unit[], public relUnitList: string[], public unitRate: any[]) {
  // }
}
