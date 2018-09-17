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
 * <h1>AnimacionProxy</h1>
 *
 * Description
 *
 * @author TheOverLordKotan (ADA) 
 * @version 1.0
 * 
 */
public class AnimacionProxy implements Animacion
{
	protected Video video = null;
	protected String foto = "mostrar la foto";

	public void clic()
	{
		if (video == null)

		{
			video = new Video();
			video.carga();
		}
		video.reproduce();
	}

	public void dibuja()
	{
		if (video != null)
			video.dibuja();
		else
			dibuja(foto);
	}

	public void dibuja(String foto)
	{
		System.out.println(foto);
	}
}