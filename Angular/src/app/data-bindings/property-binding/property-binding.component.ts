import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

name : string = 'Mary';
imgUrl: string = "https://cdn.pixabay.com/photo/2019/09/27/00/50/beach-4507253__340.jpg";
address: string = 'vijayanagar,pincode-855556';
colorName: string = 'green';
isActive: boolean = false;
colSpanValue = 2;

  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'blue';
      this.isActive = !this.isActive;
    }, 2000);
  }

}
