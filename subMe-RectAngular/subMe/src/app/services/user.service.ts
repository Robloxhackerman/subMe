import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import baseUrl from "./helper";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient: HttpClient) { }

    public registerUser(user: any) {
      return this.httpClient.post(`${baseUrl}auth/signup`, user)
          .subscribe( res => {
              console.log("Persona guardada", user)
          });
    }

    public findUser(user: any) {
        return this.httpClient.get(`${baseUrl}/users`, user)
            .subscribe( res => {
                console.log("Persona encontrada", user)
            });
    }
}
