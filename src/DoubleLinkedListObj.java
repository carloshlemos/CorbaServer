import java.util.LinkedList;

import org.omg.CORBA.ORB;

import DoubleLinkedListApp.DoubleLinkedListPOA;
import DoubleLinkedListApp.Pessoa;

public class DoubleLinkedListObj extends DoubleLinkedListPOA {
	private ORB orb;
	private LinkedList<Pessoa> listaDuplamenteEncadeada = new LinkedList<Pessoa>();

	public void setORB(ORB orb_val) {
		orb = orb_val;
	}

	@Override
	public boolean add(Pessoa pessoa) {
		return this.listaDuplamenteEncadeada.add(pessoa);
	}

	@Override
	public void addPosition(int posicao, Pessoa pessoa) {
		this.listaDuplamenteEncadeada.add(posicao, pessoa);
	}

	@Override
	public Pessoa get(int posicao) {
		return this.listaDuplamenteEncadeada.get(posicao);
	}

	@Override
	public Pessoa remove(int posicao) {
		return this.listaDuplamenteEncadeada.remove(posicao);
	}

	@Override
	public void shutdown() {
		orb.shutdown(false);
	}

}
