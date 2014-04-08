/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.hadoop.rdf.io.input.util;

import org.apache.jena.atlas.lib.Tuple;
import org.apache.jena.riot.lang.PipedRDFIterator;

import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.sparql.core.Quad;

/**
 * A tracked piped quads stream
 * 
 * @author rvesse
 * 
 */
public class TrackedPipedQuadsStream extends TrackedPipedRDFStream<Quad> {

    /**
     * Creates a new stream
     * 
     * @param sink
     *            Sink
     * @param input
     *            Input stream
     */
    public TrackedPipedQuadsStream(PipedRDFIterator<Quad> sink, TrackableInputStream input) {
        super(sink, input);
    }

    @Override
    public void triple(Triple triple) {
        // Triples are discarded
    }

    @Override
    public void quad(Quad quad) {
        this.receive(quad);
    }

    @Override
    public void tuple(Tuple<Node> tuple) {
        // Tuples are discarded
    }

}
