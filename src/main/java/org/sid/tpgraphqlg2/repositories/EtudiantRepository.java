package org.sid.tpgraphqlg2.repositories;

import org.sid.tpgraphqlg2.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long>
{
}