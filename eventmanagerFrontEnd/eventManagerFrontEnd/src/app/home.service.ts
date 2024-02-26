import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { EventModel } from './event.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  constructor(private http : HttpClient) { }

  getAllEvents() : Observable<EventModel[]>{
    return this.http.get<EventModel[]>('http://localhost:8080/getAllEvents')
  }

  createEvent( entryData : any) {
    return this.http.post('http://localhost:8080/createEvent', entryData ).subscribe(
      (result) => {
        console.log(result)
      }
    )
  }
}
