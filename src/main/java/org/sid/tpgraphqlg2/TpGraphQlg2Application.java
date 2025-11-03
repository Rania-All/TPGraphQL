package org.sid.tpgraphqlg2;

import org.sid.tpgraphqlg2.enums.Genre;
import org.sid.tpgraphqlg2.model.Centre;
import org.sid.tpgraphqlg2.model.Etudiant;
import org.sid.tpgraphqlg2.repositories.CentreRepository;
import org.sid.tpgraphqlg2.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpGraphQlg2Application implements CommandLineRunner {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CentreRepository centreRepository;
    public static void main(String[] args) {
        SpringApplication.run(TpGraphQlg2Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Centre centre1=Centre.builder()
                .nom("Maarif").adresse("Biranzarane").build();
        centreRepository.save(centre1);
        Centre centre2=Centre.builder()
                .nom("Oranges").adresse("Oulfa").build();
        centreRepository.save(centre2);
        Etudiant et1=Etudiant.builder()
                .nom("Adnani").prenom("Brahim").genre(Genre.Homme)
                .centre(centre1).build();
        etudiantRepository.save(et1);}}