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

package org.cadixdev.lorenz.model.container;

import org.cadixdev.lorenz.model.Mapping;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * A simple implementation of {@link MappingContainer}, for
 * mappings that have straight-forward relationships with their
 * signatures.
 *
 * @param <M> The type of mapping contained
 * @param <S> The type of the signature, representing the mapping
 *
 * @author Jamie Mansfield
 * @since 0.6.0
 */
public abstract class SimpleMappingContainer<M extends Mapping<?, ?>, S>
        implements MappingContainer<M, S> {

    private final Map<S, M> mappings = new HashMap<>();

    /**
     * Creates a mapping, with the given signature.
     *
     * @param signature The signature of the mapping
     * @return The mapping
     */
    protected abstract M create(final S signature);

    @Override
    public Collection<M> getAll() {
        return Collections.unmodifiableCollection(this.mappings.values());
    }

    @Override
    public boolean has(final S signature) {
        return this.mappings.containsKey(signature);
    }

    @Override
    public Optional<M> get(final S signature) {
        return Optional.ofNullable(this.mappings.get(signature));
    }

    @Override
    public M getOrCreate(final S signature) {
        return this.mappings.computeIfAbsent(signature, this::create);
    }

}
