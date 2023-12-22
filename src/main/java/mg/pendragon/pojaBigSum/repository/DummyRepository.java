package mg.pendragon.pojaBigSum.repository;

import java.util.List;
import mg.pendragon.pojaBigSum.PojaGenerated;
import mg.pendragon.pojaBigSum.repository.model.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

  @Override
  List<Dummy> findAll();
}
