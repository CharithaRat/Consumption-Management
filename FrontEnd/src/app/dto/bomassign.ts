import {Budget} from './budget';

export class Bomassign {
  constructor(public bomId: any, public bomCode: string, public bomUsage: string, public budget: Budget, public bomLength: any,
              public bomWidth: any, public bomHeight: any, public bomCovAreaUnit: any, public bomCovArea: any, public bomCost: any,
              public bomAssignDate: string, public bomCostPerUnitArea: any) {
  }
}
