package com.example.examenf.Controllers;

import com.example.examenf.Entities.Internaute;
import com.example.examenf.Services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Exam")
public class Controller {

@Autowired
    private IService iService;

@PostMapping ("addwor")

public Internaute ajouterInternaute(@RequestBody Internaute internaute) {

    return iService.ajouterInternaute(internaute);
}

    //@PostMapping("/addWashing")
    //public List<Evenement> addWashingService(@RequestBody List<Evenement> washingServices) {
       // return iService.addWashingService(washingServices);
   // }

}
