import {Component, OnInit} from '@angular/core';
import {UserService} from "../../services/user.service";

@Component({
    selector: 'app-sign-up-page',
    templateUrl: './sign-up-page.component.html',
    styleUrls: ['./sign-up-page.component.css']
})
export class SignUpPageComponent implements OnInit{

    user = {
        userName: '',
        userEmail: '',
        userPassword: ''
    }

    constructor(
        private userService: UserService
    ) {
    }
    ngOnInit(): void {
    }

    addUser(){
        console.log(this.user)
        this.userService.registerUser(this.user);
    }
}
