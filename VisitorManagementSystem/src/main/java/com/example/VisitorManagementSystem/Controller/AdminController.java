package com.example.VisitorManagementSystem.Controller;

import com.example.VisitorManagementSystem.Entity.Owner;
import com.example.VisitorManagementSystem.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;
    @Autowired
    public AdminController(AdminService adminService){
        this.adminService=adminService;
    }

    @GetMapping
    public ResponseEntity<List<Owner>> getOwnerList(){
         List<Owner> list= adminService.getOwner();
         return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{flatId}")
    public ResponseEntity<Owner> getOwnerByFlatNumber(@PathVariable Long flatId){
        Owner owner=adminService.getOwnerByFlatNumber(flatId);

        if(owner!=null)
            return new ResponseEntity<>(owner,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    public ResponseEntity<String> deleteOwner(@PathVariable Long flatId){
        boolean b=adminService.deleteOwner(flatId);

        if(b)
            return new ResponseEntity<>("Owner Details deleted successfully",HttpStatus.OK);
        else
            return new ResponseEntity<>("Unable to find the Owner with the given flat id ",HttpStatus.NOT_FOUND);
    }
}
