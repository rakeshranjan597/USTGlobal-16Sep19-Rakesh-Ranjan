import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CategroiesComponent } from './categroies.component';

describe('CategroiesComponent', () => {
  let component: CategroiesComponent;
  let fixture: ComponentFixture<CategroiesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CategroiesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CategroiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
