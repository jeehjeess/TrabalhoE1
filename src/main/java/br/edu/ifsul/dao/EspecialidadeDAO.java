
package br.edu.ifsul.dao;


import br.edu.ifsul.trabalho1etapa.Especialidade;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author jessica
 */
@Stateful
public class EspecialidadeDAO<TIPO> extends DAOGenerico<Especialidade> implements  Serializable{
    
    public EspecialidadeDAO(){
        super();
        classePersistente = Especialidade.class;
    }
}
