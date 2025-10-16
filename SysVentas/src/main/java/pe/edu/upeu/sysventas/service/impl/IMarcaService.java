package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.model.Marca;

import java.util.List;

public interface IMarcaService extends ICrudGenericoService<Marca,Long>{
    List<ComboBoxOption> listarCombobox();

}
