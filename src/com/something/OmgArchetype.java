package com.something;

import com.artemis.EntityFactory;
import com.artemis.annotations.Bind;

@Bind({TestComponent.class})
public interface OmgArchetype extends EntityFactory<OmgArchetype> {

}
