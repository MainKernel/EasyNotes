package com.easynotes.model.service;

import com.easynotes.model.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mightyloot
 *
 * */
@Service
public class NoteService {
    private NoteRepository noteRepository;

    @Autowired
    private void setDependencies(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

}
