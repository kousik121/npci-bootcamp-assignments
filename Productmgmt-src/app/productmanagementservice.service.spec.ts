import { TestBed } from '@angular/core/testing';

import { ProductmanagementserviceService } from './productmanagementservice.service';

describe('ProductmanagementserviceService', () => {
  let service: ProductmanagementserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductmanagementserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
