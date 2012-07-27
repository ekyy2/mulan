/*
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

/*
 *    LabelBasedSpecificity.java
 *    Copyright (C) 2009-2012 Aristotle University of Thessaloniki, Greece
 */
package mulan.evaluation.measure;

/**
 * Common class for the micro/macro label-based recall measures.
 *
 * @author Grigorios Tsoumakas
 * @version 2011.09.06
 */
public abstract class LabelBasedSpecificity extends LabelBasedBipartitionMeasureBase {

    /**
     * Constructs a new object with given number of labels
     *
     * @param numOfLabels the number of labels
     */
    public LabelBasedSpecificity(int numOfLabels) {
        super(numOfLabels);
    }

    public double getIdealValue() {
        return 1;
    }

}