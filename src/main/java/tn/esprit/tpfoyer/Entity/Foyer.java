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
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private String capaciteFoyer;

    @OneToOne(mappedBy = "foyerUniversite")
    Universite universite;

    @OneToMany(mappedBy = "foyerBloc")
    public Set<Bloc> blocs = new HashSet<>();


}
