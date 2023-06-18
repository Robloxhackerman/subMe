import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SignUpPageComponent} from "./pages/sign-up-page/sign-up-page.component";
import {StartPageComponent} from "./pages/start-page/start-page.component";
import {SignInPageComponent} from "./pages/sign-in-page/sign-in-page.component";
import {HomeComponent} from "./pages/home/home.component";
import {RegisterSubscriptionComponent} from "./pages/register-subscription/register-subscription.component";

const routes: Routes = [
    {path: '', component: StartPageComponent},
    {path: 'login/sign-in', component: SignInPageComponent},
    {path: 'login/sign-up', component: SignUpPageComponent},
    {path: 'home', component: HomeComponent},
    {path: 'register-sub', component: RegisterSubscriptionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
