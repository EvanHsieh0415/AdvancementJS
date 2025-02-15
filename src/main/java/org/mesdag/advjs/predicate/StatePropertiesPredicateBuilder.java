package org.mesdag.advjs.predicate;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;

class StatePropertiesPredicateBuilder {
    final StatePropertiesPredicate.Builder builder = StatePropertiesPredicate.Builder.properties();

    public StatePropertiesPredicateBuilder matchProperty(String key, String value) {
        Property<Boolean> property = BooleanProperty.create(key);
        builder.hasProperty(property, value);
        return this;
    }
}
