import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CommentDatailsComponent } from './comment-datails.component';

describe('CommentDatailsComponent', () => {
  let component: CommentDatailsComponent;
  let fixture: ComponentFixture<CommentDatailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CommentDatailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CommentDatailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
