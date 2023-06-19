import {Component} from '@angular/core';

@Component({
    selector: 'app-register-subscription',
    templateUrl: './register-subscription.component.html',
    styleUrls: ['./register-subscription.component.css']
})
export class RegisterSubscriptionComponent {
    pepe: String = "";

    cardNumber = '';
    cardExpireMonth = '';
    cardExpireYear = '';

    subscriptionName = '';
    subscriptionPrice = '';
    subscriptionDay = '';
    subscriptionMonth = '';

    card = {
        cardNumber: 0,
        cardExpireMonth: 0,
        cardExpireYear: 0
    }

    subscription= {
        subscriptionName: '',
        subscriptionPrice: 0,
        subscriptionDay: 0,
        subscriptionMonth: 0
    }

    ngOnInit(): void {
        if (this.card.cardNumber.toString().charAt(0) === "5") {
            this.pepe = "mastercard";
        } else {
            this.pepe = "visa";
        }
    }

    saveSubscription() {
        this.card.cardNumber = Number(this.cardNumber);
        this.card.cardExpireMonth = Number(this.cardExpireMonth);
        this.card.cardExpireYear = Number(this.cardExpireYear);

        this.subscription.subscriptionName = this.subscriptionName;
        this.subscription.subscriptionPrice = Number(this.subscriptionPrice)
        this.subscription.subscriptionDay = Number(this.subscriptionDay)
        this.subscription.subscriptionMonth = Number(this.subscriptionMonth)


    }
}
