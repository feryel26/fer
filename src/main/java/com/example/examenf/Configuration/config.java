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

    //Q4 ajouter les tickets et les affecter aux evenement et aux internaute indique dans le tableau en mettant ajour chaque fois le nombre de place restants dans le table eveneement
    //NB: si le nombre de ticket a ajouter depasse le nombre de place restant dans un evenement aucun ticket ne peut etre saugarder dans la base de donnees et une execption ser declenchee
    //List<Ticket> ajouterTicketEtAffecterAEvenementEtInternaute(Liste<Ticket> ticket,Long idEvenement,Long idInternaute);

    //Q5 en ulisant AOP implimenter un aspet qui permet dafficher le message "nb restant depasse" si la methode ajouterTicketEtAffecterAEvenementEtInternaute retoune une exception


    //Q6 en respectant signature en utisnat KEYWORD afficher le nombre dinternaute de la tranche dage ADULTE ayant participe a des evenement entre "2024-08-01" et "2024-10-1"
    //Long nbInternauteParTrancheAgeEtDateEvenement(TrancheAge trancheage ,LovalDate dateMin,LocalDate dateMax);

    //Q7 en utilisant jpql ajouter le montant a recupere pour un evenement donnee selon le type de ticket
   // Double montantRecupereParEvtEtTypeTicket(String nomEvt,TypeTicket typeTicket)
    //Q8 afficher linternaute le plus actif celui qui achete plus de ticket
    //String internauteLePlusActif();

}
