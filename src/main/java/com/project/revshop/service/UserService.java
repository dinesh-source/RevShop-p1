package com.project.revshop.service;

import com.project.revshop.entity.SellerModel;
import com.project.revshop.entity.UserModel;
import com.project.revshop.repository.SellerRepository;
import com.project.revshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SellerRepository sellerRepository;

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }
    
    public SellerModel saveSeller(SellerModel sellermodel) {
    	
    	return sellerRepository.save(sellermodel);
    	
    }
}