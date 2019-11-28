import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  InputData = '';

  constructor() { }

  PrintAlertmsg() {
    alert('Hai hello from Angular');
  }

  ngOnInit() {
    }

    dataInput(event) {
      console.log(event.target.value);
      this.InputData = event.target.value;
    }

}
