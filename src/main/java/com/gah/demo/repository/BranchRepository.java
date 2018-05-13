package com.gah.demo.repository;

import com.gah.demo.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Komang Arinanda
 * @since 20/01/18
 */
@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {
}
