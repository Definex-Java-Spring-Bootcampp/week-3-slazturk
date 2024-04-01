package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ApplicationRepository {

    private List<Application> applicationList = new ArrayList<>();

    public Application save(Application application) {
        applicationList.add(application);
        return application;
    }
    //find applications by user's email
    public Optional<Application> findByEmail(String email) {
        return applicationList.stream()
                .filter(application -> application.getUser().getEmail().equals(email))
                .findFirst();
    }
}
