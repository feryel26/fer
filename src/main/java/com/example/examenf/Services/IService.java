package com.example.examenf.Services;

import com.example.examenf.Entities.Washing_Service;
import com.example.examenf.Entities.Worker;

import java.util.List;

public interface IService {


    public Worker addWorker(Worker worker);
    List<Washing_Service> addWashingService(List<Washing_Service> washingServices);


}
