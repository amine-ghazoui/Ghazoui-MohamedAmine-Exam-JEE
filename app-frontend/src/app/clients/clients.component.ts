import { Component } from '@angular/core';
import { Client } from '../model/client';
import { catchError, Observable, throwError } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { ClientService } from '../services/client.service';

@Component({
  selector: 'app-clients',
  standalone: false,
  templateUrl: './clients.component.html',
  styleUrl: './clients.component.css'
})
export class ClientsComponent {

  customers! : Observable<Array<Client>>;
  errorMessage! : string; // ou bien : string | undefined
  constructor(private clientService : ClientService) {}

  getCustomers(){
    this.customers = this.clientService.getCustomers().pipe(
      catchError( err => {
        this.errorMessage = err.message;
        return throwError(err);
      })
    )
  }

}
