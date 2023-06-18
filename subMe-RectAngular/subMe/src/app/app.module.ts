import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {StartPageComponent} from './pages/start-page/start-page.component';
import {SignInPageComponent} from './pages/sign-in-page/sign-in-page.component';
import {SignUpPageComponent} from './pages/sign-up-page/sign-up-page.component';
import {IonicModule} from '@ionic/angular';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { HomeComponent } from './pages/home/home.component';
import { SubsCardsComponent } from './components/subs-cards/subs-cards.component';

@NgModule({
    declarations: [
        AppComponent,
        StartPageComponent,
        SignInPageComponent,
        SignUpPageComponent,
        HomeComponent,
        SubsCardsComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        IonicModule.forRoot(),
        FormsModule,
        HttpClientModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
