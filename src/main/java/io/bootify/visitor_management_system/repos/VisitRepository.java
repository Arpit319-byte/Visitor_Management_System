package io.bootify.visitor_management_system.repos;

import io.bootify.visitor_management_system.domain.Visit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VisitRepository extends JpaRepository<Visit, Long> {
}
