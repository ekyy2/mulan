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
 *    ClusteringBasedTest.java
 *    Copyright (C) 2009-2012 Aristotle University of Thessaloniki, Greece
 */
package mulan.classifier.meta;

import mulan.classifier.transformation.LabelPowerset;
import weka.classifiers.trees.J48;
import weka.clusterers.SimpleKMeans;
import weka.core.ManhattanDistance;

public class ClusteringBasedTest extends MultiLabelMetaLearnerTest {

    @Override
    public void setUp() throws Exception {
        SimpleKMeans clusterer = new SimpleKMeans();
        clusterer.setNumClusters(5);
        clusterer.setDistanceFunction(new ManhattanDistance());
        learner = new ClusteringBased(clusterer, new LabelPowerset(new J48()));
    }
}
