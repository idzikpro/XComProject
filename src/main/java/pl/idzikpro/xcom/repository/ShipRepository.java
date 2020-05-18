package pl.idzikpro.xcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.idzikpro.xcom.entity.ShipEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShipRepository extends JpaRepository<ShipEntity, Integer> {
    Optional<ShipEntity> findById(Integer aLong);

    @Override
    List<ShipEntity> findAll();
}