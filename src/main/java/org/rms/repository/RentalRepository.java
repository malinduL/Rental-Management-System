package org.rms.repository;

import org.rms.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<CustomerEntity,Long> {
}
