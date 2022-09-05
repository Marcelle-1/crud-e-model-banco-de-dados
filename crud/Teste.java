import java.util.Date;

import br.com.crud.dao.ContatoDAO;
import br.com.crud.model.Contato;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		//Cria contato e salva
		Contato contato = new Contato();
		contato.setNome("Eduardo");
		contato.setIdade(36);
		contato.setDataCadastro(new Date());
		
		contatoDAO.save(contato);
		
		//Atualiza o contato
		Contato contato1 = new Contato();
		contato1.setId(1);
		contato.setNome("Nome novo");
		contato1.setIdade(32);
		contato1.setDataCadastro(new Date());
		
		contatoDAO.update(contato1);
		
		//Remove o contato
		contatoDAO.removeById(1);
		
		//Lista todos contatos
		
		for(Contato c : contatoDAO.getContatos()) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Idade: " + c.getIdade());
			System.out.println("Data de cadastro: " + c.getDataCadastro());
		}
	}

}
