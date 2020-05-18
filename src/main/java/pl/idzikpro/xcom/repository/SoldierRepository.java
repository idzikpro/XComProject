package pl.idzikpro.xcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.idzikpro.xcom.entity.SoldierEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface SoldierRepository extends JpaRepository<SoldierEntity, Integer> {
    Optional<SoldierEntity> findById(Integer aLong);

    @Override
    List<SoldierEntity> findAll();
}