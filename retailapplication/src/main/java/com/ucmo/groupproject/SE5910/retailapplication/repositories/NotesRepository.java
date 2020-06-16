package com.ucmo.groupproject.SE5910.retailapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ucmo.groupproject.SE5910.retailapplication.models.Notes;

//20.
public interface NotesRepository extends JpaRepository<Notes, Long> {
    
    Notes findByTitle(final String title);
}
