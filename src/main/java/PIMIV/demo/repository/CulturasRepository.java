package PIMIV.demo.repository;

import PIMIV.demo.entity.CulturasEntity;
import PIMIV.demo.entity.EstufasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CulturasRepository extends JpaRepository<CulturasEntity, Integer> {
}


