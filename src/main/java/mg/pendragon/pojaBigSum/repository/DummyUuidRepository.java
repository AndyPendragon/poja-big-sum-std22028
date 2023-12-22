package mg.pendragon.pojaBigSum.repository;

import java.util.Optional;
import mg.pendragon.pojaBigSum.PojaGenerated;
import mg.pendragon.pojaBigSum.repository.model.DummyUuid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyUuidRepository extends JpaRepository<DummyUuid, String> {

  @Override
  Optional<DummyUuid> findById(String id);
}
