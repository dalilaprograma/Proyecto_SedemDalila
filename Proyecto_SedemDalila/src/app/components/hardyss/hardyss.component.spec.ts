import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardyssComponent } from './hardyss.component';

describe('HardyssComponent', () => {
  let component: HardyssComponent;
  let fixture: ComponentFixture<HardyssComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HardyssComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HardyssComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
