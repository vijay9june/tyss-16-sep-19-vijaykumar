import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

  Products = [
    {
      img : 'https://cdn.pixabay.com/photo/2018/09/03/11/52/autumn-3651043__340.png',
      name : 'leaf',
      price : 125
    },

    {
      img : 'https://cdn.pixabay.com/photo/2019/09/14/12/40/iceland-4475920__340.jpg',
      name : 'mountain',
      price : 125
    },

    {
      img : 'https://cdn.pixabay.com/photo/2019/02/06/16/32/architect-3979490__340.jpg',
      name : 'build',
      price : 125
    }
  ]

  constructor() { }

  ngOnInit() {
  }

}
