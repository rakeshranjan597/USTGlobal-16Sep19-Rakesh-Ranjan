import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BikesParentComponent } from './bikes-parent.component';

describe('BikesParentComponent', () => {
  let component: BikesParentComponent;
  let fixture: ComponentFixture<BikesParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BikesParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BikesParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
