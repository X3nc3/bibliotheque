package fr.diginamic;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Table(name = "emprunt")
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private int id;
    @Column(name = "DATE_DEBUT", nullable = false)
    private LocalDateTime dateDebut;
    @Column(name = "DATE_FIN")
    private LocalDateTime dateFin;
    @Column(name = "DELAI")
    private int delai;
    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client;
    @ManyToMany
    @JoinTable(name = "compo", joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
    private Set<Livre> livres;

    public Emprunt() { }

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
     * @return dateDebut
     */
    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    /**
     * Setter
     *
     * @param dateDebut dateDebut
     */
    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * Getter
     *
     * @return dateFin
     */
    public LocalDateTime getDateFin() {
        return dateFin;
    }

    /**
     * Setter
     *
     * @param dateFin dateFin
     */
    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * Getter
     *
     * @return delai
     */
    public int getDelai() {
        return delai;
    }

    /**
     * Setter
     *
     * @param delai delai
     */
    public void setDelai(int delai) {
        this.delai = delai;
    }

    /**
     * Getter
     *
     * @return client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Setter
     *
     * @param client client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Getter
     *
     * @return livres
     */
    public Set<Livre> getLivres() {
        return livres;
    }

    /**
     * Setter
     *
     * @param livres livres
     */
    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emprunt{");
        sb.append("id=").append(id);
        sb.append(", dateDebut=").append(dateDebut);
        sb.append(", dateFin=").append(dateFin);
        sb.append(", delai=").append(delai);
        sb.append(", client=").append(client);
        sb.append('}');
        return sb.toString();
    }
}
