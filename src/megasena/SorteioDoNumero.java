package megasena;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.exemplo.megasena.MegaSenaUtilitario;

class SorteioDoNumero {
	// implementar os testes
	@Test // annotation para definir o metodo como um teste
	void geracaoDeNumeroPositivo() {
		int numeroMaiorQueZero = MegaSenaUtilitario.sortearNumero();
		// usando a instrucao assertion
		assertTrue(numeroMaiorQueZero > 0);
	}

	@Test // annotation para definir o segundo metodo como um teste
	void geracaoDeNumeroMenorOuIgualASessenta() {
		int NumeroMenorIgualSessenta = MegaSenaUtilitario.sortearNumero();
		// usando a instrucao assertion
		assertTrue(NumeroMenorIgualSessenta <= 60);
	}

}

/*
 * @Test void test() { fail("Not yet implemented"); }
 */