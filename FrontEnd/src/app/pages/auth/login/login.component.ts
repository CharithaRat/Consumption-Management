import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {NgForm} from '@angular/forms';
import {LoginService} from '../../../service/login.service';
import {Router} from '@angular/router';
import {Login} from '../../../dto/login';
import {Customer} from '../../../dto/customer';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: string;
  password: string;
  cUser: Login = new Login('', '', '', '');

  @ViewChild('frmLogin', {static: false}) frmLogin: NgForm;
  @ViewChild('userName', {static: false}) userName: ElementRef;

  constructor(private loginService: LoginService, private router: Router) {
  }

  ngOnInit() {
  }

  login() {
    // console.log(this.frmLogin);
    // Above used to check form status validation state checking in console log

    // if (!this.frmLogin.valid) {
    //   alert('Please enter valid login credentials');
    // } else {
    //   this.loginService.authenticate(this.username, this.password).subscribe(resp => {
    //     this.router.navigateByUrl('/pages/dashboard');
    //   }, error1 => {
    //     if (error1.status === 401) {
    //       alert('Invalid login credentials, Please enter valid data');
    //       this.userName.nativeElement.select();
    //     } else {
    //       console.log(error1);
    //     }
    //   });
    // }

    if (!this.frmLogin.valid) {
      alert('Please enter valid login credentials');
    } else {
      this.loginService.getPassword(this.username).subscribe( login => {
        this.cUser = login;
      });
    }
  }
}
