package com.al.orchestration.Controler;

import com.al.orchestration.DOA.PersonneDAO;
import com.al.orchestration.Entity.Personne;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloControler {

    public HelloControler(PersonneDAO personneDAO) {
        this.personneDAO = personneDAO;
    }
    PersonneDAO personneDAO;

    @GetMapping("/**")
    public String handleAllGetRequests(HttpServletRequest request) {
        String requestUrlRequested = request.getRequestURI();
        System.out.printf("Request URL: %s\n", requestUrlRequested);
        return requestUrlRequested;
    }

//    @GetMapping("/personnes")
//    public Object personnes(){
//        return personneDAO.findAll();
//    }
//
//    @GetMapping("/addPersonne/{nom}")
//    public void addPersonnes(String nom){
//        Personne personne = new Personne();
//        personne.setNom(nom);
//        personneDAO.save(personne);
//    }
}
