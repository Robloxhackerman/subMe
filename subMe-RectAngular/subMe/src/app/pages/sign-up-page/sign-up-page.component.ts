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

    constructor(private userService: UserService) {
    }

    ngOnInit(): void {

    }
    forSubmit(){
        console.log(this.user)

        this.userService.registerUser(this.user).subscribe(
            (data) => {
                console.log(data)
            }
        )
    }
}
