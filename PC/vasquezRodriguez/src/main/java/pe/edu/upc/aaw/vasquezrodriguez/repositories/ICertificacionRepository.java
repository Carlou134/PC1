package pe.edu.upc.aaw.vasquezrodriguez.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Certificacion;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ICertificacionRepository extends JpaRepository<Certificacion, Integer> {
    List<Certificacion> findCertificacionByVrIssueDate(LocalDate vrIssueDate);
    @Query(value = "SELECT vr_name, SUM(vr_score)\n" +
            "FROM certificacion\n" +
            "GROUP BY vr_name",nativeQuery = true)
    public List<String[]> quantityVrnamebyCertificacion();
}
