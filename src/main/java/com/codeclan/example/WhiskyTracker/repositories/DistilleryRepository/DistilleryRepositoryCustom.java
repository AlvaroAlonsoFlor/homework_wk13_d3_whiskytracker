package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;


import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface DistilleryRepositoryCustom {
    List<Distillery> getAllDistilleriesInRegion(String region);
    List<Whisky> getWhiskyFromDistilleryWithAge(Long distilleryId, int age);
    List<Distillery> getDistilleriesWithWhiskyThisOld(int age);

}
