import { Routes } from '@angular/router';
import { LoginComponent } from './login-component/login-component';
import { App } from './app';

export const routes: Routes = [
    { path: 'home', component: App },
    { path: 'login', component: LoginComponent }
];
