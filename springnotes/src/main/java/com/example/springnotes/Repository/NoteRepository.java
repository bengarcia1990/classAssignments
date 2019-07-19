package com.example.springnotes.Repository;

import com.example.springnotes.Model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
    Note findNoteById(Long id);
}
