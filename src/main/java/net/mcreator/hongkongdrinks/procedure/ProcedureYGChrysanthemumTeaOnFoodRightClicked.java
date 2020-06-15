package net.mcreator.hongkongdrinks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.hongkongdrinks.item.ItemYGChrysanthemumTea;
import net.mcreator.hongkongdrinks.entity.EntityYGChrysanthemumTeaEntity;
import net.mcreator.hongkongdrinks.ElementsHongkongdrinksMod;

@ElementsHongkongdrinksMod.ModElement.Tag
public class ProcedureYGChrysanthemumTeaOnFoodRightClicked extends ElementsHongkongdrinksMod.ModElement {
	public ProcedureYGChrysanthemumTeaOnFoodRightClicked(ElementsHongkongdrinksMod instance) {
		super(instance, 80);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure YGChrysanthemumTeaOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure YGChrysanthemumTeaOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure YGChrysanthemumTeaOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure YGChrysanthemumTeaOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure YGChrysanthemumTeaOnFoodRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
			float x = (float) entity.posX;
			float y = (float) entity.posY;
			float z = (float) entity.posZ;
			float a = x - (int) x;
			float b = z - (int) z;
		World world = (World) dependencies.get("world");
		if ((((entity.isSneaking()) && (new ItemStack(ItemYGChrysanthemumTea.block, (int) (1))
				.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem()))
				|| ((new ItemStack(ItemYGChrysanthemumTea.block, (int) (1))
						.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
								.getItem())
						&& (new ItemStack(Blocks.AIR, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemYGChrysanthemumTea.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
			if (((entity.getHorizontalFacing()) == EnumFacing.NORTH)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityYGChrysanthemumTeaEntity.EntityCustom(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getX()) + a),
								(y + 1),
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getZ()) - b + 1),
								world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else if (((entity.getHorizontalFacing()) == EnumFacing.SOUTH)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityYGChrysanthemumTeaEntity.EntityCustom(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getX()) + a),
								(y + 1),
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getZ()) + b),
								world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else if (((entity.getHorizontalFacing()) == EnumFacing.EAST)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityYGChrysanthemumTeaEntity.EntityCustom(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getX()) - a + 1),
								(y + 1),
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getZ()) + b),
								world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			} else if (((entity.getHorizontalFacing()) == EnumFacing.WEST)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityYGChrysanthemumTeaEntity.EntityCustom(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getX()) + a),
								(y + 1),
								((entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
												entity.getLook(1f).z * 5),
										false, false, true).getBlockPos().getZ()) + b),
								world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
