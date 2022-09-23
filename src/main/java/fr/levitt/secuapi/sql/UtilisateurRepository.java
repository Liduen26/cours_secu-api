package fr.levitt.secuapi.sql;

import org.springframework.data.repository.CrudRepository;

import fr.levitt.secuapi.core.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {
}
