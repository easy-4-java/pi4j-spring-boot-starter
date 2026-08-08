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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link Pi4jProperties}.
 *
 * <p>Verifies default values, getters/setters and the configuration prefix constant.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@DisplayName("Pi4jProperties Tests")
class Pi4jPropertiesTest {

    private Pi4jProperties properties;

    @BeforeEach
    void setUp() {
        properties = new Pi4jProperties();
    }

    @Test
    @DisplayName("Configuration prefix is 'pi4j'")
    void testPrefix() {
        assertThat(Pi4jProperties.PREFIX).isEqualTo("pi4j");
    }

    @Test
    @DisplayName("Default value of enabled is false")
    void testDefaultEnabled() {
        assertThat(properties.isEnabled()).isFalse();
    }

    @Test
    @DisplayName("Setter for enabled updates the value")
    void testSetEnabled() {
        properties.setEnabled(true);
        assertThat(properties.isEnabled()).isTrue();
    }

    @Test
    @DisplayName("Setter can toggle enabled back to false")
    void testSetEnabledBackToFalse() {
        properties.setEnabled(true);
        properties.setEnabled(false);
        assertThat(properties.isEnabled()).isFalse();
    }
}
