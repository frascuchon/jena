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

package org.apache.jena.hadoop.rdf.mapreduce.filter;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.jena.hadoop.rdf.mapreduce.filter.ValidTripleFilterMapper;
import org.apache.jena.hadoop.rdf.types.TripleWritable;


/**
 * Tests for the {@link ValidTripleFilterMapper}
 * 
 * @author rvesse
 * 
 */
public class ValidTripleFilterMapperTest extends AbstractTripleValidityFilterTests {

    @Override
    protected Mapper<LongWritable, TripleWritable, LongWritable, TripleWritable> getInstance() {
        return new ValidTripleFilterMapper<LongWritable>();
    }

}
