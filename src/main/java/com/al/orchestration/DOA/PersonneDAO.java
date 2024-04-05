package com.al.orchestration.DOA;

import com.al.orchestration.Entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneDAO extends JpaRepository<Personne, Integer> {
}
