import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Client } from '../model/client';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  constructor(private http : HttpClient) { }

  getCustomers():Observable<Array<Client>>{
    return this.http.get<Array<Client>>("http://localhost:8085/clients");
  }
}
