package main.java.br.edu.ifba.saj.ads.poo.atividade_pratica;

import java.time.LocalDateTime;

public class Entity {
    private LocalDateTime CriationTime;
    private LocalDateTime LastModification;

    public Entity(){
        this.CriationTime = LocalDateTime.now();
        this.LastModification = null;
    }

    public LocalDateTime getCriationTime() {
        return CriationTime;
    }

    public LocalDateTime getLastModification() {
        return LastModification;
    }

    protected void setLastModification(LocalDateTime lastModification) {
        LastModification = lastModification;
    }

    
}
