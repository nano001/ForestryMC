/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.core.blocks;

import javax.annotation.Nullable;

import forestry.core.tiles.TileForestry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public interface IMachinePropertiesTesr<T extends TileForestry> extends IMachineProperties<T> {

	/**
	 * @return The renderer from the machine
	 */
	@Nullable
	TileEntitySpecialRenderer<? super T> getRenderer();

	String getParticleTextureLocation();
}
