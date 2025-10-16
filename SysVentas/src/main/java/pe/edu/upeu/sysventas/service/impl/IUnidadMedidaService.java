package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.model.UnidadMedida;

import java.util.List;

public interface IUnidadMedidaService extends  ICrudGenericoService<UnidadMedida,Long> {
    List<ComboBoxOption> listarCombobox();
}
