import { Component } from '@angular/core';
import { LoginService } from '../login-service';
import { Router } from '@angular/router';
//import { CookieService } from 'ngx-cookie-service';


@Component({
  selector: 'app-login-component',
  imports: [],
  templateUrl: './login-component.html',
  styleUrl: './login-component.css',
})
export class LoginComponent {
  errorMessage: string = '';

  constructor(private service: LoginService, private router: Router) {}

  login(email: string, password: string) {
    console.log("Valeurs reçues :", email, password); // Ajoute ceci
    this.service.login(email,password).subscribe({
      next: ()=>{
        // Login OK
        this.router.navigate(['/home']);
      },
      error: (errorObject)=>{
        this.errorMessage = errorObject.error.error;
      }
    })
  }
}
