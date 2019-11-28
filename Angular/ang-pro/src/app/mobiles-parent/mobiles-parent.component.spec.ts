import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MobilesParentComponent } from './mobiles-parent.component';

describe('MobilesParentComponent', () => {
  let component: MobilesParentComponent;
  let fixture: ComponentFixture<MobilesParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MobilesParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MobilesParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
