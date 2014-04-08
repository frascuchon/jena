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

package org.apache.jena.hadoop.rdf.io.output.writers;

import java.io.Writer;

import org.apache.jena.hadoop.rdf.types.TripleWritable;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;

import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.sparql.graph.GraphFactory;

/**
 * An abstract record writer for whole file triple formats
 * 
 * @author rvesse
 * 
 * @param <TKey>
 *            Key type
 */
public abstract class AbstractWholeFileTripleWriter<TKey> extends AbstractWholeFileNodeTupleWriter<TKey, Triple, TripleWritable> {

    private Graph g = GraphFactory.createDefaultGraph();

    protected AbstractWholeFileTripleWriter(Writer writer) {
        super(writer);
    }

    @Override
    protected final void add(TripleWritable value) {
        this.g.add(value.get());
    }

    @SuppressWarnings("deprecation")
    @Override
    protected final void writeOutput(Writer writer) {
        RDFDataMgr.write(writer, this.g, this.getRdfLanguage());
    }

    /**
     * Gets the RDF language to write the output in
     * 
     * @return RDF language
     */
    protected abstract Lang getRdfLanguage();

}
