// The MIT License
//
// Copyright (c) 2004 Evren Sirin
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to
// deal in the Software without restriction, including without limitation the
// rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
// sell copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
// IN THE SOFTWARE.

/*
 * Created on Nov 20, 2004
 */
package org.mindswap.owl;

/**
 * Generic interface for OWL {@link OWLDataValue data values} or
 * {@link OWLIndividual individuals}.
 * 
 * @author unascribed
 * @version $Rev: 1992 $; $Author: thorsten $; $Date: 2008-08-12 15:20:00 +0200 (Di, 12 Aug 2008) $
 */
public interface OWLValue extends OWLObject
{
	/**
	 * @return <code>true</code> if this value is a {@link OWLDataValue data value}.
	 */
	public boolean isDataValue();

	/**
	 * @return <code>true</code> if this value is a {@link OWLIndividual individual}.
	 */
	public boolean isIndividual();
}
