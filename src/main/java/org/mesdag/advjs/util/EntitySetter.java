package org.mesdag.advjs.util;

import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public interface EntitySetter {
    default EntityPredicate.Composite warpEntity(EntityType<?> entityType) {
        return EntityPredicate.Composite.wrap(EntityPredicate.Builder.entity().of(entityType).build());
    }
}
