
package com.example.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notes.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
    Note findByShareId(String shareId);
}
