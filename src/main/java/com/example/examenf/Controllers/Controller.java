package com.example.examenf.Controllers;

import com.example.examenf.Entities.Washing_Service;
import com.example.examenf.Entities.Worker;
import com.example.examenf.Services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Exam")
public class Controller {

@Autowired
    private IService iService;

@PostMapping ("addwor")

public Worker addWorker(@RequestBody Worker worker) {

    return iService.addWorker(worker);
}

    @PostMapping("/addWashing")
    public List<Washing_Service> addWashingService(@RequestBody List<Washing_Service> washingServices) {
        return iService.addWashingService(washingServices);
    }

}
