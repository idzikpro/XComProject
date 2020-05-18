package pl.idzikpro.xcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.idzikpro.xcom.entity.AlienEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlienRepository extends JpaRepository<AlienEntity, Integer> {

    Optional<AlienEntity> findById(Integer aLong);

    @Override
    List<AlienEntity> findAll();

}