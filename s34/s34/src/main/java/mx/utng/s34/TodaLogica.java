package mx.utng.s34;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class TodaLogica {
    private final CasaRepository repository;

    @Autowired
    public TodaLogica(CasaRepository repository){
        this.repository = repository;
    }

    //metodo publico para que sea accedido desde mas clases
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void guardarCasa(@RequestBody Casa casa){
        if (casa.getJefeDeFamilia() == null) {
            throw new RuntimeException("Se debe de tener un jefe de familia");
        }
        casa.setJefeDeFamilia(casa.getJefeDeFamilia().toUpperCase());

        ArrayList<String> otrosMayusculas = new ArrayList<>();

        for (String nombre : otrosMayusculas) {
            otrosMayusculas.add(nombre.toUpperCase());
        }

        casa.setOtros(otrosMayusculas);
    }
}
