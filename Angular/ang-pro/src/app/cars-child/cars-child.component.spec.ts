import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarsChildComponent } from './cars-child.component';

describe('CarsChildComponent', () => {
  let component: CarsChildComponent;
  let fixture: ComponentFixture<CarsChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarsChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarsChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
