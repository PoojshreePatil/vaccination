package com.assesment.vaccination.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.vaccination.Model.user;
import com.assesment.vaccination.Repository.demorepository;

@Service
public class demoservice {
    @Autowired
    demorepository repo;
    public Object add;

    public void add(user u) {
        repo.save(u);
    }

    public List<user> show() {
        return repo.findAll();
    }
}
