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
 * <h1>Video</h1>
 *
 * Description
 *
 * @author TheOverLordKotan (ADA) 
 * @version 1.0
 * 
 */
public class Video implements Animacion
{
	public void clic() { }

	public void dibuja()
	{
		System.out.println("Mostrar el vídeo");
	}

	public void carga()
	{
		System.out.println("Cargar el vídeo");
	}

	public void reproduce()
	{
		System.out.println("Reproducir el vídeo");
	}
}