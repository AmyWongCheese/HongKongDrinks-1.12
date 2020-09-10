package com.neocosplayer.hongkongdrinks.procedure;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import com.neocosplayer.hongkongdrinks.ElementsHongkongdrinksMod;

@ElementsHongkongdrinksMod.ModElement.Tag
public class ProcedureVitaLemonTeaFoodEaten extends ElementsHongkongdrinksMod.ModElement {
	public ProcedureVitaLemonTeaFoodEaten(ElementsHongkongdrinksMod instance) {
		super(instance, 58);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VitaLemonTeaFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).clearActivePotions();
	}
}
