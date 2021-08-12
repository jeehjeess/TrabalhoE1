
package br.edu.ifsul.dao;

import br.edu.ifsul.trabalho1etapa.Professor;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author jessica
 */
@Stateful
public class ProfessorDAO<TIPO> extends DAOGenerico<Professor> implements Serializable{
    
    public ProfessorDAO(){
        super();
        classePersistente = Professor.class;
    }
    
}
