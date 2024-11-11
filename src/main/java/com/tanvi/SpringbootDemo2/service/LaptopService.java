package com.tanvi.SpringbootDemo2.service;

import com.tanvi.SpringbootDemo2.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private com.tanvi.SpringbootDemo2.repo.LaptopRepository repo;
    public void addLaptop(Laptop lap){
        //System.out.println("Method called");
        repo.save(lap);
    }
    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }

    public static class LaptopRepository {

    }
}
