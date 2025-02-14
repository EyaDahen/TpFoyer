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
}
