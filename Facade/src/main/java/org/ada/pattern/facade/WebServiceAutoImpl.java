/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.ada.pattern.facade;

import java.util.List;

/**
 *
 * <h1>WebServiceAutoImpl</h1>
 *
 * Description
 *
 * @author TheOverLordKotan (ADA) 
 * @version 1.0
 * 
 */
public class WebServiceAutoImpl implements WebServiceAuto
{
	protected Catalogo catalogo = new ComponenteCatalogo();
	protected GestionDocumento gestionDocumento = new
			ComponenteGestionDocumento();

	public String documento(int indice)
	{
		return gestionDocumento.documento(indice);
	}

	public List<String> buscaVehiculos(int precioMedio,
			int desviacionMax)
	{
		return catalogo.buscaVehiculos(precioMedio -
				desviacionMax, precioMedio + desviacionMax);
	}
}
