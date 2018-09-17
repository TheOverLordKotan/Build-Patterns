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
 * <h1>Catalogo</h1>
 *
 * Description
 * @author TheOverLordKotan (ADA) 
 * @version 1.0
 * 
 */
public interface Catalogo {
	
	List<String> buscaVehiculos(int precioMin, int precioMax); 

}
