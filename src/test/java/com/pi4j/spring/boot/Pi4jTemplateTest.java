/*
 * Copyright (c) 2018, hiwepy (https://github.com/hiwepy).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.pi4j.spring.boot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link Pi4jTemplate}.
 *
 * <p>Verifies the template can be instantiated through its constructor.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@DisplayName("Pi4jTemplate Tests")
class Pi4jTemplateTest {

    @Test
    @DisplayName("Instance can be created via constructor with properties")
    void testInstantiation() {
        Pi4jProperties properties = new Pi4jProperties();
        Pi4jTemplate template = new Pi4jTemplate(properties);
        assertThat(template).isNotNull();
    }

    @Test
    @DisplayName("Instance can be created with a null properties argument")
    void testInstantiationWithNullProperties() {
        Pi4jTemplate template = new Pi4jTemplate(null);
        assertThat(template).isNotNull();
    }
}
