package com.tanvi.SpringbootDemo2.repo;

import com.tanvi.SpringbootDemo2.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in database.");
    }
}
