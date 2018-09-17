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

/**
 *
 * <h1>ComponenteGestionDocumento</h1>
 *
 * Description
 *
 * @author TheOverLordKotan (ADA) 
 * @version 1.0
 * 
 */
public class ComponenteGestionDocumento implements GestionDocumento
{

	public String documento(int indice)
	{
		return "Documento número " + indice;
	}
}