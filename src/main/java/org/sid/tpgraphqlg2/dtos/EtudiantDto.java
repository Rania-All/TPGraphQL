package org.sid.tpgraphqlg2.dtos;

import org.sid.tpgraphqlg2.enums.Genre;

public record EtudiantDto (
        String nom,
        String prenom,
        Genre genre,
        Long centreId
){}
