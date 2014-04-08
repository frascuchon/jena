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

import org.apache.jena.riot.Lang;

/**
 * A record writer for TriG
 * 
 * @author rvesse
 * 
 * @param <TKey>
 *            Key type
 */
public class TriGWriter<TKey> extends AbstractBatchedQuadWriter<TKey> {

    /**
     * Creates a new record writer
     * 
     * @param writer
     *            Writer
     * @param batchSize
     *            Batch size
     */
    public TriGWriter(Writer writer, long batchSize) {
        super(writer, batchSize);
    }

    @Override
    protected Lang getRdfLanguage() {
        return Lang.TRIG;
    }

}
