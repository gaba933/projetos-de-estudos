import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InvalidoComponent } from './invalido.component';

describe('InvalidoComponent', () => {
  let component: InvalidoComponent;
  let fixture: ComponentFixture<InvalidoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InvalidoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InvalidoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
