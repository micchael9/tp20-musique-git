package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Musique {
    @Id
    @GeneratedValue
    private int id;
    private String artiste;
    private String titre;
    private int duree;

    public Musique() {
    }

    public Musique(String artiste, String titre, int duree) {
        this.artiste = artiste;
        this.titre = titre;
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDureeAsString() {
        int minutes = duree / 60;
        int secondes = duree % 60;
        return minutes + ":" + String.format("%02d", secondes);
    }

    @Override
    public String toString() {
        return "models.controllers.MusiqueREST{" +
                "id=" + id +
                ", artiste='" + artiste + '\'' +
                ", titre='" + titre + '\'' +
                ", duree=" + duree +
                '}';
    }
}
