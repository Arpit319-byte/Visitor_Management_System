package com.example.VisitorManagementSystem.Service;

import com.example.VisitorManagementSystem.Entity.Owner;
import com.example.VisitorManagementSystem.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public  AdminService(AdminRepository adminRepository){
        this.adminRepository=adminRepository;
    }

    public List<Owner> getOwner(){
        return adminRepository.findAll();
    }


    public Owner getOwnerByFlatNumber(Long id) {
        Optional<Owner> owner=adminRepository.findByFlatId(id);
        return owner.orElse(null);

    }


    public boolean deleteOwner(Long flatId) {
        Optional<Owner> owner=adminRepository.findByFlatId(flatId);

        if(owner.isPresent()){
            adminRepository.delete(owner.get());
            return true;
        }else
            return false;
    }
}
