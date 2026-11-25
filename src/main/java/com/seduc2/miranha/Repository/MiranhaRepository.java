package com.seduc2.miranha.Repository;

import com.seduc2.miranha.Entity.Miranha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiranhaRepository extends JpaRepository<Miranha, Integer> {
}
