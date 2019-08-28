import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {DashboardsComponent} from './view/dashboards/dashboards.component';
import {ManageCustomerComponent} from './view/manage-customer/manage-customer.component';
import {ManageItemComponent} from './view/manage-item/manage-item.component';
import {ManageOrderComponent} from './view/manage-order/manage-order.component';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import {AppRoutingModule} from './app-routing.module';
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
import {Ng2SmartTableModule} from 'ng2-smart-table';
import {BomTableComponent} from './pages/creation/bom/bom-table.component';
import {NgxSpinnerModule} from 'ngx-spinner';
import {MatAutocompleteModule} from '@angular/material';

const EXAMPLES_COMPONENTS = [
  BomTableComponent,
];

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ManageCustomerComponent,
    ManageItemComponent,
    ManageOrderComponent,
    EmployeeComponent,
    SupplierComponent,
    ContractorComponent,
    MaterialCategoryComponent,
    MaterialMasterComponent,
    UnitComponent,
    ModelComponent,
    BomComponent,
    BomAssignComponent,
    XbomComponent,
    BudgetComponent,
    RequestionNoteComponent,
    GrnNoteComponent,
    IssueNoteComponent,
    MainStockComponent,
    OutputWindowComponent,
    MaterialVsOutputComponent,
    LoginComponent,
    RegisterComponent,
    ...EXAMPLES_COMPONENTS,
  ],
  imports: [
    HttpClientModule,
    FormsModule,
    BrowserModule,
    NgxSpinnerModule,
    AppRoutingModule,
    Ng2SmartTableModule,
    MatAutocompleteModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
