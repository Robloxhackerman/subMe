import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit{

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
