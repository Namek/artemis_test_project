package com.something;

import com.artemis.annotations.Wire;
import com.artemis.systems.VoidEntitySystem;

@Wire
public class TestEntitySystem extends VoidEntitySystem {
	OmgArchetype omg;

	@Override
	protected void processSystem() {
		omg.create();
	}
	
}
