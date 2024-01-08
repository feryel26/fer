package com.example.examenf.Configuration;

import com.example.examenf.Entities.Evenement;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.ObjectInputFilter;
import java.util.logging.Logger;
@Component
@Aspect
@Slf4j
public class config {
    private static final Logger logger = Logger.getLogger(config.class.getName());
    @AfterReturning("execution(* com.example.examenf.*.*.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("hhhhhhhhhhhh " + methodName);
    }

   //Q2 evenement "summer vibes" avec les categorie associees c1 et c2
    //evenement "how to get a job in one week" avec la categorie associe c3
   // Evenement ajouterEvenement(Evenement evenement);

    //Q3 en utlisant le spring scheduler proposer une methode qui se declanche toute les 15 seconde et qui affiche sur le console la liste des evenements pour chaque categorie
    //void listeEvenementParCategorie();


}
