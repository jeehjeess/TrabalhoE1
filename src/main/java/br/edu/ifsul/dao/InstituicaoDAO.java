
package br.edu.ifsul.dao;

import br.edu.ifsul.trabalho1etapa.Instituicao;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author jessica
 */
@Stateful
public class InstituicaoDAO<TIPO> extends DAOGenerico<Instituicao> implements Serializable{
    
    public InstituicaoDAO(){
    
        super();
        classePersistente = Instituicao.class;
    }
    
    
}
