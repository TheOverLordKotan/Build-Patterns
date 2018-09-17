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
 * <h1>WebServiceAuto</h1>
 *
 * Description
 *
 * @author TheOverLordKotan (ADA) 
 * @version 1.0
 * 
 */
public interface WebServiceAuto
{
	String documento(int indice);
	List<String> buscaVehiculos(int precioMedio, int
			desviacionMax);
}
	