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
 * <h1>UsuarioWebService</h1>
 *
 * Description
 *
 * @author TheOverLordKotan (ADA) 
 * @version 1.0
 * 
 */
public class UsuarioWebService 
{
	public static void main(String[] args)
	{
		WebServiceAuto webServiceAuto = new
				WebServiceAutoImpl();
		System.out.println(webServiceAuto.documento(0));
		System.out.println(webServiceAuto.documento(1));
		List<String> resultados =
				webServiceAuto.buscaVehiculos(6000, 1000);
		if (resultados.size() > 0)
		{
			System.out.println(
					"Vehículo(s) cuyo precio está comprendido "+
					"entre 1000 y 6000");
			for (String resultado: resultados)
				System.out.println(" " + resultado);
		}
	}
}

