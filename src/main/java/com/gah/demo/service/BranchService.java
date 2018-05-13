package com.gah.demo.service;

import com.gah.demo.entity.Branch;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Komang Arinanda
 * @since 20/01/18
 */

@Service
public interface BranchService {
    List<Branch> getAll();
//    Branch get(Integer id);
//    Branch add(SaveBranchRequest request);
//    Branch update(Integer id, SaveBranchRequest request);
//    Branch delete(Integer id);
}
