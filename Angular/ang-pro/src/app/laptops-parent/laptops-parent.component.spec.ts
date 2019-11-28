import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LaptopsParentComponent } from './laptops-parent.component';

describe('LaptopsParentComponent', () => {
  let component: LaptopsParentComponent;
  let fixture: ComponentFixture<LaptopsParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LaptopsParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LaptopsParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
