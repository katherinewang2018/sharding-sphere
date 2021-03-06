/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.dbtest.config.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class DQLDataSetAssert implements DataSetAssert {
    
    @XmlAttribute(name = "id")
    private String id;
    
    @XmlAttribute(name = "database-types")
    private String databaseTypes;
    
    @XmlElement(name = "dql-sub-assert")
    private List<DQLSubAssert> subAsserts = new LinkedList<>();
    
    private String path;
    
    @Override
    public String toString() {
        return id;
    }
    
    // TODO remove
    @Override
    public String getShardingRuleTypes() {
        return null;
    }
    
    @Override
    public void setShardingRuleTypes(final String shardingRuleTypes) {
        
    }
}
