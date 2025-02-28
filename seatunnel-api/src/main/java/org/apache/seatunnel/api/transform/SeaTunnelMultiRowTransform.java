/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.seatunnel.api.transform;

import java.util.List;

public interface SeaTunnelMultiRowTransform<T> extends SeaTunnelTransform<T> {

    /**
     * Transform input data to {@link this#getProducedCatalogTable().getSeaTunnelRowType()} types
     * data.
     *
     * @param row the data need be transformed.
     * @return transformed data.
     */
    List<T> flatMap(T row);

    default T map(T row) {
        throw new UnsupportedOperationException("Heads-up conversion is not supported");
    }
}
