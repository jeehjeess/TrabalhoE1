
package br.edu.ifsul.dao;

import br.edu.ifsul.trabalho1etapa.Aluno;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author jessica
 */
@Stateful
public class AlunoDAO<TIPO> extends DAOGenerico<Aluno> implements Serializable{
    
    public AlunoDAO(){
        super();
        classePersistente = Aluno.class; 
    }
    
}
