package com.gah.demo.service.serviceImpl;

import com.gah.demo.entity.Branch;
import com.gah.demo.repository.BranchRepository;
import com.gah.demo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Komang Arinanda
 * @since 17/02/18
 */

@Service
@Transactional
public class BranchServiceImpl implements BranchService {


    @Autowired
    private BranchRepository branchRepository;

    @Override
    public List<Branch> getAll() {
        return branchRepository.findAll();
    }

//    @Override
//    public Branch get(Integer id) {
//        return branchRepository.findOne(id);
//    }

//    @Override
//    public Branch add(SaveBranchRequest request) {
//        Branch branch = new Branch();
//        branch.setName(request.getName());
//        branch.setAddress(request.getAddress());
//        branch.setTelephone(request.getTelephone());
//        branch.setStatus("active");
//
//        return branchRepository.save(branch);
//    }
//
//    @Override
//    public Branch update(Integer id, SaveBranchRequest request) {
//        Branch branch;
//        try {
//            branch = this.get(id);
//            if(branch.getStatus().equals("active")){
//                branch.setId(id);
//                branch.setName(request.getName());
//                branch.setAddress(request.getAddress());
//                branch.setTelephone(request.getTelephone());
//                return branchRepository.save(branch);
//            }else{
//                System.out.println("Branch not found!");
//                return null;
//            }
//        }catch (Exception EX){
//            System.out.println("Error updateBranch!");
//            System.out.println(EX.toString());
//            return null;
//        }
//    }

//    @Override
//    public Branch delete(Integer id) {
//        Branch branch;
//        try {
//            branch = this.get(id);
//            if(branch.getStatus().equals("active")){
//                branch.setStatus("not active");
//                return branchRepository.save(branch);
//            }else{
//                System.out.println("Branch not found!");
//                return null;
//            }
//        }catch (Exception EX){
//            System.out.println("Error deleteBranch!");
//            System.out.println(EX.toString());
//            return null;
//        }
//    }

}
