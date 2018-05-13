package com.gah.demo.repository;

import com.gah.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Komang Arinanda
 * @since 20/01/18
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
//    List<Account> findAllByBranchId(Integer id);
//    Account findOneByBranchIdAndId(Integer branchId, Integer id);
//
//
//    @Query(value = "SELECT * FROM account a WHERE a.id = :searchKey OR a.name LIKE %:searchKey%",nativeQuery = true)
//    List<Account> searchByIdAndName(@Param("searchKey") String searchKey);
//
//    @Query(value = "SELECT * FROM account a WHERE a.name LIKE %:searchKey%", nativeQuery = true)
//    List<Account> searchByName(@Param("searchKey") String searchKey);
//
    @Query(value = "SELECT * FROM account a WHERE a.email = :email LIMIT 1", nativeQuery = true)
    Account findOneByEmail(@Param("email") String email);
}
