/*
 * This file is part of Lorenz, licensed under the MIT License (MIT).
 *
 * Copyright (c) Jamie Mansfield <https://www.jamierocks.uk/>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 * Provides containers for {@link org.cadixdev.lorenz.model.Mapping mappings},
 * identified by signatures - standardising access and manipulation there-of.
 *
 * <p>The benefit of having {@link org.cadixdev.lorenz.model.container.MappingContainer mapping containers}
 * is that access to mappings all across Lorenz is done in a consistent way,
 * and specialised convenience code is separate and easily visible (and
 * therefore maintainable).
 *
 * <p>Consumers will either use {@link org.cadixdev.lorenz.model.container.MappingContainer}
 * or {@link org.cadixdev.lorenz.model.container.ParentedMappingContainer},
 * determined by whether their container is the same object as the mapping
 * parent (in that case, use a mapping container).
 *
 * @author Jamie Mansfield
 * @since 0.6.0
 */
package org.cadixdev.lorenz.model.container;
