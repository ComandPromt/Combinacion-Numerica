import java.util.LinkedList;

public class Prueba {

	private static LinkedList<String> combinacion(int opciones) {

		LinkedList<String> lista = new LinkedList<String>();

		int combinacion = 2;

		int vueltas = 0;

		for (int i = 1; i <= opciones; i++) {

			if (i > 1) {

				--vueltas;
			}

			else {
				vueltas = opciones - (combinacion - 1);
			}

			int y = 1;

			for (int x = 1; x <= vueltas; x++) {

				if (y != i) {

					if (!lista.contains(y + "-" + (i))) {
						lista.add(i + "-" + (y));
					}

					else {

						while (lista.contains(y + "-" + (i))) {
							++y;
						}

						if (i == y) {
							++y;
						}

						lista.add(i + "-" + (y));

					}

				}

				else {
					lista.add(i + "-" + (++y));
				}

				++y;

			}

		}

		return lista;
	}

	public static void main(String[] args) {

		LinkedList<String> muestras = new LinkedList<String>();

		muestras = combinacion(6);

		for (int i = 0; i < muestras.size(); i++) {
			System.out.println(muestras.get(i));
		}

	}

}
