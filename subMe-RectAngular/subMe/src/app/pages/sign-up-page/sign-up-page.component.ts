import {Component, OnInit} from '@angular/core';
import {UserService} from "../../services/user.service";

@Component({
    selector: 'app-sign-up-page',
    templateUrl: './sign-up-page.component.html',
    styleUrls: ['./sign-up-page.component.css']
})
export class SignUpPageComponent implements OnInit{
    user = {
        name: '',
        email: '',
        password: ''
    }
    constructor(

    ) {
    }
    ngOnInit(): void {
    }
}
