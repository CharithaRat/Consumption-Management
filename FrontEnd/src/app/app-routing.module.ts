import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {EmployeeComponent} from './pages/master/employee/employee.component';
import {SupplierComponent} from './pages/master/supplier/supplier.component';
import {ContractorComponent} from './pages/master/contractor/contractor.component';
import {MaterialCategoryComponent} from './pages/master/material-category/material-category.component';
import {MaterialMasterComponent} from './pages/master/material-master/material-master.component';
import {UnitComponent} from './pages/master/unit/unit.component';
import {ModelComponent} from './pages/master/model/model.component';
import {BomComponent} from './pages/creation/bom/bom.component';
import {BomAssignComponent} from './pages/creation/bom-assign/bom-assign.component';
import {XbomComponent} from './pages/creation/xbom/xbom.component';
import {BudgetComponent} from './pages/creation/budget/budget.component';
import {RequestionNoteComponent} from './pages/stock/requestion-note/requestion-note.component';
import {GrnNoteComponent} from './pages/stock/grn-note/grn-note.component';
import {IssueNoteComponent} from './pages/stock/issue-note/issue-note.component';
import {MainStockComponent} from './pages/stock/main-stock/main-stock.component';
import {OutputWindowComponent} from './pages/production/output-window/output-window.component';
import {MaterialVsOutputComponent} from './pages/reports/material-vs-output/material-vs-output.component';
import {LoginComponent} from './pages/auth/login/login.component';
import {RegisterComponent} from './pages/auth/register/register.component';
import {DashboardComponent} from './pages/dashboard/dashboard.component';
import {SupplyComponent} from './pages/stock/supply/supply.component';

const routes: Routes =
  [
    {
      path: 'pages/auth/login',
      component: LoginComponent
    },
    {
      path: 'pages/dashboard',
      component: DashboardComponent
    },
    // MASTER FILES
    {
      path: 'pages/master/employee',
      component: EmployeeComponent
    },
    {
      path: 'pages/master/supplier',
      component: SupplierComponent
    },
    {
      path: 'pages/master/contractor',
      component: ContractorComponent
    },
    {
      path: 'pages/master/material-category',
      component: MaterialCategoryComponent
    },
    {
      path: 'pages/master/material-master',
      component: MaterialMasterComponent
    },
    {
      path: 'pages/master/unit',
      component: UnitComponent
    },
    {
      path: 'pages/master/model',
      component: ModelComponent
    },
    // CREATION
    {
      path: 'pages/creation/bom',
      component: BomComponent
    },
    {
      path: 'pages/creation/bom-assign',
      component: BomAssignComponent
    },
    {
      path: 'pages/creation/xbom',
      component: XbomComponent
    },
    {
      path: 'pages/creation/budget',
      component: BudgetComponent
    },
    // STOCK
    {
      path: 'pages/stock/supply',
      component: SupplyComponent
    },
    {
      path: 'pages/stock/requestion-note',
      component: RequestionNoteComponent
    },
    {
      path: 'pages/stock/grn-note',
      component: GrnNoteComponent
    },
    {
      path: 'pages/stock/issue-note',
      component: IssueNoteComponent
    },
    {
      path: 'pages/stock/main-stock',
      component: MainStockComponent
    },
    // PRODUCTION
    {
      path: 'pages/production/output-window',
      component: OutputWindowComponent
    },
    // REPORTS
    {
      path: 'pages/reports/material-vs-output',
      component: MaterialVsOutputComponent
    },
    // AUTHORIZATION
    {
      path: 'pages/auth/login',
      component: LoginComponent
    },
    {
      path: 'pages/auth/register',
      component: RegisterComponent
    },
    {
      path: '',
      pathMatch: 'full',
      redirectTo: 'pages/dashboard'
    },
  ];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes),
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule {
}
