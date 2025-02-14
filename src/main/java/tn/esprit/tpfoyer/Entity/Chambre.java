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
public class Chambre {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numerChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    Bloc bloc;
    @OneToMany
    Set<Reservation> reservations = new HashSet<>();
}
