package tn.esprit.tpfoyer.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
   private String nomBlock;
   private Long capaciteBloc;

   @ManyToOne
    Foyer foyerBloc;

   @OneToMany(mappedBy = "bloc")
   Set<Chambre> chambres = new HashSet<>();

    public Long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBlock() {
        return nomBlock;
    }

    public void setNomBlock(String nomBlock) {
        this.nomBlock = nomBlock;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    public Foyer getFoyerBloc() {
        return foyerBloc;
    }

    public void setFoyerBloc(Foyer foyerBloc) {
        this.foyerBloc = foyerBloc;
    }

    public Set<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(Set<Chambre> chambres) {
        this.chambres = chambres;
    }
}
