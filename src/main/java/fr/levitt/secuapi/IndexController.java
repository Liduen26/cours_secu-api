package fr.levitt.secuapi;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.levitt.secuapi.core.Utilisateur;

@RestController
public class IndexController {

    ArrayList<Utilisateur> list = new ArrayList();

    @GetMapping("/add_user")
    public void add_user() {
        Utilisateur user = new Utilisateur();
        user.setNom("hey");
        user.setPrenom("hoy");
        list.add(user);
    }

    @GetMapping("/get_user")
    public Utilisateur get_user() {
        String result = "";
        return list.get(0);
    }


    @GetMapping("/")
    public Utilisateur index() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toto");
        utilisateur.setPrenom("Tata");
        return utilisateur;
    }


}
