package com.example.examenf.Services;


import com.example.examenf.Entities.Reservation;
import com.example.examenf.Entities.Washing_Service;
import com.example.examenf.Entities.Worker;
import com.example.examenf.Repository.IReservation;
import com.example.examenf.Repository.IWashing;
import com.example.examenf.Repository.IWorker;
import com.example.examenf.Repository.IVehicle;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Aspect
@Component
@Slf4j
public class ServiceImpl implements IService{


    final IReservation iReservation;
    final IWorker iWorker;
    final IVehicle iVehicle;
    final IWashing iWashing;


    @Override
    public Worker addWorker(Worker worker) {
        return iWorker.save(worker);
    }

    @Override
    public List<Washing_Service> addWashingService(List<Washing_Service> washingServices) {
        return iWashing.saveAll(washingServices);
    }

    @Scheduled(fixedRate = 15000) //Lezemni nziid l annotation enablescheduling fil main
    public void testSchedulure() {
        for(Reservation r:iReservation.reservsbydate()){
            log.info(String.valueOf(r));
        }
    }
}
