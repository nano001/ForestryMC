/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.lepidopterology;

import javax.annotation.Nullable;

import forestry.api.climate.IClimateProvider;
import forestry.api.genetics.IHousing;
import forestry.api.genetics.IIndividual;

public interface IButterflyNursery extends IHousing, IClimateProvider {
	@Nullable
	IButterfly getCaterpillar();

	IIndividual getNanny();

	void setCaterpillar(@Nullable IButterfly caterpillar);

	boolean canNurse(IButterfly caterpillar);

}
