import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SignUpPageComponent} from "./pages/sign-up-page/sign-up-page.component";
import {StartPageComponent} from "./pages/start-page/start-page.component";
import {SignInPageComponent} from "./pages/sign-in-page/sign-in-page.component";
import {HomePageComponent} from "./pages/home-page/home-page.component";

const routes: Routes = [
    {path: '', component: StartPageComponent},
    {path: 'login/sign-in', component: SignInPageComponent},
    {path: 'login/sign-up', component: SignUpPageComponent},
    {path: 'home', component: HomePageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
