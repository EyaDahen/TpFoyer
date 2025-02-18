package tn.esprit.tpfoyer.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entity.Bloc;
@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
