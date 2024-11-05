package fr.diginamic;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private int id;
    @Column(name = "NOM", nullable = false)
    private String nom;
    @Column(name = "PRENOM", nullable = false)
    private String prenom;
    @OneToMany(mappedBy = "client")
    private Set<Emprunt> emprunts;

    public Client() { }

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
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter
     *
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter
     *
     * @param prenom prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Getter
     *
     * @return emprunts
     */
    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    /**
     * Setter
     *
     * @param emprunts emprunts
     */
    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
