package ee.gert.decathlon.controller;

import ee.gert.decathlon.entity.Athlete;
import ee.gert.decathlon.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AthleteController {

    @Autowired
    AthleteRepository athleteRepository;


    @GetMapping("athlete/{id}")
    public Athlete getAthlete(@RequestParam Long id){
        return athleteRepository.findById(id).get();
    }

    @PostMapping("athlete")
    public List<Athlete> saveAthlete(@RequestBody Athlete athlete){
        athleteRepository.save(athlete);

        return athleteRepository.findAll();
    }


}
