import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
    pepe:String = "";
    cardNumber:number = 4;

    ngOnInit(): void {
        if (this.cardNumber.toString().charAt(0) === "5") {
            this.pepe = "mastercard";
        } else {
            this.pepe = "visa";
        }
    }

}
