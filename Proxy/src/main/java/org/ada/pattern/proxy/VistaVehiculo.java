/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.ada.pattern.proxy;

/**
 *
 * <h1>VistaVehiculo</h1>
 *
 * Description
 *
 * @author TheOverLordKotan (ADA) 
 * @version 1.0
 * 
 */
public class VistaVehiculo
{
	public static void main(String[] args)
	{
		Animacion animacion = new AnimacionProxy();
		animacion.dibuja();
		animacion.clic();
		animacion.dibuja();
	}
}
