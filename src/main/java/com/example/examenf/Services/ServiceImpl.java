package com.example.examenf.Services;


import com.example.examenf.Entities.Internaute;
import com.example.examenf.Entities.Evenement;
import com.example.examenf.Entities.Categorie;
import com.example.examenf.Repository.IInternaute;
import com.example.examenf.Repository.IEvenement;
import com.example.examenf.Repository.ICategorie;
import com.example.examenf.Repository.ITicket;
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


    final IInternaute iInternaute;
    final ICategorie iCategorie;
    final ITicket iTicket;
    final IEvenement iEvenement;


    @Override
    public Internaute ajouterInternaute(Internaute internaute) {
        return iInternaute.save(internaute);
    }

   // @Override
   // public List<Evenement> addWashingService(List<Evenement> washingServices) {
      //  return iEvenement.saveAll(washingServices);
   // }

   // @Scheduled(fixedRate = 15000) //Lezemni nziid l annotation enablescheduling fil main
   // public void testSchedulure() {
      //  for(Internaute r: iInternaute.reservsbydate()){
          //  log.info(String.valueOf(r));
        //}
    //}
}
