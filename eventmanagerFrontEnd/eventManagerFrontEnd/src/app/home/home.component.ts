import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { HomeService } from '../home.service';
import { EventModel } from '../event.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{

   input :any 
    events : any

    ev :any

   createStudent = new FormGroup({
    eventName : new FormControl('' , [Validators.minLength(6)]),
    eventDescription : new FormControl('' , [Validators.required]),
    startDate : new FormControl('',Validators.required),
    endDate : new FormControl('', Validators.required),
    venue : new FormControl(''),
   })

   constructor(private homeService : HomeService){
   }

   ngOnInit(): void {
     this.homeService.getAllEvents().
     subscribe(
     
      (data) => {
        console.log(data)
        this.events = data
      }
     )
   }

   createUser(){
    console.log(this.createStudent.value)
    this.input = this.createStudent.controls.startDate.value
    console.log("LOGGER "+this.input)
    this.homeService.createEvent(this.createStudent.getRawValue())
   }
}
