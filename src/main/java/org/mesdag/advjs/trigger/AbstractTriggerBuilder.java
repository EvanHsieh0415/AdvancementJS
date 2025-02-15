package org.mesdag.advjs.trigger;

import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.PlayerPredicate;

import java.util.function.Consumer;

abstract class AbstractTriggerBuilder {
    EntityPredicate.Composite player = EntityPredicate.Composite.ANY;

    public void setPlayer(PlayerPredicate player) {
        this.player = EntityPredicate.Composite.wrap(EntityPredicate.Builder.entity().player(player).build());
    }

    public void setPlayer(Consumer<PlayerPredicateBuilder> consumer) {
        PlayerPredicateBuilder builder = new PlayerPredicateBuilder();
        consumer.accept(builder);
        this.player = builder.build();
    }
}
