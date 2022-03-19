package com.iprishchepov.springbackend.repositories;

import com.iprishchepov.springbackend.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainsRepository extends JpaRepository<Train, Long> {

}
