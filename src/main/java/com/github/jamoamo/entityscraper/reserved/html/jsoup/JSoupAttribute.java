/*
 * The MIT License
 *
 * Copyright 2022 James Amoore.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.jamoamo.entityscraper.reserved.html.jsoup;

import com.github.jamoamo.entityscraper.api.html.AHtmlAttribute;
import org.jsoup.nodes.Attribute;

/**
 * An HTML attribute that wraps a JSoup Attribute.
 *
 * @author James Amoore
 */
public final class JSoupAttribute
		  extends AHtmlAttribute
{
	private final Attribute attribute;

	/**
	 * Creates an instance of a JSoup Attribute.
	 *
	 * @param attribute the JSoup attribute to wrap
	 */
	public JSoupAttribute(Attribute attribute)
	{
		this.attribute = attribute;
	}

	/**
	 * Returns the name of the attribute.
	 *
	 * @return the attribute name.
	 */
	@Override
	public String getAttributeName()
	{
		return attribute.getKey();
	}

	/**
	 * Returns the value of the attribute.
	 *
	 * @return the attribute value.
	 */
	@Override
	public String getValue()
	{
		return attribute.getValue();
	}

}
