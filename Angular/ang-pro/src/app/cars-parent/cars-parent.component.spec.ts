import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarsParentComponent } from './cars-parent.component';

describe('CarsParentComponent', () => {
  let component: CarsParentComponent;
  let fixture: ComponentFixture<CarsParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarsParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarsParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
