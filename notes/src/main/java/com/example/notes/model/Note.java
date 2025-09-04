
package com.example.notes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Note {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;
    private String shareId;

    // Constructors
    public Note() {}
    public Note(String title, String content, String shareId) {
        this.title = title;
        this.content = content;
        this.shareId = shareId;
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getShareId() { return shareId; }
    public void setShareId(String shareId) { this.shareId = shareId; }
}
