export class Budget {
  constructor(public budgetId: any, public budgetCode: string, public modelId: string, public xbomId: string, public bomId: string,
              public bomType: string, public bomUsage: string, public lengeth: any, public width: any, public height: any,
              public bomCost: any, public noOfBomUnits: any, public reqArea: any, public covAreaByCMT: any, public actCost: any,
              public budDate: string, public ttlBudgetCost: any) {
  }
}
