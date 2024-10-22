package pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces;

import pe.edu.upc.aaw.vasquezrodriguez.entities.Certificacion;

import java.time.LocalDate;
import java.util.List;

public interface ICertificacionService {
    public void insert(Certificacion vrcertification);
    public List<Certificacion> vrlist();
    List<Certificacion> findCertificacionByVrIssueDate(LocalDate vrIssueDate);
    public List<String[]> quantityVrnamebyCertificacion();
}
