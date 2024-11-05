package fr.diginamic;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="livre")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "TITRE", nullable = false)
    private String titre;
    @Column(name = "AUTEUR", length = 50, nullable = false)
    private String auteur;
    @ManyToMany(mappedBy = "livres")
    private Set<Emprunt> emprunts;

    public Livre() {
    }

    /**
     * Getter
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter
     *
     * @return titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Setter
     *
     * @param titre titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Getter
     *
     * @return auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Setter
     *
     * @param auteur auteur
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
