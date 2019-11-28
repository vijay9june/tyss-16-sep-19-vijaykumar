import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comment-datails',
  templateUrl: './comment-datails.component.html',
  styleUrls: ['./comment-datails.component.css']
})
export class CommentDatailsComponent implements OnInit {

  Comments: any[] = [];

  constructor() { }

  ngOnInit() {
  }
  getAllComments(childData) {
    console.log("childData", childData);
    this.Comments.push(childData);
  }

}
