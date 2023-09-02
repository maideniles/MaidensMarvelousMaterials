package com.maideniles.maidensmaterials.blockentity;

import com.maideniles.maidensmaterials.client.screen.menu.MortarPestleMenu;
import com.maideniles.maidensmaterials.init.ModBlockEntities;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.item.BlossomItem;
import com.maideniles.maidensmaterials.item.GemFragmentItem;
import com.maideniles.maidensmaterials.item.MixingClayItem;
import com.maideniles.maidensmaterials.item.PigmentItem;
import com.maideniles.maidensmaterials.recipe.MortarPestleRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Optional;

public class MortarPestleBlockEntity extends BlockEntity implements MenuProvider {



    public final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            Item item = stack.getItem(); //for item list check//
            Boolean blossom = stack.getItem()instanceof BlossomItem;
            Boolean coal = stack.getItem().equals(Items.COAL) || stack.getItem().equals (Items.CHARCOAL);
            Boolean powder = stack.getItem().equals(ModItems.MICA_POWDER);

            Boolean output = stack.getItem()instanceof PigmentItem ||
                    stack.getItem() instanceof GemFragmentItem ||
                    stack.getItem() instanceof MixingClayItem;



            if(slot==0){return output;}
            if(slot==1){return blossom;}
            if(slot==2){return coal;}
            if(slot==3){return powder;}
          //  if(slot==4){return powder;}

            return super.isItemValid(slot, stack);

        }



        @Override
        protected void onContentsChanged(int slot) {



            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 72;

    public MortarPestleBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.MORTAR_PESTLE_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            public int get(int index) {
                switch (index) {
                    case 0: return MortarPestleBlockEntity.this.progress;
                    case 1: return MortarPestleBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: MortarPestleBlockEntity.this.progress = value; break;
                    case 1: MortarPestleBlockEntity.this.maxProgress = value; break;
                }
            }

            public int getCount() {
                return 2;
            }
        };




    }




    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps()  {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("mortar_pestle.progress", progress);
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("mortar_pestle.progress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, MortarPestleBlockEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);
            if(pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftItem(pBlockEntity);
            }
        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }




    private static boolean hasRecipe(MortarPestleBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<MortarPestleRecipe> match = level.getRecipeManager()
                .getRecipeFor(MortarPestleRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem());
    }




    public static void craftItem(MortarPestleBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<MortarPestleRecipe> match = level.getRecipeManager()
                .getRecipeFor(MortarPestleRecipe.Type.INSTANCE, inventory, level);

        if(match.isPresent()) {
            entity.itemHandler.extractItem(1,1, false);
            entity.itemHandler.extractItem(2,1, false);
            entity.itemHandler.extractItem(3,1, false);
           // entity.itemHandler.extractItem(4,1, false);


            entity.itemHandler.setStackInSlot(0, new ItemStack(match.get().getResultItem().getItem(),
                    entity.itemHandler.getStackInSlot(0).getCount() + 1));

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {

        return inventory.getItem(0).getItem() == output.getItem() || inventory.getItem(0).isEmpty()

                ;

    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        ItemStack output = inventory.getItem(0);
        return inventory.getItem(0).getMaxStackSize() > inventory.getItem(0).getCount();
    }





    @Override
    public Component getDisplayName() {
        return Component.literal("");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int container, Inventory inventory, Player p_39956_) {
        return new MortarPestleMenu(container, inventory, this, this.data);
    }

}
