package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.dto.ModeloDataAutocomplet;
import pe.edu.upeu.sysventas.model.Cliente;

import java.util.List;

public interface IClienteService extends ICrudGenericoService<Cliente,String> {
    List<ModeloDataAutocomplet> listAutoCompletCliente();

}
