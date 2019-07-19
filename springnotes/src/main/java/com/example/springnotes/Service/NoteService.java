package com.example.springnotes.Service;

import com.example.springnotes.Model.Note;
import com.example.springnotes.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public List<Note> findAll() {
        List<Note> notes = (List<Note>) noteRepository.findAll();
        return notes;
    }

    public void deleteNote(long id){
        noteRepository.deleteById(id);
    }

    public void save(Note note) {
        noteRepository.save(note);
    }

    public Note findNoteById(Long id) {
        return noteRepository.findNoteById(id);
    }


}
