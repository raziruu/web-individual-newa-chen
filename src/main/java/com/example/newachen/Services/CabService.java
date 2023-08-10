package com.example.newachen.Services;

import com.example.newachen.UserPojo.CabPojo;
import com.example.newachen.entity.Cab;

import java.util.List;


public interface CabService {
    String save_cab_record(CabPojo cabPojo);
    List<Cab> findAll();
    void deleteById(Integer id);
}
