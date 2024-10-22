package pe.edu.upc.aaw.vasquezrodriguez.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.vasquezrodriguez.dtos.CertificacionDTO;
import pe.edu.upc.aaw.vasquezrodriguez.dtos.VrnamebyCertificacionDTO;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Certificacion;
import pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces.ICertificacionService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vasquez")
public class CertificacionController {
    @Autowired
    private ICertificacionService vrCs;

    @PostMapping
    public void registrar(@RequestBody CertificacionDTO vrdto) {
        ModelMapper vrm = new ModelMapper();
        Certificacion vrc = vrm.map(vrdto, Certificacion.class);
        vrCs.insert(vrc);
    }

    @GetMapping
    public List<CertificacionDTO> listar() {
        return vrCs.vrlist().stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,CertificacionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscar")
    public List<CertificacionDTO> buscar(@RequestBody LocalDate vrIssueDate) {
        return vrCs.findCertificacionByVrIssueDate(vrIssueDate).stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,CertificacionDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/sumapuntajeporcertificacion")
    public List<VrnamebyCertificacionDTO> sumaPuntajeporCertificacion(){
        List<String[]> vrlist = vrCs.quantityVrnamebyCertificacion();
        List<VrnamebyCertificacionDTO> vrlistaDTO = new ArrayList<>();
        for (String[] data:vrlist){
            VrnamebyCertificacionDTO vrdto = new VrnamebyCertificacionDTO();
            vrdto.setVrNameCertification(data[0]);
            vrdto.setVrSumScore(Integer.parseInt(data[1]));
            vrlistaDTO.add(vrdto);
        }
        return vrlistaDTO;
    }
}
