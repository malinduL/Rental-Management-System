package org.rms.repository;

import org.rms.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareItemRepository extends JpaRepository<CustomerEntity,Long> {

}
