package com.example.springnotes.Controller;

import com.example.springnotes.Model.Note;
import com.example.springnotes.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NotesController {

    @Autowired
    private NoteService noteService;

    @GetMapping(value = "/")
    public String home(Model model) {
        List<Note> notes;
        notes = noteService.findAll();
        model.addAttribute("notesList", notes);
        return "home";
    }

    @GetMapping(value="/notes/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("note", noteService.findNoteById(id));
        return"editnote";
    }

    @GetMapping(value = "/notes/new")
    public String getNoteForm(Model model) {
        model.addAttribute("note", new Note());
        return "newnote";
    }
    @GetMapping(value = "/notes")
    public String getNote(Model model){
        model.addAttribute("note", noteService.findAll());
        return "home";
    }

    @RequestMapping(value="/notes", method = {RequestMethod.POST, RequestMethod.PUT})
    public String submitNewNote(Note note, Model model){
        noteService.save(note);
        model.addAttribute("note", new Note());
        return "redirect:/";
    }

    @DeleteMapping(value="/home")
    public String deleteResource(@RequestParam Long id){
        noteService.deleteNote(id);
        return "redirect:/";
    }



}
