import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

   input =""

   createStudent = new FormGroup({
    eventName : new FormControl(''),
    eventDescription : new FormControl('')
   })

   createUser(){
    console.log(this.createStudent.value)
   }
    

  

}
