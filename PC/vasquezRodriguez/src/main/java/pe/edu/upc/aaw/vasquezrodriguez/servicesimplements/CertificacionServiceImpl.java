package pe.edu.upc.aaw.vasquezrodriguez.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Certificacion;
import pe.edu.upc.aaw.vasquezrodriguez.repositories.ICertificacionRepository;
import pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces.ICertificacionService;

import java.time.LocalDate;
import java.util.List;

@Service
public class CertificacionServiceImpl implements ICertificacionService {
    @Autowired
    private ICertificacionRepository vrCr;

    @Override
    public void insert(Certificacion vrcertification) {
        vrCr.save(vrcertification);
    }

    @Override
    public List<Certificacion> vrlist() {
        return vrCr.findAll();
    }

    @Override
    public List<Certificacion> findCertificacionByVrIssueDate(LocalDate vrIssueDate) {
        return vrCr.findCertificacionByVrIssueDate(vrIssueDate);
    }

    @Override
    public List<String[]> quantityVrnamebyCertificacion() {
        return vrCr.quantityVrnamebyCertificacion();
    }
}
